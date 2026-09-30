package a2;

import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import bz.F;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: a2.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0400y extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ F purple;
    public final /* synthetic */ ax red;
    public final /* synthetic */ aw silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400y(F f5, ax axVar, aw awVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = f5;
        this.red = axVar;
        this.silver = awVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0400y(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0400y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Y1.l lVar = (Y1.l) ((List) this.red.getValue()).get(((List) r4.getValue()).size() - 2);
            float juliet = ((n0) this.silver).juliet();
            this.alpha = 1;
            if (this.purple.f0(juliet, lVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
