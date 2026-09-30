package O2;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.J6;
import vf.C3207k;
import vf.F;
import vf.ad;

/* loaded from: classes3.dex */
public final class e {
    public final o alpha;
    public final X2.k bravo;
    public final Ef.i charlie;
    public final k delta;

    public e(o oVar, X2.k kVar, Ef.i iVar, k kVar2) {
        this.alpha = oVar;
        this.bravo = kVar;
        this.charlie = iVar;
        this.delta = kVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x007a, code lost:
    
        r2.hotel(kotlin.Unit.INSTANCE, r8.bravo);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Pd.c cVar) {
        d dVar;
        Od.a aVar;
        int i4;
        Ef.i iVar;
        int andDecrement;
        int i5;
        Object sierra;
        e eVar;
        Object obj;
        Throwable th;
        Object blue;
        try {
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i10 = dVar.teal;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    dVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj2 = dVar.red;
                    aVar = Od.a.alpha;
                    i4 = dVar.teal;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = (Ef.e) dVar.alpha;
                                try {
                                    ResultKt.alpha(obj2);
                                    g gVar = (g) obj2;
                                    ((Ef.h) obj).bravo();
                                    return gVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((Ef.h) obj).bravo();
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ef.i iVar2 = dVar.purple;
                        eVar = (e) dVar.alpha;
                        ResultKt.alpha(obj2);
                        iVar = iVar2;
                    } else {
                        ResultKt.alpha(obj2);
                        dVar.alpha = this;
                        iVar = this.charlie;
                        dVar.purple = iVar;
                        dVar.teal = 1;
                        iVar.getClass();
                        do {
                            andDecrement = Ef.h.golf.getAndDecrement(iVar);
                            i5 = iVar.alpha;
                        } while (andDecrement > i5);
                        if (andDecrement > 0) {
                            sierra = Unit.INSTANCE;
                        } else {
                            C3207k tango = ad.tango(J6.delta(dVar));
                            try {
                                if (!iVar.alpha(tango)) {
                                    while (true) {
                                        int andDecrement2 = Ef.h.golf.getAndDecrement(iVar);
                                        if (andDecrement2 <= i5) {
                                            if (andDecrement2 > 0) {
                                                break;
                                            }
                                            if (iVar.alpha(tango)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                sierra = tango.sierra();
                                if (sierra != aVar) {
                                    sierra = Unit.INSTANCE;
                                }
                                if (sierra != aVar) {
                                    sierra = Unit.INSTANCE;
                                }
                            } catch (Throwable th3) {
                                tango.amber();
                                throw th3;
                            }
                        }
                        if (sierra != aVar) {
                            eVar = this;
                        }
                        return aVar;
                    }
                    B2.q qVar = new B2.q(17, eVar);
                    dVar.alpha = iVar;
                    dVar.purple = null;
                    dVar.teal = 2;
                    blue = ad.blue(Nd.i.alpha, new F(qVar, null), dVar);
                    if (blue != aVar) {
                        obj = iVar;
                        obj2 = blue;
                        g gVar2 = (g) obj2;
                        ((Ef.h) obj).bravo();
                        return gVar2;
                    }
                    return aVar;
                }
            }
            B2.q qVar2 = new B2.q(17, eVar);
            dVar.alpha = iVar;
            dVar.purple = null;
            dVar.teal = 2;
            blue = ad.blue(Nd.i.alpha, new F(qVar2, null), dVar);
            if (blue != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            obj = iVar;
            th = th4;
            ((Ef.h) obj).bravo();
            throw th;
        }
        dVar = new d(this, cVar);
        Object obj22 = dVar.red;
        aVar = Od.a.alpha;
        i4 = dVar.teal;
        if (i4 == 0) {
        }
    }
}
