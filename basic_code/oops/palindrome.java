public class palindrome {
    public static void main(String[] args) {
        String str="a man, a plan, a canal: Panama";
        

        String res="";


        String str1=str.toLowerCase().trim();

        String str2=str1.replaceAll("[,/,:, ]","");
        
        for(int i=str2.length()-1;i>=0;i--)
        {
            res=res+str2.charAt(i);
                
            

        }


        System.out.println(str2);
        System.out.println(res);

        if(str2.equals(res))
        {
            System.out.println("PALINDROME");
        }

    }
    
}
