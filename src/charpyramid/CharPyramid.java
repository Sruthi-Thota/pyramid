package charpyramid;




public class CharPyramid {

    public static void main(String[] args) 
    {
        char ch = 65;
         for(int i = 0; i <=5; i++) 
         {
            for (int j = 0; j <=i; j++) 
            {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }
    }
}