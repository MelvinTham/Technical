package src;

public class LinkedList {
    private static Node head;
    private static int countNodes = 0;

    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static class linkList
    {
       public void addHead(int data)
       {
            Node newHead;
            newHead = new Node(data);
            newHead.next = head;
            head = newHead;
            countNodes++;
       }
       public void insert(int data)
       {
           if(head == null)
           {
               head = new Node(data);
               countNodes++;
               return;
           }
           else
           {
               Node tmp = head;
               while(tmp.next != null)
               {
                   tmp = tmp.next;
               }

               tmp.next = new Node(data);
           }
           countNodes++;
       }
       public void deleteHead()
       {
           if(head == null)
           {
               System.out.println("List is empty");
           }
            Node tmp = head;
            head = head.next;
            tmp = null;
            countNodes--;
            return;
       }

       public void deleteTail()
       {
           if(head == null)
           {
               System.out.println("List is empty");
           }
           else if(head.next == null)
           {
               head = null;
           }
           else {
               Node currentTail = head;

               while (currentTail.next.next != null) {
                    currentTail = currentTail.next;
               }
               currentTail.next = null;
               countNodes--;

           }
       }


       public void printList(){


           if(head == null)
           {
               System.out.println("List is empty");
           }
           else
           {
               Node tmp = head;

               while(tmp != null)
               {
                   System.out.println(tmp.data);
                   tmp = tmp.next;
               }

           }

       }

    }
    public static void main(String[] args) {
        linkList link = new linkList();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.addHead(2);
        link.deleteHead();
        link.deleteTail();
        link.printList();
        System.out.println("Number of Nodes:" + countNodes);

    }
}
