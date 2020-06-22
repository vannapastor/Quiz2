/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author user
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Person<String> Person1 = new Person(null, "Person1", null,"firstname","lastname","address");
        Person<String> Person2 = new Person(null, "Person2", null,"firstname","lastname","address");
        Person<String> Person3 = new Person(null, "Person3", null,"firstname","lastname","address");
        Person<String> Person4 = new Person(null, "Person4", null,"firstname","lastname","address");
        Person<String> Person5 = new Person(null, "Person5", null,"firstname","lastname","address");
        
        PerList<Person> PerList = new PerList<>();
        PerList.addFirst(Person1);
        PerList.addFirst(Person2);
        PerList.addFirst(Person3);
        PerList.addFirst(Person4);
        PerList.addLast(Person5);
        
        System.out.println("Before Remove");
        PerList.DoublyLinkedList();
        
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + PerList.removeFirst().getElement());
        PerList.DoublyLinkedList();
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + PerList.removeFirst().getElement());
        PerList.DoublyLinkedList();
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + PerList.removeFirst().getElement());
        PerList.DoublyLinkedList();
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + PerList.removeFirst().getElement());
       PerList.DoublyLinkedList();
        
        
        System.out.println("\nAfter Remove Last");
        System.out.println("Removed: " + PerList.removeLast().getElement());
        PerList.DoublyLinkedList();
        
         System.out.println("\nAfter Remove Last");
        PerList.DoublyLinkedList();
     }
}