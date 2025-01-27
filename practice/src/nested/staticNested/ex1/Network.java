package nested.staticNested.ex1;

public class Network {
    public void sendMessage(String text){
        NetworkMessage newworkMessage = new NetworkMessage(text);
        newworkMessage.print();
    }
}
