package dzieciak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;

@SpringBootTest(classes = {SomeService.class})
public class Stepdefs {

    private static final Logger LOG = LoggerFactory.getLogger(Stepdefs.class);

    private final SomeService service;

    public Stepdefs(SomeService service) {
        this.service = service;
    }

    @Given("something is logged on the console")
    public void logSomethingOnConsole() {
        LOG.info("Current thread is: {}", Thread.currentThread().getName());
        service.doSomething();
    }

}
