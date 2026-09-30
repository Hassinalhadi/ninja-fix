package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class K0 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ M0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K0(M0 m02, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = m02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                M0 m02 = this.purple;
                if (m02.purple.bravo) {
                    m02.alpha.invoke();
                }
                return Unit.INSTANCE;
            default:
                M0 m03 = this.purple;
                m03.show();
                return new C0130l1(0, m03);
        }
    }
}
