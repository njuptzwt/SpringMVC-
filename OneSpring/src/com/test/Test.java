package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.bean.Northman;
import com.bean.Southman;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new FileSystemXmlApplicationContext("src/applicationContext.xml");//�����ļ�ϵͳ��ѯapplicationContext.xml�����ļ�
		//ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Northman n=(Northman) ac.getBean("northMan");
		n.eat();
		n.drink();
		Southman s=(Southman) ac.getBean("southMan");
		s.eat();
		s.drink();
	}

}
