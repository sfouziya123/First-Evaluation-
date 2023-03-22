//3.Given an array of number rearrange the array according to below example
//Input : Array = [-1,2,-3,3,6,9,8,-11]
//Output : Array = [2,6,8,3,9,-1,-3,-11]
public class main{
public static void main(String[] args){
       int [] arr={-1,2,-3,3,6,9,8,-11};
       String fouz="";
       String fouziya="";
       
       for(int i=0;i<arr.length;i++){
      
       if(arr[i]>0){
       
        fouz=fouz+arr[i];
   }else{
        fouziya=fouziya+arr[i];
 }
 
}

      System.out.println(fouz+fouziya);



}

}
