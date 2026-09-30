package com.incognia.internal;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import h9.C1823a;
import h9.C1825c;
import h9.C1831i;
import h9.C1832j;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class IZZ {

    /* renamed from: f9, reason: collision with root package name */
    public static String f8911f9;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8910b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: W, reason: collision with root package name */
    public static final AtomicReference f8909W = new AtomicReference(r.f11189b);
    public static final AtomicBoolean sVU = new AtomicBoolean(false);
    public static final pl2 gmP = new pl2(G6.f8761b, true);

    /* renamed from: J, reason: collision with root package name */
    public static final LinkedHashSet f8907J = new LinkedHashSet();
    public static final LinkedHashSet PqK = new LinkedHashSet();

    /* renamed from: V, reason: collision with root package name */
    public static final N f8908V = new N();

    public static final void W(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(f8908V);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        try {
            if (sVU.compareAndSet(false, true)) {
                if (Looper.getMainLooper().equals(Looper.myLooper())) {
                    Context applicationContext = context.getApplicationContext();
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        application.registerActivityLifecycleCallbacks(f8908V);
                        return;
                    }
                    return;
                }
                new pl2(l4V.f10797b, true).b(new C1825c(context, 1));
            }
        } catch (Throwable unused) {
        }
    }

    public static void f9(a11 a11Var) {
        gmP.b(new C1832j(a11Var, 0));
    }

    public static final void sVU(a11 a11Var) {
        f8907J.remove(a11Var);
    }

    public static void f9(XO xo) {
        gmP.b(new C1831i(xo, 1));
    }

    public static final void sVU(XO xo) {
        PqK.remove(xo);
    }

    public static final void W(a11 a11Var) {
        f8907J.add(a11Var);
    }

    public static final void W(XO xo) {
        PqK.add(xo);
    }

    public static final void W() {
        f8909W.set(f8911f9 != null ? i.f10596b : r.f11189b);
    }

    public static void b(a11 a11Var) {
        gmP.b(new C1832j(a11Var, 1));
    }

    public static void b(XO xo) {
        gmP.b(new C1831i(xo, 0));
    }

    public static void b() {
        f8911f9 = null;
        gmP.b(f8910b, new C1823a(1));
    }
}
