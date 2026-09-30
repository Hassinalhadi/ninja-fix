package Jc;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class m implements InterfaceC3440j {
    public final /* synthetic */ InterfaceC3440j alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;

    public m(InterfaceC3440j interfaceC3440j, boolean z2, boolean z10) {
        this.alpha = interfaceC3440j;
        this.purple = z2;
        this.red = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        l lVar;
        int i4;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i5 = lVar.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                lVar.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = lVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = lVar.purple;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    if (((Boolean) obj).booleanValue() && !this.purple && this.red) {
                        lVar.purple = 1;
                        if (this.alpha.emit(obj, lVar) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        lVar = new l(this, cVar);
        Object obj22 = lVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = lVar.purple;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
