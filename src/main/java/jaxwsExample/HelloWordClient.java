package jaxwsExample;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by oguzhanonder on 21/03/17.
 */
public class HelloWordClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above

        QName qName = new QName("http://jaxwsExample/","HelloWordImplService");

        Service service = Service.create(url,qName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        System.out.println(helloWorld.getHelloWorldAsString("---GERDAN"));
    }
}
