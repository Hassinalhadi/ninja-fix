package nc;

import Pd.i;
import Xd.l;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.redeem.presentation.RedeemViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import vf.ab;
import yf.N;

/* renamed from: nc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2171d extends i implements l {
    public int alpha;
    public final /* synthetic */ RedeemFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2171d(RedeemFragment redeemFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = redeemFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2171d(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C2171d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        RedeemFragment redeemFragment = this.purple;
        RedeemViewModel quebec = redeemFragment.quebec();
        C2169b c2169b = new C2169b(redeemFragment, 1);
        this.alpha = 1;
        ((N) quebec.charlie.alpha).collect(c2169b, this);
        return aVar;
    }
}
