package com.training.pms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.dto.StoreOTP;
import com.training.pms.dto.TempOTP;

@RestController
public class VerifyOTPController {
	
		@PostMapping("/otp")
		public String verifyOTP(@RequestBody TempOTP sms) {
			
			if(sms.getOtp()==StoreOTP.getOtp())
				return "OTP Correct";
			else
				return "Not Correct OTP";
		}
}
