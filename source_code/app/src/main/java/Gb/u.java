package Gb;

import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class u extends Pd.i implements Xd.l {
    public final /* synthetic */ EnvelopsViewModelV2 alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Nd.c cVar, EnvelopsViewModelV2 envelopsViewModelV2, String str) {
        super(2, cVar);
        this.alpha = envelopsViewModelV2;
        this.purple = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new u(cVar, this.alpha, this.purple);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.functions.Action, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        EnvelopsViewModelV2 envelopsViewModelV2 = this.alpha;
        envelopsViewModelV2.alpha.charlie(this.purple).subscribe(new Object(), new Fc.j(1, new D0.z(24)));
        return Unit.INSTANCE;
    }
}
