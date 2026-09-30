package F;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: F.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0094c1 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0103e2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094c1(C0103e2 c0103e2, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0103e2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0094c1(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0094c1) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            this.alpha = 1;
            EnumC0107f2 enumC0107f2 = EnumC0107f2.purple;
            androidx.compose.material3.internal.t tVar = this.purple.bravo;
            Object charlie = androidx.compose.material3.internal.i.charlie(tVar, enumC0107f2, ((androidx.compose.runtime.n0) ((androidx.compose.runtime.aw) tVar.mike)).juliet(), this);
            if (charlie != obj2) {
                charlie = Unit.INSTANCE;
            }
            if (charlie == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
