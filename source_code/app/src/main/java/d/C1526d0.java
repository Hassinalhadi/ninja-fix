package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1526d0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1530f0 purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ float silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526d0(C1530f0 c1530f0, float f5, float f10, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1530f0;
        this.red = f5;
        this.silver = f10;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1526d0(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1526d0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            long floatToRawIntBits = (Float.floatToRawIntBits(this.red) << 32) | (Float.floatToRawIntBits(this.silver) & 4294967295L);
            this.alpha = 1;
            if (androidx.compose.foundation.gestures.a.alpha(c1548o0, floatToRawIntBits, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
