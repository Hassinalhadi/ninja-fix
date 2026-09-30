package tc;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: tc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3100e extends Pd.i implements Xd.l {
    public final /* synthetic */ C3105j alpha;
    public final /* synthetic */ C3109n purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3100e(C3105j c3105j, C3109n c3109n, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c3105j;
        this.purple = c3109n;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3100e(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3100e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        String str = this.purple.alpha;
        C3105j c3105j = this.alpha;
        c3105j.zulu(str);
        c3105j.lima(false, false);
        return Unit.INSTANCE;
    }
}
