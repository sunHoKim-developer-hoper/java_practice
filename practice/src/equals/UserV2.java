package equals;

public class UserV2 {
    
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserV2 other = (UserV2) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     return this.id.equals(((UserV2) obj).id);
    // }

    

}
