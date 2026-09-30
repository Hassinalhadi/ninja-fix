package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class X implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5829a;

    public X(InterfaceC3440j interfaceC3440j) {
        this.f5829a = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        W w4;
        int i4;
        if (cVar instanceof W) {
            w4 = (W) cVar;
            int i5 = w4.f5822b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                w4.f5822b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = w4.f5821a;
                Od.a aVar = Od.a.alpha;
                i4 = w4.f5822b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5829a;
                    String str = (String) obj;
                    if (str != null) {
                        w4.f5823c = null;
                        w4.e = null;
                        w4.f5825f = null;
                        w4.f5826g = null;
                        w4.f5827h = null;
                        w4.f5822b = 1;
                        if (interfaceC3440j.emit(str, w4) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        w4 = new W(this, cVar);
        Object obj22 = w4.f5821a;
        Od.a aVar2 = Od.a.alpha;
        i4 = w4.f5822b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
