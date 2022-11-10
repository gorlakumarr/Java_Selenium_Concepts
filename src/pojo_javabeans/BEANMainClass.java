package pojo_javabeans;

public class BEANMainClass {
//BEAN
	public static void main(String[] args) {

		Employee_Bean bean = new Employee_Bean();
		bean.setEmpId(10);
		bean.setName("Sam");
		bean.setSalary(100.0);

		System.out.println(bean.getEmpId());
		System.out.println(bean.getName());
		System.out.println(bean.getSalary());
	}
}