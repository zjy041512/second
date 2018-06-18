package Cash;

public class CashContext {
    private CashSuper cashSuper;
    public CashContext (CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }
    public Double acceptCash(Double money){
        return cashSuper.acceptCash(money);
    }
}
