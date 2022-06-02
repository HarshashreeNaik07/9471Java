package com.demo.JPADesc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.demo.JPADesc.entity.Student;

public class Desc {  
	      
	      
	    public static void main( String args[]) {  
	             
	           
	         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
          EntityManager em = emf.createEntityManager();  
	          em.getTransaction().begin( );  
	          CriteriaBuilder cb=em.getCriteriaBuilder();  
	          CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
	            
	         Root<Student> stud=cq.from(Student.class);  
	           
	          
	         cq.orderBy(cb.desc(stud.get("s_age")));  
	          CriteriaQuery<Student> select = cq.select(stud);  
	          TypedQuery<Student> q = em.createQuery(select);  
          List<Student> list = q.getResultList();  
  
	          System.out.print("s_id");  
	             System.out.print("\t s_name");  
	             System.out.println("\t s_age");  
	            
          for(Student s:list)  
	          {  
	          System.out.print(s.getS_id());  
	          System.out.print("\t"+s.getS_name());  
	          System.out.println("\t"+s.getS_age());  
	          }  
	   
	em.getTransaction().commit();  
	          em.close();  
	          emf.close();    
	     }  
}