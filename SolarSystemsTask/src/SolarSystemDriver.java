import java.util.ArrayList;
import java.util.Random;

public class SolarSystemDriver
{
    public static void main(String[] args)
    {
        SolarSystem s = new SolarSystem(1000, 1000);
        int angle = 0;

        Sun sun = new Sun(0, 60, 0, "YELLOW");

        Planet mercury = new Planet(50, 4, 4, "GREY");
        Planet venus = new Planet(70, 10, 2, "ORANGE");
        Planet earth = new Planet(90, 10, 1, "BLUE");
        Planet mars = new Planet(130, 5, 0.5, "RED");
        Planet jupiter = new Planet(225, 25, 0.2, "#f4cdb3");
        Planet saturn = new Planet(275, 23, 0.1, "#ead6b8");
        Planet uranus = new Planet(325, 18, 0.05, "#d9ddf4");
        Planet neptune = new Planet(375, 18, 0.02, "#5b5ddf");

        Moon moon = new Moon(12, 3, 5, "GREY", earth);
        Moon io = new Moon(16, 4, 20, "YELLOW", jupiter);
        Moon europa = new Moon(20, 3, 18, "GREY", jupiter);
        Moon ganymede = new Moon(24, 5, 15, "GREY", jupiter);
        Moon callisto = new Moon(32, 4, 10, "GREY", jupiter);
        Moon titan = new Moon(28, 5, 10, "ORANGE", saturn);
        Moon triton = new Moon(16, 3, 20, "GREY", neptune);
        
        Comet comet = new Comet(200, 5, 0.4, "#057cc8", 0.5);

        Planet[] planets = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
        Moon[] moons = {moon, io, europa, ganymede, callisto, titan, triton};
        ArrayList<SolarObjects> asteroids = new ArrayList<SolarObjects>();
        ArrayList<Moon> saturnRings = new ArrayList<Moon>();
        
        Random rand = new Random();

        for (int i = 0; i < 200; i++)
        {
            int asteroidDistance = rand.nextInt(10);
            double asteroidVelocity = rand.nextDouble(5);
            SolarObjects asteroid = new SolarObjects(155 + asteroidDistance, 2, asteroidVelocity, "GREY");
            asteroids.add(asteroid);
        }

        for (int j = 0; j < 300; j++)
        {
            double ringVelocity = rand.nextDouble(5);
            Moon ringObject = new Moon(20, 2, ringVelocity, "#ffe1ab", saturn);
            saturnRings.add(ringObject);
        }

        while (angle >= 0)
        {
            sun.DrawObject(s);

            for (int i = 0; i < planets.length; i++)
            {
                planets[i].DrawObject(s);
            }

            for (int j = 0; j < moons.length; j++)
            {
                moons[j].DrawMoon(s);
            }

            for (int k = 0; k < asteroids.size(); k++)
            {
                asteroids.get(k).DrawObject(s);;
            }

            for (int l = 0; l < saturnRings.size(); l++)
            {
                saturnRings.get(l).DrawMoon(s);
            }
            
            comet.DrawComet(s);

            s.finishedDrawing();
        }

        System.out.println(s);
    }
}