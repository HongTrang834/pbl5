package com.pbl5.security;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pbl5.model.User;
import com.pbl5.service.UserService;

@Service
@ControllerAdvice
public class CustomUserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userService.findByUsername(username);
			
		if(user == null) {
			throw new UsernameNotFoundException("Not found " + username);
		}
		
		Collection<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
		
		grantedAuthoritySet.add(new SimpleGrantedAuthority(user.getRole().getRoleName()));
		
		return new CustomUserDetails(user, grantedAuthoritySet);
		
	}
	
	@ModelAttribute("currentUserAvatarUrl")
    public String getAvatarUrl() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() &&
            !(authentication instanceof AnonymousAuthenticationToken)) {
            String username = authentication.getName();
            User user = userService.findByUsername(username);
            return user != null ? user.getAvatarUrl() : null;
        }
        return null;
    }
	
	@ModelAttribute("currentUserUsername")
    public String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() &&
            !(authentication instanceof AnonymousAuthenticationToken)) {
            String username = authentication.getName();
            User user = userService.findByUsername(username);
            return user != null ? user.getUsername() : null;
        }
        return null;
    }
	
	@ModelAttribute("currentUserEmail")
    public String getEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() &&
            !(authentication instanceof AnonymousAuthenticationToken)) {
            String username = authentication.getName();
            User user = userService.findByUsername(username);
            return user != null ? user.getEmail() : null;
        }
        return null;
    }

}