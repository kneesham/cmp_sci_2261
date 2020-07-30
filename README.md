# cmp_sci_2261
Java web programming final project.

# Project description
Your spaceships must be a new class that inherits from the "spaceship" class. Something to the extent of: 
![Image of structure]
(https://umsl.instructure.com/users/10753/files/1475250/preview?verifier=pf2WWIKsXOfGIdpqYgdtHWBceem2VB8oKAB4ijUm)

Your spaceship's constructor must randomize your ship health, max speed, and x and y position: 

Ship health should be randomly set to somewhere between 50-100
Attack power should be randomly set to somewhere between 5-20
Max Speed should be randomly set to somewhere between 1-3
X and Y positions must be randomly set to somewhere between 0-10
 

Your ship classes must both: 

Extend spaceship.
Have at least one constructor that calls its super constructor. 
Have a printShipDiagnostics method which prints not only your ship's class variables, but also its inherited class variables from spaceship. 
You should also have a "print board" method which takes in both ships and displays their location on the board (we will discuss how to do this in class). 

 

Once your spaceships are created, display them on the game board. Create a menu for your captains to choose their types of ships. 

 

 

**** BONUS POINTS: If your ships come within 1 square of each other, initiate a turn based battle (this is where your specific methods of each class could come in handy)

 

In the below example, the Federation class has the option for diplomacy (which would end a battle immediately), while the Romulan Warbird class has the option for cloaking, which also would end the battle immediately. 
