public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int summ = 0;
        while (true)
        {
            String z = reader.readLine();
           if (z.equals("����"))
           {
               System.out.println(summ);
             return ;
           }
            else 
           {
               summ = summ + Integer.parseInt(z);
           }
        }        //�������� ��� ��� ���
    }
}