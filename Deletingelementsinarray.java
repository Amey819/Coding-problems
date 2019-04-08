import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int writeindex = 1;
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(2);
        A.add(3);
        A.add(5);
        A.add(5);
        A.add(7);
        A.add(11);
        A.add(11);
        A.add(11);
        A.add(13);
        for(int i = 1; i < A.size() ; i++)
        {
            if(!A.get(writeindex - 1) .equals(A.get(i))
            {
                A.set(writeindex++ , A.get(i)); // i gets incremented till we find a non-repetetive integer and when we find we write it to the vacant spot
            }
        }
        System.out.println(writeindex);
}