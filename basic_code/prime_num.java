class prime_num{
    public static void main(String[] args) 
    {
            int n=29;
            int temp=0;
        
            for(int j=2;j<=n-1;j++)
            {
                if(n%j==0)
                {
                   temp++;
                    
                }
               
            }
            if(temp>0)
            {
                System.out.println("non prime");
            }
            else{
                System.out.println("prime");
            }
            
        
        
        
      

    }
}