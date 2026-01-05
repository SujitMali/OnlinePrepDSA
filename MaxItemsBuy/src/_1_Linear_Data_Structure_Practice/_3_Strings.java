package _1_Linear_Data_Structure_Practice;

public class _3_Strings {
    public static void main(String args[])
    {
        StringBuilder st = new StringBuilder("Hello");
        for(int i = 0; i < st.length()/2; i++)
        {
            char temp = st.charAt(i);
            st.setCharAt(i, st.charAt(st.length() - 1 - i));
            st.setCharAt((st.length() - 1 - i), temp);

        }

        System.out.println(st);

    }
}
