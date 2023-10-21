//This is a child class of SolarObjects, specifically for satellites that orbit a planet or any solar object orbiting the Sun
//This class is responsible for creating moon objects with the appropriate attributes
//This child class contains 1 new attribute: planet (Class: Planet)
/**
 * 
 * @author Ian Tan
 * @version 19/10/2023
 */
public class Moon extends SolarObjects
{
    private Planet planet;
    
    /**
     * 
     * @param distance This attribute determines the distance of the solar object from the center of the Solar System model
     * @param diameter This attribute determines the size of the solar object
     * @param velocity This attribute determines how fast each solar object completes an orbit
     * @param colour This attribute determines the colour of the solar object
     * @param planet This attribute shows which planet the moon object orbits
     */
    public Moon(double distance, double diameter, double velocity, String colour, Planet planet)
    {
        super(distance, diameter, velocity, colour);
        this.planet = planet;
    }

    //This method is used to paint a moon object in the Solar System model
    /**
     * @param s
     * This method is used to paint a moon object in the Solar System model
     */
    public void DrawMoon(SolarSystem s)
    {
        s.drawSolarObjectAbout(super.getDistance(), super.getAngle(), super.getDiameter(), super.getColour(), planet.getDistance(), planet.getAngle());
        updatePosition();
    }
}