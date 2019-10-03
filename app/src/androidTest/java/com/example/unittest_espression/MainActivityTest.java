package com.example.unittest_espression;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);


    // create a instance of the target class
    MainActivity mainActivity;
    String messageToDisply;


    @Before
    public void setUp() throws Exception {

        mainActivity = activityTestRule.getActivity();
        messageToDisply = "This is a test message";
    }

    @Test // import  library  from second
    public void testUserInputScenario(){
        onView(withId(R.id.editText_messageToCopy)).perform(typeText(messageToDisply));
        closeSoftKeyboard();
        onView(withId(R.id.btn_getMessage)).perform(click());
        onView(withId(R.id.textView_copiedMeaasge)).check(matches(withText(messageToDisply)));
    }


    @After
    public void tearDown() throws Exception {
        mainActivity = null;


    }
}