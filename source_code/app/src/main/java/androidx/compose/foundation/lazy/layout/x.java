package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q0.AbstractC2375K;
import q0.C2379O;

/* loaded from: classes3.dex */
public final class x implements Xd.m {
    public final /* synthetic */ ai alpha;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ y red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;

    public x(ai aiVar, T.s sVar, y yVar, androidx.compose.runtime.ax axVar) {
        this.alpha = aiVar;
        this.purple = sVar;
        this.red = yVar;
        this.silver = axVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        T.s then;
        R.c cVar = (R.c) obj;
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        Object jade = c0585q.jade();
        Object obj4 = C0580l.alpha;
        if (jade == obj4) {
            jade = new u(cVar, new Cb.u(this.silver, 11));
            c0585q.f(jade);
        }
        u uVar = (u) jade;
        Object jade2 = c0585q.jade();
        if (jade2 == obj4) {
            jade2 = new C2379O(new J2.e(uVar));
            c0585q.f(jade2);
        }
        C2379O c2379o = (C2379O) jade2;
        ai aiVar = this.alpha;
        if (aiVar != null) {
            c0585q.purple(1743490539);
            c0585q.purple(887527095);
            Object obj5 = ay.alpha;
            if (obj5 != null) {
                c0585q.purple(1345648624);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1345697697);
                View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
                boolean golf = c0585q.golf(view);
                Object jade3 = c0585q.jade();
                if (golf || jade3 == obj4) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    if (tag instanceof aw) {
                        jade3 = (aw) tag;
                    } else {
                        jade3 = null;
                    }
                    if (jade3 == null) {
                        jade3 = new ViewOnAttachStateChangeListenerC0560a(view);
                        view.setTag(R.id.compose_prefetch_scheduler, jade3);
                    }
                    c0585q.f(jade3);
                }
                obj5 = (aw) jade3;
                c0585q.quebec(false);
            }
            Object obj6 = obj5;
            c0585q.quebec(false);
            Object[] objArr = {aiVar, uVar, c2379o, obj6};
            boolean golf2 = c0585q.golf(aiVar) | c0585q.india(uVar) | c0585q.india(c2379o) | c0585q.india(obj6);
            Object jade4 = c0585q.jade();
            if (golf2 || jade4 == obj4) {
                jade4 = new X9.e(aiVar, uVar, c2379o, obj6, 3);
                c0585q.f(jade4);
            }
            C0564b.echo(objArr, (Function1) jade4, c0585q);
            c0585q.quebec(false);
        } else {
            c0585q.purple(1744076749);
            c0585q.quebec(false);
        }
        int i4 = aj.alpha;
        T.s sVar = this.purple;
        if (aiVar != null && (then = sVar.then(new TraversablePrefetchStateModifierElement(aiVar))) != null) {
            sVar = then;
        }
        boolean golf3 = c0585q.golf(uVar);
        Object obj7 = this.red;
        boolean golf4 = golf3 | c0585q.golf(obj7);
        Object jade5 = c0585q.jade();
        if (golf4 || jade5 == obj4) {
            jade5 = new Cb.a(21, uVar, obj7);
            c0585q.f(jade5);
        }
        AbstractC2375K.bravo(c2379o, sVar, (Xd.l) jade5, c0585q, 8);
        return Unit.INSTANCE;
    }
}
