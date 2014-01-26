package com.antonioleiva.qrreader.ui;

import android.app.Activity;
import android.view.ViewGroup;
import com.antonioleiva.qrreader.QrApp;

import static butterknife.ButterKnife.findById;

public interface AppContainer {

    ViewGroup get(Activity activity, QrApp app);

    AppContainer DEFAULT = new AppContainer() {
        @Override public ViewGroup get(Activity activity, QrApp app) {
            return findById(activity, android.R.id.content);
        }
    };
}
