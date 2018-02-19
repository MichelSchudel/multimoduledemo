package nl.craftsmen.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ApiController {

    @GetMapping("/person")
    public List<Person> hello() {
        Person person = new Person();
        person.setName("Mark");
        return Collections.singletonList(person);
    }
}
