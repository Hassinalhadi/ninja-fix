package com.incognia.internal;

import K5.a;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import av.l;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import ga.as;
import h9.C1835m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Ref;
import s6.AbstractC2689j6;

/* loaded from: classes2.dex */
public abstract class Lsv {

    /* renamed from: W, reason: collision with root package name */
    public static final W6 f9085W;

    /* renamed from: b, reason: collision with root package name */
    public static final sG0 f9086b;

    /* renamed from: f9, reason: collision with root package name */
    public static final Pwm f9087f9;
    public static final AtomicReference sVU;

    static {
        sG0 sg0;
        W6 w62;
        Context context;
        try {
            sg0 = new sG0();
            f9086b = sg0;
            w62 = new W6();
            f9085W = w62;
            context = OQ.f9304b;
        } catch (Throwable unused) {
        }
        if (context != null) {
            f9087f9 = new Pwm(new C7a(context, w62, yL2.f11856W, ab.juliet(yL2.f11857b), sg0));
            sVU = new AtomicReference();
            return;
        }
        throw new NullPointerException("Using SDK context before initialization");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final void W(Throwable th, boolean z2) {
        W6 w62 = f9085W;
        (w62 != null ? w62 : null).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (w62 == null) {
            w62 = null;
        }
        w62.getClass();
        String id2 = TimeZone.getDefault().getID();
        String message = th.getMessage();
        if (message == null) {
            message = LogMessages.UNKNOWN_ERROR;
        }
        String str = message;
        String echo = AbstractC2689j6.echo(th);
        hc hcVar = hc.f10551b;
        PIe pIe = new PIe(currentTimeMillis, id2, str, echo, z2, false, null, null, null, null, null, null, null, null, null, null, (String) wGk.lK.getValue(), 655232);
        Pwm pwm = f9087f9;
        Pwm pwm2 = pwm != null ? pwm : null;
        XnD xnD = new XnD(currentTimeMillis, pIe);
        pwm2.getClass();
        ?? obj = new Object();
        pwm2.f10963b.b(new VZP(obj, pwm2));
        if (obj.alpha) {
            ?? obj2 = new Object();
            pwm2.f10963b.b(new VZP(obj2, pwm2));
            if (obj2.alpha) {
                pwm2.f10963b.W(new bFl(pwm2));
                pwm2.f10963b.b(nc.f10960b);
            }
        }
        pwm2.f9456f9.b(new kV(xnD, pwm2));
    }

    public static final void b(Thread thread, Throwable th) {
    }

    public static Handler f9() {
        AtomicReference atomicReference = sVU;
        HandlerThread handlerThread = (HandlerThread) atomicReference.get();
        if (handlerThread == null) {
            HandlerThread b2 = TVm.b(new C1835m(0));
            while (!atomicReference.compareAndSet(null, b2) && atomicReference.get() == null) {
            }
            handlerThread = (HandlerThread) atomicReference.get();
        }
        return new Handler(handlerThread.getLooper());
    }

    public static void b(Throwable th, boolean z2) {
        f9().post(new l(th, z2, 3));
    }

    public static void b(PIe pIe) {
        f9().post(new as(2, pIe));
    }

    public static void b(ArrayList arrayList) {
        f9().post(new as(4, arrayList));
    }

    public static void b(YWS yws) {
        f9().post(new as(3, yws));
    }

    public static void b() {
        f9().post(new a(4));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PIe pIe = (PIe) it.next();
            Pwm pwm = f9087f9;
            if (pwm == null) {
                pwm = null;
            }
            XnD xnD = new XnD(pIe.f9412b, pIe);
            pwm.getClass();
            ?? obj = new Object();
            pwm.f10963b.b(new VZP(obj, pwm));
            if (obj.alpha) {
                ?? obj2 = new Object();
                pwm.f10963b.b(new VZP(obj2, pwm));
                if (obj2.alpha) {
                    pwm.f10963b.W(new bFl(pwm));
                    pwm.f10963b.b(nc.f10960b);
                }
            }
            pwm.f9456f9.b(new kV(xnD, pwm));
        }
    }

    public static final void W() {
        Pwm pwm = f9087f9;
        if (pwm == null) {
            pwm = null;
        }
        pwm.f10963b.b(new Lz(pwm));
    }

    public static final void W(YWS yws) {
        int collectionSizeOrDefault;
        try {
            Pwm pwm = f9087f9;
            if (pwm == null) {
                pwm = null;
            }
            pwm.getClass();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            pwm.f9456f9.W(new z2e(pwm, objectRef));
            List list = (List) objectRef.alpha;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((XnD) it.next()).sVU);
            }
            yws.b(arrayList);
        } catch (Throwable unused) {
            Pwm pwm2 = f9087f9;
            Pwm pwm3 = pwm2 != null ? pwm2 : null;
            pwm3.f10963b.b(new Lz(pwm3));
            yws.b(CollectionsKt.emptyList());
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final void W(PIe pIe) {
        Pwm pwm = f9087f9;
        if (pwm == null) {
            pwm = null;
        }
        XnD xnD = new XnD(pIe.f9412b, pIe);
        pwm.getClass();
        ?? obj = new Object();
        pwm.f10963b.b(new VZP(obj, pwm));
        if (obj.alpha) {
            ?? obj2 = new Object();
            pwm.f10963b.b(new VZP(obj2, pwm));
            if (obj2.alpha) {
                pwm.f10963b.W(new bFl(pwm));
                pwm.f10963b.b(nc.f10960b);
            }
        }
        pwm.f9456f9.b(new kV(xnD, pwm));
    }
}
