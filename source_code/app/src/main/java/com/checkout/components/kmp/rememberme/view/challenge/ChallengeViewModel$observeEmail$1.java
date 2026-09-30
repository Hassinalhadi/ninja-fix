package com.checkout.components.kmp.rememberme.view.challenge;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.model.ChallengeViewState;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.InterfaceC3440j;
import yf.L;
import yf.N;
import yf.at;

@e(c = "com.checkout.components.kmp.rememberme.view.challenge.ChallengeViewModel$observeEmail$1", f = "ChallengeViewModel.kt", l = {66}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class ChallengeViewModel$observeEmail$1 extends i implements l {
    int label;
    final /* synthetic */ ChallengeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeViewModel$observeEmail$1(ChallengeViewModel challengeViewModel, c<? super ChallengeViewModel$observeEmail$1> cVar) {
        super(2, cVar);
        this.this$0 = challengeViewModel;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ChallengeViewModel$observeEmail$1(this.this$0, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        AuthInfoRepository authInfoRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            authInfoRepository = this.this$0.authInfoRepository;
            L email = authInfoRepository.getEmail();
            final ChallengeViewModel challengeViewModel = this.this$0;
            InterfaceC3440j interfaceC3440j = new InterfaceC3440j() { // from class: com.checkout.components.kmp.rememberme.view.challenge.ChallengeViewModel$observeEmail$1.1
                @Override // yf.InterfaceC3440j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((String) obj2, (c<? super Unit>) cVar);
                }

                public final Object emit(String str, c<? super Unit> cVar) {
                    AuthInfoRepository authInfoRepository2;
                    ChallengeViewState mapToViewState;
                    at atVar = ChallengeViewModel.this.get_state();
                    ChallengeViewModel challengeViewModel2 = ChallengeViewModel.this;
                    authInfoRepository2 = challengeViewModel2.authInfoRepository;
                    mapToViewState = challengeViewModel2.mapToViewState(str, (List) authInfoRepository2.getHints().getValue());
                    ((N) atVar).india(mapToViewState);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (email.collect(interfaceC3440j, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((ChallengeViewModel$observeEmail$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
