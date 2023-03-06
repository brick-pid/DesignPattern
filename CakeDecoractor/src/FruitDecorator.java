public class FruitDecorator extends Decoractor{

    public FruitDecorator(ACake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + fruit";
    }

    @Override
    public int getCost() {
        return super.getCost() + 10;
    }
}
