/**
* Base class for beverages, any beverage should extend this class.
* @author pavl_g
*/
public class Beverage {
    
    //TODO-Drink name & description
    private final String name = "DRINKNAME";
    private String description = "DESCRIPTION";
    
    //TODO-add for any beverage
    private float sugarSpoons = 0f;
    private double drinkCost = 0d;
    
    //TODO-Condiments instance
    private Condiments condiments;
    
    public Beverage(final String name){
        this.name = name;
    }
      
    public Beverage(final String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public void setDescription(String descritpion){
        this.description = descritpion;
    }
    
    public void setSugarSpoons(float sugarSpoons){
        this.sugarSpoons = sugarSpoons;
    }
    
    public float getSugarSpoons(){
        return sugarSpoons;
    }
    
    public double calculateTotalCost(){
        if(condiments != null){
           return condiments.getCondimentsTotalPrice() + getDrinkCost();
        }else{
            return getDrinkCost();
        }
    }
    
    public void setDrinkCost(double drinkCost){
        this.drinkCost = drinkCost;
    }
    
    public double getDrinkCost(){
        return drinkCost;
    }
    
    public void setCondiments(@Nullable Condiments condiments){
        this.condiments = condiments;        
    }
    
    public Condiments getCondiments(){
        return condiments;
    }
    
   /**
    *  TODO-a subclass representing the general add-ons for any beverage, 
    *  @apiNote any #Beverage.Condiments class should extend this.
    *  @author pavl_g
    */
    public static class Condiments {
    
        //TODO-general condiments available for any beverage
        private boolean lemon;
        private boolean ginger;
        private boolean mint;
        private boolean pomegranate;
        private boolean vanilla;
        private boolean cardamom;
        private boolean cocaPowder;
        private boolean milk;
        private boolean espresso;
        
        //TODO-prices for general condiments available for sany beverage
        public static final double LEMON_PRICE = 0.2d;
        public static final double GINGER_PRICE = 0.4d;
        public static final double MINT_PRICE = 0.5d;
        public static final double POME_PRICE = 0.8d;
        public static final double VANILLA_PRICE = 1.5d;
        public static final double CARDAMOM_PRICE = 0.02d;
        public static final double COCA_PRICE = 0.6d;
        public static final double MILK_PRICE = 0.8d;
        public static final double ESPRESSO_PRICE = 0.4d;
        
        public Condiments setLemon(boolean lemon){
                this.lemon = lemon;
            return this;
        }
        public boolean hasLemon(){
            return lemon;
        }
        public Condiments setGinger(boolean ginger){
                this.ginger = ginger;
            return this;
        }
        public boolean hasGinger(){
            return ginger;
        }
        public Condiments setMint(boolean mint){
                this.mint = mint;
            return this;        
        }
        public boolean hasMint(){
            return mint;
        }
        public Condiments setPomegranate(boolean pomegranate){
                this.pomegranate = pomegranate;
            return this;
        }
        public boolean hasPomegranate(){
            return pomegranate;
        }   
        
        public Condiments setVanilla(boolean vanilla){
                this.vanilla = vanilla;
            return this;
        }
        public boolean hasVanilla(){
            return vanilla;
        }
        //...............continue the setters
        public double getCondimentsTotalPrice(){
            double condimentsCost = 0d;
                if(hasLemon()){
                    condimentsCost += Condiments.LEMON_PRICE;
                }
                if(hasGinger()){
                    condimentsCost += Condiments.GINGER_PRICE;
                }
                if(hasMint()){
                    condimentsCost += Condiments.MINT_PRICE;
                } 
                if(hasPomegranate()){
                    condimentsCost += Condiments.POME_PRICE;
                }
                if(hasPomegranate()){
                    condimentsCost += Condiments.POME_PRICE;
                }
                if(hasVanilla()){
                    condimentsCost += Condiments.VANILLA_PRICE;
                }
            return condimentsCost;
        }
    }
    

}
