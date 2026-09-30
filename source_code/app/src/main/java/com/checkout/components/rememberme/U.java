package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.AbstractC3220y;
import vf.ad;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class U implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3440j f5810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5811b;

    public U(InterfaceC3440j interfaceC3440j, MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase) {
        this.f5810a = interfaceC3440j;
        this.f5811b = mapJWTTokenToWalletUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        if (r2.emit(r11, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        T t5;
        int i4;
        InterfaceC3440j interfaceC3440j;
        int i5;
        Object m206constructorimpl;
        AbstractC3220y abstractC3220y;
        int i10;
        if (cVar instanceof T) {
            t5 = (T) cVar;
            int i11 = t5.f5800b;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                t5.f5800b = i11 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = t5.f5799a;
                Od.a aVar = Od.a.alpha;
                i4 = t5.f5800b;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj2);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = t5.f5809l;
                    interfaceC3440j = t5.f5805h;
                    ResultKt.alpha(obj2);
                } else {
                    ResultKt.alpha(obj2);
                    interfaceC3440j = this.f5810a;
                    Pair pair = (Pair) obj;
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    i5 = 0;
                    if (str2 != null) {
                        abstractC3220y = this.f5811b.f6337f;
                        Z z2 = new Z(this.f5811b, str, str2, null);
                        t5.f5801c = null;
                        t5.e = null;
                        t5.f5803f = null;
                        t5.f5804g = null;
                        t5.f5805h = interfaceC3440j;
                        t5.f5806i = null;
                        t5.f5807j = null;
                        t5.f5808k = null;
                        t5.f5809l = 0;
                        t5.f5800b = 1;
                        obj2 = ad.blue(abstractC3220y, z2, t5);
                        if (obj2 != aVar) {
                            i10 = 0;
                        }
                        return aVar;
                    }
                    Result.Companion companion = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(MapJWTTokenToWalletUseCase.access$getConsumerDecodeError(this.f5811b)));
                    Result result = new Result(m206constructorimpl);
                    t5.f5801c = null;
                    t5.e = null;
                    t5.f5803f = null;
                    t5.f5804g = null;
                    t5.f5805h = null;
                    t5.f5806i = null;
                    t5.f5807j = null;
                    t5.f5808k = null;
                    t5.f5809l = i5;
                    t5.f5800b = 2;
                }
                m206constructorimpl = ((Result) obj2).alpha;
                i5 = i10;
                Result result2 = new Result(m206constructorimpl);
                t5.f5801c = null;
                t5.e = null;
                t5.f5803f = null;
                t5.f5804g = null;
                t5.f5805h = null;
                t5.f5806i = null;
                t5.f5807j = null;
                t5.f5808k = null;
                t5.f5809l = i5;
                t5.f5800b = 2;
            }
        }
        t5 = new T(this, cVar);
        Object obj22 = t5.f5799a;
        Od.a aVar2 = Od.a.alpha;
        i4 = t5.f5800b;
        if (i4 == 0) {
        }
        m206constructorimpl = ((Result) obj22).alpha;
        i5 = i10;
        Result result22 = new Result(m206constructorimpl);
        t5.f5801c = null;
        t5.e = null;
        t5.f5803f = null;
        t5.f5804g = null;
        t5.f5805h = null;
        t5.f5806i = null;
        t5.f5807j = null;
        t5.f5808k = null;
        t5.f5809l = i5;
        t5.f5800b = 2;
    }
}
