package F;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class U0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0103e2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(C0103e2 c0103e2, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0103e2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new U0(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
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
            C0103e2 c0103e2 = this.purple;
            androidx.compose.material3.internal.ad delta = c0103e2.bravo.delta();
            EnumC0107f2 enumC0107f2 = EnumC0107f2.red;
            if (!delta.alpha.containsKey(enumC0107f2)) {
                enumC0107f2 = EnumC0107f2.purple;
            }
            Object alpha = C0103e2.alpha(c0103e2, enumC0107f2, this);
            if (alpha != obj2) {
                alpha = Unit.INSTANCE;
            }
            if (alpha == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
