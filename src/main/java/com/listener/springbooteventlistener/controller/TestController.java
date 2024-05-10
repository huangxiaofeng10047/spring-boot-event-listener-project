package com.listener.springbooteventlistener.controller;

import javax.annotation.Resource;

import com.listener.springbooteventlistener.event.BaseEvent;
import com.listener.springbooteventlistener.event.OrderEvent;
import com.listener.springbooteventlistener.event.PersonEvent;
import com.listener.springbooteventlistener.model.Order;
import com.listener.springbooteventlistener.model.Person;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Resource
  private ApplicationEventPublisher applicationContext;
@GetMapping("/publicEvent")
    public void publishEvent(){
//       applicationContext.publishEvent(new PersonEvent(new Person("why"),"add"));
//       applicationContext.publishEvent(new OrderEvent(new Order("why"),"add"));
    applicationContext.publishEvent(new BaseEvent(new Person("why"),"add"));
    applicationContext.publishEvent(new BaseEvent(new Order("why"),"add"));

    }
}
