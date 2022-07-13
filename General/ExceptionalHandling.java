public class ExceptionalHandling
{
    public static void main(String args[]) 
    {
        int a;
        try
        {
            a=50/0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e+"Your error is madarchudai");
        }
        finally
        {
            System.out.println("gand marao");
        }
        throw new ArithmeticException("Go learn numbers");

    }
}