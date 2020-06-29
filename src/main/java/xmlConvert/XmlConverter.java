package xmlConvert;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.net.URL;

public class XmlConverter {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
           Object o =  xmlMapper.readValue(new URL("http://www.tcmb.gov.tr/kurlar/today.xml"),Object.class);
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
