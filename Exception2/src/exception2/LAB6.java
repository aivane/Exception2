/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception2;

/**
 *
 * @author Student
 */
public class LAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //System.out.println(e.getStackTrace());
            //e.printStackTrace();
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            
            for (int i=0; e.getStackTrace()>=i; i++) { 
            System.out.println(stackTraceElement[0].getClassName());
            System.out.println(stackTraceElement[0].getLineNumber());
            System.out.println(stackTraceElement[0].getMethodName());
            System.out.println(stackTraceElement[0].getFileName());
            }
        }
    }
    
}
