public class Main {
    public static void main(String[] args) {

        BurgerMeal simpleMeal = new BurgerMeal.BurgerBuilder("veg", "wheat").build();
        BurgerMeal cheeseBurger = new BurgerMeal.BurgerBuilder("wheat", "veg").withCheese(true).build();
        BurgerMeal completeMeal = new BurgerMeal.BurgerBuilder("wheat", "veg").withCheese(true).withDrink(true)
                .withFries(true).build();

//        simpleMeal.toString();
        System.out.println(simpleMeal.toString());
        System.out.println(cheeseBurger.toString());
        System.out.println(completeMeal.toString());

    }
}
//Another way: We can make the different constructors but it's not the scalable approach