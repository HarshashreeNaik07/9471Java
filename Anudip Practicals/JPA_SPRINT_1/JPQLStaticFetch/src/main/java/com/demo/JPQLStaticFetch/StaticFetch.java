package com.demo.JPQLStaticFetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.JPQLStaticFetch.entity.Student;

public class StaticFetch 
{
	
	     public static void main( String args[]) {  
	             
	          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
	          EntityManager em = emf.createEntityManager();  
	          em.getTransaction().begin( );  
	                    
	          Query query = em.createNamedQuery("find name");  
	          @SuppressWarnings("unchecked")  
	        List<Student> list =query.getResultList();  
	          System.out.println("Student Name :");  
	          for(Student s:list) {   
	        	  System.out.println(s.getS_name()); //System.out.println(s.getS_id() +" " +  s.getS_name() + " " + s.getS_age()); can do these too    
	          }
	          em.close();  
	          emf.close();    
	     } 
	}