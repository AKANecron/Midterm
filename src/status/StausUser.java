/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    private String value;
    
    public StausUser(int code)
    {
        this.value = value;

        switch(code)
            {
            case 0: 
                value = "ZERO";
            break;
            case 1: 
                value = "ONE";
            break;
            case 2:
                value = "TWO";
            break;
            case 3: 
                value = "THREE";
            break;
            default:
                value = "FOUR";
            break;
            }
    } 
   
    public String toString(){
        return value;
    }
}
