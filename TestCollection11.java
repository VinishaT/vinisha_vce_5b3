import java.util.*;  
import java.io.*;  
class TestCollection11{  
 public static void main(String args[]){  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  

  al.add("Rinky"); 
al.add("Rama");
al.add("Sant");
al.add("Rahul"); 
  //Traversing elements  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  