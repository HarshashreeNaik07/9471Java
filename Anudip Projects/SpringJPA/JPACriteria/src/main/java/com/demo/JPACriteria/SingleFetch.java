package com.demo.JPACriteria;


import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.demo.JPACriteria.entity.Student;
public class SingleFetch {  
    
    
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          CriteriaQuery<Student> cq=cb.createQuery(Student.class);    
         Root<Student> stud=cq.from(Student.class);  
         cq.multiselect(stud.get("s_name"));   
          CriteriaQuery<Student> select = cq.select(stud);  
          TypedQuery<Student> q = em.createQuery(select);  
          List<Student> list = q.getResultList();  
  
          System.out.println("s_name");  
        
          for(Student s:list)  
          {  
          System.out.println(s.getS_id());  
          }  
   
          em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}