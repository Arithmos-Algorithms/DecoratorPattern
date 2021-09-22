/**
* Base class for alcoholic drinks
* @author pavl_g
*/
public class AlcoholicBeverage extends ColdBeverage {

     //TODO-Condiments instance
     private AlcoholicCondiments condiments;
     
     public AlcoholicBeverage(final String name){
          super(name);
     }
     
     public AlcoholicBeverage(final String name, String description){
          super(name, description);
     }
     
     @Override
     public double calculateTotalCost(){
          return getCondiments() + super.calculateTotalCost(); 
     }
     
     public void setCondiments(AlcoholicCondiments condiments){
          this.condiments = condiments;
     }
     
     @Override
     public Condiments getCondiments(){
          return condiments;
     }
    
   /**
    *  TODO-a subclass representing the alcoholic drinks add-ons for any alcoholic beverage.
    *  @apiNote alcoholic beverage modifications.
    *  @author pavl_g
    */
    public static class AlcoholicCondiments extends ColdBeverage.Condiments {
        
        //TODO-special condiments for alcoholic beverages
        private double alcoholPercentage = 0.09d;
        
        //TODO-prices for these dudes
        public static final double PRICE1 = 5d;
        public static final double PRICE2 = 5d;
        public static final double PRICE3 = 10d;
       
       
        public void setAlcoholPercentage(double alcoholPercentage){
            assert (alcoholPercentage > 0 && alcoholPercentage < 1);
            this.alcoholPercentage = alcoholPercentage;
        }
        
        public double getAlcoholPercentage(){
            return alcoholPercentage;
        }
        
        //...............continue the setters
        @Override
        public double getCondimentsTotalPrice(){
            double condimentsCost = 0d;
                if(alcoholPercentage > 0.8d){
                    condimentsCost += AlcoholicCondiments.PRICE3;
                }else if(alcoholPercentage > 0.5d){
                    condimentsCost += AlcoholicCondiments.PRICE2;
                }else{
                    condimentsCost += AlcoholicCondiments.PRICE1;
                }
            return condimentsCost + super.getCondimentsTotalPrice();
        }
    
    }
}
