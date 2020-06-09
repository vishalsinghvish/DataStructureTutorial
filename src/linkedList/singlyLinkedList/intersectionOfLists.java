package linkedList.singlyLinkedList;

import linkedList.singlyLinkedList.AddingNumberInList;

public class intersectionOfLists extends AddingNumberInList{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
	   Node(int a){
		   data = a;
		   next = null;
		}
	}
	
	public void printLst(){
		Node temp = head;
		int LengthList =0;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
			LengthList++;
		}
		System.out.println(" --> And the length of the list is "+LengthList);
	}
	
	public void intersectionLst(Node head1){
		Node temp =head1;
		int len=0;
		int[] lst1={};
//		int[] lst1={}, lst2={};
		while(temp!=null){
			lst1[len] = temp.data;
			len++;
			temp = temp.next;
		}
		for(int i=0;i<len ;i++){
		System.out.println(lst1[i]);
		}
	}
	
	public static void main(String[] args) {
		intersectionOfLists lnklst1 = new intersectionOfLists();
		intersectionOfLists lnklst2 = new intersectionOfLists();
		lnklst1.head = new Node(1);
		Node second  = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		lnklst1.head.next =second;
		second.next= third;
		third.next=fourth;
		
		lnklst2.head = new Node(4);
		Node second2  = new Node(3);
		Node third2 = new Node(7);
		Node fourth2 = new Node(2);
		lnklst2.head.next =second;
		second2.next= third2;
		third2.next=fourth2;
		
		System.out.print("The main Linklist is:\n ");
		lnklst1.printLst();
		lnklst2.printLst();
		lnklst1.intersectionLst(lnklst1.head);
	}

}
