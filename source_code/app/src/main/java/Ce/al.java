package Ce;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import se.C2871u;

/* loaded from: classes2.dex */
public abstract class al extends ad {
    @Override // Ce.ad
    public void november(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
    }

    @Override // Ce.ad
    public final C2871u papa() {
        return null;
    }

    @Override // Ce.ad
    public final x sierra(ve.z method, ArrayList arrayList, kotlin.reflect.jvm.internal.impl.types.y yVar, List valueParameters) {
        Intrinsics.echo(method, "method");
        Intrinsics.echo(valueParameters, "valueParameters");
        return new x(yVar, valueParameters, arrayList, CollectionsKt.emptyList());
    }
}
