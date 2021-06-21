package com.sring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sring.jdbc.dao.StudentDaoImp;
import com.sring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/sring/jdbc/config.xml");
     //   StudentDaoImp studentDaoImp = context.getBean("studentdao",StudentDaoImp.class);
    
        //Student s2 = new Student();
        //s2.setName("manisha");
        //s2.setCity("birsiya");
        //s2.setId(2);
        //studentDaoImp.change(s2);
       //  List<Student> student = studentDaoImp.getAllStudent() ;    //  System.out.println(student);
        //student.toString();
        //for(Student s:student)
       // {
       // 	System.out.println(s);
       // }
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDaoImp studentDaoImp = context.getBean("studentDaoImp",StudentDaoImp.class);
        Student s1 = new Student();
        s1.setId(4);
        s1.setName("me");
       s1.setCity("pata");
       studentDaoImp.insert(s1);
}
}