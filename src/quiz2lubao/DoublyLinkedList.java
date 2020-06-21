/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2lubao;

/**
 *
 * @author Jeo
 */
public class DoublyLinkedList {

    public static void main(String[] args) {

        // In the Main class within the main method, declare an array of Person class with a size of five(5).
        Person[] persons = new Person[5];

        persons[0] = new Person("Jeo", "Lubao", "Philippines");
        persons[1] = new Person("Cardo", "Dalisay", "Manila");
        persons[2] = new Person("Xi", "Jinping", "China");
        persons[3] = new Person("Naruto", "Uzumaki", "Konoha");
        persons[4] = new Person("Kim", "Chiu", "Classroom");

        DNode<String> node1 = new DNode(null, persons[0].getFirstName(), persons[0].getLastName(), persons[0].getAddress(), null);
        DNode<String> node2 = new DNode(null, persons[1].getFirstName(), persons[1].getLastName(), persons[1].getAddress(), null);
        DNode<String> node3 = new DNode(null, persons[2].getFirstName(), persons[2].getLastName(), persons[2].getAddress(), null);
        DNode<String> node4 = new DNode(null, persons[3].getFirstName(), persons[3].getLastName(), persons[3].getAddress(), null);
        DNode<String> node5 = new DNode(null, persons[4].getFirstName(), persons[4].getLastName(), persons[4].getAddress(), null);

        DList<DNode> DoublyLinkedList = new DList<>();

        //Add each node into the DoublyLinkedList using the methods discussed during the session. 
        //Each add method must be utilized to test its functionality. 
        //These are the addFirst and addLast methods.
        
        
        //The ORIGINAL DoublyLinkedList would look like this
        // HEADER -> [Kim, Chiu, Classroom] -> [Xi, Jinping, China] -> [Cardo, Dalisay, Manila] ->[ Jeo, Lubao, Philippines] -> [Naruto, Uzumaki, Konoha] -> TRAILER
        DoublyLinkedList.addFirst(node1);
        DoublyLinkedList.addFirst(node2);
        DoublyLinkedList.addFirst(node3);
        DoublyLinkedList.addLast(node4);
        DoublyLinkedList.addFirst(node5);

        //Display the list. The display of the list must be a method call of a method ofDoublyLinkedList.
        System.out.println("\nBefore Remove");
        DoublyLinkedList.ofDoublyLinkedList();

        
        //Shows the functionality of removeFirst and removeLast methods. 
        //The doublylinkedlist would look like this
        // HEADER -> [Xi, Jinping, China] -> [Cardo, Dalisay, Manila] ->[ Jeo, Lubao, Philippines] -> [Naruto, Uzumaki, Konoha] -> TRAILER
        System.out.println("\nRemove First");
        DoublyLinkedList.removeFirst();
        DoublyLinkedList.ofDoublyLinkedList();

        //The doublylinkedlist would look like this
        // HEADER -> [Xi, Jinping, China] -> [Cardo, Dalisay, Manila] ->[ Jeo, Lubao, Philippines] -> TRAILER
        System.out.println("\nRemove Last");
        DoublyLinkedList.removeLast();
        DoublyLinkedList.ofDoublyLinkedList();

    }
}
