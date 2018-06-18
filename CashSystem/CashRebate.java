package Cash;

public class CashRebate implements CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money - Math.floor(money/300)*100;
    }
}
