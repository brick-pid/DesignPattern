public class Main {
    public static void main(String[] args) {
        ACake cake = new BasicCake();
        cake = new MilkDecoractor(cake);
        cake = new FruitDecorator(cake);
        cake = new MilkDecoractor(cake);
        System.out.println(cake.getCost());
        System.out.println(cake.getDescription());
    }
}