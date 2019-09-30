package com.wideorbit.wost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wideorbit.wostreaming.WOSTargeting;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		WOSTargeting wost = new WOSTargeting();
		System.out.println(wost.output());
	}
}
