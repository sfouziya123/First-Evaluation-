//1.Write an algorithm to reverse a string 
public class main{
public static void main(String[] args){

     String fouz="First Evaluation In Bootcamp";
     String str="";
     for(int i=fouz.length()-1;i>=0;i--){
     
    
     //for(int i=str.length-1;i>=0;i--){
     
     
     str=str+fouz.charAt(i);
     }
     System.out.println("original string"+fouz);
     System.out.println("reverse str"+str);
     
     
 }
 }

