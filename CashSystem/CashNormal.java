package Cash;

public class CashNormal implements CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
