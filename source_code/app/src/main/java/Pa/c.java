package Pa;

import Q0.r;
import androidx.compose.runtime.ax;
import i.C1874w;
import kotlin.jvm.functions.Function0;
import l0.InterfaceC2044a;
import s6.J4;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2044a {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ C1874w purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ ax silver;
    public final /* synthetic */ float teal;
    public final /* synthetic */ Function0 white;

    public c(boolean z2, C1874w c1874w, float f5, ax axVar, float f10, Function0 function0) {
        this.alpha = z2;
        this.purple = c1874w;
        this.red = f5;
        this.silver = axVar;
        this.teal = f10;
        this.white = function0;
    }

    @Override // l0.InterfaceC2044a
    public final long black(int i4, long j5) {
        C1874w c1874w = this.purple;
        if (!this.alpha) {
            try {
                if (c1874w.echo.alpha() == 0) {
                    if (c1874w.echo.bravo() == 0) {
                        int i5 = (int) (j5 & 4294967295L);
                        if (Float.intBitsToFloat(i5) > 0.0f) {
                            float intBitsToFloat = Float.intBitsToFloat(i5);
                            ax axVar = this.silver;
                            axVar.setValue(Float.valueOf(J4.charlie(a.bravo(axVar) + intBitsToFloat, 0.0f, this.red)));
                            return (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat));
                        }
                        return 0L;
                    }
                    return 0L;
                }
            } catch (IllegalStateException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    @Override // l0.InterfaceC2044a
    public final long maroon(int i4, long j5, long j6) {
        ax axVar = this.silver;
        float f5 = 0.0f;
        if (a.bravo(axVar) > 0.0f && !this.alpha) {
            int i5 = (int) (j6 & 4294967295L);
            if (Float.intBitsToFloat(i5) < 0.0f) {
                float intBitsToFloat = Float.intBitsToFloat(i5) + ((Number) axVar.getValue()).floatValue();
                if (intBitsToFloat >= 0.0f) {
                    f5 = intBitsToFloat;
                }
                axVar.setValue(Float.valueOf(f5));
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // l0.InterfaceC2044a
    public final Object navy(long j5, Nd.c cVar) {
        return new r(0L);
    }

    @Override // l0.InterfaceC2044a
    public final Object oscar(long j5, long j6, Nd.c cVar) {
        boolean z2 = this.alpha;
        ax axVar = this.silver;
        if (!z2 && a.bravo(axVar) >= this.teal) {
            this.white.invoke();
        } else {
            axVar.setValue(Float.valueOf(0.0f));
        }
        return new r(0L);
    }
}
