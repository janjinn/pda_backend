public class User {
    private String id;
    private String psw;

    public User(String id, String psw) {
        this.id = id;
        this.psw = psw;
    }

    public String getName(){
        return id;
    }

    public void setName(String id) {
        this.id = id;
    }
}
