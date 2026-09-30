package com.incognia.internal;

import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;

/* loaded from: classes2.dex */
public final class Zmd {
    public static final List DOu;

    /* renamed from: E, reason: collision with root package name */
    public static final List f10050E;
    public static final String FL;
    public static final List IB;

    /* renamed from: L, reason: collision with root package name */
    public static final String f10052L;

    /* renamed from: P, reason: collision with root package name */
    public static final String f10053P;
    public static final List PqK;
    public static final List Qs;

    /* renamed from: R, reason: collision with root package name */
    public static final List f10054R;

    /* renamed from: V, reason: collision with root package name */
    public static final List f10055V;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f10057Y;

    /* renamed from: ar, reason: collision with root package name */
    public static final String f10058ar;

    /* renamed from: n9, reason: collision with root package name */
    public static final String f10061n9;
    public static final List olU;

    /* renamed from: b, reason: collision with root package name */
    public static final String f10059b = (String) wGk.PB.getValue();

    /* renamed from: W, reason: collision with root package name */
    public static final String f10056W = (String) wGk.CY.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10060f9 = (String) wGk.us.getValue();
    public static final String sVU = (String) wGk.SV.getValue();
    public static final String gmP = (String) wGk.pD.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final List f10051J = CollectionsKt.listOf((String) wGk.Glr.getValue(), (String) wGk.NmY.getValue());

    static {
        Lazy lazy = wGk.Ljx;
        String str = (String) lazy.getValue();
        Lazy lazy2 = wGk.nu;
        PqK = CollectionsKt.listOf(str, (String) lazy2.getValue(), (String) wGk.Al.getValue());
        f10055V = ab.juliet((String) wGk.Xm.getValue());
        olU = CollectionsKt.listOf((String) lazy.getValue(), (String) lazy2.getValue(), (String) wGk.Xh.getValue());
        f10054R = ab.juliet((String) wGk.Vg.getValue());
        DOu = CollectionsKt.listOf((String) lazy.getValue(), (String) lazy2.getValue(), (String) wGk.mK.getValue());
        IB = ab.juliet((String) wGk.aV.getValue());
        Qs = CollectionsKt.listOf((String) lazy.getValue(), (String) lazy2.getValue(), (String) wGk.N7i.getValue());
        f10050E = ab.juliet((String) wGk.es.getValue());
        f10061n9 = (String) lazy.getValue();
        f10057Y = (String) lazy2.getValue();
        f10053P = (String) wGk.f11686dg.getValue();
        f10052L = (String) wGk.D80.getValue();
        FL = (String) wGk.YA5.getValue();
        f10058ar = (String) wGk.Hoq.getValue();
    }

    public static List b() {
        String str = f10059b;
        List list = f10051J;
        List list2 = PqK;
        b2 b2Var = new b2(str, list, list2, null);
        b2 b2Var2 = new b2(f10056W, list2, olU, f10055V);
        String str2 = f10060f9;
        List list3 = f10054R;
        ArrayList white = CollectionsKt.white(b2Var, b2Var2, new b2(str2, list3, DOu, null), new b2(sVU, list3, Qs, IB));
        white.add(new b2(gmP, CollectionsKt.listOf(f10052L, f10053P, String.format(FL, Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))), CollectionsKt.listOf(f10061n9, f10057Y, String.format(f10058ar, Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))), f10050E));
        return white;
    }
}
