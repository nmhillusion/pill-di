package app.netlify.nmhillusion.neon_di.mock.seeder;

import app.netlify.nmhillusion.neon_di.annotation.Neon;

/**
 * date: 2022-02-03
 * <p>
 * created-by: MINGUY1
 */

@Neon(priority = 5)
public class OrangeJuiceSeeder implements DrinkSeeder {
    @Override
    public String drink() {
        return "Orange juice";
    }
}