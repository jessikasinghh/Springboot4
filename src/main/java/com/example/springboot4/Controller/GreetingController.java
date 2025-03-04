package com.example.springboot4.Controller;

import com.example.springboot4.Entity.Greeting;
import com.example.springboot4.Entity.User;
import com.example.springboot4.Service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public Greeting getGreeting(@RequestBody User user) {
        return greetingService.getGreeting(user);
    }
}



//import com.example.springboot4.Entity.Greeting;
//import org.springframework.web.bind.annotation.*;
//import com.example.springboot4.Service.GreetingService;
//
//
//@RestController
//@RequestMapping("/greetings")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    @GetMapping("/hello")
//    public Greeting getSimpleGreeting() {
//        return greetingService.getSimpleGreeting();
//    }
//
//    @GetMapping("/{name}")
//    public Greeting getGreeting(@PathVariable String name) {
//        return greetingService.getPersonalizedGreeting(name);
//    }
//
//    @PostMapping
//    public Greeting createGreeting(@RequestBody String name) {
//        return greetingService.createGreeting(name);
//    }
//
//    @PutMapping("/{name}")
//    public Greeting updateGreeting(@PathVariable String name) {
//        return greetingService.updateGreeting(name);
//    }
//
//    @DeleteMapping("/{name}")
//    public Greeting deleteGreeting(@PathVariable String name) {
//        return greetingService.deleteGreeting(name);
//    }
//}
//


//@RestController
//@RequestMapping("/greetings")
//public class GreetingController {
//
//    @GetMapping("/{name}")
//    public Greeting getGreeting(@PathVariable String name) {
//        return new Greeting("Hello, " + name + "!");
//    }
//
//    @PostMapping
//    public Greeting createGreeting(@RequestBody String name) {
//        return new Greeting("Greeting created for " + name);
//    }
//
//    @PutMapping("/{name}")
//    public Greeting updateGreeting(@PathVariable String name) {
//        return new Greeting("Greeting updated for " + name);
//    }
//
//    @DeleteMapping("/{name}")
//    public Greeting deleteGreeting(@PathVariable String name) {
//        return new Greeting("Greeting deleted for " + name);
//    }
//}