package F;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class Y0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0103e2 purple;
    public final /* synthetic */ float red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C0103e2 c0103e2, float f5, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0103e2;
        this.red = f5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Y0(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object charlie;
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
            androidx.compose.material3.internal.t tVar = this.purple.bravo;
            Object value = ((androidx.compose.runtime.t0) ((androidx.compose.runtime.ax) tVar.golf)).getValue();
            float golf = tVar.golf();
            float f5 = this.red;
            Object charlie2 = tVar.charlie(golf, f5, value);
            if (((Boolean) ((Function1) tVar.delta).invoke(charlie2)).booleanValue()) {
                charlie = androidx.compose.material3.internal.i.charlie(tVar, charlie2, f5, this);
                if (charlie != obj2) {
                    charlie = Unit.INSTANCE;
                }
            } else {
                charlie = androidx.compose.material3.internal.i.charlie(tVar, value, f5, this);
                if (charlie != obj2) {
                    charlie = Unit.INSTANCE;
                }
            }
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
