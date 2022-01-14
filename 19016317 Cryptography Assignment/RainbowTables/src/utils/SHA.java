/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author benja
 */

//Handles SHA1 hash creation
public class SHA {
     /*
    Function converts a byte array to hex
    Takes an input as a byte array, converts it to hexadecimal 
    returns it as a string
    */
    public static String convertToHex(byte[] data) { 
        StringBuffer buf = new StringBuffer(); 
        for (int i = 0; i < data.length; i++) { 
        	int halfbyte = (data[i] >>> 4) & 0x0F; 
        	int two_halfs = 0; 
        	do { 
	            if ((0 <= halfbyte) && (halfbyte <= 9)) 
	                buf.append((char) ('0' + halfbyte)); 
	            else 
	            	buf.append((char) ('a' + (halfbyte - 10))); 
	            halfbyte = data[i] & 0x0F; 
        	} while(two_halfs++ < 1); 
        } 
        
        return buf.toString(); 
    } 
    /*
    Produces a SHA1 hash as output from a given string
    Takes in the input string in parameters and converts to sha1
    returns a SHA1 hash a byte array
    */
    public static byte[] SHA1(String text)  
    throws NoSuchAlgorithmException, UnsupportedEncodingException  { 
	MessageDigest md; 
	md = MessageDigest.getInstance("SHA-1"); 
	byte[] sha1hash = new byte[40]; 
	md.update(text.getBytes("iso-8859-1"), 0, text.length()); 
	sha1hash = md.digest(); 
	return sha1hash; // Just take out this its raw representation and pass that through the big int
    
    }
    /*
    Produces a SHA1 hash as output from a given string
    Takes in the input string in parameters and converts to sha1
    returns a SHA1 hash a string
    */
    public static String SHA1toString(String text)  
    throws NoSuchAlgorithmException, UnsupportedEncodingException  { 
	MessageDigest md; 
	md = MessageDigest.getInstance("SHA-1"); 
	byte[] sha1hash = new byte[40]; 
	md.update(text.getBytes("iso-8859-1"), 0, text.length()); 
	sha1hash = md.digest(); 
	return convertToHex(sha1hash); 
    
    }
}
