package pixel.academy.spring_core_ioc.common;

public class GreekChef implements Chef{
    //constructor
    public GreekChef(){
        System.out.println("In constructor: " +getClass().getSimpleName());
    }
    @Override
    public String getDailyRecipe(){
        return "Greek Salad + A fresh and healthy mix of tomatoes, cucumbers, red onions, olives, and feta chees";
    }

}
