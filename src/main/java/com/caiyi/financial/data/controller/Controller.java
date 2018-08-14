package com.caiyi.financial.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caiyi.financial.data.model.ReturnMessage;

/**
 * Created by zph  Date：2017/8/10.
 */
@SuppressWarnings({"rawtypes","unchecked"})
@RestController
public class Controller {

	@Autowired
    private KafkaTemplate kafkaTemplate;

	@RequestMapping(value = "/send", method = RequestMethod.GET)
    public ReturnMessage send(@RequestParam(required = true) String topic, @RequestParam(required = true) String message) {
        kafkaTemplate.send(topic, message);
        ReturnMessage returnMessage = new ReturnMessage(message, topic, "OK", "200");
        return returnMessage;
    }
	

	@RequestMapping(value = "/sendTo", method = RequestMethod.POST)
    public ReturnMessage sendTo(@RequestParam(required = true) String topic, @RequestParam(required = true) String message) {
        kafkaTemplate.send(topic, message);
        ReturnMessage returnMessage = new ReturnMessage(message, topic, "OK", "200");
        return returnMessage;
    }

}
