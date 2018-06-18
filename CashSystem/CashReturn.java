package Cash;

public class CashReturn implements CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money*0.8;
    }
}
