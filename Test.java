package test;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        if (test.check("abcacbabcbacbcacbacabacbcabcbacabacbcacb"))
        {
            System.out.println("YAYYYYY!");
        }

       // test.check("abcba");
    }

    public boolean check(String str)
    {
        for (int i = 0 ; i < str.length(); i++)
        {
            for (int j = 1; j <= (str.length() - i) / 2; j++)
            {
                String first =str.substring(i, i + j);
                String second = str.substring(i+j, i+j+j);
                if (first.equals(second))
                {
                    System.out.println("Duplicated adjacent substrings found. The i = " + i + " and the j = " + j + " and the first = " + first
                    + " and the second = " + second);
                    return false;
                }
            }
        }
        return true;
    }
}
