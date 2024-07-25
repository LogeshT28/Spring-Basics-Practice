package class1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentInfo extends DefaultHandler {

    boolean stname = false, stemail = false, stmob = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("student")) {
            String rno = attributes.getValue("rollono");
            System.out.println("Roll No: " + rno);
        } else if (qName.equals("name")) {
            stname = true;
        } else if (qName.equals("emailid")) {
            stemail = true;
        } else if (qName.equals("mobile")) {
            stmob = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (stname) {
            String stud_name = new String(ch, start, length);
            System.out.println("Student Name: " + stud_name);
            stname = false;
        }
        if (stemail) {
            String stud_email = new String(ch, start, length);
            System.out.println("Student Emailid: " + stud_email);
            stemail = false;
        }
        if (stmob) {
            String stud_mob = new String(ch, start, length);
            System.out.println("Student Mobile: " + stud_mob);
            stmob = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("student")) {
            System.out.println("**********************************");
        }
    }
}
