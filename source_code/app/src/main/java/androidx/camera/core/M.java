package androidx.camera.core;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0525x;
import bd.ExecutorC0748a;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r1.InterfaceC2482a;
import s6.T7;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final class M {
    public final Object alpha = new Object();
    public final Size bravo;
    public final t charlie;
    public final InterfaceC0525x delta;
    public final boolean echo;
    public final V0.k foxtrot;
    public final V0.h golf;
    public final V0.k hotel;
    public final V0.h india;
    public final V0.h juliet;
    public final J kilo;
    public C0502i lima;
    public L mike;
    public Executor november;

    static {
        Range range = C0509g.foxtrot;
    }

    public M(Size size, InterfaceC0525x interfaceC0525x, boolean z2, t tVar, bj.f fVar) {
        this.bravo = size;
        this.delta = interfaceC0525x;
        this.echo = z2;
        this.charlie = tVar;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + Constants.AES_SUFFIX;
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i4 = 0;
        V0.k alpha = AbstractC3003i.alpha(new V0.i() { // from class: androidx.camera.core.F
            @Override // V0.i
            public final Object black(V0.h hVar) {
                switch (i4) {
                    case 0:
                        atomicReference.set(hVar);
                        return P0.gold(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference.set(hVar);
                        return P0.gold(new StringBuilder(), str, "-status");
                    default:
                        atomicReference.set(hVar);
                        return P0.gold(new StringBuilder(), str, "-Surface");
                }
            }
        });
        V0.h hVar = (V0.h) atomicReference.get();
        hVar.getClass();
        this.juliet = hVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i5 = 1;
        V0.k alpha2 = AbstractC3003i.alpha(new V0.i() { // from class: androidx.camera.core.F
            @Override // V0.i
            public final Object black(V0.h hVar2) {
                switch (i5) {
                    case 0:
                        atomicReference2.set(hVar2);
                        return P0.gold(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference2.set(hVar2);
                        return P0.gold(new StringBuilder(), str, "-status");
                    default:
                        atomicReference2.set(hVar2);
                        return P0.gold(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.hotel = alpha2;
        alpha2.foxtrot(new be.g(0, alpha2, new I(0, hVar, alpha)), tg.k.bravo());
        V0.h hVar2 = (V0.h) atomicReference2.get();
        hVar2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i10 = 2;
        V0.k alpha3 = AbstractC3003i.alpha(new V0.i() { // from class: androidx.camera.core.F
            @Override // V0.i
            public final Object black(V0.h hVar22) {
                switch (i10) {
                    case 0:
                        atomicReference3.set(hVar22);
                        return P0.gold(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference3.set(hVar22);
                        return P0.gold(new StringBuilder(), str, "-status");
                    default:
                        atomicReference3.set(hVar22);
                        return P0.gold(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.foxtrot = alpha3;
        V0.h hVar3 = (V0.h) atomicReference3.get();
        hVar3.getClass();
        this.golf = hVar3;
        J j5 = new J(this, size);
        this.kilo = j5;
        com.google.common.util.concurrent.e delta = be.h.delta(j5.echo);
        alpha3.foxtrot(new be.g(0, alpha3, new K(delta, hVar2, str)), tg.k.bravo());
        delta.foxtrot(new G(this, 0), tg.k.bravo());
        ExecutorC0748a bravo = tg.k.bravo();
        AtomicReference atomicReference4 = new AtomicReference(null);
        V0.k alpha4 = AbstractC3003i.alpha(new A2.ao(14, this, atomicReference4));
        alpha4.foxtrot(new be.g(0, alpha4, new O7.j(27, fVar)), bravo);
        V0.h hVar4 = (V0.h) atomicReference4.get();
        hVar4.getClass();
        this.india = hVar4;
    }

    public final void alpha(final Surface surface, Executor executor, final InterfaceC2482a interfaceC2482a) {
        if (!this.golf.bravo(surface)) {
            V0.k kVar = this.foxtrot;
            if (!kVar.isCancelled()) {
                T7.golf(null, kVar.purple.isDone());
                try {
                    kVar.get();
                    final int i4 = 0;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    interfaceC2482a.accept(new C0501h(3, surface));
                                    return;
                                default:
                                    interfaceC2482a.accept(new C0501h(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i5 = 1;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    interfaceC2482a.accept(new C0501h(3, surface));
                                    return;
                                default:
                                    interfaceC2482a.accept(new C0501h(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        I i10 = new I(1, interfaceC2482a, surface);
        V0.k kVar2 = this.hotel;
        kVar2.foxtrot(new be.g(0, kVar2, i10), executor);
    }

    public final void bravo(Executor executor, L l10) {
        C0502i c0502i;
        synchronized (this.alpha) {
            this.mike = l10;
            this.november = executor;
            c0502i = this.lima;
        }
        if (c0502i != null) {
            executor.execute(new E(l10, c0502i, 1));
        }
    }

    public final void charlie() {
        final String str = "Surface request will not complete.";
        this.golf.delta(new Exception(str) { // from class: androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException
        });
    }
}
