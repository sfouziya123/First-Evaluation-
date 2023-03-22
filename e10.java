 //10.Write a java program to generate prime numbers from a range of  0 to n, Check sum of two prime numbers  is equal target value. Print two values
//Input : n = 20;
//Output: 3, 17
public class main{

  public static void main(String[] args){
  
  int num=20;
  String target=true;
       for(int i=1;i<=num;i++){
        int count=0;
         for(int j=1;j<=num;j++){
         if(i%j==0){
         if(target==false){
         count++;
         }
         }
       }
       if(count==2){
        System.out.println(i+" "+target);
  }
  }
}
}

