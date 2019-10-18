package testPackage;


public class LinkedList {

    LinkedListNode head;

    public LinkedList () {
        head = null;
    }

    public void add(HashEntry data) {

        LinkedListNode toAdd = new LinkedListNode(data);
        if(head == null) {
            head = toAdd;
        } else {
            LinkedListNode temp = head;

            //parse until you find the end node
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = toAdd;
        }
    }

    public HashEntry get(int index){

        //keep getting the next one in the list that many times.
        LinkedListNode temp = head;
        for(int i = 0; i < index; i++){
            if(temp.next != null)
                temp = temp.next;
            else
                return null;
        }

        return temp.nodeValue;
    }

}
