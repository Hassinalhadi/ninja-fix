package Wc;

import Jb.I;
import androidx.lifecycle.az;
import com.app.network.network.models.WithdrawTransaction;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class w extends Pd.i implements Xd.l {
    public final /* synthetic */ WithDrawHistoryViewModel alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(WithDrawHistoryViewModel withDrawHistoryViewModel, int i4, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = withDrawHistoryViewModel;
        this.purple = i4;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new w(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        WithDrawHistoryViewModel withDrawHistoryViewModel = this.alpha;
        Single<DataResponse<WithdrawTransaction>> ivory = withDrawHistoryViewModel.alpha.ivory(new Integer(this.purple));
        az azVar = this.red;
        ivory.subscribe(new I(27, new Fb.j(azVar, 17)), new I(28, new s(azVar, withDrawHistoryViewModel, 3)));
        return Unit.INSTANCE;
    }
}
