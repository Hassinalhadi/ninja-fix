package u;

import Pd.i;
import androidx.compose.runtime.t0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3129c extends i implements Function1 {
    public int alpha;
    public final /* synthetic */ C3130d purple;
    public final /* synthetic */ C3128b red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3129c(C3130d c3130d, C3128b c3128b, Nd.c cVar) {
        super(1, cVar);
        this.purple = c3130d;
        this.red = c3128b;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C3129c(this.purple, this.red, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3129c) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C3128b c3128b = this.red;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C3130d c3130d = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                ((t0) c3130d.charlie).setValue(c3128b);
                this.alpha = 1;
                Object india = c3128b.bravo.india(this);
                if (india != aVar) {
                    india = Unit.INSTANCE;
                }
                if (india == aVar) {
                    return aVar;
                }
            }
            ((t0) c3130d.charlie).setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ((t0) c3130d.charlie).setValue(null);
            throw th;
        }
    }
}
