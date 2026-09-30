package af;

import com.google.android.gms.internal.measurement.C1290a1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.q;
import vf.ab;
import yf.C3434d;
import yf.C3446p;

/* renamed from: af.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0439j extends Pd.i implements Xd.l {
    public q alpha;
    public int purple;
    public final /* synthetic */ C0440k red;
    public final /* synthetic */ Xd.l silver;
    public final /* synthetic */ C1290a1 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439j(C0440k c0440k, Xd.l lVar, C1290a1 c1290a1, Nd.c cVar) {
        super(2, cVar);
        this.red = c0440k;
        this.silver = lVar;
        this.teal = c1290a1;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0439j(this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0439j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.q, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        boolean z2 = true;
        if (i4 != 0) {
            if (i4 == 1) {
                qVar = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (this.red.isEnabled()) {
                ?? obj2 = new Object();
                C3446p c3446p = new C3446p(new C3434d((xf.e) this.teal.bravo, z2), new C0438i((q) obj2, (Nd.c) null));
                this.alpha = obj2;
                this.purple = 1;
                if (this.silver.invoke(c3446p, this) == aVar) {
                    return aVar;
                }
                qVar = obj2;
            }
            return Unit.INSTANCE;
        }
        if (!qVar.alpha) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return Unit.INSTANCE;
    }
}
