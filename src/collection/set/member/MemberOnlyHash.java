package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberNohashNoEq [id=" + id + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
