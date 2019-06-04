package com.pawana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pawana.model.Student;

public class SetterInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/pawana/cfgs/ApplicationContext.xml"));
		Student st=factory.getBean("st1", Student.class);
		
		System.out.println("Id: "+st.getId());
		System.out.println("Name: "+st.getName());
		System.out.println("Address: "+st.getAddress());
	}

}
