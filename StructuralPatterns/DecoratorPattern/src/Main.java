public class Main {
    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        Beverage milkCoffee = new MilkDecorator(new Coffee());
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.cost());

        Beverage milkSugarCoffee = new SugarDecorator(new MilkDecorator(new Coffee()));
        System.out.println(milkSugarCoffee.getDescription() + " $" + milkSugarCoffee.cost());

    }
}