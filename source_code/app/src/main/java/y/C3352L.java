package y;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import b.Z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: y.L, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3352L implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Q0.d purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;

    public /* synthetic */ C3352L(Q0.d dVar, androidx.compose.runtime.ax axVar, int i4) {
        this.alpha = i4;
        this.purple = dVar;
        this.red = axVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Z z2;
        switch (this.alpha) {
            case 0:
                T.p pVar = T.p.alpha;
                com.clevertap.android.sdk.variables.b bVar = new com.clevertap.android.sdk.variables.b((Function0) obj, 3);
                C3352L c3352l = new C3352L(this.purple, this.red, 1);
                if (b.L.alpha()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        z2 = Z.bravo;
                    } else {
                        z2 = Z.charlie;
                    }
                    if (b.L.alpha()) {
                        return new MagnifierElement(bVar, c3352l, z2);
                    }
                    return pVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                float bravo = Q0.i.bravo(((Q0.i) obj).alpha);
                Q0.d dVar = this.purple;
                this.red.setValue(new Q0.m((dVar.ochre(bravo) << 32) | (dVar.ochre(Q0.i.alpha(r7.alpha)) & 4294967295L)));
                return Unit.INSTANCE;
        }
    }
}
