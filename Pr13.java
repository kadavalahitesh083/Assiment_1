public class Pr13   
   
  public static void main(String[] args)
  {     
      String string = "It is a common misconception that canada the us and mexico are the only three country in north america";    
      String word = "",large="";    
      String[] words = new String[100];    
      int length = 0;    
          
    
      string = string + " ";    
          
      for(int i = 0; i < string.length(); i++)
      {    
              
          if(string.charAt(i) != ' ')
          {    
              word = word + string.charAt(i);    
          }    
          else
          {    
             
              words[length] = word;    
                  
              length++;    
                
              word = "";    
          }    
      }            
   
      large = words[0];    
          
         
      for(int k = 0; k < length; k++)
      {    
            if(large.length() < words[k].length())    
              large = words[k];    
      }    
     
      System.out.println("Largest word: " + large);    
  }  
