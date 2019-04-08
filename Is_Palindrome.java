public class HelloWorld{

   
     
     public boolean ispalindrome(String s)
     {
        // divide to chararray
        String str = s.replaceAll("[\\W]", "");
        char[] c = str.toCharArray(); 
        int count_a = 0;
        int count_b = c.length - 1;
        
        while(count_a != count_b)
        {
            if(c[count_a] != c[count_b])
            {
                return false;
            }
            else
            {
                count_a ++;
                count_b --;
            }
        }
        return true;
     }
     public static void main(String[] args)
     {
         String string1 = "A man, a plan, a canal, Panama";
         HelloWorld h = new HelloWorld();
         
         boolean result = h.isPalindrome(string1);
         if(result)
         {
             System.out.println("Palindrome");
         }
         else{
             System.out.println(" Not a Palindrome");
         }
     }
     
     
       
        
}