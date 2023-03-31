package singleton;

import singleton.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        DBConnection dbConnection3 = DBConnection.getInstance();
        DBConnection dbConnection4 = DBConnection.getInstance();
        DBConnection dbConnection5 = DBConnection.getInstance();

        dbConnection.getUsernameById(1);

        System.out.println("Hello world!");
    }
}