package vf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3209m extends K {
    public final /* synthetic */ int teal;
    public final C3207k white;

    public /* synthetic */ C3209m(C3207k c3207k, int i4) {
        this.teal = i4;
        this.white = c3207k;
    }

    @Override // vf.K
    public final boolean juliet() {
        switch (this.teal) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // vf.K
    public final void kilo(Throwable th) {
        C3207k c3207k = this.white;
        switch (this.teal) {
            case 0:
                Throwable romeo = c3207k.romeo(india());
                if (c3207k.xray()) {
                    Af.e eVar = (Af.e) c3207k.silver;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Af.e.f65a;
                        Object obj = atomicReferenceFieldUpdater.get(eVar);
                        Af.t tVar = Af.f.bravo;
                        if (Intrinsics.areEqual(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, romeo)) {
                                if (atomicReferenceFieldUpdater.get(eVar) != tVar) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c3207k.delta(romeo);
                if (!c3207k.xray()) {
                    c3207k.papa();
                    return;
                }
                return;
            default:
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                return;
        }
    }
}
