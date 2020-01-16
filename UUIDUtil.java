package com.test;

import java.nio.ByteBuffer;
import java.util.UUID;
 
public class UUIDUtil {
 
    public static void main(String args[]) {
    	shortUUID();
   
    }
    public static void shortUUID() {
    	String uui = "bolidene621d081-85cb-4951-adea-49b88d7f4ab0";
    	System.out.println(UUID.nameUUIDFromBytes(uui.getBytes()).toString());
    	String abc = UUID.nameUUIDFromBytes(uui.getBytes()).toString();
    	System.out.println(abc);
    	
  	 // String uui = "e621d081-85cb-4951-adea-49b88d7f4ab0";
  	//  System.out.println(uui.getBytes());
  	    long l = ByteBuffer.wrap(abc.getBytes()).getLong();
  	  //System.out.println(l);
  	  System.out.println(Long.toString(l, Character.MAX_RADIX));
  	}
}
