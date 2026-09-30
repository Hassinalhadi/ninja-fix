package hd;

import dd.C1614e;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC2304b;
import s6.Z4;
import t6.AbstractC2981d2;
import t6.AbstractC2991f2;

/* loaded from: classes2.dex */
public final class ab extends Pd.i implements Xd.o {
    public int alpha;
    public /* synthetic */ AbstractC2304b purple;
    public /* synthetic */ io.ktor.utils.io.t red;
    public /* synthetic */ Ed.a silver;
    public final /* synthetic */ Charset teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(Charset charset, Nd.c cVar) {
        super(5, cVar);
        this.teal = charset;
    }

    @Override // Xd.o
    public final Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ab abVar = new ab(this.teal, (Nd.c) obj5);
        abVar.purple = (AbstractC2304b) obj2;
        abVar.red = (io.ktor.utils.io.t) obj3;
        abVar.silver = (Ed.a) obj4;
        return abVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2304b abstractC2304b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        Charset charset = null;
        if (i4 != 0) {
            if (i4 == 1) {
                abstractC2304b = this.purple;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            AbstractC2304b abstractC2304b2 = this.purple;
            io.ktor.utils.io.t tVar = this.red;
            if (!Intrinsics.areEqual(this.silver.alpha, kotlin.jvm.internal.u.alpha.bravo(String.class))) {
                return null;
            }
            this.purple = abstractC2304b2;
            this.red = null;
            this.alpha = 1;
            Object mike = io.ktor.utils.io.ak.mike(tVar, this);
            if (mike == aVar) {
                return aVar;
            }
            abstractC2304b = abstractC2304b2;
            obj = mike;
        }
        Gf.i iVar = (Gf.i) obj;
        C1614e bravo = abstractC2304b.bravo();
        rg.b bVar = ad.alpha;
        sd.e charlie = AbstractC2991f2.charlie(bravo.echo());
        if (charlie != null) {
            charset = AbstractC2981d2.alpha(charlie);
        }
        if (charset == null) {
            charset = this.teal;
        }
        ad.alpha.hotel("Reading response body for " + bravo.delta().getUrl() + " as String with charset " + charset);
        return Z4.bravo(iVar, charset, 2);
    }
}
