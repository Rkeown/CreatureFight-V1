/**
 * TODO (50): Fill out the following information...
 * 
 * Name: 
 * Course: 
 * Teacher: 
 * Date Last Modified: 
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreatureWorld extends World
{
    //TODO (1): Declare two private Creature instance variables to store a player one creature and player two creature
    private Creature player1;
    private Creature player2;
    /**
     * CreatureWorld
     * Default constructor for objects of class CreatureWorld.
     * 
     * @param There are no parameters
     * @return an object of class CreatureWorld
     */
    public CreatureWorld()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        
        /**
         * TODO (26): Set the creature variables from TODO 1 to what they should be...
         * Player one's creature is a new Charmander and player two's creature is a new Pikachu
         * 
         * Hint: each new Creature will require a reference to the CreatureWorld, so use "this" in the parameters 
         */
        player1 = new Charmander(this);
        player2 = new Pikachu(this);
        
        //TODO (32): Add a method call to the prepareCreatures method you created. You should see all your objects in your world. If you don't, try to fix it
        prepareCreatures();
        
        Greenfoot.start();
    }
    
    /**
     * act will complete actions that the CreatureWorld object should
     * accomplish while the scenario is running
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        /**
         * TODO (33): Create a List variable called allObjects and instantiate it to a method call to getObjects. 
         *            The getObjects method requires which class of objects it should be getting. We want this List to
         *            store all objects, so use a parameter of null. That will get all objects, not just the objects
         *            of one class
         */
        
        List allObjects = getObjects(null);
        // TODO (34): If playerOneCreature's health bar has a current health less than or equal to 0...
        
            //TODO (35): Make a call to removeObjects and use the allObjects list as the parameter
            
            //TODO (36): Use the show text method to display that player two wins in the centre of the scenario
            
            //TODO (37): Stop the scenario
            
        
        //TODO (38): If playerTwoCreature's health bar has a current health less than or equal to 0...
        
            //TODO (39): Make a call to removeObjects and use the allObjects list as the parameter
            
            //TODO (40): Use the show text method to display that player one wins in the centre of the scenario
            
            //TODO (41): Stop the scenario
            if(player1.getHealthBar().getCurrent() <= 0)
            {
                removeObjects(allObjects);
                showText("Pikachu Wins!", getWidth()/2, getHeight()/2);
                Greenfoot.stop();
            }
                        if(player2.getHealthBar().getCurrent() <= 0)
            {
                removeObjects(allObjects);
                showText("Charmander Wins!",getWidth()/2, getHeight()/2);
                Greenfoot.stop();
            }
    }
    
    /**
     * TODO (27): Declare a prepareCreatures method that has no return type and no parameters
     * 
     * TODO (28): Inside the method, write code to add the playerOneCreature object to the world
     *          at an x location of playerOneCreature.getImage().getWidth()/2 and a y location
     *          of getHeight() - playerOneCreature.getImage().getHeight()/2 (this will add the
     *          playerOneCreature at the bottom left corner of the world)
     *          
     * TODO (29): Underneath the line that adds the playerOneCreature, add a new Button object that 
     *           has the color RED and a value of 50 at an x location of getWidth()/2 and a y
     *           location of getHeight() - 100
     *           5
     * TODO (30): Underneath the lines that add the playerOneCreature and attack button, add the
     *           playerTwoCreature to the world at an x location of getWidth() - playerTwoCreature.getImage().getWidth()/2
     *           and a y location of playerTwoCreature.getHeight()/2 (this will add the playerTwoCreature
     *           to the top right corner of the world)
     * 
     * TODO (31): Underneath the line that adds the playerTwoCreature, add a new Button object that
     *           has the color RED and a value of 50 at an x location of getWidth()/2 and a y 
     *           location of 100.
     */
    /**
     * prepare Creatures tells the program to load the pokemon as well as the health
     * and the buttons for attacking
     * 
     * @param there are no parameters
     * @return there is no return
     */
    private void prepareCreatures()
    {
        addObject(player1,  player1.getImage().getWidth()/2, getHeight() - player1.getImage().getHeight()/2);
        
        addObject( new Button(Color.RED, 50),getWidth()/2,getHeight() - 100);
        
        addObject(player2, getWidth() - player2.getImage().getWidth()/2, player2.getImage().getHeight()/2);
        
        addObject( new Button(Color.RED, 50),getWidth()/2,  100);
    }    
    /**
     * TODO (2): Declare a public method called getPlayerOne that returns a Creature object and
     *           has no parameters
     * 
     * TODO (3): The one thing this method should do is return the playerOneCreature
     */

    /**
     * TODO (4): Declare a public method called getPlayerTwo that returns a Creature object and
     *           has no parameters. You should be available to figure out what this method does
     *           from the previous two TODOs
     */
    /**
     * getPlayetOne is just a method that is called on by other methods to
     * return player1
     * @param There are no parameters
     * @return it returns player1
     */
    public Creature getPlayerOne()
    {
        return player1;
    }
    /**
     * getPlayerTwo does the same thing as getPlayer one but it returns
     * player2 instead
     * @param there are no parameters
     * @return it returns player2
     */
    public Creature getPlayerTwo()
    {
        return player2;
    }
}

