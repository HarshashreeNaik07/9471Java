package com.demo.jpaCascadePersist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaCascadePersist.entity.StudentEntity;
import com.demo.jpaCascadePersist.entity.Subject;

public class StudentCascade {  
	  
    public static void main( String[ ] args ) {  
            
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
           
         EntityManager em = emf.createEntityManager( );  
         em.getTransaction().begin();  
 
          
         StudentEntity s1=new StudentEntity();  
         s1.setS_id(101);  
         s1.setS_name("chiku");  
         s1.setS_age(20);  
           
         StudentEntity s2=new StudentEntity();  
         s2.setS_id(102);  
         s2.setS_name("chotu");  
         s2.setS_age(22);  
           
         Subject sb1=new Subject();  
         sb1.setName("English");  
         sb1.setMarks(80);  
         sb1.setS_id(s1.getS_id());  
             
         Subject sb2=new Subject();  
         sb2.setName("Maths");  
         sb2.setMarks(75);  
         sb2.setS_id(s2.getS_id());  
           
         s1.setSub(sb1);  
         s2.setSub(sb2);  
           
             
           
         em.persist( s1 );  
         em.persist(s2);  
         
         em.getTransaction().commit();  
 
         em.close( );  
         emf.close( );  
         
         
   }  
 
     
}
