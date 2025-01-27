package immnutable;

public class ImmutableAddress {

    private final String address;

    public ImmutableAddress(String address) {
        this.address = address;
    }

    public ImmutableAddress() {
        this.address = "기본 주소";
    }

    public String getAddress() {
        return address;
    }
}
