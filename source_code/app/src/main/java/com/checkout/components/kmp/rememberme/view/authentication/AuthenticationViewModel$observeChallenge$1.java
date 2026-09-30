package com.checkout.components.kmp.rememberme.view.authentication;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewState;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.N;
import yf.at;

@e(c = "com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewModel$observeChallenge$1", f = "AuthenticationViewModel.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "Lcom/checkout/components/kmp/rememberme/data/model/Challenge;"}, k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticationViewModel$observeChallenge$1 extends i implements l {
    int label;
    final /* synthetic */ AuthenticationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$observeChallenge$1(AuthenticationViewModel authenticationViewModel, c<? super AuthenticationViewModel$observeChallenge$1> cVar) {
        super(2, cVar);
        this.this$0 = authenticationViewModel;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new AuthenticationViewModel$observeChallenge$1(this.this$0, cVar);
    }

    @Override // Xd.l
    public final Object invoke(CreateChallengeResponse createChallengeResponse, c<? super Unit> cVar) {
        return ((AuthenticationViewModel$observeChallenge$1) create(createChallengeResponse, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        N n5;
        Object value;
        a aVar = a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            at atVar = this.this$0.get_state();
            do {
                n5 = (N) atVar;
                value = n5.getValue();
            } while (!n5.hotel(value, AuthenticationViewState.copy$default((AuthenticationViewState) value, null, AuthenticationViewType.OTP, 1, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
