package com.founder.eds.web.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.founder.eds.core.Constants;
import com.founder.eds.dao.UserDao;
import com.founder.eds.dto.DefaultUserDetails;
import com.founder.eds.dto.LoginDto;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDetailsDao;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		
		List<LoginDto> userList = userDetailsDao.selectUserByUserId(username);
		
		DefaultUserDetails user = new DefaultUserDetails();
		
		if(userList != null && !userList.isEmpty())
    	{
			LoginDto loginDto = userList.get(0);
			
			if(!Constants.JOB_CATEGORY_MANAGER.equals(loginDto.getJobCategory()))
			{
			    throw new UsernameNotFoundException("User is not manager");
			}
			
    		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(Privilege.DEFAULT_PRIVILEGE);
            user = new DefaultUserDetails(username, loginDto.getUserName(), loginDto.getPassword(),true, authorities);
            return user;
    	}
		else
        {
            throw new UsernameNotFoundException("User not found");
        }
	}
}
