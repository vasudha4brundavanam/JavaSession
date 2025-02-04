
import java.util.List;

import java.util.ArrayList;

public class Liset {
   /* list =1,2,3
    list2=2,3,4
    o/p:5*/

    //optimisize using hashset
    public static void main(String[] args)
    {

        List<Integer> a = List.of(1,2,3);
        List<Integer>  b= List.of(2,3,4);
        int result=0;
        for(Integer each:a){
            if(b.contains(each))
                result+=each;
        }
        System.out.println(result);
    }

}
