package com.founder.eds.web.security;

import org.springframework.security.access.ConfigAttribute;

public class SecureUrl implements ConfigAttribute
{
    private static final long serialVersionUID = -4328324059439910754L;

    private String attr;
    
    public SecureUrl(String attr)
    {
        this.attr = attr;
    }
    
    @Override
    public String getAttribute()
    {
        return this.attr;
    }

}
