//5.Write a java program to find maximum and minimum occurring character in an string
//Input : str = “grass is greener on the other side"
//Output : Minimum occurring character = a, Maximum occurring character = e
public class main{
public static void main(String[] args){
        int str="“grass is greener on the other side";
        int max=str[0];
        int min=str[0];
       
        for(int i=0;i<str.length;i++){
          if(str[i]>max){
           min=max;
           max=str[i];
          
           
               
       }else if (str[i]>min){
      
        min=str[i];
      
        }

        }
        System.out.println(max);
        System.out.println(min);
        }

     }


  
