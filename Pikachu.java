import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Creature
{
    /**
     * TODO (22): Create a constructor for Pikachu that has a World parameter called world
     * 
     * TODO (23): Use the Creature constructor to initialize the health and ownership of Pikachu.
     *            Initialize the healthNumber to 650 and the playerOwnership to 2. Use Charmander
     *            for help if you need.
     * 
     * TODO (24): Next, get the image for this class, and scale it to a width of 150 and a height of 100
     * 
     * TODO (25): Use your World parameter to add an object to the world. You will add Pikachu's health bar
     *            by using the getHealthBar() method as the first parameter and adding it at an x location 
     *            of 100 and a y location of 25
     */
    /**
     * Pikachu sets up pikachu's location, health, and size
     * @param there is one parametr:world
     * @return there are no returns
     */
    public Pikachu(World world)
    {
        super(650,2);
        getImage().scale(150,100);
        world.addObject( getHealthBar(), 100, 25);
    }
    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        /**
         * TODO (46): Create a CreatureWorld variable called playerWorld. Initialize it
         *            to a reference to your CreatureWorld. Use Charmander as a reference if needed
         */
        
        //TODO (47): If Pikachu's health bar has a current health less than or equal to 0 (you must get the health bar and then get its current value)...
        
            //TODO (48): Get the world and use it to show text that says that Pikachu has fainted at an x location of getWorld().getWidth()/2 and a y location of getWorld().getHeight()/2 + 26
            
            //TODO (49): Delay the scenario by 30 act cycles
    }    
}
