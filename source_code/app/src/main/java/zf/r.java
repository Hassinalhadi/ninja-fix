package zf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class r implements InterfaceC3440j {
    public final /* synthetic */ xf.e alpha;
    public final /* synthetic */ int purple;

    public r(xf.e eVar, int i4) {
        this.alpha = eVar;
        this.purple = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (vf.ad.bronze(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.alpha.bravo(r0, r7) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        q qVar;
        int i4;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i5 = qVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                qVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = qVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = qVar.red;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj2);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj2);
                } else {
                    ResultKt.alpha(obj2);
                    kotlin.collections.v vVar = new kotlin.collections.v(this.purple, obj);
                    qVar.red = 1;
                }
                qVar.red = 2;
            }
        }
        qVar = new q(this, cVar);
        Object obj22 = qVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = qVar.red;
        if (i4 == 0) {
        }
        qVar.red = 2;
    }
}
