package com.training.pms.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.training.pms.dto.SmsPojo;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Component
public class SmsService {
     private final String ACCOUNT_SID ="AC9d02442b9258cf891d84dea0a048892b";

    private final String AUTH_TOKEN = "448cc602f8547730f06e54517a3682b5";

    private final String FROM_NUMBER = "+18106710624";

    public void send(SmsPojo sms) throws ParseException {
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
      
    	
        int min = 100000;  
         int max = 999999; 
        int number=(int)(Math.random()*(max-min+1)+min);
      
        
        String msg ="Your OTP - "+number+ " please verify this OTP in your Application by group1 in RevSpace V3";
       
        
        Message message = Message.creator(new PhoneNumber(sms.getPhoneNo()), new PhoneNumber(FROM_NUMBER), msg)
                .create();
       
     
    }

    public void receive(MultiValueMap<String, String> smscallback) {
   
    }

}