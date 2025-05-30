package com.pbl5.service.impl;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.pbl5.service.OtpService;

@Service
public class OtpServiceImpl implements OtpService {

	private final Map<String, String> otpStorage = new ConcurrentHashMap<>();
	private final Map<String, Long> otpTimeMap = new ConcurrentHashMap<>();

	public String generateOtp(String email) {
		String otp = String.valueOf(100000 + new Random().nextInt(900000));
		otpStorage.put(email, otp);
		otpTimeMap.put(email, System.currentTimeMillis());
		return otp;
	}

	public boolean verifyOtp(String email, String otp) {
		if (!otpStorage.containsKey(email))
			return false;

		Long otpTime = otpTimeMap.get(email);
		if (otpTime == null || System.currentTimeMillis() - otpTime > 60_000)
			return false;

		return otp.equals(otpStorage.get(email));
	}

	public void clearOtp(String email) {
		otpStorage.remove(email);
		otpTimeMap.remove(email);
	}

}
