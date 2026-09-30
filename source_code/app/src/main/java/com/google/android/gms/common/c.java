package com.google.android.gms.common;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean amber(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel echo(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ Class india() {
        return BasicFileAttributes.class;
    }
}
