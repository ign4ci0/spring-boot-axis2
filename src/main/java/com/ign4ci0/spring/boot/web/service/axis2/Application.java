package com.ign4ci0.spring.boot.web.service.axis2;

import java.io.IOException;

import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;
import org.apache.axis2.transport.http.AxisServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

/**
 * @author ignacio
 * @since Dec 3, 2018
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
    @Autowired
    Axis2ServiceRegister register;
    
    /**
     * @param args
     */
    public static void main ( String [ ] args )
    {
        SpringApplication.run ( Application.class, args );
    }
    
    public @Bean ServletRegistrationBean < AxisServlet > servletRegistration ( ) throws IOException
    {
        ServletRegistrationBean < AxisServlet > bean = new ServletRegistrationBean < AxisServlet > (
                                                            new AxisServlet ( ), "/ws-server/services/*" );
        bean.setLoadOnStartup ( 1 );
        bean.addInitParameter ( "axis2.repository.path", register.getRepoPath ( ) );
        bean.addInitParameter ( "axis2.xml.url", new ClassPathResource ( "axis2.xml" ).getURL ( ).toString ( ) );
        
        return bean;
    }
    
    @Override
    protected SpringApplicationBuilder configure ( SpringApplicationBuilder application )
    {
        return application.sources ( Application.class );
    }
    
    public @Bean ApplicationContextHolder getApplicationContext ( )
    {
        ApplicationContextHolder applicationContextHolder = new ApplicationContextHolder ( );
        return applicationContextHolder;
    }
}
