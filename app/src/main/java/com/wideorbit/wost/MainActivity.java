package com.wideorbit.wost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wideorbit.wost_library.WOSTLibrary;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WOSTLibrary wost = new WOSTLibrary();
		System.out.println(wost.output());
	}
}
