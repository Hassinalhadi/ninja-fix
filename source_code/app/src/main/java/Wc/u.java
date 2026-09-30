package Wc;

import Jb.I;
import androidx.lifecycle.az;
import com.app.network.network.models.WalletTopUpResponse;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class u extends Pd.i implements Xd.l {
    public final /* synthetic */ WithDrawHistoryViewModel alpha;
    public final /* synthetic */ double purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(WithDrawHistoryViewModel withDrawHistoryViewModel, double d4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = withDrawHistoryViewModel;
        this.purple = d4;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new u(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        WithDrawHistoryViewModel withDrawHistoryViewModel = this.alpha;
        Single<WalletTopUpResponse> cyan = withDrawHistoryViewModel.alpha.cyan(this.purple);
        az azVar = this.red;
        cyan.subscribe(new I(23, new Fb.j(azVar, 15)), new I(24, new s(azVar, withDrawHistoryViewModel, 1)));
        return Unit.INSTANCE;
    }
}
