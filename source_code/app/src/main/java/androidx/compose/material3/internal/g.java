package androidx.compose.material3.internal;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import vf.I;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class g implements InterfaceC3440j {
    public final /* synthetic */ Ref.ObjectRef alpha;
    public final /* synthetic */ vf.ab purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Ref.ObjectRef objectRef, vf.ab abVar, Xd.l lVar) {
        this.alpha = objectRef;
        this.purple = abVar;
        this.red = (Pd.i) lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Xd.l, Pd.i] */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        f fVar;
        int i4;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i5 = fVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                fVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = fVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = fVar.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        obj = fVar.purple;
                        gVar = fVar.alpha;
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    I i10 = (I) this.alpha.alpha;
                    if (i10 != null) {
                        i10.foxtrot(new AnchoredDragFinishedSignal());
                        fVar.alpha = this;
                        fVar.purple = obj;
                        fVar.teal = 1;
                        if (i10.gray(fVar) == aVar) {
                            return aVar;
                        }
                    }
                    gVar = this;
                }
                Ref.ObjectRef objectRef = gVar.alpha;
                vf.ac acVar = vf.ac.silver;
                ?? r4 = gVar.red;
                vf.ab abVar = gVar.purple;
                objectRef.alpha = vf.ad.zulu(abVar, null, acVar, new e(r4, obj, abVar, null), 1);
                return Unit.INSTANCE;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = fVar.teal;
        if (i4 == 0) {
        }
        Ref.ObjectRef objectRef2 = gVar.alpha;
        vf.ac acVar2 = vf.ac.silver;
        ?? r42 = gVar.red;
        vf.ab abVar2 = gVar.purple;
        objectRef2.alpha = vf.ad.zulu(abVar2, null, acVar2, new e(r42, obj, abVar2, null), 1);
        return Unit.INSTANCE;
    }
}
