/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author HP
 */
public class CircularDoublyLinkedList {
     public  Node head;
      public Node temp;
     public int size;
     

    public CircularDoublyLinkedList() {
	  head= null;
	  size=0;
	}
	public class Node {
		 
		String data;
		Node next;
		Node prev;
               
		
		public Node( String data, Node prev, Node next ) {
			this.data=data;
			this.next= next;
			this.prev= prev;
		 }
                public Node (String data){
                    this.data=data;
                }
                
		}
        public void addFirst(String element) {
        Node tmp = new Node(element);
        if(head != null ) {
        head.prev.next = tmp;
        tmp.prev=head.prev;
        tmp.next=head;
        head.prev=tmp;
        }
        head = tmp;
        if(head.prev == null) { head.prev = tmp;}
        size++;
        System.out.println("adding at start: " + element);
    }// end of Node class
	//pass After=false to add at start;
	public void insert( String data,Object After ) {
            Node NewNode=new Node(data);
            if (After.equals(false)==true){
               addFirst(data);
            }
            else {
            Node temp=head;
            while(temp.data!=After){
                temp=temp.next;
            }
            temp.next.prev=NewNode;
            NewNode.next=temp.next;
            temp.next=NewNode;
            NewNode.prev=temp;
             System.out.println("Inserting: " +data + " After " + After);
         }
        }
        
     public void remove( Object data ) {
	Node temp=head;
        if (head.data==data){
            head.prev.next=head.next;
            head.next.prev=head.prev;
            head=head.next;
            System.out.println("Deleting: " +data);
        }
        else {
        while (temp.data!=data){
            temp=temp.next;
        }
        
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        System.out.println("Deleting: " +data);
        }
     }
	 public Node get( Object data ) {
             Node temp=head;
             boolean a=false;
             if (temp.prev.data!=data){
             while (temp!=head.prev){
                 if (temp.data==data){
                     a=true;
                     break;
                 }
                 else {
                     temp=temp.next;
                 }
              }
             }
             else {
             a=true;
             temp=head.prev;
             
             }
             
             if (a==true){
                 System.out.println("Found");
                 return temp;
             }
             else{
                 System.out.println("Not Found");
              
                 return null;
	 }
         }
	 public void iterateForward( ) {
             System.out.println("Iterating Forward: ");
             Node temp=head;
             while (temp!=head.prev){
                 System.out.println(temp.data);
                 temp=temp.next;
             }
             System.out.println(temp.data);
	 }
	 public void iterateBackward( ) {
              System.out.println("iterating backword..");
              Node temp=head.prev;
              while (temp!=head){
                  System.out.println(temp.data);
                  temp=temp.prev;
              }
              System.out.println(temp.data);
	}
 

	 boolean Check_Circular(){
             if (head.prev.next==head)
		 return true;
             else 
                 return false;
		 }
          public void addLast(String element) {
         
        if (head == null)  
    {  
        Node new_node = new Node(element);  
        
        new_node.next = new_node.prev = new_node;  
        head = new_node;    
    }  
        else {
    Node last = (head).prev;  
    Node new_node = new Node(element);  
    new_node.next = head;  
    (head).prev = new_node;
    new_node.prev = last;      
    last.next = new_node;  
}  
         
}
}
