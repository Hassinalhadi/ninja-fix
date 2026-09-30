package b;

import androidx.compose.runtime.r0;
import androidx.compose.runtime.t0;
import fe.C1712d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Function1 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ float purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ b0(float f5, C1712d c1712d) {
        this.purple = f5;
        this.red = c1712d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                A0.ad adVar = (A0.ad) obj;
                Float valueOf = Float.valueOf(this.purple);
                C1712d c1712d = (C1712d) this.red;
                float f5 = c1712d.alpha;
                if (0.0f <= f5) {
                    if (C1712d.alpha(valueOf, Float.valueOf(0.0f)) && !C1712d.alpha(Float.valueOf(0.0f), valueOf)) {
                        valueOf = Float.valueOf(0.0f);
                    } else if (C1712d.alpha(Float.valueOf(f5), valueOf) && !C1712d.alpha(valueOf, Float.valueOf(f5))) {
                        valueOf = Float.valueOf(f5);
                    }
                    A0.aa.delta(adVar, new A0.g(valueOf.floatValue(), c1712d));
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c1712d + '.');
            default:
                long longValue = ((Long) obj).longValue();
                bz.a0 a0Var = (bz.a0) this.red;
                if (!a0Var.hotel()) {
                    r0 r0Var = a0Var.golf;
                    if (r0Var.juliet() == Long.MIN_VALUE) {
                        r0Var.kilo(longValue);
                        ((t0) ((androidx.compose.runtime.ax) a0Var.alpha.alpha)).setValue(Boolean.TRUE);
                    }
                    long juliet = longValue - r0Var.juliet();
                    float f10 = this.purple;
                    if (f10 != 0.0f) {
                        juliet = Zd.a.echo(juliet / f10);
                    }
                    a0Var.oscar(juliet);
                    if (f10 == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a0Var.india(juliet, z2);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b0(bz.a0 a0Var, float f5) {
        this.red = a0Var;
        this.purple = f5;
    }
}
