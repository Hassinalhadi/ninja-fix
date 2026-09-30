package s0;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.C2396o;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2541a extends Lambda implements Function1 {
    public final /* synthetic */ am alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2541a(am amVar) {
        super(1);
        this.alpha = amVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [q0.C, s0.b] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am amVar;
        InterfaceC2542b interfaceC2542b = (InterfaceC2542b) obj;
        if (interfaceC2542b.coral()) {
            if (interfaceC2542b.charlie().bravo) {
                interfaceC2542b.bronze();
            }
            Iterator it = interfaceC2542b.charlie().india.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                amVar = this.alpha;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                am.alpha(amVar, (C2396o) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2542b.golf());
            }
            L l10 = interfaceC2542b.golf().f13253k;
            Intrinsics.checkNotNull(l10);
            while (!Intrinsics.areEqual(l10, amVar.alpha.golf())) {
                for (C2396o c2396o : amVar.bravo(l10).keySet()) {
                    am.alpha(amVar, c2396o, amVar.charlie(l10, c2396o), l10);
                }
                l10 = l10.f13253k;
                Intrinsics.checkNotNull(l10);
            }
        }
        return Unit.INSTANCE;
    }
}
