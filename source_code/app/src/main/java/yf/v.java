package yf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class v implements InterfaceC3440j {
    public final /* synthetic */ InterfaceC3440j alpha;
    public final /* synthetic */ Ref.ObjectRef purple;

    public v(InterfaceC3440j interfaceC3440j, Ref.ObjectRef objectRef) {
        this.alpha = interfaceC3440j;
        this.purple = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        u uVar;
        int i4;
        v vVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i5 = uVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                uVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = uVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = uVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        vVar = uVar.alpha;
                        try {
                            ResultKt.alpha(obj2);
                        } catch (Throwable th) {
                            th = th;
                            vVar.purple.alpha = th;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    try {
                        InterfaceC3440j interfaceC3440j = this.alpha;
                        uVar.alpha = this;
                        uVar.silver = 1;
                        if (interfaceC3440j.emit(obj, uVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = this;
                        vVar.purple.alpha = th;
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        uVar = new u(this, cVar);
        Object obj22 = uVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = uVar.silver;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
