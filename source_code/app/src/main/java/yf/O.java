package yf;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import s6.J6;
import vf.C3207k;
import zf.AbstractC3511a;

/* loaded from: classes2.dex */
public final class O extends zf.c {
    public final AtomicReference alpha = new AtomicReference(null);

    @Override // zf.c
    public final boolean alpha(AbstractC3511a abstractC3511a) {
        AtomicReference atomicReference = this.alpha;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC3428A.bravo);
        return true;
    }

    @Override // zf.c
    public final Nd.c[] bravo(AbstractC3511a abstractC3511a) {
        this.alpha.set(null);
        return zf.b.alpha;
    }

    public final Object charlie(M m4) {
        C3207k c3207k = new C3207k(1, J6.delta(m4));
        c3207k.tango();
        AtomicReference atomicReference = this.alpha;
        Af.t tVar = AbstractC3428A.bravo;
        while (true) {
            if (atomicReference.compareAndSet(tVar, c3207k)) {
                break;
            }
            if (atomicReference.get() != tVar) {
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                break;
            }
        }
        Object sierra = c3207k.sierra();
        if (sierra == Od.a.alpha) {
            return sierra;
        }
        return Unit.INSTANCE;
    }
}
