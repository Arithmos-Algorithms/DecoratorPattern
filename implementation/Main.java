public class Main {
    public static void main(String[] args) {
        //RedTea
        final Tea tea = new RedTea("American Tea", "My Lovely Tea");
        tea.setDrinkCost(10d);
        tea.setCondiments(new HotBeverage.Condiments()
                          .setGinger(true)
                          .setMint(true));
        System.out.println(tea.calculateTotalCost() + " " + "$");
        
        //alcoholics
        final TntFork tntFork = new TntFork("TNT Blow", "Die like a bitch");
        tntFork.setDrinkCost(50d);
        tntFork.setCondiments(new AlcoholicsBeverage.Condiments()
                          .setGinger(true)
                          .setMint(true)
                          .setAlcoholPercentage(0.5d));
        System.out.println(tntFork.calculateTotalCost() + " " + "$");
        
        //GreenTea
        final GreenTea greenTea = new GreenTea("Egyptian Tea", "Heal your Mind");
        greenTea.setDrinkCost(5d);
        greenTea.setCondiments(new HotBeverage.Condiments()
                          .setGinger(true)
                          .setMint(true)
                          .setLemon(true));
        System.out.println(greenTea.calculateTotalCost() + " " + "$"); 
        
        final Coffee espresso = new Espresso("Espresso", "Heart Fuel");
        espresso.setSugarSpoons(2d);
        espresso.setDrinkCost(20d);
        Beverage.Condiments condiments = new Coffee.Condiments();
        condiments.setMocha(true);
        System.out.println(espresso.calculateTotalCost() + " " + "$"); 
    }
}
