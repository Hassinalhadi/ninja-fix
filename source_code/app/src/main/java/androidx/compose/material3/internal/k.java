package androidx.compose.material3.internal;

import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class k extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(t tVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.delta();
            case 1:
                t tVar = this.purple;
                return new Pair(tVar.delta(), ((androidx.compose.runtime.ad) tVar.juliet).getValue());
            case 2:
                t tVar2 = this.purple;
                Object value = ((t0) ((ax) tVar2.hotel)).getValue();
                if (value == null) {
                    float echo = tVar2.echo();
                    boolean isNaN = Float.isNaN(echo);
                    ax axVar = (ax) tVar2.golf;
                    if (!isNaN) {
                        Object value2 = ((t0) axVar).getValue();
                        ad delta = tVar2.delta();
                        float charlie = delta.charlie(value2);
                        if (charlie != echo && !Float.isNaN(charlie)) {
                            if (charlie < echo) {
                                Object bravo = delta.bravo(echo, true);
                                if (bravo != null) {
                                    return bravo;
                                }
                            } else {
                                Object bravo2 = delta.bravo(echo, false);
                                if (bravo2 != null) {
                                    return bravo2;
                                }
                            }
                        }
                        return value2;
                    }
                    return ((t0) axVar).getValue();
                }
                return value;
            case 3:
                t tVar3 = this.purple;
                float charlie2 = tVar3.delta().charlie(((t0) ((ax) tVar3.golf)).getValue());
                float charlie3 = tVar3.delta().charlie(((androidx.compose.runtime.ad) tVar3.kilo).getValue()) - charlie2;
                float abs = Math.abs(charlie3);
                float f5 = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float golf = (tVar3.golf() - charlie2) / charlie3;
                    if (golf < 1.0E-6f) {
                        f5 = 0.0f;
                    } else if (golf <= 0.999999f) {
                        f5 = golf;
                    }
                }
                return Float.valueOf(f5);
            default:
                t tVar4 = this.purple;
                Object value3 = ((t0) ((ax) tVar4.hotel)).getValue();
                if (value3 == null) {
                    float echo2 = tVar4.echo();
                    boolean isNaN2 = Float.isNaN(echo2);
                    ax axVar2 = (ax) tVar4.golf;
                    if (!isNaN2) {
                        return tVar4.charlie(echo2, 0.0f, ((t0) axVar2).getValue());
                    }
                    return ((t0) axVar2).getValue();
                }
                return value3;
        }
    }
}
