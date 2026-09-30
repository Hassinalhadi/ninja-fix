package S2;

import R2.m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import vf.ab;

/* loaded from: classes3.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ i purple;
    public final /* synthetic */ Ref.ObjectRef red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M2.c f2031s;
    public final /* synthetic */ Ref.ObjectRef silver;
    public final /* synthetic */ X2.h teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Ref.ObjectRef yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, X2.h hVar, Object obj, Ref.ObjectRef objectRef3, M2.c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = iVar;
        this.red = objectRef;
        this.silver = objectRef2;
        this.teal = hVar;
        this.white = obj;
        this.yellow = objectRef3;
        this.f2031s = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f2031s, cVar);
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
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        m mVar = (m) this.red.alpha;
        M2.b bVar = (M2.b) this.silver.alpha;
        X2.k kVar = (X2.k) this.yellow.alpha;
        this.alpha = 1;
        Object alpha = i.alpha(this.purple, mVar, bVar, this.teal, this.white, kVar, this.f2031s, this);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
