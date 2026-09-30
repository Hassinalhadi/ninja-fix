package vf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;

/* renamed from: vf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3199c extends K {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13996a = AtomicReferenceFieldUpdater.newUpdater(C3199c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final C3207k teal;
    public aq white;
    public final /* synthetic */ C3201e yellow;

    public C3199c(C3201e c3201e, C3207k c3207k) {
        this.yellow = c3201e;
        this.teal = c3207k;
    }

    @Override // vf.K
    public final boolean juliet() {
        return false;
    }

    @Override // vf.K
    public final void kilo(Throwable th) {
        C3207k c3207k = this.teal;
        if (th != null) {
            c3207k.getClass();
            Af.t blue = c3207k.blue(new C3215t(th, false), null);
            if (blue != null) {
                c3207k.oscar(blue);
                C3200d c3200d = (C3200d) f13996a.get(this);
                if (c3200d != null) {
                    c3200d.bravo();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3201e.bravo;
        C3201e c3201e = this.yellow;
        if (atomicIntegerFieldUpdater.decrementAndGet(c3201e) == 0) {
            ag[] agVarArr = c3201e.alpha;
            ArrayList arrayList = new ArrayList(agVarArr.length);
            for (ag agVar : agVarArr) {
                arrayList.add(agVar.juliet());
            }
            c3207k.resumeWith(Result.m206constructorimpl(arrayList));
        }
    }
}
