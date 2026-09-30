package com.incognia.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DeviceProductInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import g3.z;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes2.dex */
public final class Av7 {

    /* renamed from: W, reason: collision with root package name */
    public final WindowManager f8388W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8389b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8390f9 = LazyKt.lazy(new Bbw(this));

    public Av7(Context context) {
        this.f8389b = context;
        this.f8388W = (WindowManager) context.getSystemService("window");
    }

    public final String W() {
        try {
            Display display = (Display) this.f8390f9.getValue();
            if (display != null) {
                return display.getName();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Integer b() {
        DisplayMetrics displayMetrics;
        try {
            Resources resources = this.f8389b.getResources();
            if (resources != null) {
                displayMetrics = resources.getDisplayMetrics();
            } else {
                displayMetrics = new DisplayMetrics();
            }
            return Integer.valueOf(displayMetrics.densityDpi);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String f9() {
        Display display;
        DeviceProductInfo kilo;
        try {
            if (CnH.b(CnH.f8484b, 31, 0, 2) && (display = (Display) this.f8390f9.getValue()) != null && (kilo = z.kilo(display)) != null) {
                return z.papa(kilo);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String gmP() {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        Rect bounds2;
        try {
            if (CnH.b(CnH.f8484b, 30, 0, 2)) {
                maximumWindowMetrics = this.f8388W.getMaximumWindowMetrics();
                StringBuilder sb2 = new StringBuilder();
                bounds = maximumWindowMetrics.getBounds();
                sb2.append(bounds.height());
                sb2.append('x');
                bounds2 = maximumWindowMetrics.getBounds();
                sb2.append(bounds2.width());
                return sb2.toString();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display display = (Display) this.f8390f9.getValue();
            if (display != null) {
                display.getRealMetrics(displayMetrics);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(displayMetrics.heightPixels);
            sb3.append('x');
            sb3.append(displayMetrics.widthPixels);
            return sb3.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String sVU() {
        Display display;
        DeviceProductInfo kilo;
        try {
            if (CnH.b(CnH.f8484b, 31, 0, 2) && (display = (Display) this.f8390f9.getValue()) != null && (kilo = z.kilo(display)) != null) {
                return z.black(kilo);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
