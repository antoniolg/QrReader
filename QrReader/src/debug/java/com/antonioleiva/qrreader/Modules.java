package com.antonioleiva.qrreader;

final class Modules {
    public static Object[] list(QrApp app) {
        return new Object[]{
                new QrModule(app),
                new DebugQrModule()
        };
    }
}
