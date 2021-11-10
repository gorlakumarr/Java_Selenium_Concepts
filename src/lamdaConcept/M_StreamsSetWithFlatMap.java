package lamdaConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class M_StreamsSetWithFlatMap {
	public static void main(String[] args) {

		M_Employee emp1 = new M_Employee();
		emp1.addDevices("iPhone8");
		emp1.addDevices("Samsung9");
		emp1.addDevices("iPhone9");
		emp1.addDevices("Mac Book Pro");

		M_Employee emp2 = new M_Employee();
		emp2.setEmpName("Tom");

		emp2.addDevices("Lenovo windows10");
		emp2.addDevices("Samsung9");
		emp2.addDevices("iPhone9");
		emp2.addDevices("Mac Book Air");

		List<M_Employee> l = new ArrayList<>();
		l.add(emp1);
		l.add(emp2);

		List<String> ll = l.stream().map(x -> x.getDevices()) // Stream of Set Of String
				.flatMap(x -> x.stream()) // Stream Of String
				.distinct().collect(Collectors.toList());
		ll.forEach(x -> System.out.println(x));
	}
}
