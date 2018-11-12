package controller;

import model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SandwichController {

   /* @RequestMapping("/sandwich")
    public Sandwich sandwich(@RequestParam(value="name")String name,@RequestParam(value="price")BigDecimal price, @RequestParam(value="ingredients")String ingredients){
        return new Sandwich.SandwichBuilder(UUID.randomUUID())
                .withName(name)
                .withPrice(price)
                .withIngredients(ingredients)
                .build();
    }*/

   /*
   @RequestMapping(value = "/")
   public String index(){
       return "index.jsp";
   }
   */


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
