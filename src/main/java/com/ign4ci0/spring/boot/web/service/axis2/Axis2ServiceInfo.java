package com.ign4ci0.spring.boot.web.service.axis2;

import org.springframework.core.io.Resource;

/**
 * @author ignacio
 * @since Dec 3, 2018
 *
 */
public class Axis2ServiceInfo
{
    private String   name;
    
    private Resource resource;
    
    public String getName ( )
    {
        return name;
    }
    
    public void setName ( String name )
    {
        this.name = name;
    }
    
    public Resource getResource ( )
    {
        return resource;
    }
    
    public void setResource ( Resource resource )
    {
        this.resource = resource;
    }
}
