package linkedList.circularLinkedList;

public class insertNodeLinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
				
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList(){
		Node currentNode=head,temp = head;
		int length=0;
		while(temp.next!=currentNode){
			System.out.print(temp.data+"-->");
			temp=temp.next;
			length++;
		}
		System.out.print(temp.data+"-->");
		length++;
		System.out.println("\nThe length of Linkedlist is: "+length);
	}
	
	public void insertHead(int data){
		Node newNode = new Node(data);
		Node temp=head;
		newNode.next =head;
		while(temp.next!=head){
			temp = temp.next;
		}
		temp.next=newNode;
		head = newNode;
	}
	
	public void insertLast(int data){
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next!= head){
			temp=temp.next;
		}
		temp.next =newNode;
		newNode.next = head;
	}
	
	public void insertRandom(int preData,int data){
		Node newNode = new Node(data);
		Node temp = head,nexNode =null;
		while(temp.next!= head){
			nexNode = temp.next;
			if(temp.data==preData){
				temp.next = newNode;
				newNode.next= nexNode;
				break;
			}
			else
				temp = temp.next;
		}
		if(temp.data == preData && temp.next==head){
			temp.next = newNode;
			newNode.next = head;
		}
		else
			System.out.println("Given node is not present.");
	}
	
	public void insertAtPosition(int pos,int data){
		Node newNode = new Node(data);
		Node temp= head,nexNode=null;
		int length=2;
		while(temp.next!=head){
			nexNode= temp.next;
			if(length==pos){
				temp.next = newNode;
				newNode.next = nexNode;
				temp = temp.next;
				length++;
			}
			else{
				temp = temp.next;
				length++;
			}	
		}
		if(temp.next==head && length==pos){
			temp.next = newNode;
			newNode.next = head;
		}
//		else
//			System.out.println("linkedlist is samll.");
	}
	
	public static void main(String[] args) {
		insertNodeLinkedList lnklst = new insertNodeLinkedList();
		lnklst.head = new Node(5);
		Node second = new Node(6);
		Node third = new Node(7);
		Node fourth = new Node(8);
		Node fifth = new Node(9);
		lnklst.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = lnklst.head;
		lnklst.printList();
//		lnklst.insertHead(1);
//		lnklst.printList();
//		lnklst.insertLast(2);
//		lnklst.printList();
//		lnklst.insertRandom(2, 4);
//		lnklst.printList();
		lnklst.insertAtPosition(2, 0);
		lnklst.printList();
	}

}
