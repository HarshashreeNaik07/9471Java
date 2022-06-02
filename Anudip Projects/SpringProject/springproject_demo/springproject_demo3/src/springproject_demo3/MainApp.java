package springproject_demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
	      TextEditor te = (TextEditor) ac.getBean("textEditor");
	      te.spellCheck();
	    
	   }
	}