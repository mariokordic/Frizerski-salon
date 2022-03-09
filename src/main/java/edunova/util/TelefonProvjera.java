/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mkordic
 */
public class TelefonProvjera {
   public static boolean ispravanBroj(String str) {
       
       Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
       Matcher match = ptrn.matcher(str); 
       return (match.find() && match.group().equals(str));  
   }
}
