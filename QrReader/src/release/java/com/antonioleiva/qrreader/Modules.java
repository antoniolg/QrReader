package com.antonioleiva.qrreader;

import com.antonioleiva.qrreader.ui.UiModule;

final class Modules {
    public static Object[] list(QrApp app) {
        return new Object[]{
                new QrModule(app),
                new UiModule()
        };
    }
}
