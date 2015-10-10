package com.vitalik;
import java.io.*;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Utils utils = new Utils();

        System.out.println("Test console application");
        System.out.println("Args count - " + args.length);

        for(String arg: args)
            System.out.println(arg);


        String WorkingDir = System.getProperty("user.dir");
        System.out.println("Current dir: " + WorkingDir);

        try {
      /*      InputStream inputFile = new FileInputStream(WorkingDir + "\\test.xml");

            int size = inputFile.available();
            System.out.println("Total Available Bytes: " + size);

            for (int i = 0; i < size; i++) {
                System.out.print((char) inputFile.read());
            }
            System.out.println("------------------");

           //  File file = new File(WorkingDir + "\\test.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(WorkingDir + "\\test.xml"));

            doc.getDocumentElement().normalize();
            System.out.println("Root element " + doc.getDocumentElement().getNodeName());



            utils.printNode(doc.getChildNodes(), 1);
*/


            utils.getWeather("http://www.cbr.ru/scripts/XML_daily.asp?");

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



