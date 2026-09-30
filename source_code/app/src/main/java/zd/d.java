package zd;

import io.ktor.utils.io.ak;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ io.ktor.utils.io.m purple;
    public final /* synthetic */ byte[] red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.ktor.utils.io.m mVar, byte[] bArr, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = mVar;
        this.red = bArr;
        this.silver = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            if (ak.sierra(this.purple, this.red, this.silver, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
