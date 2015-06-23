package com.valgriz.creditcheck.android;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AndroidLauncher extends FragmentActivity implements AndroidFragmentApplication.Callbacks{

	AdView adView;

	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		GameFragment fragment = new GameFragment();
		FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
		tr.replace(R.id.GameView, fragment);
		tr.commit();

		adView = (AdView) findViewById(R.id.adView);

		AdRequest adRequest = new AdRequest.Builder()
				.tagForChildDirectedTreatment(true)
				.addTestDevice("A06A4EEE80B3E1D5A904A45B27B1159E")
				.build();

		adView.loadAd(adRequest);

	}

	@Override
	public void exit() {

	}
}
