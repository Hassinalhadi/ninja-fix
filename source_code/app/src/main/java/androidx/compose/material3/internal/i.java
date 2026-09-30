package androidx.compose.material3.internal;

import F.G2;
import F.Y;
import a0.C0366t;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.O;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import b.M;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.K;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class i {
    public static final void alpha(long j5, D0.an anVar, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-716124955);
        if ((i4 & 6) == 0) {
            if (c0585q.foxtrot(j5)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(anVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(lVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) == 146 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            androidx.compose.runtime.aa aaVar = G2.alpha;
            C0564b.bravo(new O[]{Y.alpha.alpha(new C0366t(j5)), aaVar.alpha(((D0.an) c0585q.kilo(aaVar)).delta(anVar))}, lVar, c0585q, ((i5 >> 3) & 112) | 8);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ai(j5, anVar, lVar, i4, 0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(Function0 function0, Xd.l lVar, Pd.c cVar) {
        d dVar;
        int i4;
        if (cVar instanceof d) {
            d dVar2 = (d) cVar;
            int i5 = dVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                dVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                dVar = dVar2;
                Object obj = dVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = dVar.purple;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    h hVar = new h(function0, lVar, null);
                    dVar.purple = 1;
                    if (vf.ad.mike(hVar, dVar) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        dVar = new Pd.c(cVar);
        Object obj2 = dVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = dVar.purple;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }

    public static final Object charlie(t tVar, Object obj, float f5, Pd.i iVar) {
        Object bravo = tVar.bravo(obj, M.alpha, new c(tVar, f5, null), iVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    public static final T.s delta(T.s sVar, t tVar, Xd.l lVar) {
        K k6 = K.alpha;
        return sVar.then(new DraggableAnchorsElement(tVar, lVar));
    }

    public static final String echo(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.kilo(AndroidCompositionLocals_androidKt.alpha);
        return ((Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo)).getResources().getString(i4);
    }
}
