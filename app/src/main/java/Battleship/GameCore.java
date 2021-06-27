package Battleship;

import java.util.Scanner;

public class GameCore {
    private Player p1;
    private Player p2;
    private GameStatus status;

    private final String HINT_FOR_SHIP_SET = "Player %s, place your ships on the game field\n\n";
    private final String HINT_FOR_SWITCH_PLAYER = "Press Enter and pass the move to another player\n";

    public GameCore() {
        this.p1 = new Player("1");
        this.p2 = new Player("2");
        this.status = GameStatus.SHIP_SETTING;
    }

    public void setShips(Scanner sc) {
        System.out.printf(HINT_FOR_SHIP_SET, p1.getName());
        p1.setSelf(sc);
        changePlayer(sc);
        System.out.printf(HINT_FOR_SHIP_SET, p2.getName());
        p2.setSelf(sc);
        this.status = GameStatus.FIRST_PLAYER_SHOT;
        changePlayer(sc);
    }

    public void startGame(Scanner sc) {
        boolean isCorrectInput;
        while (!(this.status.equals(GameStatus.FIRST_PLAYER_WIN) ||
                this.status.equals(GameStatus.SECOND_PLAYER_WIN))) {
            switch (this.status) {
                case SHIP_SETTING:
                    setShips(sc);
                    break;
                case FIRST_PLAYER_SHOT:
                    p1.enemy.printSea();
                    System.out.println("---------------------");
                    p1.self.printSea();
                    System.out.println("Player 1, it's your turn:");
                    isCorrectInput = false;
                    while (!isCorrectInput) {
                        isCorrectInput = p1.shot(sc.nextLine(), p2);
                    }
                    this.status = GameStatus.SECOND_PLAYER_SHOT;
                    if (!checkWinner()) {
                        changePlayer(sc);
                    }
                    break;
                case SECOND_PLAYER_SHOT:
                    p2.enemy.printSea();
                    System.out.println("---------------------");
                    p2.self.printSea();
                    System.out.println("Player 2, it's your turn:");
                    isCorrectInput = false;
                    while (!isCorrectInput) {
                        isCorrectInput = p2.shot(sc.nextLine(), p1);
                    }
                    this.status = GameStatus.FIRST_PLAYER_SHOT;
                    if (!checkWinner()) {
                        changePlayer(sc);
                    }
                    break;
            }

        }
        System.out.println("You sank the last ship. You won. Congratulations!");
    }

    private boolean checkWinner() {
        boolean isEnd = false;
        if (p1.isWin(p2)) {
            this.status = GameStatus.FIRST_PLAYER_WIN;
            isEnd = true;
        }
        if (p2.isWin(p1)) {
            this.status = GameStatus.SECOND_PLAYER_WIN;
            isEnd = true;
        }
        return isEnd;
    }

    private void changePlayer(Scanner sc) {
        System.out.println(HINT_FOR_SWITCH_PLAYER);
        sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
