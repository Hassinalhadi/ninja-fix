package com.checkout.components.kmp.rememberme.view.otp;

import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.model.OTPViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import yf.N;
import yf.at;

@e(c = "com.checkout.components.kmp.rememberme.view.otp.OTPViewModel$countDownTimeLeft$1", f = "OTPViewModel.kt", l = {184}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class OTPViewModel$countDownTimeLeft$1 extends i implements l {
    int I$0;
    int label;
    final /* synthetic */ OTPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPViewModel$countDownTimeLeft$1(OTPViewModel oTPViewModel, Nd.c<? super OTPViewModel$countDownTimeLeft$1> cVar) {
        super(2, cVar);
        this.this$0 = oTPViewModel;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        return new OTPViewModel$countDownTimeLeft$1(this.this$0, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004c -> B:5:0x004d). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i4;
        N n5;
        Object value;
        Od.a aVar = Od.a.alpha;
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = this.I$0;
                ResultKt.alpha(obj);
                i4 = i10 - 1;
                if (-1 < i4) {
                    at atVar = this.this$0.get_state();
                    do {
                        n5 = (N) atVar;
                        value = n5.getValue();
                    } while (!n5.hotel(value, OTPViewState.copy$default((OTPViewState) value, null, false, null, i4, 7, null)));
                    this.I$0 = i4;
                    this.label = 1;
                    if (ad.november(1000L, this) == aVar) {
                        return aVar;
                    }
                    i10 = i4;
                    i4 = i10 - 1;
                    if (-1 < i4) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            i4 = 60;
            if (-1 < i4) {
            }
        }
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, Nd.c<? super Unit> cVar) {
        return ((OTPViewModel$countDownTimeLeft$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
