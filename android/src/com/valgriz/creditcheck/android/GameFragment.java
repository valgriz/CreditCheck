package com.valgriz.creditcheck.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.valgriz.creditcheck.Main;

/**
 * Created by Steven on 6/22/2015.
 */
public class GameFragment extends AndroidFragmentApplication {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return initializeForView(new Main());
	}
}
