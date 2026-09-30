package F;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s6.J4;

/* renamed from: F.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0090b1 extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0090b1(Function0 function0, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke();
                return Boolean.TRUE;
            case 1:
                this.purple.invoke();
                return Boolean.TRUE;
            case 2:
                return Float.valueOf(J4.charlie(((Number) this.purple.invoke()).floatValue(), 0.0f, 1.0f));
            case 3:
                float f5 = 1.0f;
                if (((Number) this.purple.invoke()).floatValue() < 1.0f) {
                    f5 = 0.3f;
                }
                return Float.valueOf(f5);
            default:
                Xe.n nVar = (Xe.n) this.purple.invoke();
                if (nVar instanceof Xe.j) {
                    return ((Xe.j) nVar).hotel();
                }
                return nVar;
        }
    }
}
