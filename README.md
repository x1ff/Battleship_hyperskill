# Battleship_hyperskill  [![Build Status](https://travis-ci.org/x1ff/Battleship_hyperskill.svg?branch=master)](https://travis-ci.org/x1ff/Battleship_hyperskill)

## About
Writing games is probably one of the most exciting tasks in programming. Develop your own version of the popular "Battleship Game" to play with your friends!
## Learning outcomes
You will understand the process of developing such a complex program as a game and learn about processing user input and handling errors.
## This project is a part of the following tracks
Java DeveloperPreparing for the AP Computer Science (Java)Java Developer 2.0

## Description
Here is a good way to show off your new skills: 
offer a friend to play a computer game that you wrote yourself! 
Of course, it is much more fun to play Battleship with someone else: 
the possibility of winning or losing adds a thrill to the game!

Both players add the ships to their fields one by one (no peeking!), 
and then start shelling each other until one of them succeeds. 
To make the game fair and prevent the players from peeping at each other's fields, 
after each move add the message "Press Enter and pass the move to another player", 
which will clear the screen.

## Objectives
To complete this stage and the entire project, add a PvP component to your game. 
Now the player will see not only the opponent's screen but their own as well. 
Place the opponent's screen at the top and your field at the bottom.

## Example

Player 1, place your ships on the game field

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Aircraft Carrier (5 cells):

F3 F7

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Battleship (4 cells):

A1 D1

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ ~ ~  
C O ~ ~ ~ ~ ~ ~ ~ ~ ~  
D O ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Submarine (3 cells):

J7 J10

Error! Wrong length of the Submarine! Try again:

J10 J8

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ ~ ~  
C O ~ ~ ~ ~ ~ ~ ~ ~ ~  
D O ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ O O O  

Enter the coordinates of the Cruiser (3 cells):

B9 D8

Error! Wrong ship location! Try again:

B9 D9

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ O ~  
C O ~ ~ ~ ~ ~ ~ ~ O ~  
D O ~ ~ ~ ~ ~ ~ ~ O ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ O O O  

Enter the coordinates of the Destroyer (2 cells):

E6 D6

Error! You placed it too close to another one. Try again:

I2 J2

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ O ~  
C O ~ ~ ~ ~ ~ ~ ~ O ~  
D O ~ ~ ~ ~ ~ ~ ~ O ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ O ~ ~ ~ ~ ~ ~ ~ ~  
J ~ O ~ ~ ~ ~ ~ O O O  

Press Enter and pass the move to another player
...
Player 2, place your ships to the game field

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Aircraft Carrier (5 cells):

H2 H6

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ O O O O O ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Battleship (4 cells):

F3 F6

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ O O O O O ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Enter the coordinates of the Submarine (3 cells):

H8 F8

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ O ~ ~  
G ~ ~ ~ ~ ~ ~ ~ O ~ ~  
H ~ O O O O O ~ O ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

...

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ O ~ ~  
D ~ ~ ~ O O O ~ O ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ O ~ ~  
G ~ ~ ~ ~ ~ ~ ~ O ~ ~  
H ~ O O O O O ~ O ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Press Enter and pass the move to another player
...

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
---------------------
&nbsp;  1 2 3 4 5 6 7 8 9 10  
A O ~ ~ ~ ~ ~ ~ ~ ~ ~  
B O ~ ~ ~ ~ ~ ~ ~ O ~  
C O ~ ~ ~ ~ ~ ~ ~ O ~  
D O ~ ~ ~ ~ ~ ~ ~ O ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O O ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ O ~ ~ ~ ~ ~ ~ ~ ~  
J ~ O ~ ~ ~ ~ ~ O O O  

Player 1, it's your turn:

I3

You missed!
Press Enter and pass the move to another player
...

&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
---------------------
&nbsp;  1 2 3 4 5 6 7 8 9 10  
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
C ~ ~ ~ ~ ~ ~ ~ O ~ ~  
D ~ ~ ~ O O O ~ O ~ ~  
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  
F ~ ~ O O O O ~ O ~ ~  
G ~ ~ ~ ~ ~ ~ ~ O ~ ~  
H ~ O O O O O ~ O ~ ~  
I ~ ~ M ~ ~ ~ ~ ~ ~ ~  
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  

Player 2, it's your turn:

A1

You hit a ship!
Press Enter and pass the move to another player
...