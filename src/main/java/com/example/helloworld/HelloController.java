package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	
	@RequestMapping("/")
	public String root() {
		
		return "Hola finalmente :')";
	}
	
	
	
	@GetMapping("/calc/{oper}/{n1}/{n2}")
    public String calc(@PathVariable String oper,@PathVariable int n1,@PathVariable int n2)
	{
        if("suma".equals(oper)){
            return "Resultado: " + (n1 + n2);
        }
        return "Operación no soportada";
    }
	
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello ";
    }
}
