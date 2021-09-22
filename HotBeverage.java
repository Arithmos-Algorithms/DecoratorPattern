/**
* Base class for hot beverages.
* @author pavl_g
*/
public class HotBeverage extends Beverage {
   
     //TODO-Condiments instance
     private HotCondiments condiments;
     
     public HotBeverage(final String name){
          super(name);
     }
     
     public HotBeverage(final String name, String description){
          super(name, description);
     }
     
     @Override
     public double calculateTotalCost(){
          return getCondiments() + super.calculateTotalCost(); 
     }
     
     public void setCondiments(HotCondiments condiments){
          this.condiments = condiments;
     }
     
     @Override
     public Condiments getCondiments(){
          return condiments;
     }
     
   /**
    *  TODO-a subclass representing the hot drinks add-ons for any hot beverage.
    *  @apiNote hot beverage modifications.
    *  @author pavl_g
    */
    public static class HotCondiments extends Beverage.Condiments {
        
        //TODO-special condiments for cold beverages

        
        //TODO-prices for these dudes
      
        //...............continue the setters
        @Override
        public double getCondimentsTotalPrice(){
            return super.getCondimentsTotalPrice();
        }
    
    }

}
