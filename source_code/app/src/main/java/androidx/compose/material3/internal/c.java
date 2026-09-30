package androidx.compose.material3.internal;

import F.C0092c;
import bz.P;
import bz.f0;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class c extends Pd.i implements Xd.n {
    public int alpha;
    public /* synthetic */ q purple;
    public /* synthetic */ ad red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ t teal;
    public final /* synthetic */ float white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, float f5, Nd.c cVar) {
        super(4, cVar);
        this.teal = tVar;
        this.white = f5;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        c cVar = new c(this.teal, this.white, (Nd.c) obj4);
        cVar.purple = (q) obj;
        cVar.red = (ad) obj2;
        cVar.silver = obj3;
        return cVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        float echo;
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
            q qVar = this.purple;
            float charlie = this.red.charlie(this.silver);
            if (!Float.isNaN(charlie)) {
                ?? obj2 = new Object();
                t tVar = this.teal;
                if (Float.isNaN(tVar.echo())) {
                    echo = 0.0f;
                } else {
                    echo = tVar.echo();
                }
                obj2.alpha = echo;
                C0092c c0092c = new C0092c(7, qVar, (Object) obj2);
                this.purple = null;
                this.red = null;
                this.alpha = 1;
                if (P.alpha(echo, charlie, this.white, (f0) tVar.charlie, c0092c, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
