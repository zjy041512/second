package Cash;

public class CashTest {
    public static void main(String[] args){
        CashSuper cashSuper = new CashRebate();
        CashContext cashContext = new CashContext(cashSuper);
        Double realCash = cashContext.acceptCash(500d);
        System.out.println(realCash);
    }
}
