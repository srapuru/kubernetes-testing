package com.zetcode;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MyController {

    @GetMapping("/")
    public Publisher<String> home() {

        return Mono.just("Home page");
    }
}
