package com.avella.sample.swaggerapidocumentation;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/v1")
class PersonController {

    private final Flux<Person> allPerson = Flux.just(
            new Person("Anthony", "Paris"),
            new Person("Celia", "Paris"),
            new Person("Thomas", "Marseille")
    );

    @GetMapping("/person")
    Flux<Person> swaggerGetExample() {
        return allPerson;
    }

    @PostMapping("/person")
    Flux<Person> swaggerPostExample() {
        return allPerson;
    }

    @PutMapping("/person")
    Flux<Person> swaggerPutExample() {
        return allPerson;
    }

    @DeleteMapping("/person")
    Flux<Person> swaggerDeleteExample() {
        return allPerson;
    }
}
