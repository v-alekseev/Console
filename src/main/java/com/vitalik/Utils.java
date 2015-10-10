package com.vitalik;




import org.apache.http.HttpEntity;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;





public class Utils {


    void getWeather(String url) throws IOException {

        System.out.println("Get weather from " + url);


        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        //HttpRequest request = new HttpRequest(url);
        httpget.setHeader("Accept", "application/json");

        CloseableHttpResponse response = httpclient.execute(httpget);
        System.out.println("http request " + httpget.toString());
        try {
            System.out.println("http response " + response.toString());
            HttpEntity entity = response.getEntity();
            System.out.println("http entity " + entity.toString());
            entity.writeTo(System.out);

        } finally {
            response.close();
        }

      //  HttpClient client = new DefaultHttpClient();

     //   DefaultHttpClient client = new DefaultHttpClient();
      //          HttpGet; request = new HttpGet("http://www.google.com");
       // HttpResponse response = client.execute(request);

        return;
    }

    public void printNode(NodeList nodeLst, int level){
        if(nodeLst == null)
            return;
        level++;
        for(int i=0; i< nodeLst.getLength(); i++){
            Node node = nodeLst.item(i);
            for(int j=0; j < level; j++)
                System.out.print("-");
            // System.out.print(node.getNodeType());
           if(node.getNodeType() == Node.ELEMENT_NODE)
               System.out.println("<" + node.getNodeName() + ">");
           if(node.getNodeType() == 3)
               System.out.println(node.getNodeValue());

            printNode(node.getChildNodes(), level);
        }
    }
}
