public class Spaceship {

    String shipName;
    String engineType;
    double maxSpeed;
    int shipHealth;
    int attackPower;
    int posX, posY;
    // member variables for the ship class.

    Spaceship() {
        // default constructor
        this.shipName = "Default Ship";
        this.engineType = "Chemical Rockets";
        this.maxSpeed = Math.random() * 3 + 1;
        this.shipHealth = (int)(Math.random() * 100);
        this.attackPower = (int)((Math.random() * 5) + 15);
        this.posY = ((int)Math.random() * 10);
        this.posX = ((int)Math.random() * 10);

    }

    Spaceship(String shipName, String engineType){

        this.shipName = shipName;
        this.engineType = engineType;
        this.maxSpeed = Math.random() * 3 + 1;
        this.shipHealth = (int)(Math.random() * 100);
        this.attackPower = (int)((Math.random() * 5) + 15);
        this.posY = (int)(Math.random() * 10);
        this.posX = (int)(Math.random() * 10);
    }

    public void printShip() {   // Print the attributes of the spaceship.

        System.out.printf("Shipname: %s\n" +
                          "Engine Type: %s\n" +
                          "Max Speed: %.2f\n" +
                          "Ship Health: %d\n" +
                          "Attack Power: %d\n" +

        "\n", this.shipName, this.engineType, this.maxSpeed, this.shipHealth, this.attackPower );
        // The variables That I want to print in my output message.
    }

    public void moveUp(){       // Move the ship up one space.

        if (this.posY != 0) {
            this.posY -= 1;
        }
        else {
            this.posY = 9;
            // Move the ship to the bottom of the board if it reaches the top.
        }

    }

    public void moveDown(){     // Move the ship Down one block.

        if (this.posY != 9) {
            this.posY += 1;
        }
        else {
            this.posY = 0;
            // Move the ship to the top of the board if it reaches the top.
        }
    }

    public void moveLeft() {    // Move the ship left a block

        if (this.posX != 0 ){
            this.posX -= 1;
        }
        else {
            this.posX = 9;
        }
    }

    public void moveRight() {   // Move the ship Right a block.

        if (this.posX != 9 ){
            this.posX += 1;
        }

        else {
            this.posX = 0;
        }
    }
}
