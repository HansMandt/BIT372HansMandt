package com.example.unitcoverter;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.unitcoverter", appContext.getPackageName());
    }

//    @Test
//    public void can_enter_fahrenheit() {
//        onView(withId(R.id.fahrenheit_input)).perform(typeText("45"));
//        onView(withId(R.id.convert_btn)).perform(click());
//        onView(withId(R.id.celcius_text)).check(matches(withText("7.22 ºC")));
//    }

//    @Test
//    public void can_enter_lbs() {
//        onView(withId(R.id.pounds_input)).perform(typeText("31"));
//        onView(withId(R.id.convert_lbs_to_kg_btn)).perform(click());
//        onView(withId(R.id.kilograms_text)).check(matches(withText("14.06 kg")));
//    }

    @Test
    public void spinner_is_selectable() {
        onView(withId(R.id.convert_spinner)).perform(click());
        onView(withText("ºF to ºC")).perform(click());
        onView(withId(R.id.convertInput)).perform(typeText("50"));
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.convertOutput)).check(matches(withText("10.00 ºC")));
    }

    @Test
    public void should_not_enter_empty_value() {
        onView(withId(R.id.convert_btn)).perform(click());
        onView(withId(R.id.convertInput)).check(matches(withText("")));
    }
}