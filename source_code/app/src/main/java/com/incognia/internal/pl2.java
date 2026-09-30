package com.incognia.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import h9.aw;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pl2 {

    /* renamed from: W, reason: collision with root package name */
    public final Handler f11091W;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11092b;

    /* renamed from: f9, reason: collision with root package name */
    public final XYO f11093f9;

    public pl2(HUf hUf, boolean z2) {
        Handler handler;
        this.f11092b = z2;
        if (Intrinsics.areEqual(hUf, G6.f8761b)) {
            handler = (Handler) Vpb.olU.get(Vpb.f9801b.getAndIncrement() % 2);
        } else if (Intrinsics.areEqual(hUf, FD.f8653b)) {
            AtomicInteger atomicInteger = Vpb.f9801b;
            AtomicInteger atomicInteger2 = TVm.f9677b;
            HandlerThread b2 = TVm.b(Vpb.f9802f9);
            Vpb.f9798J.add(b2);
            handler = new Handler(b2.getLooper());
        } else if (Intrinsics.areEqual(hUf, Pgh.f9443b)) {
            handler = Vpb.PqK;
        } else if (Intrinsics.areEqual(hUf, ZH6.f10036b)) {
            handler = Vpb.f9799V;
        } else if (Intrinsics.areEqual(hUf, l4V.f10797b)) {
            AtomicInteger atomicInteger3 = Vpb.f9801b;
            handler = new Handler(Looper.getMainLooper());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f11091W = handler;
        this.f11093f9 = new XYO();
    }

    public static final void W(d7p d7pVar, pl2 pl2Var) {
        try {
            d7pVar.run();
        } catch (Throwable th) {
            if (pl2Var.f11092b) {
                pl2Var.f11093f9.b(th);
            }
        }
    }

    public final void b(d7p d7pVar) {
        this.f11091W.post(new aw(d7pVar, this, 1));
    }

    public final void b(long j5, d7p d7pVar) {
        this.f11091W.postDelayed(new aw(d7pVar, this, 0), j5);
    }

    public static final void b(d7p d7pVar, pl2 pl2Var) {
        try {
            d7pVar.run();
        } catch (Throwable th) {
            if (pl2Var.f11092b) {
                pl2Var.f11093f9.b(th);
            }
        }
    }
}
