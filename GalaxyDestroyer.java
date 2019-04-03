import java.util.Arrays;

public class GalaxyDestroyer extends Spaceship {

    String[] weapons;       // The name of the weapons aboard the Spaceship.
    String description;     // The description of the spaceship.
    int crewSize;           // The total number of crew members on the ship.
    int numWeapons;         // The number of weapons the spaceship has.

    GalaxyDestroyer() {
        // Default Constructor.
        super();
        this.description = "The most intimidating Destroyer of all";
        this.crewSize = 15;
        this.numWeapons = 3;
        this.weapons = new String[] {"Galaxy-guns", "Black Hole Blaster", "Emp Missiles"};


    }
    GalaxyDestroyer(String shipName) {
        // Overloaded constructor.

        super(shipName, "Rocket Thrusters");
        this.description = "The destroyer of all galaxies";
        this.crewSize = 15;
        this.numWeapons = 3;
        this.weapons = new String[] {"Galaxy-guns", "Black Hole Blaster", "Emp Missiles"};

    }
    public void printShip() {   // Print the attributes, and the details of this ship.
        super.printShip();

        System.out.printf("Description: %s\n" +
                "Crew Size: %d\n" +
                "Number Of Weapons: %d\n" +
                "Weapons list: %s\n" +
                "\n",this.description, this.crewSize, this.numWeapons, Arrays.toString(this.weapons) );
    }
    public int getPosX() {
        return super.posX;
    }
    public int getPosY() {
        return super.posY;
    }
    public String getShipName() {
        return super.shipName.substring(0,3);
    }
}


