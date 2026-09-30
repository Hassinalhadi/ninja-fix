package kotlin.reflect.jvm.internal.impl.types;

import F.S0;
import gf.InterfaceC1787b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ ArrayList alpha;
    public final /* synthetic */ ao purple;
    public final /* synthetic */ InterfaceC1787b red;
    public final /* synthetic */ p000if.d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList, ao aoVar, InterfaceC1787b interfaceC1787b, p000if.d dVar) {
        super(1);
        this.alpha = arrayList;
        this.purple = aoVar;
        this.red = interfaceC1787b;
        this.silver = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am runForkingPoint = (am) obj;
        Intrinsics.echo(runForkingPoint, "$this$runForkingPoint");
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            S0 s02 = new S0(this.purple, this.red, (p000if.d) it.next(), this.silver, 3);
            if (!runForkingPoint.alpha) {
                runForkingPoint.alpha = ((Boolean) s02.invoke()).booleanValue();
            }
        }
        return Unit.INSTANCE;
    }
}
