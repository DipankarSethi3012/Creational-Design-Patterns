public class BurgerMeal {
    //required fields
    private final String bun;
    private final String patty;

    //optional fields
    private final boolean withCheese;
    private final boolean withFries;
    private final boolean withDrink;

    private BurgerMeal(BurgerBuilder burgerBuilder){
        this.bun = burgerBuilder.bun;
        this.patty = burgerBuilder.patty;
        this.withCheese = burgerBuilder.withCheese;
        this.withFries = burgerBuilder.withFries;
        this.withDrink = burgerBuilder.withDrink;
    }

    @Override
    public String toString() {
        return "BurgerMeal{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", withCheese=" + withCheese +
                ", withFries=" + withFries +
                ", withDrink=" + withDrink +
                '}';
    }

    public static class BurgerBuilder {
        //required fields
        private final String bun;
        private final String patty;

        //optional fields
        private boolean withCheese;
        private boolean withFries;
        private boolean withDrink;

        public BurgerBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder withCheese(boolean withCheese) {
            this.withCheese = withCheese;
            return this;
        }

        public BurgerBuilder withFries(boolean withFries) {
            this.withFries = withFries;
            return this;
        }

        public BurgerBuilder withDrink(boolean withDrink) {
            this.withDrink = withDrink;
            return this;
        }

        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }
}
