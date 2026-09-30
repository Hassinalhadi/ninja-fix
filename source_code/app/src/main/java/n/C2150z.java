package n;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;
import y.C3344D;

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2150z extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;
    public final /* synthetic */ I0.ab silver;
    public final /* synthetic */ C3344D teal;
    public final /* synthetic */ I0.l white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2150z(ax axVar, androidx.compose.runtime.ax axVar2, I0.ab abVar, C3344D c3344d, I0.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = axVar;
        this.red = axVar2;
        this.silver = abVar;
        this.teal = c3344d;
        this.white = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2150z(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2150z) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ax axVar = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                C1.t bronze = C0564b.bronze(new Cb.u(this.red, 29));
                b.aj ajVar = new b.aj(axVar, this.silver, this.teal, this.white, 1);
                this.alpha = 1;
                if (bronze.collect(ajVar, this) == aVar) {
                    return aVar;
                }
            }
            at.papa(axVar);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            at.papa(axVar);
            throw th;
        }
    }
}
