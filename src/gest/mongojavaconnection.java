
package gest;

import com.mongodb.MongoClient;

/**
 *
 * @author YANI
 */
public class mongojavaconnection {
    public static void main(String args[]) {
    
    MongoClient yani;
       yani = new MongoClient("localhost",27017);
    System.out.println("serveur connecter");
    
    }
    
}
