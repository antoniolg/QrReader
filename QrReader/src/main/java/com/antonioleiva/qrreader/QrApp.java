package com.antonioleiva.qrreader;

import android.app.Application;
import android.content.Context;
import dagger.ObjectGraph;
import timber.log.Timber;

public class QrApp extends Application {

    private ObjectGraph objectGraph;

    @Override public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        buildObjectGraphAndInject();
    }

    private void buildObjectGraphAndInject() {
        objectGraph = ObjectGraph.create(Modules.list(this));
        objectGraph.inject(this);
    }

    public void inject(Object o) {
        objectGraph.inject(o);
    }

    public static QrApp get(Context context) {
        return (QrApp) context.getApplicationContext();
    }
}
