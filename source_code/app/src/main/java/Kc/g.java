package Kc;

import Jb.I;
import Xd.l;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements l {
    public final /* synthetic */ SuspensionViewModel alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SuspensionViewModel suspensionViewModel, Nd.c cVar) {
        super(2, cVar);
        this.alpha = suspensionViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        SuspensionViewModel suspensionViewModel = this.alpha;
        suspensionViewModel.alpha.kilo().subscribe(new I(9, new f(suspensionViewModel, 0)), new I(10, new f(suspensionViewModel, 1)));
        return Unit.INSTANCE;
    }
}
