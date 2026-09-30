package com.incognia.internal;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import g3.z;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class CnH {

    /* renamed from: b, reason: collision with root package name */
    public static final CnH f8484b = new CnH();

    /* renamed from: W, reason: collision with root package name */
    public static final String f8481W = Build.BOARD;

    /* renamed from: f9, reason: collision with root package name */
    public static final String f8485f9 = Build.BOOTLOADER;
    public static final String sVU = Build.BRAND;
    public static final String gmP = Build.DEVICE;

    /* renamed from: J, reason: collision with root package name */
    public static final String f8476J = Build.FINGERPRINT;
    public static final String PqK = Build.HARDWARE;

    /* renamed from: V, reason: collision with root package name */
    public static final String f8480V = Build.HOST;
    public static final String olU = Build.ID;

    /* renamed from: R, reason: collision with root package name */
    public static final String f8479R = Build.MANUFACTURER;
    public static final String DOu = Build.MODEL;
    public static final int IB = Build.VERSION.SDK_INT;
    public static final String Qs = Build.VERSION.INCREMENTAL;

    /* renamed from: E, reason: collision with root package name */
    public static final String f8475E = "android";

    /* renamed from: n9, reason: collision with root package name */
    public static final String f8486n9 = Build.PRODUCT;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f8482Y = Build.getRadioVersion();

    /* renamed from: P, reason: collision with root package name */
    public static final String f8478P = Build.TAGS;

    /* renamed from: L, reason: collision with root package name */
    public static final long f8477L = Build.TIME;
    public static final String FL = Build.USER;

    /* renamed from: ar, reason: collision with root package name */
    public static final String f8483ar = Build.DISPLAY;

    public final List J() {
        if (b(this, 21, 0, 2)) {
            return ArraysKt.sierra(Build.SUPPORTED_64_BIT_ABIS);
        }
        return null;
    }

    public final List PqK() {
        if (b(this, 21, 0, 2)) {
            return ArraysKt.sierra(Build.SUPPORTED_ABIS);
        }
        return CollectionsKt.listOf(Build.CPU_ABI, Build.CPU_ABI2);
    }

    public final String W() {
        if (b(this, 0, 25, 1)) {
            return Build.SERIAL;
        }
        return null;
    }

    public final Integer b() {
        if (b(this, 31, 0, 2)) {
            return Integer.valueOf(z.alpha());
        }
        return null;
    }

    public final String f9() {
        String str;
        if (b(this, 31, 0, 2)) {
            str = Build.SOC_MANUFACTURER;
            return str;
        }
        return null;
    }

    public final List gmP() {
        if (b(this, 21, 0, 2)) {
            return ArraysKt.sierra(Build.SUPPORTED_32_BIT_ABIS);
        }
        return null;
    }

    public final String sVU() {
        if (b(this, 31, 0, 2)) {
            return z.oscar();
        }
        return null;
    }

    public static boolean b(CnH cnH, int i4, int i5, int i10) {
        if ((i10 & 1) != 0) {
            i4 = RecyclerView.UNDEFINED_DURATION;
        }
        if ((i10 & 2) != 0) {
            i5 = LottieConstants.IterateForever;
        }
        cnH.getClass();
        int i11 = IB;
        return i4 <= i11 && i11 <= i5;
    }
}
