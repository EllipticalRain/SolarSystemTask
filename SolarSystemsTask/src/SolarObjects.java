//This is the parent class for all celestial bodies in the Solar System model
//It is responsible for creating solar objects with the appropriate attributes and calling methods to paint the Solar System model
//This class is used for solar objects that orbit the Sun, such as the asteroid belt
//This class contains 4 attributes: distance, diameter, velocity and colour
/**
 * 
 * @author Ian Tan
 * @version 19/10/2023
 */
public class SolarObjects
{
    private double distance;
    private double angle;
    private double diameter;
    private double velocity;
    private String colour;
    
    /**
     * 
     * @param distance This attribute determines the distance of the solar object from the center of the Solar System model
     * @param diameter This attribute determines the size of the solar object
     * @param velocity This attribute determines how fast each solar object completes an orbit
     * @param colour This attribute determines the colour of the solar object
     */
    public SolarObjects(double distance, double diameter, double velocity, String colour)
    {
        this.distance = distance;
        this.diameter = diameter;
        this.velocity = velocity;
        this.colour = colour;
    }
    
    /**
     * This method is used to update the position of all solar objects in the Solar System model
     */
    public void updatePosition()
    {
        angle += velocity;
    }

    /**
     * @param s
     * This method is used to paint a solar object in the Solar System model
     */
    public void DrawObject(SolarSystem s)
    {
        s.drawSolarObject(distance, angle, diameter, colour);
        updatePosition();
    }

    //This class contains getters so that the child classes are able to access the neccessary parents attributes
    //Note velocity attribute is not included
    /**
     * @return double This returns distance
     */
    public double getDistance() {
        return distance;
    }
    
    /**
     * @param distance This sets distance
     */
    public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
     * @return double This returns angle
     */
    public double getAngle() {
        return angle;
    }
    
    /**
     * @return double This returns diameter
     */
    public double getDiameter() {
        return diameter;
    }
    
    /**
     * @return String This returns colour
     */
    public String getColour() {
        return colour;
    }
}