package jaxwsExample;

import javax.jws.WebService;

/**
 * Created by oguzhanonder on 21/03/17.
 */


// 2. Create a Web Service Endpoint Implementation

@WebService(endpointInterface = "jaxwsExample.HelloWorld")
public class HelloWordImpl implements HelloWorld{
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS" + name;
    }
}
