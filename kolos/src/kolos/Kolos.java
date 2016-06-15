package kolos;

public class Kolos {
    //Metoda zliczajaca ilosc samochodow
    public static int count(int[] A) 
    {
        int countZero = 0;
        int countCars = 0;

        for(int i=0; i<A.length;i++)
        {
            if(A[i] == 0)
            {
                countZero++;
            }
            if(countZero > 0 && A[i]==1 )
            {
                countCars += countZero;

            }
             if(countCars>1000000000)
             {
                 return -1;
             }
        }
        return countCars;
    }
    
    public static void main(String[] args) {
       
    }
    
}
