package com.corejava.ds;

public class SelfLinkList {
	
	Node head; 
	
    static class Node {
 
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    public static SelfLinkList insert(SelfLinkList list,
                                    int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
 
        return list;
	}
	
	public static void printList(SelfLinkList list) {
				
		Node currNode =list.head;
		 System.out.print("LinkedList: ");
		
		while (currNode !=null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		
	}
	
	public static SelfLinkList deteNode(SelfLinkList list,int key) {
		
		Node currentNode = list.head;
		Node prev=null;
		
		if(currentNode !=null && currentNode.data==key) {
			list.head = currentNode.next;
			return list;
		}
		while (currentNode!=null && currentNode.data!=key) {
			prev = currentNode;
			currentNode = currentNode.next;			
		}
		
		if(currentNode!=null) {
			prev.next =currentNode.next;
			
		}
		
		return list;
		
	}
	
	public static SelfLinkList deleteNodeFromSpecificIndex(SelfLinkList list,int index) {
		
		Node cuNode =list.head;
		Node prev=null;
		
		if(index==0 && cuNode!=null) {
			list.head=cuNode.next;
			return list;
		}
		int counter =0;
		
		while (cuNode!=null) {
			if(index==counter) {
				prev.next=cuNode.next;
				break;
			}else {
				prev = cuNode;
				cuNode=cuNode.next;
				counter++;
			}
			
		}
		if(cuNode==null) {
			System.out.println("test");
		}
		return list;
	}
	
	public static void main(String[] args)
    {
        /* Start with the empty list. */
    	SelfLinkList list = new SelfLinkList();
 
        //
        // ******INSERTION******
        //
 
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
 
        // Print the LinkedList
        printList(list);
        
       // deteNode(list,1);
        
        //printList(list);
        deleteNodeFromSpecificIndex(list, 4);
        printList(list);
    }
}
