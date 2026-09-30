package androidx.lifecycle;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import td.C3117a;

/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0639i extends ay {
    public av.ao bravo;

    public final Unit charlie(Pd.c cVar) {
        C0638h c0638h;
        int i4;
        if (cVar instanceof C0638h) {
            c0638h = (C0638h) cVar;
            int i5 = c0638h.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0638h.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0638h.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c0638h.red;
                if (i4 != 0 || i4 == 1) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        c0638h = new C0638h(this, cVar);
        Object obj2 = c0638h.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0638h.red;
        if (i4 != 0) {
        }
        ResultKt.alpha(obj2);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.ay, androidx.lifecycle.au
    public final void onActive() {
        super.onActive();
        av.ao aoVar = this.bravo;
        if (aoVar != null) {
            vf.Y y10 = (vf.Y) aoVar.white;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            aoVar.white = null;
            if (((vf.Y) aoVar.teal) == null) {
                aoVar.teal = vf.ad.zulu((C3117a) aoVar.red, null, null, new C0633c(aoVar, null), 3);
            }
        }
    }

    @Override // androidx.lifecycle.ay, androidx.lifecycle.au
    public final void onInactive() {
        super.onInactive();
        av.ao aoVar = this.bravo;
        if (aoVar != null) {
            if (((vf.Y) aoVar.white) == null) {
                Cf.e eVar = vf.ao.alpha;
                aoVar.white = vf.ad.zulu((C3117a) aoVar.red, Af.n.alpha.teal, null, new C0632b(aoVar, null), 2);
                return;
            }
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
    }
}
