package U0;

import F.C0130l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ v purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v vVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return new C0130l1(1, this.purple);
            default:
                v vVar = this.purple;
                if (vVar.purple.alpha) {
                    vVar.alpha.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
