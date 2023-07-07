package com.nguyen.espresso7;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.accessibility.AccessibilityChecks;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Basic tests showcasing espresso AccessibilityChecks.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class AccessibilityChecksTest {

    @Test
    public void accessibilityChecks() {
        AccessibilityChecks.enable();
        try (ActivityScenario scenario = ActivityScenario.launch(MainActivity.class)) {
            onView(withId(R.id.openBrowserButton)).perform(click());
        }
    }
}