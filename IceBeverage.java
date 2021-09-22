/**
* Base class for ice drinks.
* @author pavl_g
*/
public class IceBeverage extends ColdBeverage {
     
     //TODO-Condiments instance
     private IceBeverageCondiments condiments;
     
     public IceBeverage(final String name){
          super(name);
     }
     
     public IceBeverage(final String name, String description){
          super(name, description);
     }
     
     @Override
     public double calculateTotalCost(){
          return getCondiments() + super.calculateTotalCost(); 
     }
     
     @Override
     public Condiments getCondiments(){
          return condiments;
     }
     
   /**
    *  TODO-a subclass representing the ice drinks add-ons for any ice beverage.
    *  @apiNote ice beverage modifications.
    *  @author pavl_g
    */
    public static class IceBeverageCondiments extends ColdBeverage.Condiments {
        
       //TODO-special condiments for ice beverages
        private boolean coconut;
        
        //TODO-prices for these dudes
        public static final double COCONUT_PRICE = 0.5d;
        
        public void setCoconut(boolean coconut){
            this.coconut = coconut;
        }
        public boolean hasCoconut(){
            return coconut;
        }
        //...............continue the setters
        @Override
        public double getCondimentsTotalPrice(){
            double condimentsCost = 0d;
                if(hasCoconut()){
                    condimentsCost += IceBeverageCondiments.COCONUT_PRICE;
                }
            return condimentsCost + super.getCondimentsTotalPrice();
        }
    }
}
