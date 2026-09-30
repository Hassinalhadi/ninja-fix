package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2689j6;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class Q implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5795b;

    public Q(InterfaceC3440j interfaceC3440j, MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        this.f5794a = interfaceC3440j;
        this.f5795b = mapJWTTokenToWalletUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        P p4;
        int i4;
        Logger logger;
        String str;
        Logger logger2;
        if (cVar instanceof P) {
            p4 = (P) cVar;
            int i5 = p4.f5788b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                p4.f5788b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = p4.f5787a;
                Od.a aVar = Od.a.alpha;
                i4 = p4.f5788b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5794a;
                    Pair pair = (Pair) obj;
                    String str2 = (String) pair.first;
                    Object obj3 = ((Result) pair.second).alpha;
                    boolean z2 = obj3 instanceof kotlin.k;
                    if (!z2 && ((str = (String) obj3) == null || str.length() == 0)) {
                        logger2 = this.f5795b.f6336d;
                        N4.a.alpha(logger2, MapJWTTokenToWalletUseCase.access$getConsumerDecodeError(this.f5795b), null, false, 6, null);
                    }
                    Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj3);
                    if (m207exceptionOrNullimpl != null) {
                        logger = this.f5795b.f6336d;
                        N4.a.alpha(logger, MapJWTTokenToWalletUseCase.access$getConsumerDecodeError(this.f5795b), AbstractC2689j6.echo(m207exceptionOrNullimpl), false, 4, null);
                    }
                    if (z2) {
                        obj3 = null;
                    }
                    Pair pair2 = new Pair(str2, obj3);
                    p4.f5789c = null;
                    p4.e = null;
                    p4.f5791f = null;
                    p4.f5792g = null;
                    p4.f5788b = 1;
                    if (interfaceC3440j.emit(pair2, p4) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        p4 = new P(this, cVar);
        Object obj22 = p4.f5787a;
        Od.a aVar2 = Od.a.alpha;
        i4 = p4.f5788b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
