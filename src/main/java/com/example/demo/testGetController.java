package com.example.demo;
        import java.util.concurrent.atomic.AtomicLong;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class testGetController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/test-get", method = RequestMethod.GET)
    public testGet greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new testGet(counter.incrementAndGet(),
                String.format(template, name));
    }
}