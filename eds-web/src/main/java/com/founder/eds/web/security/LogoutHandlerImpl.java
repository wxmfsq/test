package com.founder.eds.web.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

public class LogoutHandlerImpl implements LogoutHandler
{
    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
    {
    }
}
