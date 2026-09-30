package com.incognia.internal;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class q8 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f11128b;

    public q8(Context context) {
        this.f11128b = context;
    }

    public final String W(String str) {
        try {
            return Settings.Secure.getString(this.f11128b.getContentResolver(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Integer b() {
        try {
            return Integer.valueOf(Settings.Secure.getInt(this.f11128b.getContentResolver(), "accessibility_enabled"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String f9(String str) {
        try {
            return Settings.System.getString(this.f11128b.getContentResolver(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        try {
            return Settings.Global.getString(this.f11128b.getContentResolver(), str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
