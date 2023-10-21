//This is a child class of SolarObjects, this class is used for planets that orbit the Sun
//This class is responsible for creating planet objects with the appropriate attributes
//This child class contains no new attributes
/**
 * 
 * @author Ian Tan
 * @version 19/10/2023
 */
public class Planet extends SolarObjects
{
	/**
	 * 
     * @param distance This attribute determines the distance of the solar object from the center of the Solar System model
     * @param diameter This attribute determines the size of the solar object
     * @param velocity This attribute determines how fast each solar object completes an orbit
     * @param colour This attribute determines the colour of the solar object
	 */
    public Planet(double distance, double diameter, double velocity, String colour)
    {
        super(distance, diameter, velocity, colour);
    }
}