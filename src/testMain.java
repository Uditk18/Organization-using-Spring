import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import OrganizationSpring.Organization;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization org=(Organization) context.getBean("organization");
		System.out.println(org);
	}

}
