package com.demo.ManyToManyMapping;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.ManyToManyMapping.entity.Library;
import com.demo.ManyToManyMapping.entity.Student;



public class MTMMapping 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
        EntityManager em=emf.createEntityManager();  
 
        em.getTransaction().begin();  
      
         Student st1 = new Student("Akshay", null);
         Student st2 = new Student("Dipti", null);
         em.persist(st1);
         em.persist(st2);
         
         List<Student> al1 = new ArrayList<>();
         List<Student> al2 = new ArrayList<>();
         
         al1.add(st1);
         al1.add(st2);
         
         al2.add(st1);
         al2.add(st2);
         
         Library lib1 = new Library("MariaDB", al1);
         Library lib2 = new Library("MySQL", al2);
         em.persist(lib1);
         em.persist(lib2);
             
           	em.getTransaction().commit();  
           	em.close();  
        	emf.close();  
             
    }
}