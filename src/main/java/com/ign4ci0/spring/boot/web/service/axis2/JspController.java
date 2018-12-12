package com.ign4ci0.spring.boot.web.service.axis2;

import org.apache.axis2.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ignacio
 * @since Dec 3, 2018
 *
 */
@Controller
public class JspController
{
    private Logger logger = LoggerFactory.getLogger ( JspController.class );
    
    @RequestMapping ( "/WEB-INF/views/listServices.jsp" )
    public String services ( HttpServletRequest request, Model model )
    {
        logger.info ( "services map {}", request.getAttribute ( Constants.SERVICE_MAP ) );
        model.addAttribute ( "request", request );
        model.addAttribute ( "service", request.getAttribute ( Constants.SERVICE_MAP ) );
        return "listServices";
    }
}
