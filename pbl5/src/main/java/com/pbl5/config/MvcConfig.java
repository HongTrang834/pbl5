package com.pbl5.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/otp").setViewName("otp");
		registry.addViewController("/user/listening-exercise-card").setViewName("user/listening-exercise-card");
		registry.addViewController("/user/reading-exercise-card").setViewName("user/reading-exercise-card");
		registry.addViewController("/forgot-password").setViewName("forgot-password");
		
		registry.addViewController("/update-password-forgot").setViewName("update-password-forgot");
		//registry.addViewController("/user/account-information/update-password").setViewName("user/account-information/update-password");
		
	}

}

// MvcConfig này dùng để định tuyến (mapping) một số URL đến view mà không cần tạo controller riêng.