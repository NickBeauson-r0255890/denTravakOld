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

    //Werkt nog niet -> Omzetten van price naar BigDecimal ? 
   @RequestMapping("/sandwich")
    public Sandwich sandwich(@RequestParam(value="name")String name, @RequestParam(value="price") BigDecimal price, @RequestParam(value="ingredients")String ingredients){
        return new Sandwich.SandwichBuilder(UUID.randomUUID())
                .withName(name)
                .withPrice(price)
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
