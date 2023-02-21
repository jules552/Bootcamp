package com.github.jules552.bootcamp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    var mainRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun before() {
        Intents.init()
    }

    @After
    fun after() {
        Intents.release()
    }

    @Test
    fun buttonFireIntentToGreetingActivity() {
        mainRule.scenario.onActivity {}
        onView(withId(R.id.inputText)).perform(ViewActions.typeText("Jules"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.mainButton)).perform(click())
        intended(hasComponent(GreetingActivity::class.java.name))
    }

    @Test
    fun buttonFireIntentWithCorrectContent() {
        mainRule.scenario.onActivity {}
        onView(withId(R.id.inputText)).perform(ViewActions.typeText("Jules"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.mainButton)).perform(click())
        intended(hasExtra("name", "Jules"))
    }

}