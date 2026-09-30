package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1524c0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1530f0 purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524c0(C1530f0 c1530f0, long j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1530f0;
        this.red = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1524c0(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1524c0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C1548o0 c1548o0 = this.purple.f11995j;
            this.alpha = 1;
            if (c1548o0.bravo(this.red, true, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
