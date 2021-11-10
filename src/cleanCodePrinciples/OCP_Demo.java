package cleanCodePrinciples;

// Class 5
// Main class
// To demonstrate working of all classes
/**
 * Solution
 * 
 * Create an abstract class that serves as a base class for all types of
 * objects.
 * 
 * All the geometric objects have a set of dimensions and a get_volume method
 * (both of which are different for each type of object).
 * 
 * For each type of object (a geometric object in this case) inherit the
 * ‘Geo_object’ class, add the dimensions for that type of object and override
 * the ‘get_volume‘ method.
 * 
 * As it is apparent that by shifting the volume calculation from the
 * ‘Application’ class to a different class, adding a new type of geometric
 * object would not require changing the ‘Application’ class.
 * 
 * @param geo_objects
 * @param s_geo_objects
 * @return
 */
public class OCP_Demo {

	// Main driver method
	public static void main(String args[]) {
		// Initializing cuboid1 as well as declaring
		// its dimensions.
		OCP_Cuboid cb1 = new OCP_Cuboid();

		// Custom entries
		cb1.length = 5;
		cb1.breadth = 10;
		cb1.height = 15;

		// Initializing Cuboid2 as well as declaring
		// its dimensions.
		OCP_Cuboid cb2 = new OCP_Cuboid();
		cb2.length = 2;
		cb2.breadth = 4;
		cb2.height = 6;

		// initializing Cuboid3 as well as declaring
		// its dimensions.
		OCP_Cuboid cb3 = new OCP_Cuboid();
		cb3.length = 3;
		cb3.breadth = 12;
		cb3.height = 15;

		// initializing Sphere1 as well as declaring
		// its dimension.
		OCP_Sphere sp1 = new OCP_Sphere();
		sp1.radius = 5;

		// initializing Sphere2 as well as declaring
		// its dimension.
		OCP_Sphere sp2 = new OCP_Sphere();
		sp2.radius = 2;

		// initializing Sphere3 as well as declaring
		// its dimension.
		OCP_Sphere sp3 = new OCP_Sphere();
		sp3.radius = 3;

		// Now, initializing and declaring
		// an array of Geo_objects
		OCP_Geo_objects[] g_arr = new OCP_Geo_objects[6];

		// Setting Geo_objects to cuboid class
		g_arr[0] = cb1;
		g_arr[1] = cb2;
		g_arr[2] = cb3;

		// Setting Geo_objects to sphere class
		g_arr[3] = sp1;
		g_arr[4] = sp2;
		g_arr[5] = sp3;

		// Initializing the Application class
		OCP_Application app = new OCP_Application();

		// Getting the total volume
		// using get_total_volume
		double vol = app.get_total_volume(g_arr);

		// Printing total volume
		System.out.println("The total volume is " + vol);
	}
}