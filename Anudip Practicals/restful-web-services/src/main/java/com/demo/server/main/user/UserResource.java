package com.demo.server.main.user;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class UserResource   
{  
@Autowired  
private UserDaoService service;  
@GetMapping("/users")  
public List<User> retriveAllUsers()  
{  
return service.findAll();  
}  
}  
