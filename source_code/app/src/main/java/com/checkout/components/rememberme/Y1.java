package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.utils.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class Y1 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5837a;

    public Y1(InterfaceC3440j interfaceC3440j) {
        this.f5837a = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        X1 x12;
        int i4;
        if (cVar instanceof X1) {
            x12 = (X1) cVar;
            int i5 = x12.f5831b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                x12.f5831b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = x12.f5830a;
                Od.a aVar = Od.a.alpha;
                i4 = x12.f5831b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5837a;
                    String str = (String) obj;
                    if (!Intrinsics.areEqual(str, Constants.ADD_CARD_ITEM_ID) && str != null && str.length() != 0) {
                        x12.f5832c = null;
                        x12.f5833d = null;
                        x12.f5834f = null;
                        x12.f5835g = null;
                        x12.f5831b = 1;
                        if (interfaceC3440j.emit(obj, x12) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        x12 = new X1(this, cVar);
        Object obj22 = x12.f5830a;
        Od.a aVar2 = Od.a.alpha;
        i4 = x12.f5831b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
