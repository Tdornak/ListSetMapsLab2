package listsetmapslab.lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Startup {

    
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<Employee>();
        //String lastName, String firstName, String ssn
        Employee e1 = new Employee("Smith", "john", "111-11-1111");
        Employee e2 = new Employee("Borg", "Sally", "222-22-2222");
        Employee e3 = new Employee("Stark", "Rob", "333-33-3333");
        Employee e4 = new Employee("Robert", "Rob", "444-44-4444"); 
        
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        
        System.out.println("sorting by the natural");
        for ( Employee emp : set) {
            System.out.println(emp);
        }
        
        List<Employee> list = new ArrayList<Employee>(set);
        
        Collections.sort(list, new EmployeeByLastName());
        System.out.println("sorting by lastName");
        for ( Employee emp : list) {
            System.out.println(emp);
        }
    }
}
