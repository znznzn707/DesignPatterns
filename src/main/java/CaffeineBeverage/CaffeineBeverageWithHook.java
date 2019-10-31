package CaffeineBeverage;

public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe() {
        boilWater() ;
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew() ;
    abstract void addCondiments() ;
    void boilWater() {
        System.out.println("Boiling Water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public boolean customerWantsCondiments() {
        return true ;
    }
}
