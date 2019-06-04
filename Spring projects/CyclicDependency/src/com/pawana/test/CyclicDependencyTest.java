package com.pawana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pawana.pojo.A;
import com.pawana.pojo.B;

public class CyclicDependencyTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/pawana/cfgs/ApplicationContext.xml"));
		A a=factory.getBean("a", A.class);
		B b=factory.getBean("b", B.class);
		System.out.println(a+" "+b);

	}

}
