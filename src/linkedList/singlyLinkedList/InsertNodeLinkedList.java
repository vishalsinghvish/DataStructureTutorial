package linkedList.singlyLinkedList;

public class InsertNodeLinkedList {

	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int a){
			 data =a;
		     next= null;
		}
	}
	
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void insertHead(int insertData){
		Node newHead = new Node(insertData);
		newHead.next = head;
		head = newHead;
	}
	
	public void inserLast(int insertData){
		Node newLast = new Node(insertData);
		if(head==null){
			head = newLast;
//			newLast.next =null;
			return;
		}
		Node last= head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = newLast;
		newLast.next= null;
	}
	
	public void insertOnRandom(Node preNode,int insertData){
		Node newRandom = new Node(insertData);
		
	if(preNode==null){
		System.out.println("Previous Node can't be null.");
		return;
	}
	newRandom.next = preNode.next;
	preNode.next = newRandom;
	}
	
	public static void main(String[] args) {
		InsertNodeLinkedList lnklst = new InsertNodeLinkedList();
		lnklst.head = new Node(15);
		Node second = new Node(18);
		Node third = new Node(20);
		lnklst.head.next = second;
		second.next= third;
		System.out.println("The main Linklist is:");
		lnklst.printList();
		System.out.println("\n");
		
		lnklst.insertHead(11);
		System.out.println("After inserting new head Linklist is:");
		lnklst.printList();
		System.out.println("\n");
		
		lnklst.inserLast(23);
		System.out.println("After inserting last node Linklist is:");
		lnklst.printList();
		System.out.println("\n");
		
		lnklst.insertOnRandom(second, 19);
		System.out.println("After inserting random node Linklist is:");
		lnklst.printList();
	}

}
