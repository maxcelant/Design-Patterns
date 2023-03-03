package Singleton;

import javax.xml.crypto.Data;

public class Database {

    private static Database instance;
    private String db_name;
    private String db_pass;

    private Database() {
        this.db_name = "dbname";
        this.db_pass = "password123";
    }

    private Database(String name, String pass) {
        this.db_name = name;
        this.db_pass = pass;
    }

    // To make sure its singleton !!
    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    // Parameterized Constructor (Assuming database isnt already created)
    public static Database getInstance(String name, String pass) {
        if (Database.instance == null) {
            Database.instance = new Database(name, pass);
        }
        return Database.instance;
    }

    public void connect() {
        System.out.println("Connect to server...");
    }

    public void query(String query) {
        System.out.println("Performing: " + query + " on " + this.db_name);
    }
}
