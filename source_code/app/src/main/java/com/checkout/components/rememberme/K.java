package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class K implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5765a;

    public K(InterfaceC3440j interfaceC3440j) {
        this.f5765a = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        J j5;
        int i4;
        if (cVar instanceof J) {
            j5 = (J) cVar;
            int i5 = j5.f5759b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                j5.f5759b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = j5.f5758a;
                Od.a aVar = Od.a.alpha;
                i4 = j5.f5759b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5765a;
                    if (((String) obj).length() > 0) {
                        j5.f5760c = null;
                        j5.f5761d = null;
                        j5.f5762f = null;
                        j5.f5763g = null;
                        j5.f5759b = 1;
                        if (interfaceC3440j.emit(obj, j5) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        j5 = new J(this, cVar);
        Object obj22 = j5.f5758a;
        Od.a aVar2 = Od.a.alpha;
        i4 = j5.f5759b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
