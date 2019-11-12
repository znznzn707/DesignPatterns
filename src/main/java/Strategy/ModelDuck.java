package duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithWings() ;
        quackBehavior = new Quack() ;
        }
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
