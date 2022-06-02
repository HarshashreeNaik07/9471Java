package com.demo.jpaCascadeRemove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaCascadeRemove.entity.StudentEntity;

public class StudentCascade {  
	  
    public static void main( String[ ] args ) {  
            
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
           
         EntityManager em = emf.createEntityManager( );  
         em.getTransaction().begin();  
 
          
         StudentEntity s=em.find(StudentEntity.class, 101);  
         em.remove(s);  
           
         
         em.getTransaction().commit();  
 
         em.close( );  
         emf.close( );  
         
         
   }  
 
     
}