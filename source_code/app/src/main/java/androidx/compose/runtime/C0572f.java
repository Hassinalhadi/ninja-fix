package androidx.compose.runtime;

import Yb.C0312j0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2832z6;
import s6.J6;
import vf.C3207k;

/* renamed from: androidx.compose.runtime.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0572f implements at {
    public final C0312j0 alpha;
    public Throwable red;
    public final Object purple = new Object();
    public final P.a silver = new AtomicInteger(0);
    public bv.ah teal = new bv.ah();
    public bv.ah white = new bv.ah();

    /* JADX WARN: Type inference failed for: r2v2, types: [P.a, java.util.concurrent.atomic.AtomicInteger] */
    public C0572f(C0312j0 c0312j0) {
        this.alpha = c0312j0;
    }

    public static final void alpha(C0572f c0572f, Throwable th) {
        int i4;
        synchronized (c0572f.purple) {
            try {
                if (c0572f.red != null) {
                    return;
                }
                c0572f.red = th;
                bv.ah ahVar = c0572f.teal;
                Object[] objArr = ahVar.alpha;
                int i5 = ahVar.bravo;
                for (int i10 = 0; i10 < i5; i10++) {
                    C3207k c3207k = ((C0568d) objArr[i10]).bravo;
                    if (c3207k != null) {
                        Result.Companion companion = Result.INSTANCE;
                        c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
                    }
                }
                c0572f.teal.india();
                P.a aVar = c0572f.silver;
                do {
                    i4 = aVar.get();
                } while (!aVar.compareAndSet(i4, ((((i4 >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.runtime.d, java.lang.Object] */
    @Override // androidx.compose.runtime.at
    public final Object blue(Function1 function1, Nd.c cVar) {
        int i4;
        int i5;
        boolean z2 = true;
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        ?? obj = new Object();
        obj.alpha = function1;
        obj.bravo = c3207k;
        ?? obj2 = new Object();
        obj2.alpha = -1;
        synchronized (this.purple) {
            Throwable th = this.red;
            if (th != null) {
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
            } else {
                P.a aVar = this.silver;
                do {
                    i4 = aVar.get();
                    i5 = i4 + 1;
                } while (!aVar.compareAndSet(i4, i5));
                if ((134217727 & i5) != 1) {
                    z2 = false;
                }
                obj2.alpha = (i5 >>> 27) & 15;
                this.teal.golf(obj);
                c3207k.victor(new C0570e(obj, this, obj2));
                if (z2) {
                    try {
                        this.alpha.invoke();
                    } catch (Throwable th2) {
                        alpha(this, th2);
                    }
                }
            }
        }
        Object sierra = c3207k.sierra();
        Od.a aVar2 = Od.a.alpha;
        return sierra;
    }

    public final void bravo(long j5) {
        int i4;
        C3207k c3207k;
        Object m206constructorimpl;
        synchronized (this.purple) {
            try {
                bv.ah ahVar = this.teal;
                this.teal = this.white;
                this.white = ahVar;
                P.a aVar = this.silver;
                do {
                    i4 = aVar.get();
                } while (!aVar.compareAndSet(i4, ((((i4 >>> 27) & 15) + 1) & 15) << 27));
                int i5 = ahVar.bravo;
                for (int i10 = 0; i10 < i5; i10++) {
                    C0568d c0568d = (C0568d) ahVar.bravo(i10);
                    Function1 function1 = c0568d.alpha;
                    if (function1 != null && (c3207k = c0568d.bravo) != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(function1.invoke(Long.valueOf(j5)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                        }
                        c3207k.resumeWith(m206constructorimpl);
                    }
                }
                ahVar.india();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Nd.h
    public final Object fold(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // Nd.h
    public final Nd.f get(Nd.g gVar) {
        return AbstractC2832z6.alpha(this, gVar);
    }

    @Override // Nd.f
    public final Nd.g getKey() {
        return as.purple;
    }

    @Override // Nd.h
    public final Nd.h minusKey(Nd.g gVar) {
        return AbstractC2832z6.bravo(this, gVar);
    }

    @Override // Nd.h
    public final Nd.h plus(Nd.h hVar) {
        return AbstractC2832z6.charlie(this, hVar);
    }
}
