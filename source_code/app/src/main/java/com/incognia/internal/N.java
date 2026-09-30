package com.incognia.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import g9.a;
import h9.C1823a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class N implements Application.ActivityLifecycleCallbacks {
    public static final void b() {
        IZZ.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            IZZ.gmP.b(new C1823a(3));
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            IZZ.gmP.b(new a(7, activity));
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static final void b(Activity activity) {
        AtomicReference atomicReference = IZZ.f8909W;
        String simpleName = activity.getClass().getSimpleName();
        AtomicReference atomicReference2 = IZZ.f8909W;
        iA iAVar = (iA) atomicReference2.get();
        atomicReference2.set(i.f10596b);
        IZZ.f8911f9 = simpleName;
        Iterator it = IZZ.f8907J.iterator();
        while (it.hasNext()) {
            ((a11) it.next()).b();
        }
        if (Intrinsics.areEqual(iAVar, r.f11189b)) {
            Iterator it2 = IZZ.PqK.iterator();
            while (it2.hasNext()) {
                ((XO) it2.next()).b();
            }
        }
    }
}
