/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public enum Status {
    
    REJECTED, PENDING, PROCESSING, APPROVED, NOT_VALID_CODE;
    
    public static void main(String[] args){
        
    Status status[] = Status.values();
 
        for (Status e : status) {
            System.out.println(e + " at code number : ");
        }
}    
}