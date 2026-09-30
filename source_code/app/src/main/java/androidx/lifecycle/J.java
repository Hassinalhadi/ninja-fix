package androidx.lifecycle;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class J implements aj {
    public final /* synthetic */ aa alpha;
    public final /* synthetic */ Ref.ObjectRef purple;
    public final /* synthetic */ vf.ab red;
    public final /* synthetic */ aa silver;
    public final /* synthetic */ C3207k teal;
    public final /* synthetic */ Ef.c white;
    public final /* synthetic */ Pd.i yellow;

    /* JADX WARN: Multi-variable type inference failed */
    public J(aa aaVar, Ref.ObjectRef objectRef, vf.ab abVar, aa aaVar2, C3207k c3207k, Ef.c cVar, Xd.l lVar) {
        this.alpha = aaVar;
        this.purple = objectRef;
        this.red = abVar;
        this.silver = aaVar2;
        this.teal = c3207k;
        this.white = cVar;
        this.yellow = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.l, Pd.i] */
    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        Ref.ObjectRef objectRef = this.purple;
        if (aaVar == this.alpha) {
            objectRef.alpha = vf.ad.zulu(this.red, null, null, new I(this.white, this.yellow, null), 3);
            return;
        }
        if (aaVar == this.silver) {
            vf.I i4 = (vf.I) objectRef.alpha;
            if (i4 != null) {
                i4.foxtrot(null);
            }
            objectRef.alpha = null;
        }
        if (aaVar == aa.ON_DESTROY) {
            Result.Companion companion = Result.INSTANCE;
            this.teal.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
        }
    }
}
