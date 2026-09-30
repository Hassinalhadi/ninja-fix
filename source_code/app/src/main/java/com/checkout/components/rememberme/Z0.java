package com.checkout.components.rememberme;

import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.rememberme.savecard.SaveCardViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class Z0 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveCardViewModel f5843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(SaveCardViewModel saveCardViewModel, String str, Nd.c cVar) {
        super(2, cVar);
        this.f5843b = saveCardViewModel;
        this.f5844c = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Z0(this.f5843b, this.f5844c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new Z0(this.f5843b, this.f5844c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r6.execute(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (vf.ad.november(300, r5) == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SuspendUseCase suspendUseCase;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5842a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            this.f5842a = 1;
        }
        suspendUseCase = this.f5843b.f6270a;
        String str = this.f5844c;
        this.f5842a = 2;
    }
}
