public class Main {
    static int[] movezeros(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++) {
           // element is nonzero copy it to jth index
            if(a[i]!=0)
            {
a[j++]=a[i];

            if(i>j)
            {
                a[i]=0;
            }
}
        }
        return a;

    }



    public static void main(String[] args) {
        String str = " tsetTRe ";
        String str1 = "AmazonAzonma";
        String str3 = " I am a SDET";
         str3 =str3.trim();
        String stra[]=str3.split(" ");
        StringBuilder output=new StringBuilder();
for(String i:stra)
        {  //StringBuilder temp =new StringBuilder(stra[i]);
            String rev=new StringBuilder(i).reverse().toString();
            output.append(rev).append(" ");
        }
        System.out.println(output.toString());
        str=str.trim().toLowerCase();
        System.out.println(str);
        //System.out.println("Hello, World!");
        int[] a={1,0,5,6,0,0,0,9,0,1,0};
        for(int i:movezeros(a))
            System.out.print(i +" ");


    }
}