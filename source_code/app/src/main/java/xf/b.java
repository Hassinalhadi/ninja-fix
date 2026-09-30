package xf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import s6.J6;
import vf.C3207k;
import vf.ad;
import vf.j0;

/* loaded from: classes2.dex */
public final class b implements j0 {
    public Object alpha = g.papa;
    public C3207k purple;
    public final /* synthetic */ e red;

    public b(e eVar) {
        this.red = eVar;
    }

    public static final void bravo(b bVar) {
        C3207k c3207k = bVar.purple;
        Intrinsics.checkNotNull(c3207k);
        bVar.purple = null;
        bVar.alpha = g.lima;
        Throwable quebec = bVar.red.quebec();
        if (quebec == null) {
            Result.Companion companion = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(Boolean.FALSE));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(quebec)));
        }
    }

    @Override // vf.j0
    public final void alpha(Af.r rVar, int i4) {
        C3207k c3207k = this.purple;
        if (c3207k != null) {
            c3207k.alpha(rVar, i4);
        }
    }

    public final Object charlie(Pd.c cVar) {
        m mVar;
        Boolean bool;
        Object obj = this.alpha;
        boolean z2 = true;
        if (obj == g.papa || obj == g.lima) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.yellow;
            e eVar = this.red;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                if (eVar.whiskey()) {
                    this.alpha = g.lima;
                    Throwable quebec = eVar.quebec();
                    if (quebec == null) {
                        z2 = false;
                    } else {
                        int i4 = Af.s.alpha;
                        throw quebec;
                    }
                } else {
                    long andIncrement = e.red.getAndIncrement(eVar);
                    long j5 = g.bravo;
                    long j6 = andIncrement / j5;
                    int i5 = (int) (andIncrement % j5);
                    if (mVar2.charlie != j6) {
                        mVar = eVar.papa(j6, mVar2);
                        if (mVar == null) {
                            continue;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    Object crimson = eVar.crimson(mVar, i5, andIncrement, null);
                    Af.t tVar = g.mike;
                    if (crimson != tVar) {
                        Af.t tVar2 = g.oscar;
                        if (crimson == tVar2) {
                            if (andIncrement < eVar.tango()) {
                                mVar.bravo();
                            }
                            mVar2 = mVar;
                        } else {
                            if (crimson == g.november) {
                                e eVar2 = this.red;
                                C3207k tango = ad.tango(J6.delta(cVar));
                                try {
                                    this.purple = tango;
                                    Object crimson2 = eVar2.crimson(mVar, i5, andIncrement, this);
                                    if (crimson2 == tVar) {
                                        alpha(mVar, i5);
                                    } else {
                                        if (crimson2 == tVar2) {
                                            if (andIncrement < eVar2.tango()) {
                                                mVar.bravo();
                                            }
                                            m mVar3 = (m) e.yellow.get(eVar2);
                                            while (true) {
                                                if (eVar2.whiskey()) {
                                                    bravo(this);
                                                    break;
                                                }
                                                long andIncrement2 = e.red.getAndIncrement(eVar2);
                                                long j7 = g.bravo;
                                                long j10 = andIncrement2 / j7;
                                                int i10 = (int) (andIncrement2 % j7);
                                                if (mVar3.charlie != j10) {
                                                    m papa = eVar2.papa(j10, mVar3);
                                                    if (papa != null) {
                                                        mVar3 = papa;
                                                    }
                                                }
                                                Object crimson3 = eVar2.crimson(mVar3, i10, andIncrement2, this);
                                                if (crimson3 == g.mike) {
                                                    alpha(mVar3, i10);
                                                    break;
                                                }
                                                if (crimson3 == g.oscar) {
                                                    if (andIncrement2 < eVar2.tango()) {
                                                        mVar3.bravo();
                                                    }
                                                } else if (crimson3 != g.november) {
                                                    mVar3.bravo();
                                                    this.alpha = crimson3;
                                                    this.purple = null;
                                                    bool = Boolean.TRUE;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        } else {
                                            mVar.bravo();
                                            this.alpha = crimson2;
                                            this.purple = null;
                                            bool = Boolean.TRUE;
                                        }
                                        tango.hotel(bool, null);
                                    }
                                    Object sierra = tango.sierra();
                                    Od.a aVar = Od.a.alpha;
                                    return sierra;
                                } catch (Throwable th) {
                                    tango.amber();
                                    throw th;
                                }
                            }
                            mVar.bravo();
                            this.alpha = crimson;
                        }
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public final Object delta() {
        Object obj = this.alpha;
        Af.t tVar = g.papa;
        if (obj != tVar) {
            this.alpha = tVar;
            if (obj != g.lima) {
                return obj;
            }
            Throwable romeo = this.red.romeo();
            int i4 = Af.s.alpha;
            throw romeo;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked");
    }
}
