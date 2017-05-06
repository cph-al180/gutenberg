/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Andreas
 */
public class MySQLConnector {
    
    private static MySQLConnector connector;
    private EntityManagerFactory emf;
    
    private MySQLConnector(){
        connector = new MySQLConnector();
        emf = Persistence.createEntityManagerFactory("Gutenberg_PU");
    }
    
    public MySQLConnector GetCon(){
        return connector;
    }
    
    public EntityManager GetEM(){
        return emf.createEntityManager();
    } 
}
