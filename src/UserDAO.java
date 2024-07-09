import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<Integer, User> db = new HashMap<>();

    public void save(User user){
        db.put(db.size(), user);
    }

    public void updateUserInfo(){

    }
}
