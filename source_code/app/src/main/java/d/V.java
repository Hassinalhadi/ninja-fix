package d;

import bz.AbstractC0779d;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class V extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1548o0 red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ kotlin.jvm.internal.r teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1548o0 c1548o0, long j5, kotlin.jvm.internal.r rVar, Nd.c cVar) {
        super(2, cVar);
        this.red = c1548o0;
        this.silver = j5;
        this.teal = rVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        V v4 = new V(this.red, this.silver, this.teal, cVar);
        v4.purple = obj;
        return v4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((C1542l0) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C1542l0 c1542l0 = (C1542l0) this.purple;
            C1548o0 c1548o0 = this.red;
            float golf = c1548o0.golf(this.silver);
            Ac.n nVar = new Ac.n(this.teal, c1548o0, c1542l0, 11);
            this.alpha = 1;
            if (bz.P.alpha(0.0f, golf, 0.0f, AbstractC0779d.juliet(0.0f, null, 7), nVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
