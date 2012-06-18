package com.gmail.takashi316.sandbox.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.gmail.takashi316.sandbox.HelloAndroidActivity;

/**
 * @author Takashi SASAKI
 */
public class HelloAndroidTestCase extends
		ActivityInstrumentationTestCase2<HelloAndroidActivity> {

	public HelloAndroidTestCase() {
		super(HelloAndroidActivity.class);
	}// UsersActivityTestCase

	public void test1() {
		this.activity.runOnUiThread(new Runnable() {

			@Override
			public void run() {
				getInstrumentation().waitForIdle(null);
			}
		});// runOnUiThread

	}// test1

	Activity activity;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		this.activity = getActivity();
		// this.buttonResetUsers = (Button) this.usersActivity
		// .findViewById(R.id.buttonResetUsers);
		super.setUp();
	}// setUp

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}// tearDown
}// UsersActivityTestCase

