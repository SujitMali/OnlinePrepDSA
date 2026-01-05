    package _1_Linear_Data_Structure_Practice;

    public class _1_LoopsInJava {
        public static void main(String args[])
        {
            outerLoop:
            for(int i = 0 ; i< 4; i++)
            {
                System.out.println("Entry in Outer with i : "+ i);
                for(int j = 0 ; j < 2 ; j++ )
                {
                    System.out.println("Entry in inner with j : "+ j);
                    if(i == 1 ){
                        break outerLoop;
                    }
                    System.out.println("Inner Loop j : "+ j);
                }

                System.out.println("Outer Loop i : "+ i);
            }
        }
    }
