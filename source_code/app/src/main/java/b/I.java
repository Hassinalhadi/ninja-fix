package b;

import androidx.compose.runtime.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ K purple;

    public /* synthetic */ I(K k6, int i4) {
        this.alpha = i4;
        this.purple = k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j5;
        switch (this.alpha) {
            case 0:
                this.purple.d();
                return Unit.INSTANCE;
            case 1:
                return new Z.b(this.purple.f3288b);
            default:
                q0.z zVar = (q0.z) ((t0) this.purple.yellow).getValue();
                if (zVar != null) {
                    j5 = zVar.gray(0L);
                } else {
                    j5 = 9205357640488583168L;
                }
                return new Z.b(j5);
        }
    }
}
