package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size;

    public MyLinkedListV1() {
    }
    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null)
            first = newNode;
        else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        this.size ++;
    }
    private Node getLastNode() {
        Node x = this.first;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element){
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = this.first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }   
    public int indexOf(Object o){
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if(o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }

    
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1 [first=" + first + ", size=" + size + "]";
    }

}
