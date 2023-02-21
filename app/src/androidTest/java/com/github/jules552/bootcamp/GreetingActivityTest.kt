package com.github.jules552.bootcamp

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GreetingActivityTest {
    @Test
    fun greetingActivityIsDisplayingCorrectText() {
        val intent = Intent(ApplicationProvider.getApplicationContext(), GreetingActivity::class.java)
            .putExtra("name", "Jules")
        ActivityScenario.launch<GreetingActivity>(intent).use {
            onView(withId(R.id.greetingText)).check(matches(withText("Hello Jules!")))
        }
    }
}