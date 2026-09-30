package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1547o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1551q purple;
    public final /* synthetic */ b.M red;
    public final /* synthetic */ Xd.l silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1547o(C1551q c1551q, b.M m4, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1551q;
        this.red = m4;
        this.silver = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1547o(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1547o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C1551q c1551q = this.purple;
            b.Q q4 = c1551q.charlie;
            C1549p c1549p = c1551q.bravo;
            C1545n c1545n = new C1545n(c1551q, this.silver, null);
            this.alpha = 1;
            q4.getClass();
            if (vf.ad.mike(new b.P(this.red, q4, c1545n, c1549p, null), this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
