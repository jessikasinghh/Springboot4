package com.example.springboot4.Controller;

//UC8
import com.example.springboot4.Entity.Greeting;
import com.example.springboot4.Service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public Greeting saveGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName
    ) {
        String message = greetingService.generateGreeting(firstName, lastName);
        return greetingService.saveGreeting(message);
    }

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.findGreetingById(id);
    }

    @GetMapping
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestParam String newMessage) {
        return greetingService.updateGreeting(id, newMessage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGreeting(@PathVariable Long id) {
        boolean deleted = greetingService.deleteGreeting(id);
        if (deleted) {
            return ResponseEntity.ok("Greeting with ID " + id + " deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Greeting with ID " + id + " not found.");
        }
    }
}


////UC7
//import com.example.springboot4.Entity.Greeting;
//import com.example.springboot4.Service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/greetings")
//public class GreetingController {
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    @PostMapping
//    public Greeting saveGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName
//    ) {
//        String message = greetingService.generateGreeting(firstName, lastName);
//        return greetingService.saveGreeting(message);
//    }
//
//    @GetMapping("/{id}")
//    public Greeting getGreetingById(@PathVariable Long id) {
//        return greetingService.findGreetingById(id);
//    }
//
//    @GetMapping
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//
//    @PutMapping("/{id}")
//    public Greeting updateGreeting(@PathVariable Long id, @RequestParam String newMessage) {
//        return greetingService.updateGreeting(id, newMessage);
//    }
//}
//



//UC6
//import com.example.springboot4.Entity.Greeting;
//import com.example.springboot4.Service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/greetings")
//public class GreetingController {
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    @PostMapping
//    public Greeting saveGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName
//    ) {
//        String message = greetingService.generateGreeting(firstName, lastName);
//        return greetingService.saveGreeting(message);
//    }
//
//    @GetMapping("/{id}")
//    public Greeting getGreetingById(@PathVariable Long id) {
//        return greetingService.findGreetingById(id);
//    }
//
//    @GetMapping
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//}
//



////UC5
//import com.example.springboot4.Entity.Greeting;
//import com.example.springboot4.Service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/greetings")
//public class GreetingController {
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    @PostMapping
//    public Greeting saveGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName
//    ) {
//        String message = greetingService.generateGreeting(firstName, lastName);
//        return greetingService.saveGreeting(message);
//    }
//
//    @GetMapping("/{id}")
//    public Greeting getGreetingById(@PathVariable Long id) {
//        return greetingService.findGreetingById(id);
//    }
//}


////UC4
//import com.example.springboot4.Entity.Greeting;
//import com.example.springboot4.Service.GreetingService;
//import org.springframework.web.bind.annotation.*;
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
//    @PostMapping
//    public Greeting saveGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName
//    ) {
//        String message = greetingService.generateGreeting(firstName, lastName);
//        return greetingService.saveGreeting(message);
//    }
//}



//import com.example.springboot4.Entity.Greeting;
//import com.example.springboot4.Entity.User;
//import com.example.springboot4.Service.GreetingService;
//import org.springframework.web.bind.annotation.*;
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
//    @PostMapping
//    public Greeting getGreeting(@RequestBody User user) {
//        return greetingService.getGreeting(user);
//    }
//}
//
//

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