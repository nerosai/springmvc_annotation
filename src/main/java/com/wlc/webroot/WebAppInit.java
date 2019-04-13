package com.wlc.webroot;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Order(1)
public class WebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ApplicationContextXML.class};
    }

    protected Class<?>[] getServletConfigClasses() {
      /**/  return new Class<?>[]{ServletXML.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
