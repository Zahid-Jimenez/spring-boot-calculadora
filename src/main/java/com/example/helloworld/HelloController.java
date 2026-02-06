import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fing.app.models.Product;

@RestController
public class Calc {

	
	
	
	
	@PostMapping("/prod") // Maps to POST /api/products
    public String createProduct(@RequestBody Product product) {
        
        System.out.println("Received product: " + product.getName());

        
        return "Ok";
    }
	//hola
	
	
	
	@RequestMapping("/")
	public String root() {
		
		return "Hola";
	}
	
	
	
	@GetMapping("/calc/{oper}/{n1}/{n2}")
    public String calc(@PathVariable int n1) 
	{
        
        return "n1 = " + n1;
    }
	
	
	
	@GetMapping("/users/{userId}")
    public String getUserDetails(@PathVariable Long userId, 
    		@RequestParam(value = "name", defaultValue = "World") String name) 
	{
        // Use the userId to fetch data, e.g., from a database
        return "User ID: " + userId + ", " + name;
    }
	
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, 
    		            @RequestParam(value = "carrera", defaultValue = "World") String carrera
    		) {
        return String.format("Hello %s!, %s", name, carrera);
    }
}
