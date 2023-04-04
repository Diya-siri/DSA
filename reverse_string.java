
//reverse the string
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char[] arr = str.toCharArray();
        String r="";
        for(int j=arr.length-1;j>=0;j--)
        { 
            r+=arr[j];
            
        }
        return r;
    }
}