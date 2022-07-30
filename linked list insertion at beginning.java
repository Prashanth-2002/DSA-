import java.util.*;


public class Main {
     public Node head = null;  
     public Node tail = null;    
    
    class Node{
        int data;
        Node next;
    
        Node(int data) {this.data = data; this.next = null; }

    }
       
    
     public void addAtStart(int data) {  
     Node newnode = new Node(data);  
        
        if(head==null){
          head = newnode;  
         tail = newnode;    
        }
        else {
            newnode.next=head;
             head=newnode;
        }
    }
    public void display() {  
        Node current = head;  
        if(head == null) {  
        System.out.println("List is empty");  
        return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
        System.out.print(current.data + " ");  
        current = current.next;  
        }  
        System.out.println();  
        }  
        
    
    public static void main(String[] args) {  

        Main sList = new Main();  
        
        sList.addAtStart(1);  
        sList.display();  
        
        sList.addAtStart(2);  
        sList.display();  
        
        sList.addAtStart(3);  
        sList.display();  
        
        sList.addAtStart(4);  
        sList.display();  
        }  
        } 
    
    






      




    
    

       
    
    


    

    





        



    

