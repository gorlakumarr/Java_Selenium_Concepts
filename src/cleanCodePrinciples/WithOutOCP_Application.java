package cleanCodePrinciples;

public class WithOutOCP_Application {

	// It returns the total volume of the geometric objects
	public double get_total_volume(WithOutOCP_Cuboid[] geo_objects, WithOutOCP_Sphere[] s_geo_objects) {

		// Variable to store total volume
		double vol_sum = 0;

		// Iteratively calculating the volume of each object
		// and adding it to the total volume
		for (WithOutOCP_Cuboid geo_obj : geo_objects) {

			// Iteratively calculating the volume of each object
			// and adding it to the total volume
			vol_sum += geo_obj.length * geo_obj.breadth * geo_obj.height;
		}

		for (WithOutOCP_Sphere geo_obj : s_geo_objects) {

			// Iteratively calculating the volume of each
			// Sphere and adding it to the total volume
			vol_sum += (4 / 3) * Math.PI * geo_obj.radius * geo_obj.radius * geo_obj.radius;
		}
		// returning the to total volume
		return vol_sum;
	}
}