package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1537j extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1539k purple;
    public final /* synthetic */ am red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537j(C1539k c1539k, am amVar, Nd.c cVar) {
        super(2, cVar);
        b.M m4 = b.M.alpha;
        this.purple = c1539k;
        this.red = amVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        b.M m4 = b.M.alpha;
        return new C1537j(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1537j) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C1539k c1539k = this.purple;
            b.Q q4 = c1539k.charlie;
            androidx.compose.material3.internal.r rVar = c1539k.bravo;
            this.alpha = 1;
            b.M m4 = b.M.purple;
            am amVar = this.red;
            q4.getClass();
            if (vf.ad.mike(new b.P(m4, q4, amVar, rVar, null), this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
