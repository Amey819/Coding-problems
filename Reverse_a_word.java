   public String Reverse_words_string(String s)
     {
        // Reverse the entire string
        // then again reverse each word in the string to get result
        
        reverse(s,0,s.length() -1); // reverse the entire string
        int start = 0;
        while(end = find(s," ",start) != -1) // finds position of " " to complete a word in the string
        {
            reverse(s,start,end); // reverses each word
            start = end + 1; // start the next word
        }
        return s;
     }
     
     