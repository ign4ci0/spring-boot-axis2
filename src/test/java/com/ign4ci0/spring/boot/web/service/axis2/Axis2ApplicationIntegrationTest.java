package com.ign4ci0.spring.boot.web.service.axis2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ignacio
 * @since Dec 3, 2018
 *
 */
@RunWith ( SpringRunner.class )
@SpringBootTest ( classes= Application.class, webEnvironment = WebEnvironment.RANDOM_PORT )
public class Axis2ApplicationIntegrationTest
{
    @Test
    public void testAxis2service ( )
    {
        
    }
}
