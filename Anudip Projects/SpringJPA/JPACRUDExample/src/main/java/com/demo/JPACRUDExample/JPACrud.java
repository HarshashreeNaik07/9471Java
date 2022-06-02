package com.demo.JPACRUDExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;
import java.util.List;

import com.demo.JPACRUDExample.entity.Player;

public class JPACrud 
{
    public static void main( String[] args )
    {
    	JPACrud.createRecord();
    	JPACrud.retrieveRecord();
    	JPACrud.updateRecord();
    	//JPACrud.deleteRecord(); 
    	JPACrud.findbyNamedQueryRecord();
    	JPACrud.findbyfuzzyNamedQueryRecord();
    	

    }
    
private static void createRecord() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPACRUD");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin(); 
	    Player p1 = new Player();
	    	p1.setLoginName("Harshashree");
	    	p1.setPassword("Naik06");
	    	p1.setEmailAddress("harshashree.naik06@gmail.com");
	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	       // Date date = new Date();
	        p1.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
	    	p1.setVerified(true);
	    	p1.setLastAccessTime(new java.util.Date());
	    	
	    	Player p2 = new Player();
	    	p2.setLoginName("Akshay");
	    	p2.setPassword("Shimpi06");
	    	p2.setEmailAddress("akshayshimpi06@gmail.com");
	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	       // Date date = new Date();
	        p2.setRegistrationDate(new java.util.GregorianCalendar(2017,05,23));
	    	p2.setVerified(true);
	    	p2.setLastAccessTime(new java.util.Date());

	    	Player p3 = new Player();
	    	p3.setLoginName("Dipti");
	    	p3.setPassword("Patankar30");
	    	p3.setEmailAddress("dipti.patankar30@gmail.com");
	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	       // Date date = new Date();
	        p3.setRegistrationDate(new java.util.GregorianCalendar(2017,05,25));
	    	p3.setVerified(true);
	    	p3.setLastAccessTime(new java.util.Date());
	    	
	    	Player p4 = new Player();
	    	p4.setLoginName("Ritesh");
	    	p4.setPassword("Shinde17");
	    	p4.setEmailAddress("riteshshinde17@gmail.com");
	    	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	       // Date date = new Date();
	        p4.setRegistrationDate(new java.util.GregorianCalendar(2017,05,25));
	    	p4.setVerified(true);
	    	p4.setLastAccessTime(new java.util.Date());
	    	
	    	
	    	
	    	em.persist(p1);
	    	em.persist(p2);
	    	em.persist(p3);
	    	em.persist(p4);
	    	
	    	em.getTransaction().commit();
	    	Query query = em.createQuery("select p from Player p");
	    	
	    	List<Player> list =query.getResultList();  
	          System.out.println("Player details :");  
	          for(Player s:list) {  
	                
	             System.out.println(s);      
	          }
	    	em.close();
	    	emf.close();
}
	

	private static void findbyfuzzyNamedQueryRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACRUD");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Query query=  entityManager.createNamedQuery("player.findByFuzzyEmail");
		query.setParameter("email", "%scja%");
		List<Player> players = query.getResultList();

		for (Player playa : players) {
			System.out.println(playa);
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println(player.getLoginName());
		}
		entityManager.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	private static void findbyNamedQueryRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACRUD");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Query query=  entityManager.createNamedQuery("player.findByEmail");
		query.setParameter("email", "mj@mcnz.com");
		List<Player> players = query.getResultList();

		for (Player playa : players) {
			System.out.println(playa);
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println(player.getLoginName());
		}
		
		entityManager.getTransaction().commit();
	}



	//private static void deleteRecord() {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACRUD");
		//EntityManager entityManager = emf.createEntityManager();
		//entityManager.getTransaction().begin();

		//Long key = Long.valueOf(1);
		//Player p = entityManager.find(Player.class, key);
		//entityManager.remove(p); // record is deleted
		//System.out.println("Delete Data");
		//System.out.println(p.getPassword());

		//entityManager.getTransaction().commit();
		
	//}

	private static void updateRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACRUD");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin(); 

		Long key = Long.valueOf(1);
		Player p = entityManager.find(Player.class, Long.valueOf(1));
		p.setPassword("kowabunga");
		System.out.println("Update Data");
		System.out.println(p.getPassword());

		entityManager.getTransaction().commit();
		
	}

	private static void retrieveRecord() {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPACRUD");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin();
	    
	    Long key = Long.valueOf(1);
		Player p = em.find(Player.class, key);
		System.out.println("Retrieve Data");
		System.out.println(p.getPassword()+"    "+ p.getLoginName());
		
		
		em.getTransaction().commit();
	}

	
	
	
	
}
