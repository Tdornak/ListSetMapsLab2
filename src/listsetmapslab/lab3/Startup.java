package listsetmapslab.lab3;

import java.util.ArrayList;
import java.util.List;

public class Startup {

    
    
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        //String lastName, String firstName, String ssn
        Employee e1 = new Employee("Smith", "john", "111-11-1111");
        Employee e2 = new Employee("Smith", "Sally", "222-22-2222");
        Employee e3 = new Employee("Stark", "Rob", "333-33-3333");
        Employee e4 = new Employee("Stark", "Rob", "333-33-3333"); 
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        System.out.println(list.size());
        
        Employee e5 = list.get(1);
        System.out.println(e5);
        
        for (Employee emp : list) {
            System.out.println(emp);
        }
        
        System.out.println(list.indexOf(e3));
        list.remove(e1);
        
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
