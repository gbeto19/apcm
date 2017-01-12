
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Teste {
    
    
    
    
    Session session = HibernateUtil.getSessionFactory().openSession(); 
     Transaction t = session.getTransaction();
    
     
     
}
