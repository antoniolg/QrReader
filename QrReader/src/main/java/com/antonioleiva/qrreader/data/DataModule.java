package com.antonioleiva.qrreader.data;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

import static android.content.Context.MODE_PRIVATE;

@Module(
        complete = false,
        library = true
)
public final class DataModule {

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Application app) {
        return app.getSharedPreferences("QrReader", MODE_PRIVATE);
    }
}
