package i;

import d.O;
import kotlin.ResultKt;
import kotlin.Unit;
import s0.al;

/* renamed from: i.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1873v extends Pd.i implements Xd.l {
    public final /* synthetic */ C1874w alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1873v(C1874w c1874w, int i4, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c1874w;
        this.purple = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1873v(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1873v) create((O) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C1874w c1874w = this.alpha;
        C1870s c1870s = c1874w.echo;
        int alpha = c1870s.alpha();
        int i4 = this.purple;
        if (alpha != i4 || c1870s.bravo() != 0) {
            androidx.compose.foundation.lazy.layout.s sVar = c1874w.november;
            sVar.delta();
            sVar.bravo = null;
        }
        c1870s.charlie(i4, 0);
        c1870s.echo = null;
        al alVar = c1874w.kilo;
        if (alVar != null) {
            alVar.kilo();
        }
        return Unit.INSTANCE;
    }
}
