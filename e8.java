//8.Write a java program to print Below pattern
//Input : [[*_*_*],[_*_*].[*_*_*]]
// * * *
 // _ _
 //  * *
// _  _
 //* * *
 
 public class main{
 public static void main(String[] args){
     int n=5;
     for(int i=0;i<n;i++){
     String bag="";
      for (int j=0;j<n;j++){
      
      if(j%2==0){
      if(i%2==1){
      bag=bag+"*"+"_";
      }
      }else if(j%2==1){
      if(i%2==0){
      
      
     
     bag=bag+"_"+"*";
 }
 }
 }
 
   System.out.println(bag);
 }
 
 }
 }
 
