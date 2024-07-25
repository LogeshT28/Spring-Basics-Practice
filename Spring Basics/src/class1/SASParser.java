package class1;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SASParser {
    public static void main(String[] args) {
        try {
            StudentInfo sf = new StudentInfo();
            File f = new File("G:\\Java\\src\\class1\\College_info.xml");
            SAXParserFactory sft = SAXParserFactory.newInstance();
            SAXParser sp = sft.newSAXParser();
            sp.parse(f, sf);
        } catch(Exception obj) {
            obj.printStackTrace();
        }
    }
}
