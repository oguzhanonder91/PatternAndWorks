package jaxwsExample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by oguzhanonder on 21/03/17.
 */



// 1. create a webservice endpoint interface


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {

    @WebMethod String getHelloWorldAsString(String name);
}
