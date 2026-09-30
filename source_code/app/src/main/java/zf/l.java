package zf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import vf.I;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class l implements InterfaceC3440j {
    public final /* synthetic */ Ref.ObjectRef alpha;
    public final /* synthetic */ vf.ab purple;
    public final /* synthetic */ n red;
    public final /* synthetic */ InterfaceC3440j silver;

    public l(Ref.ObjectRef objectRef, vf.ab abVar, n nVar, InterfaceC3440j interfaceC3440j) {
        this.alpha = objectRef;
        this.purple = abVar;
        this.red = nVar;
        this.silver = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        k kVar;
        int i4;
        l lVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i5 = kVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                kVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = kVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = kVar.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        obj = kVar.purple;
                        lVar = kVar.alpha;
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    I i10 = (I) this.alpha.alpha;
                    if (i10 != null) {
                        i10.foxtrot(new ChildCancelledException());
                        kVar.alpha = this;
                        kVar.purple = obj;
                        kVar.teal = 1;
                        if (i10.gray(kVar) == aVar) {
                            return aVar;
                        }
                    }
                    lVar = this;
                }
                lVar.alpha.alpha = vf.ad.zulu(lVar.purple, null, vf.ac.silver, new j(lVar.red, lVar.silver, obj, null), 1);
                return Unit.INSTANCE;
            }
        }
        kVar = new k(this, cVar);
        Object obj22 = kVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = kVar.teal;
        if (i4 == 0) {
        }
        lVar.alpha.alpha = vf.ad.zulu(lVar.purple, null, vf.ac.silver, new j(lVar.red, lVar.silver, obj, null), 1);
        return Unit.INSTANCE;
    }
}
