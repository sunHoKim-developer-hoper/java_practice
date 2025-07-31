package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {

        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        // 연결된 노드 탐색하기
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode : " + lastNode);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node thirdNode = getNode(first, index);
        System.out.println("thirdNode : " +thirdNode.item);

        // 데이터 추가하기
        add(first, "D");
        System.out.println(first);
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public static void printAll(Node x) {
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
    private static void add(Node node, String item) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(item);
    }
}
