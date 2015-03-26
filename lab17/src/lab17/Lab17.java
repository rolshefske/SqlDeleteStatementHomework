package lab17;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lab17 {

    public static void main(String[] args) {
//1.      Using instructor sample project “GenericsAndSets” as a guide, create a List
//(choose from Vector or ArrayList) of your favorite hobby items, where each
//item is represented as a String value. Do not use generics. Populate the list
//with at least three items. Then loop through the list and print out the contents
//to the console. Don’t forget to cast items as your retrieve them for output.
//Next, insert some new items, then run the loop again, showing that the items
//were indeed added. Now remove one or two items and run the loop again to
//verify the removal worked.
 

        List hobbyList = new ArrayList();
        hobbyList.add("Reading and watching the news");
        hobbyList.add("Programming");
        hobbyList.add("Excercising");
        hobbyList.add("Stuff");
        
        for(int i=0; i < hobbyList.size(); i++) 
        {
            String s = (String)hobbyList.get(i);
            System.out.println(s);
        }   
        hobbyList.add("More stuff");
        hobbyList.add("Even more stuff");
        
        System.out.println("\n");
       
        
           for(int i=0; i < hobbyList.size(); i++) 
        {
            String s = (String)hobbyList.get(i);
            System.out.println(s);
        }   
        
        hobbyList.remove(2);
        hobbyList.remove(2);
        
                System.out.println("\n");
       
        
           for(int i=0; i < hobbyList.size(); i++) 
        {
            String s = (String)hobbyList.get(i);
            System.out.println(s);
        }  
        
        
//2. Create a new List consisting of three Employee objects (use the Employee
//class provided in the GenericsAndSets sample project under the “common”
//package. Use generics to create your list. Now loop through the list (using the
//new for-each style) and print out some meaningful information about each
//object. Verify that no cast was necessary. Do you use toString()?

 
List<Employee> employeeList = new ArrayList<Employee>();  

employeeList.add(new Employee("Smith", "John", "665485166"));
employeeList.add(new Employee("Hoth", "Billy", "783563573"));
employeeList.add(new Employee("Rick", "Olsh", "877345673"));

           for(int i=0; i < employeeList.size(); i++) 
        {
            String s = employeeList.get(i).getFirstName();
            String t = employeeList.get(i).getLastName();
            String d = employeeList.get(i).getSsn();
            System.out.println(s);
            System.out.println(t);
            System.out.println(d);
        }  
//           No cast was necessary and I did not use toString
        
// 3. Create a new List consisting of one or more Employee objects, plus one or
//more Dog objects (also from the common package). Do not use generics. Now
//loop through the list and print out some meaningful information about each
//object. What challenges does this present? How can you overcome these
//challenges? Did you remember to override the toString() method in the
//Employee and Dog classes? Did you call that method to output some
//meaningful information? If not, do that now.
        
           
           
           
           
 List dogEmployeeList = new ArrayList();
 
 dogEmployeeList.add(new Employee("Smith", "John", "665485166"));
 dogEmployeeList.add(new Employee("Hoth", "Billy", "783563573"));
 dogEmployeeList.add(new Employee("Rick", "Olsh", "877345673"));
 
 dogEmployeeList.add(new Dog("Barky1", 7361574));
 dogEmployeeList.add(new Dog("Barky2", 45623454));
 dogEmployeeList.add(new Dog("Barky3", 7252354));
// 
// 
//
// 
for(Object o : dogEmployeeList)
{
    System.out.println(o.toString());
}
           
           
           
           
           
           
           
//4. Create a Set of Employee objects (use the Employee class from the “common”
//package in the sample project) where there is at least one duplicate. Did the
//duplicate get removed? Did your remember to override equals() and
//hashCode()? Did you select one or more properties that uniquely identify an
//employee? If not, do that now and then run your program again.
        
        Set<Employee> employees = new TreeSet<Employee>();
        
        Employee a = new Employee("Smith", "John", "665485166");
        Employee b = new Employee("Hoth", "Billy", "783563573");
        Employee c = new Employee("Rick", "Olsh", "877345673");       
        
        employees.add(a);
        employees.add(b);
        employees.add(c);
        
        a.setSsn("333-33-3333");
        b.setSsn("333-33-3333");
        
        employees = new HashSet<Employee>(employees);   
        
      for(int i=0; i < employees.size(); i++)        
      {
//          Employee dd = employees(i);
          System.out.println();
      }
        
    }
    
}
