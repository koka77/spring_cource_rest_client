package org.udemyspringcource.somov.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.udemyspringcource.somov.rest.configuration.MyConfig;
import org.udemyspringcource.somov.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        получение всех сотрудников
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        получение сотрудника по ID
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);

//        обновление данных о сотруднике по ID
//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 800);
//        emp.setId(16);
//        communication.saveEmployee(emp);

//        удаление сотрудника по ID
        communication.deleteEmployee(16);
    }

}
