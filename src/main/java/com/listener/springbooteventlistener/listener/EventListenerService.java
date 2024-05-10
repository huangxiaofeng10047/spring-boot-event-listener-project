package com.listener.springbooteventlistener.listener;

import com.listener.springbooteventlistener.event.BaseEvent;
import com.listener.springbooteventlistener.event.OrderEvent;
import com.listener.springbooteventlistener.event.PersonEvent;
import com.listener.springbooteventlistener.model.Order;
import com.listener.springbooteventlistener.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerService {
    static   final Logger logger= LoggerFactory.getLogger(EventListenerService.class);

    @EventListener
public void handleEvent(BaseEvent<Person> event) {
        logger.info("PersonEvent received: {}", event);
}
    @EventListener
    public void handleOrderEvent(BaseEvent<Order> event) {
        logger.info("OrderEvent received: {}", event);
    }
//    @EventListener
//    public void handleEvent(BaseEvent<?>baseEvent){
//        Object data=baseEvent.getData();
//        if(data instanceof Order){
//            logger.info("OrderEvent received "+baseEvent);
//        }else if (data instanceof Person){
//            logger.info("PersonEvent received "+baseEvent);
//        }
//    }
}
