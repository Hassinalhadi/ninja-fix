package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class J extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ S purple;
    public final /* synthetic */ File red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s3, File file, Nd.c cVar) {
        super(2, cVar);
        this.purple = s3;
        this.red = file;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new J(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        this.alpha = 1;
        Object oscar = ((J2.n) bravo).oscar(this.red, this);
        if (oscar == aVar) {
            return aVar;
        }
        return oscar;
    }
}
