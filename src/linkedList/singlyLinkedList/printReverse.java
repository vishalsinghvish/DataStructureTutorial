package linkedList.singlyLinkedList;

public class printReverse {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
	   Node(int a){
		   data = a;
		   next = null;
		}
	}
	
	public void printList(){
		Node temp = head;
		int lengthList = 0;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
			lengthList++;
		} 
		System.out.println("The length of the linkedlist is:"+lengthList);
	}
	
	public void reverseList(){
		Node prevNode= null,temp = head,nextNode=null;
		while(temp!=null){
			nextNode = temp.next;
			temp.next = prevNode;
			prevNode = temp;
			temp = nextNode;
		}
		head=prevNode;
	}
	
	public static void main(String[] args) {
		printReverse lnklst = new printReverse(); 
		lnklst.head = new Node(13);
		Node second  = new Node(26);
		Node third = new Node(39);
		Node fourth = new Node(52);
		Node fifth = new Node(65);
		Node sixth = new Node(78);
		lnklst.head.next =second;
		second.next= third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		System.out.print("The main Linklist is:\n ");
		lnklst.printList();
		lnklst.reverseList();
		lnklst.printList();
	}

}



