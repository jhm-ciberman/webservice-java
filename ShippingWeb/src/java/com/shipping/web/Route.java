/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author jhmci
 */
public class Route {
    
    protected String route;
    
    protected Pattern regexPattern;
    
    protected String method;
    
    protected String controller;
    
    protected String controllerAction;
    
    public Route(String method, String route, String action) {
        this.method = method;
        this.route = route;
        this.regexPattern = compileRegex(route);
        String[] act = action.split("@");
        this.controller = act[0];
        this.controllerAction = act[1];
    }
    
    protected Pattern compileRegex(String route) {
        if (! route.endsWith("/")) {
            route += "/";
        }
        
        route = route.replace("/", "\\/");
        System.out.print(route);
        return Pattern.compile("^" + route + "?$");
    }
    
    protected Controller makeController() {
        try {
            String name = "com.shipping.web." + this.controller;
            
            Class<Controller> clazz = (Class<Controller>) Class.forName(name);
            return clazz.newInstance();
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Response callControllerAction(Request request) {
        Controller controller = this.makeController();
        if (controller == null) {
            return null;
        }
        try {
            
            Method[] methods = controller.getClass().getMethods();
            for (Method method : methods) {
                if (method.getName().equals(this.controllerAction)) {
                    if (method.getParameterCount() == 1) {
                        return (Response) method.invoke(controller, request);
                    } else {
                        return (Response) method.invoke(controller);
                    }
                }
            }
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException ex) {
            Logger.getLogger(Route.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Route.class.getName()).log(Level.SEVERE, null, ex.getCause());
        }
        return null;
    }
    
    
}
