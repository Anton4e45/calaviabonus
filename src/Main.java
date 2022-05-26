public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int price = 10_000;
            int miles = service.calculate(price);
            System.out.println("При стоимости билета: " + price + "руб.");
            System.out.println("Будет начислено бонусных миль: " + miles);;
        }
}
