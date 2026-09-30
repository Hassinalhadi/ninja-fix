package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class P extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ S purple;
    public final /* synthetic */ Ref.ObjectRef red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s3, Ref.ObjectRef objectRef, Nd.c cVar) {
        super(2, cVar);
        this.purple = s3;
        this.red = objectRef;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new P(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        E9.b bravo = ((C0333u0) this.purple.alpha.purple).bravo();
        File file = (File) this.red.alpha;
        this.alpha = 1;
        Object oscar = ((J2.n) bravo).oscar(file, this);
        if (oscar == aVar) {
            return aVar;
        }
        return oscar;
    }
}
