package com.checkout.components.card;

import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel$pay$2$WhenMappings;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class Q extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayButtonViewModel f3961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardTokenRequest f3962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(PayButtonViewModel payButtonViewModel, CardTokenRequest cardTokenRequest, Nd.c cVar) {
        super(2, cVar);
        this.f3961b = payButtonViewModel;
        this.f3962c = cardTokenRequest;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Q(this.f3961b, this.f3962c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new Q(this.f3961b, this.f3962c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        PaymentButtonAction paymentButtonAction;
        int i4;
        TokenRepository tokenRepository;
        TokenRepository tokenRepository2;
        Od.a aVar = Od.a.alpha;
        int i5 = this.f3960a;
        if (i5 != 0) {
            if (i5 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            function1 = this.f3961b.f4523f;
            if (function1 != null) {
                this.f3960a = 1;
                obj = function1.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            paymentButtonAction = this.f3961b.f4522d;
            i4 = PayButtonViewModel$pay$2$WhenMappings.$EnumSwitchMapping$0[paymentButtonAction.ordinal()];
            if (i4 != 1) {
                tokenRepository = this.f3961b.f4520b;
                tokenRepository.sendCardTokenRequest(this.f3962c);
            } else if (i4 == 2) {
                tokenRepository2 = this.f3961b.f4520b;
                tokenRepository2.sendCardTokenOnly(this.f3962c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.f3961b.a(true);
            return Unit.INSTANCE;
        }
        paymentButtonAction = this.f3961b.f4522d;
        i4 = PayButtonViewModel$pay$2$WhenMappings.$EnumSwitchMapping$0[paymentButtonAction.ordinal()];
        if (i4 != 1) {
        }
        return Unit.INSTANCE;
    }
}
