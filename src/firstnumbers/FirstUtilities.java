package firstnumbers;

public class FirstUtilities {
    public boolean isFirst(int n) {
        if(n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public void displayFirstNumbersInRange(int upperRange) {
        for(int i = 2; i <= upperRange; i++)
            if(isFirst(i))
                System.out.println(i);
    }
}
