package Od;

import Pd.g;
import Xd.l;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

/* loaded from: classes2.dex */
public final class c extends g {
    public int alpha;
    public final /* synthetic */ l purple;
    public final /* synthetic */ Nd.c red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Nd.c cVar, Nd.c cVar2, l lVar) {
        super(cVar);
        this.purple = lVar;
        this.red = cVar2;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                this.alpha = 2;
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.alpha = 1;
        ResultKt.alpha(obj);
        l lVar = this.purple;
        Intrinsics.charlie(lVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        x.echo(2, lVar);
        return lVar.invoke(this.red, this);
    }
}
