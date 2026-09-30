package t6;

import Jb.C0201i;
import a2.C0391p;
import android.content.Context;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import io.ktor.serialization.ContentConvertException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import yf.AbstractC3428A;

/* loaded from: classes2.dex */
public abstract class W2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(ArrayList arrayList, io.ktor.utils.io.t tVar, Ed.a aVar, Charset charset, Pd.c cVar) {
        wd.d dVar;
        Object obj;
        int i4;
        Ed.a aVar2;
        io.ktor.utils.io.t tVar2;
        if (cVar instanceof wd.d) {
            wd.d dVar2 = (wd.d) cVar;
            int i5 = dVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                dVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                dVar = dVar2;
                obj = dVar.red;
                Od.a aVar3 = Od.a.alpha;
                i4 = dVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        aVar2 = dVar.purple;
                        tVar2 = dVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    wd.c cVar2 = new wd.c(new C1.t(4, arrayList), charset, aVar, tVar, 0);
                    wd.e eVar = new wd.e(tVar, null);
                    dVar.alpha = tVar;
                    dVar.purple = aVar;
                    dVar.silver = 1;
                    obj = AbstractC3428A.papa(cVar2, eVar, dVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar2 = aVar;
                    tVar2 = tVar;
                }
                if (obj != null) {
                    if (!tVar2.hotel()) {
                        return tVar2;
                    }
                    ge.w wVar = aVar2.bravo;
                    if (wVar != null && wVar.alpha()) {
                        return vd.b.alpha;
                    }
                    throw new ContentConvertException("No suitable converter found for " + aVar2, null, 2, null);
                }
                return obj;
            }
        }
        dVar = new Pd.c(cVar);
        obj = dVar.red;
        Od.a aVar32 = Od.a.alpha;
        i4 = dVar.silver;
        if (i4 == 0) {
        }
        if (obj != null) {
        }
    }

    public static final Y1.ag bravo(Y1.at[] atVarArr, C0585q c0585q) {
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        Object[] copyOf = Arrays.copyOf(atVarArr, atVarArr.length);
        J2.l lVar = new J2.l(new S4.b(22), new C0391p(context, 0));
        boolean india = c0585q.india(context);
        Object jade = c0585q.jade();
        if (india || jade == C0580l.alpha) {
            jade = new C0201i(context, 4);
            c0585q.f(jade);
        }
        Y1.ag agVar = (Y1.ag) R.l.delta(copyOf, lVar, (Function0) jade, c0585q, 0, 4);
        for (Y1.at atVar : atVarArr) {
            agVar.bravo.sierra.alpha(atVar);
        }
        return agVar;
    }
}
