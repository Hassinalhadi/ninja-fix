package androidx.compose.material3.internal;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Lambda red;
    public final /* synthetic */ Pd.i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Function0 function0, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = (Lambda) function0;
        this.silver = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        h hVar = new h(this.red, this.silver, cVar);
        hVar.purple = obj;
        return hVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Xd.l, Pd.i] */
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
            vf.ab abVar = (vf.ab) this.purple;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C1.t bronze = C0564b.bronze(this.red);
            g gVar = new g(objectRef, abVar, this.silver);
            this.alpha = 1;
            if (bronze.collect(gVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
