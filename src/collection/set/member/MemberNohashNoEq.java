package collection.set.member;

public class MemberNohashNoEq {

    private String id;

    public MemberNohashNoEq() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MemberNohashNoEq(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberNohashNoEq [id=" + id + "]";
    }
}
