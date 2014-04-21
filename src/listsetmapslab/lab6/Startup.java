package listsetmapslab.lab6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Startup {

    
    public static void main(String[] args) {
        Map<String,Employee> map = new TreeMap<String,Employee>();
        //String lastName, String firstName, String ssn
        Employee e1 = new Employee("Smith", "john", "111-11-1111");
        Employee e2 = new Employee("Smith", "Sally", "222-22-2222");
        Employee e3 = new Employee("Stark", "Rob", "333-33-3333");
        Employee e4 = new Employee("Stark", "Rob", "333-33-3334"); 
        
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);
        
        Collection<String> keys = map.keySet();
        System.out.println("looping through the keys");
        for (String key : keys) {
            System.out.println(key);
        }
        Collection<Employee> employees = map.values();
        System.out.println("Looping through the values");
        for ( Employee emp : employees) {
            System.out.println(emp);
        }
        
        
    }
}
