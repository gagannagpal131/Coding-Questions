import java.util.*;
import java.io.*;

class MyQueue{

     private class Node{
          int data;
          Node next;
     }

     Node head, tail;
     MyQueue(){
          this.head = null;
          this.tail = null;
     }

     public void insertNode(int data){

          Node newNode = new Node();

          if(head == null){
               newNode.data = data;
               newNode.next = null;
               head = tail = newNode;

          } else {
               newNode.data = data;
               newNode.next = null;
               tail.next = newNode;
               tail = newNode;
          }  
     }

     public void deleteNode(){

          if(head == null){
               System.out.println("Queue is empty\n");

          }else{
               if (head == tail){
                    head = tail = null;
               } else {
                    head = head.next;
               }
          }
     }

     public void displayQueue(){

          Node temp;
          temp = head;

          if(head == null){
               System.out.println("Queue is empty\n");
          }

          while(temp != null){
               System.out.print("<-"+temp.data);
               temp = temp.next;
          }
     }
}

public class LinkedQueue{

     public static void main(String[] args) {

          MyQueue myQueue = new MyQueue();

          int choice, data;

          Scanner sc = new Scanner(System.in); 

          while(true){

               System.out.println("\nenter your choice\n");
               System.out.println("1. Insert Data into Queue");
               System.out.println("2. Delete data from Queue");
               System.out.println("3. View Queue elements");
               System.out.println("4. Exit\n");
               choice = sc.nextInt();

               switch(choice){

                    case 1: 
                         System.out.println("Enter data to be inserted");
                         data = sc.nextInt();
                         myQueue.insertNode(data);
                         break;

                    case 2:
                         myQueue.deleteNode();
                         break;
                    
                    case 3:
                         myQueue.displayQueue();   
                         break;
                    
                    default:
                         System.exit(0);     
               }
          }
     }
}


