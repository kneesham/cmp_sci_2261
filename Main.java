/**********************************************************************
 * Name: Theodore Nesham
 * Date: 03/19/2019
 * Description: Project is used to cover java inheritance
***********************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[][] gameBoard = new String[10][10];
        SuperDestroyer superD = new SuperDestroyer("Enterprise");
        GalaxyDestroyer galaxD = new GalaxyDestroyer( "Your Betsy" ); // this will be the ship your control.

        System.out.println("Your two ships are: ");
        System.out.println("Ship 1: "); superD.printShip();
        System.out.println("Ship 2: "); galaxD.printShip();

        while(true) {

            System.out.println("\nUse W,A,S,D to move your ship around.");
            String userIn = in.nextLine();

            moveShips( superD, galaxD, gameBoard, userIn );
            // Move the two ships around the board.

            printBoard( superD, galaxD, gameBoard );
            // Output where the ships are currently at.

            if (checkSurroundings( superD, galaxD, gameBoard )){
                System.out.println("\nShips are fighting!");
                fight( superD, galaxD );
                break;
            }
        }


    }

    public static void printBoard(SuperDestroyer s, GalaxyDestroyer g, String[][] board) {

        board[g.getPosY()][g.getPosX()] = g.getShipName();
        board[s.getPosY()][s.getPosX()] = s.getShipName();
        // the board prints sideways so reversing the x and y of the ships gives correct positions.

        System.out.println("_______________________________________________________________________");

        for (int i = 0; i < board.length ; i++) {
            System.out.print("|");

            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == null ){
                    System.out.print("______|");
                }
                else {
                    System.out.print("_" + board[i][j] + "__|");
                }
            }
            System.out.println();

        }
    }

    public static void moveShips(SuperDestroyer s, GalaxyDestroyer g, String[][] gameBoard, String direction){
        // s is the ship the computer controls and g is the user's ship.

        int computerChoice = (int)(Math.random() * 4);

        // This if block is used to change the position of the user's ship.
        if (direction.equals("w")){
            // Move up.
            gameBoard[g.getPosY()][g.getPosX()] = null;
            // reset the previous square to a null.
            g.moveUp();
        }
        else if(direction.equals("s")) { // Move down.
            gameBoard[g.getPosY()][g.getPosX()] = null;
            // reset the previous square to a null.
            g.moveDown();
        }
        else if(direction.equals("d")) { // move right.
            gameBoard[g.getPosY()][g.getPosX()] = null;
            // reset the previous square to a null.
            g.moveRight();
        }
        else if(direction.equals("a")) { // move left.
            gameBoard[g.getPosY()][g.getPosX()] = null;
            // reset the previous square to a null.
            g.moveLeft();

        }

        switch (computerChoice){
            // move the computer's ship around the board.
            case 1: {
                // Move up.
                gameBoard[s.getPosY()][s.getPosX()] = null;
                // reset the previous square to a null.
                s.moveUp();
                break;
            }
            case 2: {
                gameBoard[s.getPosY()][s.getPosX()] = null;
                // reset the previous square to a null.
                s.moveDown();
                break;
            }
            case 3: {
                gameBoard[s.getPosY()][s.getPosX()] = null;
                // reset the previous square to a null.
                s.moveRight();
                break;
            }
            case 4: {
                gameBoard[s.getPosY()][s.getPosX()] = null;
                // reset the previous square to a null.
                s.moveLeft();
                break;
            }
        }
    }

    public static boolean checkSurroundings(SuperDestroyer s, GalaxyDestroyer g, String[][] board) {
        // check the surroundings of your ship!

        boolean doFight = false;



        if (
                (g.getPosY() + 1) == s.getPosY() && g.getPosX() == s.getPosX() ||  //Check up
                (g.getPosY() - 1) == s.getPosY() && g.getPosX() == s.getPosX() ||  //Check down.

                (g.getPosX() + 1) == s.getPosX() && g.getPosY() == s.getPosY() ||  //Check right.
                (g.getPosX() - 1) == s.getPosX() && g.getPosY() == s.getPosY()    //Check left.

        ) {
           doFight = true;
        }
        else if ((g.getPosY()) == s.getPosY() && g.getPosX() == s.getPosX()){
            System.out.println("Ships collided nobody wins :( ");
            System.exit(0);
        }

        return doFight;
    }

    public static void fight(SuperDestroyer s, GalaxyDestroyer g ){

        System.out.println("You're attacking: " + s.getShipName());

        Object survivor = null;    // create a generic object to find which ship will be the survivor.

        while(true){

            try {
                Thread.sleep( 2000 );   // have the Main thread sleep for 2 seconds.
                //Note: this is just so you can see how each ships attack effects on another.

            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            System.out.println();

            if ( !(s.shipHealth <= 0) ){
                System.out.println(s.shipName + " Health is: " + s.shipHealth);
            }
            else {
                survivor = g;   // assign the ship who's health is not 0.
                break;
            }

            if ( !(g.shipHealth <= 0) ){
                System.out.println(g.shipName + " Health is: " + g.shipHealth);
            }
            else {
                survivor = s; // assign the ship who's health is not 0.
                break;
            }
            s.shipHealth -= g.attackPower;
            g.shipHealth -= s.attackPower;

        }
        System.out.println("The winner is: " + ((Spaceship) survivor).shipName);

    }
}


