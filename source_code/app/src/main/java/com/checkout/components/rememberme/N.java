package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import com.checkout.components.rememberme.utils.JWTDecoder;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class N implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5782b;

    public N(InterfaceC3440j interfaceC3440j, MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        this.f5781a = interfaceC3440j;
        this.f5782b = mapJWTTokenToWalletUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        M m4;
        int i4;
        Object m206constructorimpl;
        JWTDecoder jWTDecoder;
        if (cVar instanceof M) {
            m4 = (M) cVar;
            int i5 = m4.f5771b;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                m4.f5771b = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = m4.f5770a;
                Od.a aVar = Od.a.alpha;
                i4 = m4.f5771b;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    InterfaceC3440j interfaceC3440j = this.f5781a;
                    String str = (String) obj;
                    MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase = this.f5782b;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        jWTDecoder = mapJWTTokenToWalletUseCase.f6333a;
                        m206constructorimpl = Result.m206constructorimpl(jWTDecoder.getSub(str));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    Pair pair = new Pair(str, new Result(m206constructorimpl));
                    m4.f5772c = null;
                    m4.e = null;
                    m4.f5774f = null;
                    m4.f5775g = null;
                    m4.f5771b = 1;
                    if (interfaceC3440j.emit(pair, m4) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        m4 = new M(this, cVar);
        Object obj22 = m4.f5770a;
        Od.a aVar2 = Od.a.alpha;
        i4 = m4.f5771b;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
