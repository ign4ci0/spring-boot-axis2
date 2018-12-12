package com.ign4ci0.spring.boot.web.service.axis2;

import com.ign4ci0.spring.boot.web.service.axis2.generated.WSQueriesServiceSkeletonInterface;
import com.ign4ci0.spring.boot.web.service.axis2.generated.messages.ArrayOfXsdString;
import com.ign4ci0.spring.boot.web.service.axis2.generated.messages.GetInformation;
import com.ign4ci0.spring.boot.web.service.axis2.generated.messages.GetInformationResponse;
import com.ign4ci0.spring.boot.web.service.axis2.generated.messages.ObjectFactory;

/**
 * @author ignacio
 * @since Dec 5, 2018
 *
 */
public class WSQueriesDispatcher implements WSQueriesServiceSkeletonInterface
{
    
    /* (non-Javadoc)
     * @see com.ign4ci0.spring.boot.web.service.axis2.generated.WSQueriesServiceSkeletonInterface#getInformation(com.ign4ci0.spring.boot.web.service.axis2.generated.messages.GetInformation)
     */
    @Override
    public GetInformationResponse getInformation ( GetInformation getInformation )
    {
        ObjectFactory of = new ObjectFactory ( );
        GetInformationResponse response = of.createGetInformationResponse ( );
        ArrayOfXsdString value = of.createArrayOfXsdString ( );
        org.xmlsoap.schemas.soap.encoding.ObjectFactory soapenc = new org.xmlsoap.schemas.soap.encoding.ObjectFactory ( );
        value.getAny ( ).add ( soapenc.createAnyType ( new String ( "one" ) ) );
        value.getAny ( ).add ( soapenc.createAnyType ( new String ( "two" ) ) );
        response.setData ( value );
        return response;
    }
    
}
