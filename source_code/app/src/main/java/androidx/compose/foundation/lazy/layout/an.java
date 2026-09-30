package androidx.compose.foundation.lazy.layout;

import g.AbstractC1719b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class an implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aq purple;

    public /* synthetic */ an(aq aqVar, int i4) {
        this.alpha = i4;
        this.purple = aqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                w wVar = (w) this.purple.alpha.invoke();
                int itemCount = wVar.getItemCount();
                int i4 = 0;
                while (true) {
                    if (i4 < itemCount) {
                        if (!Intrinsics.areEqual(wVar.alpha(i4), obj)) {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                    }
                }
                return Integer.valueOf(i4);
            default:
                int intValue = ((Integer) obj).intValue();
                aq aqVar = this.purple;
                w wVar2 = (w) aqVar.alpha.invoke();
                if (intValue < 0 || intValue >= wVar2.getItemCount()) {
                    StringBuilder sierra = Q0.c.sierra(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sierra.append(wVar2.getItemCount());
                    sierra.append(')');
                    AbstractC1719b.alpha(sierra.toString());
                }
                vf.ad.zulu(aqVar.getCoroutineScope(), null, null, new ap(aqVar, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
