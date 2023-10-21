//This class is responsible for creating comet objects that do not have a circular orbit
//This class contains 1 new attribute: eccentricity (Data Type: double)
/**
 * 
 * @author Ian Tan
 * @version 20/10/2023
 */
public class Comet extends SolarObjects 
{
	private double radians;
	private final double finalDistance = getDistance();
	private double eccentricity;
	
	/**
	 * 
     * @param distance This attribute determines the distance of the solar object from the center of the Solar System model
     * @param diameter This attribute determines the size of the solar object
     * @param velocity This attribute determines how fast each solar object completes an orbit
     * @param colour This attribute determines the colour of the solar object
	 */
	public Comet(double distance, double diameter, double velocity, String colour, double eccentricity)
	{
		super(distance, diameter, velocity, colour);
		this.eccentricity = eccentricity;
	}
	
	/**
	 * @param s
	 * This method is used to paint a comet object in the Solar System model
	 */
	public void DrawComet(SolarSystem s)
	{
		s.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
		updatePosition();
		
		//Equation to calculate orbit of comet with a non-circular orbit
		radians = Math.toRadians(getAngle());
		setDistance(finalDistance / (1 + eccentricity * Math.cos(radians)));
	}
}