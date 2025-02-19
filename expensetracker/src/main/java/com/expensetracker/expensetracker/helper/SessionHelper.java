package com.expensetracker.expensetracker.helper;


import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpSession;

@Component
public class SessionHelper {

    public  String removeSession() {
        try {
            System.out.println("Removing message from session");
            HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
            session.removeAttribute("registeredSuccessfully");
        } catch (Exception e) {
            System.out.println("Error in SessionHelper: " + e);
            e.printStackTrace();
        }
        return "";
    }
    
}
