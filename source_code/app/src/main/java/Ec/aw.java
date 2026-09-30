package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.p0;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import i.C1868q;
import i.C1874w;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes2.dex */
public final /* synthetic */ class aw implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ aw(int i4, Object obj, int i5) {
        this.alpha = i5;
        this.purple = i4;
        this.red = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        switch (this.alpha) {
            case 0:
                ((p0) this.red).kilo(this.purple);
                return Unit.INSTANCE;
            case 1:
                Y1.r rVar = ((HomeActivityV2) this.red).f12282U;
                if (rVar != null) {
                    rVar.charlie(this.purple, null, null);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("navController");
                throw null;
            case 2:
                return C0564b.whiskey(J4.delta(this.purple, 0, CollectionsKt.ivory((List) this.red)));
            case 3:
                C1868q c1868q = (C1868q) CollectionsKt.olive(((C1874w) this.red).golf().kilo);
                int i5 = 0;
                if (c1868q != null) {
                    i4 = c1868q.alpha;
                } else {
                    i4 = 0;
                }
                int i10 = (this.purple - i4) - 1;
                if (i10 >= 0) {
                    i5 = i10;
                }
                return Integer.valueOf(i5);
            default:
                return Integer.valueOf(((D0.ak) ((I.al) this.red).echo).bravo.delta(this.purple));
        }
    }

    public /* synthetic */ aw(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }
}
