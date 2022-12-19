package app.netlify.nmhillusion.pill_di.mock.seeder;

import app.netlify.nmhillusion.pill_di.annotation.Pillable;

/**
 * date: 2022-02-03
 * <p>
 * created-by: MINGUY1
 */

@Pillable(priority = 5)
public class OrangeJuiceSeeder implements DrinkSeeder {
    @Override
    public String drink() {
        return "Orange juice";
    }
}