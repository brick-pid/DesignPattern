public class Decoractor extends ACake{
    ACake basicCake;
    public Decoractor(ACake cake) {
        this.basicCake = cake;
    }
    @Override
    public String getDescription() {
        return this.basicCake.getDescription();
    }

    @Override
    public int getCost() {
        return this.basicCake.getCost();
    }
}
