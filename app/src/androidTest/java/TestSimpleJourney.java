import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.stephentaylor.daftcatapp_espresso.MainActivity;
import com.example.stephentaylor.daftcatapp_espresso.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Ste on 09/04/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestSimpleJourney {

    private final static String NAME_OF_USER = "Ste";

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void addText_sameActivity() {
        onView(withId(R.id.enter_name))
                .perform(typeText(NAME_OF_USER), closeSoftKeyboard());
        onView(withId(R.id.button))
                .perform(click());
        onView(withId(R.id.greeting))
                .check(matches(withText("Meow, Ste")));
    }

}
