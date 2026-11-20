public class  ValidAnagram
{
     public static boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
          if(s.length()!=t.length())return false;

        String ch=s.toLowerCase();
         String ch1=t.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
           
             freq[ch.charAt(i)-'a']++;
             freq[ch1.charAt(i)-'a']--;

        }
       
        for(int a:freq)
        {
           if(a!=0)return false;
        }
       return true;
    }
      public static void main(String[] args)
      {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
      }
}