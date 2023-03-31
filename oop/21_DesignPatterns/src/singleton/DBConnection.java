package singleton;


public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }

        return instance;
    }

    public String getUsernameById(int id) {
        return "username";
    }
}
