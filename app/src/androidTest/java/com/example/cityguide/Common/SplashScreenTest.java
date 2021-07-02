package com.example.cityguide.Common;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.cityguide.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SplashScreenTest {

    @Rule
    public ActivityTestRule<SplashScreen> mActivityTestRule = new ActivityTestRule<>(SplashScreen.class);

    @Rule
    public GrantPermissionRule mGrantPermissionRule =
            GrantPermissionRule.grant(
                    "android.permission.ACCESS_FINE_LOCATION");

    @Test
    public void splashScreenTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.skip_btn), withText("Skip"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.login_singup),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.signup_btn), withText("Sign Up"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        3),
                                1)));
        appCompatButton2.perform(scrollTo(), click());

        ViewInteraction textInputEditText = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.signup_username),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("admin"), closeSoftKeyboard());

        ViewInteraction textInputEditText2 = onView(
                allOf(withText("admin"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.signup_username),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withText("admin"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.signup_username),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(click());

        ViewInteraction textInputEditText4 = onView(
                allOf(withText("admin"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.signup_username),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(click());

        ViewInteraction textInputEditText5 = onView(
                allOf(withText("korsun.pavel.99@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.signup_email),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText5.perform(pressImeActionButton());

        ViewInteraction textInputEditText6 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.signup_password),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText6.perform(replaceText("admin123"), closeSoftKeyboard());

        ViewInteraction textInputEditText7 = onView(
                allOf(withText("admin123"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.signup_password),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText7.perform(pressImeActionButton());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.signup_next_button), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton3.perform(scrollTo(), click());

        ViewInteraction appCompatRadioButton = onView(
                allOf(withId(R.id.male), withText("Male"),
                        childAtPosition(
                                allOf(withId(R.id.radio_group),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                1)),
                                0)));
        appCompatRadioButton.perform(scrollTo(), click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.signup_next_button), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton4.perform(scrollTo(), click());

        ViewInteraction relativeLayout = onView(
                allOf(withId(R.id.rlClickConsumer),
                        childAtPosition(
                                allOf(withId(R.id.countryCodeHolder),
                                        childAtPosition(
                                                withId(R.id.country_code_picker),
                                                0)),
                                0),
                        isDisplayed()));
        relativeLayout.perform(click());

        pressBack();

        pressBack();

        ViewInteraction textInputEditText8 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.signup_phone_number),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText8.perform(click());

        ViewInteraction textInputEditText9 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.signup_phone_number),
                                0),
                        0),
                        isDisplayed()));
        textInputEditText9.perform(replaceText("908669509"), closeSoftKeyboard());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.signup_next_button), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2)));
        appCompatButton5.perform(scrollTo(), click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withText("Verify Code"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton6.perform(click());

        pressBack();

        pressBack();

        pressBack();

        pressBack();

        pressBack();

        pressBack();

        ViewInteraction appCompatImageView2 = onView(
                allOf(withId(R.id.menu_icon),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        ViewInteraction navigationMenuItemView = onView(
                allOf(withId(R.id.nav_near_me),
                        childAtPosition(
                                allOf(withId(R.id.design_navigation_view),
                                        childAtPosition(
                                                withId(R.id.navigation_view),
                                                0)),
                                2),
                        isDisplayed()));
        navigationMenuItemView.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.btn_location),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        1),
                                0),
                        isDisplayed()));
        floatingActionButton.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
