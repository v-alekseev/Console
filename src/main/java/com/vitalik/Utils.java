package com.vitalik;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Utils {

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
