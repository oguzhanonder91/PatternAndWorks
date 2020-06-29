package jaxwsExample;

import javax.xml.ws.Endpoint;

/**
 * Created by oguzhanonder on 21/03/17.
 */


//3. Create a Endpoint Publisher


public class HelloWorldPublisher {
    public static void main(String[] args) {

        Endpoint.publish("http://127.0.0.1:9999/ws/hello",new HelloWordImpl());
    }
}

