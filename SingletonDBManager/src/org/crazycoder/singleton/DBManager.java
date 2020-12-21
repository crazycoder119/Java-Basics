package org.crazycoder.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private  static volatile DBManager dbManager;
    private static volatile Connection connection;

    // No one is able to create a instance from this
    private DBManager(){
        if (dbManager!=null){
            throw new RuntimeException("Please use getDbManager method ");
        }
    }
    // we donot use synchronize here because there can be performance low you have to lock exact code check
    public static DBManager getDbManager() {
        if(dbManager==null) {
            // Double checking singleton because in here two threads comes at same time and create two instances
            synchronized (DBManager.class) {
                if(dbManager==null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }

    public Connection getConnection(){
        if(connection==null){
            synchronized (DBManager.class){
                if(connection==null){
                    /**
                     * https://www.youtube.com/watch?v=UuXkwgPkVPg
                     * https://db.apache.org/derby/papers/DerbyTut/install_software.html
                     * https://db.apache.org/derby/papers/DerbyTut/ij_intro.html
                     * Before using this we have to install derby and we have to add  1. derby.jar 2. derbyclient.jar 3. derbynet.jar 4. derbytools.jar
                     * from the installed path c apache folder
                     */

                    String url = "jdbc:derby:D:\\IdeaProjects\\Projects\\Singleton Design Pattern\\lib\\songbook;create=true; user=admin;password=admin";
                    try {
                        connection = DriverManager.getConnection(url,"admin","admin");
                    } catch (SQLException sqlException){
                        /* This is a bad habbit we have log these exceptions in a file in products */
                        sqlException.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

}
