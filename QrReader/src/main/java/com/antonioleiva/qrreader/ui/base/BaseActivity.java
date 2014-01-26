package com.antonioleiva.qrreader.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.antonioleiva.qrreader.QrApp;
import com.antonioleiva.qrreader.ui.AppContainer;

import javax.inject.Inject;

public class BaseActivity extends Activity {

    @Inject AppContainer appContainer;
    private ViewGroup container;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        QrApp app = QrApp.get(this);
        app.inject(this);

        container = appContainer.get(this, app);
    }

    @Override public void setContentView(int layoutResID) {
        getLayoutInflater().inflate(layoutResID, container);
    }

    @Override public void setContentView(View view) {
        throw new UnsupportedMethodException();
    }

    @Override public void setContentView(View view, ViewGroup.LayoutParams params) {
        throw new UnsupportedMethodException();
    }

    private class UnsupportedMethodException extends RuntimeException {
        private UnsupportedMethodException() {
            super("Can't use setContentView other than id overload.");
        }
    }
}
