package com.antonioleiva.qrreader;

import android.app.Application;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(
        injects = {
                QrApp.class
        },
        library = true
)
public final class QrModule {
    private final QrApp app;

    public QrModule(QrApp app) {
        this.app = app;
    }

    @Provides @Singleton Application provideApplication() {
        return app;
    }
}
