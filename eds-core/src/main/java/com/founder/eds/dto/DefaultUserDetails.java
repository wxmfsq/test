package com.founder.eds.dto;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class DefaultUserDetails implements UserDetails{

	private static final long serialVersionUID = -29651602107495145L;
	private String username;
	private String realName;
	private String password;   
	private boolean enabled;   
	private List<GrantedAuthority> authorities; 

	public DefaultUserDetails() {
	}

	public DefaultUserDetails(String username, String realName,
			String password,boolean enabled,List<GrantedAuthority> authorities) {
		super();
		this.username = username;
		this.realName = realName;
		this.password = password;
		this.enabled = enabled;
		this.authorities = authorities;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {   
		return username;   
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {   
		return password;   
	}
	
	public boolean isEnabled(){   
		return enabled;   
	}

	public void setEnabled(boolean enabled){   
		this.enabled = enabled; 
	}
	
	public boolean isAccountNonExpired() {   
		return enabled;   
	}   

	public boolean isAccountNonLocked() {   
		return enabled;   
	}   
 
	public boolean isCredentialsNonExpired() {   
		return enabled;   
	}

	public List<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	} 
	
    @Override
    public boolean equals(Object rhs) {
        if (rhs instanceof DefaultUserDetails) {
            return username.equals(((DefaultUserDetails) rhs).getUsername());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return username.hashCode();
    }
}