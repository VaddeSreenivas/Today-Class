package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Student;
import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		//create IOC Cotainer
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationcontext.xml");
		 BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationcontext.xml"));
		//GetBean Method
		WishGenerator wish=factory.getBean("wish",WishGenerator.class);
		String res=wish.generateMsg(" Siva");
		System.out.println(res);
		
		Student student=factory.getBean("student",Student.class);
		System.out.println("Name:"+student.getName());
		System.out.println("Id: "+student.getId());
		System.out.println("Address:"+student.getAddress());
	}

}
