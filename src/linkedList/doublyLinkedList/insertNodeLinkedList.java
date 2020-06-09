package linkedList.doublyLinkedList;

public class insertNodeLinkedList {

	Node head;
	
	public static class Node{
		int data;
		Node prev,next;
		
		Node(int a){
			data=a;
			prev=null;
			next=null;
		} 
		}
	public void printList(){
		Node temp = head;
		int lengthList=0;
		while(temp!=null){
		System.out.print(temp.data+" ");
		lengthList++;
		temp= temp.next;
		}
		System.out.println("  --> An the length of the doubly LinkedList is "+lengthList);
	}
	
	public void insertHead(int data){
		Node newNode = new Node(data);
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	
	public void insertLast(int data){
		Node newNode = new Node(data);
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	public void insertOnRandom(int prevNodeData,int data){ // insert after the given prevNode
		Node newNode =new Node(data);
		Node temp=head, nexNode=null;
		while(temp!=null){
			if(temp.next==null && temp.data==data){
				temp.next = newNode;
		     	newNode.prev=temp;
		     	System.out.println("if1 executed");
			}
//			else if((temp.next==null) && (temp.data!= prevNodeData)){
//				System.out.print("Given Node is not present.");
//				System.out.println("ifelse executed");
//			}
			else{		     	
				nexNode = temp.next;
				System.out.println("else1 executed");
			if(temp.data==prevNodeData){
				temp.next = newNode;
				newNode.prev=temp;
				newNode.next = nexNode;
				nexNode.prev = newNode;
				temp = temp.next;
				System.out.println("if2 executed");
			}
			else
				temp = temp.next;
			System.out.println("else2 executed");
			System.out.println(temp.data);
			System.out.println(temp.next.data);
		}
		}
	}
	
//	public void insertOnRandom(int prevNodeData,int data){ // insert after the given prevNode
//		Node newNode =new Node(data);
//		Node temp=head, nexNode=null;
//		while(temp!=null){
//			if(temp.data==prevNodeData){
//				if(temp.next == null){
//					temp.next = newNode;
//					newNode.prev=temp;
//				}
//				else{
//				nexNode = temp.next;
//				}
//				temp.next = newNode;
//				newNode.prev=temp;
//				newNode.next = nexNode;
//				nexNode.prev = newNode;
//				temp = temp.next;
//				System.out.println("if executed");
//			}
//			else
//				temp = temp.next;
//			System.out.println("else executed");
//		}
//	}
	
	public static void main(String[] args) {
		insertNodeLinkedList lnklst = new insertNodeLinkedList();
		lnklst.head = new Node(12);
		Node second = new Node(24);
		Node third = new Node(36);
		Node fourth = new Node(48);
		Node fifth = new Node(60);
		Node sixth = new Node(72);
		Node seventh = new Node(84);
		lnklst.head.prev =null;
		lnklst.head.next=second;
		second.prev=lnklst.head;
		second.next = third;
		third.prev = second;
		third.next  =fourth;
		fourth.prev = third;
		fourth.next = fifth;
		fifth.prev = fourth;
		fifth.next = sixth;
		sixth.prev = fifth;
		sixth.next = seventh;
		seventh.prev = sixth;
		seventh.next =null;
		lnklst.printList();
		
		lnklst.insertHead(6);
		
		lnklst.printList();
		
//		lnklst.insertLast(108);
//		lnklst.printList();
		
		lnklst.insertOnRandom(60, 65);
		lnklst.printList();
	}

}
