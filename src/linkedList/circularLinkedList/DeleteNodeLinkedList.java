package linkedList.circularLinkedList;

public class DeleteNodeLinkedList {

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
	
	public void deleteNodeBydata(int d){
		Node temp=head,preNode=null,nexNode=null;
		if(temp.data==d){
			while(temp.next!=head){
				temp=temp.next;
			}
			temp.next=head.next;
			head=head.next;
		}
		else{
		while(temp.next!=head){
			if(temp.data==d){
				preNode.next= nexNode;
				preNode=temp;
				temp=temp.next;
				nexNode=temp.next;
			}
			else{
				preNode=temp;
				temp=temp.next;
				nexNode=temp.next;
			}
		}
		if(temp.data==d){
			preNode.next =nexNode;
		}
		}
	}
	
	public void deleteNodeByPosition(int position){
		Node temp=head,preNode=null,nexNode=null;
		int length=1;
		if(position==1){
			while(temp.next!=head){
				temp=temp.next;
			}
			temp.next=head.next;
			head=head.next;
		}
		else{
		while(temp.next!=head){
			if(length==position){
				preNode.next=nexNode;
				preNode=temp;
				temp=temp.next;
				nexNode=temp.next;
				length++;
			}
			else{
				preNode=temp;
				temp=temp.next;
				nexNode=temp.next;
				length++;
			}
		}
		if(temp.next==head && length==position){
			preNode.next=head;
		}
		}
	}
	
	public static void main(String[] args) {
		DeleteNodeLinkedList lnklst = new DeleteNodeLinkedList();
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
//		lnklst.deleteNodeBydata(5);
		lnklst.deleteNodeByPosition(1);
		lnklst.printList();
	}

}
