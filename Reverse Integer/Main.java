public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(reverse());
    }


    static int reverse()
    {
        int x=-2147483412;
        int ans=0;

        while(x!=0)
        {
            int rem;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)
                return 0;
            rem=x%10;
            x=x/10;
            ans=ans*10+rem;

        }
        return ans;
    }


}
