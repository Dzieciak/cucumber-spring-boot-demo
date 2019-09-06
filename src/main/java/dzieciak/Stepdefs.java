package dzieciak;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;

@SpringBootTest(classes = {SomeService.class})
public class Stepdefs {

    private final SomeService service;

    public Stepdefs(SomeService service) {
        this.service = service;
    }

    @Given("something is logged on the console")
    public void logSomethingOnConsole() {
        service.doSomething();
    }

}
