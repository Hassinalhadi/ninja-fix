package j;

import d.O;
import i.C1870s;
import kotlin.ResultKt;
import kotlin.Unit;
import s0.al;

/* loaded from: classes3.dex */
public final class s extends Pd.i implements Xd.l {
    public final /* synthetic */ t alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, int i4, Nd.c cVar) {
        super(2, cVar);
        this.alpha = tVar;
        this.purple = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new s(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((O) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        t tVar = this.alpha;
        C1870s c1870s = tVar.delta;
        int alpha = c1870s.alpha();
        int i4 = this.purple;
        if (alpha != i4 || c1870s.bravo() != 0) {
            androidx.compose.foundation.lazy.layout.s sVar = tVar.mike;
            sVar.delta();
            sVar.bravo = null;
        }
        c1870s.charlie(i4, 0);
        c1870s.echo = null;
        al alVar = tVar.juliet;
        if (alVar != null) {
            alVar.kilo();
        }
        return Unit.INSTANCE;
    }
}
