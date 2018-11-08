package application;

import model.Greeting;
import model.Sandwich;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SandwichController {

    //run & go to localhost:8080/sandwich?name=cheese&price=3.2&ingredients=cheese, lettuce, eggs
        //-> shows json of created sandwich   {"name":"cheese","price":3.20,"ingredients":"cheese, lettuce, eggs"}
   @RequestMapping("/sandwich")
    public Sandwich sandwich(@RequestParam(value="name")String name, @RequestParam(value="price") String price, @RequestParam(value="ingredients")String ingredients){
       BigDecimal priceDecimal = new BigDecimal(price).setScale(2,BigDecimal.ROUND_HALF_UP);
       return new Sandwich.SandwichBuilder(UUID.randomUUID())
                .withName(name)
                .withPrice(priceDecimal)
                .withIngredients(ingredients)
                .build();
    }

    @RequestMapping(value="/test")
    public String home(){
        return "Test ";
    }
     private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

}
