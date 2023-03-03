package Singleton;

public class App {
    public static void main(String args[]) {
        Database db = Database.getInstance("maxcelant_db", "jerryiscool");
        db.connect();
        db.query("SELECT * FROM TBUSERS");

        Database db2 = Database.getInstance();
        db2.connect();
        db2.query("SELECT id FROM TBUSERS"); // db and db2 are the same object!!
    }
}
