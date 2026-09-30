package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2832z6;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class D implements at {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;

    public D(Choreographer choreographer, t0.ay ayVar) {
        this.alpha = 1;
        this.purple = choreographer;
        this.red = ayVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object alpha(Function1 function1, Nd.c cVar) {
        C c3;
        Od.a aVar;
        int i4;
        Object sierra;
        Object blue;
        if (cVar instanceof C) {
            c3 = (C) cVar;
            int i5 = c3.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c3.purple;
                aVar = Od.a.alpha;
                i4 = c3.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = c3.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    C3.d dVar = (C3.d) this.red;
                    c3.alpha = function1;
                    c3.silver = 1;
                    if (dVar.india()) {
                        sierra = Unit.INSTANCE;
                    } else {
                        C3207k c3207k = new C3207k(1, J6.delta(c3));
                        c3207k.tango();
                        synchronized (dVar.red) {
                            ((ArrayList) dVar.purple).add(c3207k);
                        }
                        c3207k.victor(new Cb.l(10, dVar, c3207k));
                        sierra = c3207k.sierra();
                        if (sierra != aVar) {
                            sierra = Unit.INSTANCE;
                        }
                    }
                }
                at atVar = (at) this.purple;
                c3.alpha = null;
                c3.silver = 2;
                blue = atVar.blue(function1, c3);
                if (blue != aVar) {
                    return aVar;
                }
                return blue;
            }
        }
        c3 = new C(this, cVar);
        Object obj2 = c3.purple;
        aVar = Od.a.alpha;
        i4 = c3.silver;
        if (i4 == 0) {
        }
        at atVar2 = (at) this.purple;
        c3.alpha = null;
        c3.silver = 2;
        blue = atVar2.blue(function1, c3);
        if (blue != aVar) {
        }
    }

    @Override // androidx.compose.runtime.at
    public final Object blue(Function1 function1, Nd.c cVar) {
        int i4 = 1;
        switch (this.alpha) {
            case 0:
                return alpha(function1, cVar);
            default:
                t0.ay ayVar = (t0.ay) this.red;
                if (ayVar == null) {
                    Nd.f fVar = cVar.getContext().get(Nd.d.alpha);
                    if (fVar instanceof t0.ay) {
                        ayVar = (t0.ay) fVar;
                    } else {
                        ayVar = null;
                    }
                }
                C3207k c3207k = new C3207k(1, J6.delta(cVar));
                c3207k.tango();
                t0.az azVar = new t0.az(c3207k, this, function1);
                if (ayVar != null && Intrinsics.areEqual(ayVar.purple, (Choreographer) this.purple)) {
                    synchronized (ayVar.silver) {
                        ayVar.white.add(azVar);
                        if (!ayVar.f13830b) {
                            ayVar.f13830b = true;
                            ayVar.purple.postFrameCallback(ayVar.f13831c);
                        }
                    }
                    c3207k.victor(new t0.as(i4, ayVar, azVar));
                } else {
                    ((Choreographer) this.purple).postFrameCallback(azVar);
                    c3207k.victor(new t0.as(2, this, azVar));
                }
                Object sierra = c3207k.sierra();
                Od.a aVar = Od.a.alpha;
                return sierra;
        }
    }

    @Override // Nd.h
    public final Object fold(Object obj, Xd.l lVar) {
        switch (this.alpha) {
            case 0:
                return lVar.invoke(obj, this);
            default:
                return lVar.invoke(obj, this);
        }
    }

    @Override // Nd.h
    public final Nd.f get(Nd.g gVar) {
        switch (this.alpha) {
            case 0:
                return AbstractC2832z6.alpha(this, gVar);
            default:
                return AbstractC2832z6.alpha(this, gVar);
        }
    }

    @Override // Nd.f
    public final Nd.g getKey() {
        switch (this.alpha) {
            case 0:
                return as.purple;
            default:
                return as.purple;
        }
    }

    @Override // Nd.h
    public final Nd.h minusKey(Nd.g gVar) {
        switch (this.alpha) {
            case 0:
                return AbstractC2832z6.bravo(this, gVar);
            default:
                return AbstractC2832z6.bravo(this, gVar);
        }
    }

    @Override // Nd.h
    public final Nd.h plus(Nd.h hVar) {
        switch (this.alpha) {
            case 0:
                return AbstractC2832z6.charlie(this, hVar);
            default:
                return AbstractC2832z6.charlie(this, hVar);
        }
    }

    public D(at atVar) {
        this.alpha = 0;
        this.purple = atVar;
        this.red = new C3.d();
    }
}
