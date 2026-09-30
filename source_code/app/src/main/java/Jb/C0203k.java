package Jb;

import i.C1874w;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: Jb.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0203k extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0208p purple;
    public final /* synthetic */ C1874w red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203k(C0208p c0208p, C1874w c1874w, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0208p;
        this.red = c1874w;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0203k(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((C0203k) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        do {
            C0208p c0208p = this.purple;
            if (this.red.echo.alpha() == 0 && this.red.echo.bravo() == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            c0208p.f1655i = z2;
            this.alpha = 1;
        } while (vf.ad.november(150L, this) != aVar);
        return aVar;
    }
}
