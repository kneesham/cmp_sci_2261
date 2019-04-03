import java.util.Arrays;

public class SuperDestroyer extends Spaceship {

    String[] weapons;       // The name of the weapons aboard the Spaceship.
    String description;     // The description of the spaceship.
    int crewSize;           // The total number of crew members on the ship.
    int numWeapons;         // The number of weapons the spaceship has.

    SuperDestroyer() { // Default constructor

        super();
        this.description = "The most intimidating Destroyer of all";
        this.crewSize = 20;
        this.numWeapons = 4;
        this.weapons = new String[] {"Mini-guns", "Laser Cannons", "Emp Blasters", "Zombie Apocalypse WF47"};

    }
    SuperDestroyer(String shipName) {   // Overloaded Constructor.

        super(shipName, "Ion Drive");
        this.description = "The most intimidating Destroyer of all";
        this.crewSize = 20;
        this.numWeapons = 4;
        this.weapons = new String[] {"Mini-guns", "Laser Cannons", "Emp Blasters", "Zombie Apocalypse WF47"};

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
