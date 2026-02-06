
package encapsulation;


public class EncapsulationMain  {

    
    public static void main(String[] args) {
        
        Person man = new Person();
        
        System.out.println(man.getName());
        
        man.setAge(10);
        man.setName("John");
        man.setAge(21);
        System.out.println(man.getName());
        System.out.println(man.getAge());
        
        
        
    }
    
}
