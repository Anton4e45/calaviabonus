public class BonusMilesService {
    public int calculate(int price) {
        int x = 20;
        // x колличество рублей за которые начисляется 1 миля
        int miles = price / x;
        return miles;

    }
}
