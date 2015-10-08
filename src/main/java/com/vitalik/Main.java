package com.vitalik;
import java.io.*;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Test console application");
        System.out.println("Args count - " + args.length);

        for(String arg: args)
            System.out.println(arg);


        String WorkingDir = System.getProperty("user.dir");
        System.out.println("Current dir: " + WorkingDir);

        try {
            InputStream inputFile = new FileInputStream(WorkingDir + "\\test.xml");

            int size = inputFile.available();
            System.out.println("Total Available Bytes: " + size);

            for (int i = 0; i < size; i++) {
                System.out.print((char) inputFile.read());
            }
            System.out.println("------------------");

             File file = new File(WorkingDir + "\\test.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            //Document doc = db.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element " + doc.getDocumentElement().getNodeName());
            NodeList nodeLst = doc.getElementsByTagName("employee");
            System.out.println("Information of all employees");
            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("firstname");
                    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                    NodeList fstNm = fstNmElmnt.getChildNodes();
                    System.out.println("First Name : " + ( fstNm.item(0)).getNodeValue());
                    NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
                    Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
                    NodeList lstNm = lstNmElmnt.getChildNodes();
                    System.out.println("Last Name : " + ( lstNm.item(0)).getNodeValue());
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.toString());
        }


        String name;  // переменна€ дл€ имени
        Scanner in = new Scanner(System.in);
       // name = con.readLine("¬ведите свое им€: ");
        System.out.print("¬ведите свое им€: ");
        name = in.nextLine();//считываем одну строку целиком

        //System.out.println("Name - " + name);
        System.out.println("Name - " + name);

    }
}
