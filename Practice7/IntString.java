public class IntString implements StringInt{
    public int score(String A) {
        return A.length();
    }

    public String newString(String A) {
        String s = "";
        for (int i = 1; i <= A.length(); ++i)
        {
            if(!((i % 2) == 0))
            {
                s+=A.charAt(i-1);
            }
        }
        return s;
    }

    public String TeneT(String A) {
        String s = "";
        for (int i = 0; i < A.length(); ++i)
        {
            s+=A.charAt(A.length()-1-i);
        }
        return s;
    }
}