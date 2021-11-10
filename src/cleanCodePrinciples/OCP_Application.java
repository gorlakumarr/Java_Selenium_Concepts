package cleanCodePrinciples;

// Class 4
// Helper class
// To calculate the volume of geometric objects
public class OCP_Application {

	public double get_total_volume(OCP_Geo_objects[] geo_objects) {
		// Initially initializing sum to zero
		double vol_sum = 0;

		// Iterating using for each loop
		for (OCP_Geo_objects geo_obj : geo_objects) {
			vol_sum += geo_obj.get_volume();
		}

		return vol_sum;
	}
}