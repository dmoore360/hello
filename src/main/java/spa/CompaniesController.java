package spa;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CompaniesController {
    //@RequestMapping(value = "/pets", method = RequestMethod.GET, consumes="application/json")

    /*@RequestMapping(value = "http://finance.yahoo.com/webservice/v1/symbols/aapl/quote?format=json&view=detail", method = RequestMethod.GET, consumes="application/json")
    public String getQuote(){

        return
    }*/

    public String index() {
        return "Greetings from Spring Boot Me!";
    }

}
