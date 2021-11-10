package lamdaConcept;

import java.util.HashSet;
import java.util.Set;

public class M_Employee {

	private String empName;
	private Set<String> devices;

	// public Employee(String empName, Set<String> devices) {
	// this.empName = empName;
	// this.devices = devices;
	// }

	public void addDevices(String deviceName) {
		if (devices == null) {
			this.devices = new HashSet<>();
		}
		this.devices.add(deviceName);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

}
