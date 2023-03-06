public class MilkDecoractor extends Decoractor{

    public MilkDecoractor(ACake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + milk";
    }

    @Override
    public int getCost() {
        return super.getCost() + 10;
    }
}
