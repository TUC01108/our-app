package com.training.pms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.dto.TempOTP;

@RestController
public class VerifyOTP {
	
		@PostMapping("/otp")
		public String verifyOTP(@RequestBody TempOTP sms) {
			
			if(sms.getOtp()==123455)
				return "OTP Correct";
			else
				return "Not Correct OTP";
		}
}
