package Kc;

import Jb.I;
import Xd.l;
import com.app.network.network.models.SuspensionHistoryItem;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements l {
    public final /* synthetic */ SuspensionViewModel alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SuspensionViewModel suspensionViewModel, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = suspensionViewModel;
        this.purple = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        SuspensionViewModel suspensionViewModel = this.alpha;
        Single<DataResponse<SuspensionHistoryItem>> alpha = suspensionViewModel.alpha.alpha(suspensionViewModel.juliet);
        boolean z2 = this.purple;
        alpha.subscribe(new I(11, new h(suspensionViewModel, z2, 0)), new I(12, new h(suspensionViewModel, z2, 1)));
        return Unit.INSTANCE;
    }
}
