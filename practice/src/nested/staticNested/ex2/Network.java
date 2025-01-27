package nested.staticNested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage newworkMessage = new NetworkMessage(text);
        newworkMessage.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
