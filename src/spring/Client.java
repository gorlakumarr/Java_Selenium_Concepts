package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		// One Method
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);

		// Another Method

		ClassPathResource resource = new ClassPathResource("employeebean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee e2 = beanFactory.getBean("emp1", Employee.class);
		System.out.println(e2);
	}
}
