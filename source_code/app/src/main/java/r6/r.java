package r6;

import android.content.Context;
import com.google.android.gms.measurement.internal.C1477x;
import java.util.ArrayList;
import s6.K7;
import s6.N7;
import s6.P7;
import t6.e4;
import t6.g4;
import t6.h4;

/* loaded from: classes2.dex */
public final class r extends com.google.mlkit.common.sdkinternal.e {
    public final /* synthetic */ int alpha;

    public /* synthetic */ r(int i4) {
        this.alpha = i4;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    public final Object create(Object obj) {
        switch (this.alpha) {
            case 0:
                com.google.mlkit.common.sdkinternal.i charlie = com.google.mlkit.common.sdkinternal.i.charlie();
                Context bravo = com.google.mlkit.common.sdkinternal.i.charlie().bravo();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                C1477x c1477x = new C1477x(14);
                C5.a aVar = C5.a.echo;
                E5.s.bravo(bravo);
                E5.s.alpha().charlie(aVar);
                C5.a.delta.contains(new B5.c("json"));
                arrayList.add(c1477x);
                return new q(charlie.bravo(), (com.google.mlkit.common.sdkinternal.m) charlie.alpha(com.google.mlkit.common.sdkinternal.m.class));
            case 1:
                K7 k72 = (K7) obj;
                com.google.mlkit.common.sdkinternal.i charlie2 = com.google.mlkit.common.sdkinternal.i.charlie();
                return new P7(charlie2.bravo(), (com.google.mlkit.common.sdkinternal.m) charlie2.alpha(com.google.mlkit.common.sdkinternal.m.class), new N7(com.google.mlkit.common.sdkinternal.i.charlie().bravo(), k72), k72.alpha);
            default:
                com.google.mlkit.common.sdkinternal.i charlie3 = com.google.mlkit.common.sdkinternal.i.charlie();
                return new h4(charlie3.bravo(), (com.google.mlkit.common.sdkinternal.m) charlie3.alpha(com.google.mlkit.common.sdkinternal.m.class), new g4(com.google.mlkit.common.sdkinternal.i.charlie().bravo(), (e4) obj));
        }
    }
}
