package com.dido.mrws.controllers;

import com.dido.mrws.constans.Params;
import com.dido.mrws.model.Person;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class GreetingController {

  private final AtomicLong id = new AtomicLong();

  @GetMapping
  public Person greeting(
      @RequestParam(value = "name", defaultValue = "enter param -> ?name=value") String name,
      @RequestParam(value = "lastName", defaultValue = "enter param -> ?lastName=value") String lastName,
      @RequestParam(value = "age", defaultValue = "") Integer age,
      @RequestParam(value = "address", defaultValue = "enter param -> ?address=value") String address) {
    return new Person(id.incrementAndGet(), String.format(Params.template, name), lastName, age,
        address, Params.URL_EXAMPLE);
  }

}
