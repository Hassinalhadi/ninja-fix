package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class z0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ yf.L purple;
    public final /* synthetic */ K red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yf.L l10, K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = l10;
        this.red = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new z0(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            R1.a aVar2 = new R1.a(this.red, 3);
            this.alpha = 1;
            if (this.purple.collect(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
