/**
* Base class for cold beverages, any cold beverage should extend this class.
* @author pavl_g
*/
public class ColdBeverage extends Beverage {
    
     //TODO-Condiments instance
     private ColdCondiments condiments;
     
     public ColdBeverage(final String name){
          super(name);
     }
     
     public ColdBeverage(final String name, String description){
          super(name, description);
     }
     
     @Override
     public double calculateTotalCost(){
          return getCondiments() + super.calculateTotalCost(); 
     }
     
     public void setCondiments(ColdCondiments condiments){
          this.condiments = condiments;
     }

     @Override
     public Condiments getCondiments(){
          return condiments;
     }
     
   /**
    *  TODO-a subclass representing the cold drinks add-ons for any cold beverage.
    *  @apiNote Cold beverage modifications.
    *  @author pavl_g
    */
    public static class ColdCondiments extends Beverage.Condiments {
        
        //TODO-special condiments for cold beverages
        private boolean ice = true;
        private boolean fruitsAdditions;
        
        //TODO-prices for these dudes
        public static final double ICE_PRICE = 0.005d;
        public static final double FRUITS_ADDITIONS_PRICE = 0.2d;
        
        public ColdCondiments setIce(boolean ice){
                this.ice = ice;
            return this;
        }
        public boolean hasIce(){
            return ice;
        }
        public ColdCondiments setFruitsAdditions(boolean fruitsAdditions){
                this.fruitsAdditions = fruitsAdditions;
            return this;
        }
        public boolean hasFruitsAdditions(){
            return fruitsAdditions;
        }
        //...............continue the setters
        @Override
        public double getCondimentsTotalPrice(){
            double condimentsCost = 0d;
                if(hasIce()){
                    condimentsCost += ColdCondiments.ICE_PRICE;
                }
                if(hasFruitsAdditions()){
                    condimentsCost += ColdCondiments.FRUITS_ADDITIONS_PRICE;
                }
            return condimentsCost + super.getCondimentsTotalPrice();
        }
    
    }
}
