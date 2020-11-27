/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package quiz.if1.pkg10119013;

/**
 *
 * @author Fiona Avila
 */


public class ServicePrice implements ServiceItem{
    
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void displayService(){
        System.out.println("#*********************#");
        System.out.println();
    }
}
