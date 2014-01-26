package com.antonioleiva.qrreader;

import com.antonioleiva.qrreader.ui.DebugUiModule;
import dagger.Module;

@Module(
        addsTo = QrModule.class,
        includes = {
                DebugUiModule.class
        },
        overrides = true
)
public final class DebugQrModule {
}
