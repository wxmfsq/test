package com.founder.eds.web.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class DatabaseFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource
{

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException
    {
        if ((object == null) || !this.supports(object.getClass())) 
        {
            throw new IllegalArgumentException("Object must be a FilterInvocation");
        }
        
        Collection<ConfigAttribute> result = new ArrayList<ConfigAttribute>();
        ConfigAttribute attr = new SecureUrl(Privilege.DEFAULT_PRIVILEGE_ID);
        result.add(attr);
        
        return result;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes()
    {
        Collection<ConfigAttribute> authorize = new ArrayList<ConfigAttribute>();
        ConfigAttribute attr = new SecurityConfig(Privilege.DEFAULT_PRIVILEGE_ID);
        authorize.add(attr);
        attr = new SecurityConfig("ROLE_r001");
        authorize.add(attr);
        attr = new SecurityConfig("ROLE_r002");
        authorize.add(attr);
        attr = new SecurityConfig("ROLE_r003");
        authorize.add(attr);
        attr = new SecurityConfig("ROLE_r004");
        authorize.add(attr);
        
        return authorize;
    }

    @Override
    public boolean supports(Class<?> clazz)
    {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }

}
