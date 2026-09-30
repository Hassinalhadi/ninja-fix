package lf;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2345u;
import se.aq;

/* loaded from: classes2.dex */
public final class s extends Lambda implements Function1 {
    public static final s alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2345u $receiver = (InterfaceC2345u) obj;
        Intrinsics.echo($receiver, "$this$$receiver");
        List valueParameters = $receiver.peach();
        Intrinsics.delta(valueParameters, "valueParameters");
        aq aqVar = (aq) CollectionsKt.olive(valueParameters);
        boolean z2 = false;
        if (aqVar != null && !Ue.e.alpha(aqVar) && aqVar.f13747c == null) {
            z2 = true;
        }
        List list = v.bravo;
        if (!z2) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
