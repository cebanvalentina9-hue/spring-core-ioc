package pixel.academy.spring_core_ioc;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {

    @Override
    public String getDaylyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoes and basil";
    }
}