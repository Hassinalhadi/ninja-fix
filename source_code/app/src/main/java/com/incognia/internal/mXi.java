package com.incognia.internal;

import android.os.SystemClock;
import com.google.android.material.datepicker.j;
import com.incognia.internal.mXi;
import g9.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class mXi {

    /* renamed from: b, reason: collision with root package name */
    public static final pl2 f10907b = new pl2(FD.f8653b, true);

    /* renamed from: W, reason: collision with root package name */
    public static final XYO f10906W = new XYO();

    /* renamed from: f9, reason: collision with root package name */
    public static final W6 f10908f9 = new W6();
    public static final LinkedHashMap sVU = new LinkedHashMap();
    public static final AtomicInteger gmP = new AtomicInteger(0);

    public static final void W(int i4) {
        try {
            sVU.remove(Integer.valueOf(i4));
        } catch (Throwable th) {
            f10906W.b(th);
        }
    }

    public static int b(final String str) {
        final int incrementAndGet = gmP.incrementAndGet();
        try {
            W6 w62 = f10908f9;
            w62.getClass();
            final long currentTimeMillis = System.currentTimeMillis();
            final v73 v73Var = new v73(w62);
            f10907b.b(new d7p() { // from class: h9.au
                @Override // com.incognia.internal.d7p
                public final void run() {
                    mXi.b(incrementAndGet, str, currentTimeMillis, v73Var);
                }
            });
            return incrementAndGet;
        } catch (Throwable th) {
            f10906W.b(th);
            return incrementAndGet;
        }
    }

    public static void f9(final int i4) {
        try {
            f10908f9.getClass();
            final long currentTimeMillis = System.currentTimeMillis();
            final long uptimeMillis = SystemClock.uptimeMillis();
            f10907b.b(new d7p() { // from class: h9.av
                @Override // com.incognia.internal.d7p
                public final void run() {
                    mXi.b(i4, uptimeMillis, currentTimeMillis);
                }
            });
        } catch (Throwable th) {
            f10906W.b(th);
        }
    }

    public static final void b(int i4, String str, long j5, v73 v73Var) {
        sVU.put(Integer.valueOf(i4), new WDG(str, j5, v73Var));
    }

    public static final void b(int i4, long j5, long j6) {
        WDG wdg = (WDG) sVU.get(Integer.valueOf(i4));
        if (wdg != null) {
            wdg.sVU = Long.valueOf(j5 - wdg.gmP.f11532b);
            wdg.f9841f9 = Long.valueOf(j6);
        }
    }

    public static void b(final int i4) {
        f10907b.b(new d7p() { // from class: h9.at
            @Override // com.incognia.internal.d7p
            public final void run() {
                mXi.W(i4);
            }
        });
    }

    public static void b(qK qKVar) {
        f10907b.b(new a(17, qKVar));
    }

    public static final void b(Function1 function1) {
        int collectionSizeOrDefault;
        try {
            Collection values = sVU.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (((WDG) obj).f9841f9 != null) {
                    arrayList.add(obj);
                }
            }
            List<WDG> z2 = CollectionsKt.z(arrayList);
            if (z2.isEmpty()) {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(new Result(Result.m206constructorimpl(CollectionsKt.emptyList())));
                return;
            }
            CollectionsKt.c(sVU.entrySet(), RZF.f9552b);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(z2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WDG wdg : z2) {
                arrayList2.add(new C3K(wdg.f9840b, Long.valueOf(wdg.f9839W), wdg.f9841f9, wdg.sVU));
            }
            function1.invoke(new Result(Result.m206constructorimpl(CollectionsKt.p(arrayList2, new B3()))));
        } catch (Throwable th) {
            f10906W.b(th);
            Result.Companion companion2 = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(th)), function1);
        }
    }
}
