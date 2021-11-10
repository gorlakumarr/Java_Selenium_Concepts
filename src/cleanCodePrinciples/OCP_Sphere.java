package cleanCodePrinciples;

// Class 3
// Helper Class
// Extending Geo_objects to fit sphere dimension

/**
 * 
 * On taking an overview, we found that our first approach wasn’t open for
 * extension and required modification in the code to accommodate new
 * requirements (new geometric objects) . While the second approach was open for
 * extension and adding new requirements can be done without modifying any
 * existing code. The second approach helps to achieve robustness in the whole
 * program.
 * 
 * @author e104399
 *
 */
public class OCP_Sphere extends OCP_Geo_objects {

	// To store radius of a sphere
	public double radius;

	// Overrided function to calculate
	// the volume of a sphere

	// @Override
	public double get_volume() {
		return (4 / 3) * Math.PI * radius * radius * radius;
	}
}