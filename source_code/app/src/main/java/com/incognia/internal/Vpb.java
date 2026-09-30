package com.incognia.internal;

import K5.a;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import h9.C1835m;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import s6.J4;

/* loaded from: classes2.dex */
public final class Vpb {

    /* renamed from: J, reason: collision with root package name */
    public static final ArrayList f9798J;
    public static final Handler PqK;

    /* renamed from: V, reason: collision with root package name */
    public static final Handler f9799V;

    /* renamed from: f9, reason: collision with root package name */
    public static final Thread.UncaughtExceptionHandler f9802f9;
    public static final HandlerThread gmP;
    public static final ArrayList olU;
    public static final HandlerThread sVU;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f9801b = new AtomicInteger(0);

    /* renamed from: W, reason: collision with root package name */
    public static final XYO f9800W = new XYO();

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int i4 = 0;
        C1835m c1835m = new C1835m(1);
        f9802f9 = c1835m;
        sVU = TVm.b(c1835m);
        gmP = TVm.b(c1835m);
        List z2 = CollectionsKt.z(J4.hotel(0, 2));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(z2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
            AtomicInteger atomicInteger = TVm.f9677b;
            arrayList.add(TVm.b(f9802f9));
        }
        f9798J = new ArrayList();
        PqK = new Handler(sVU.getLooper());
        f9799V = new Handler(gmP.getLooper());
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(new Handler(((HandlerThread) obj).getLooper()));
        }
        olU = arrayList2;
        f9799V.post(new a(5));
    }

    public static final void b(Thread thread, Throwable th) {
        try {
            f9800W.b(th);
        } catch (Throwable unused) {
        }
    }

    public static final void b() {
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        } catch (Throwable unused) {
        }
    }
}
