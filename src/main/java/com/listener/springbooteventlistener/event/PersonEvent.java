package com.listener.springbooteventlistener.event;

import com.listener.springbooteventlistener.model.Person;
import lombok.Data;

@Data
public class PersonEvent {
   private Person person;

   private String addOrUpdate;

   public PersonEvent(Person person, String addOrUpdate) {
       this.person = person;
       this.addOrUpdate = addOrUpdate;
   }
}
