package oe;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2349y;
import s6.K4;
import se.C2873w;

/* renamed from: oe.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2235f extends Lambda implements Function1 {
    public static final C2235f alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2349y module = (InterfaceC2349y) obj;
        Intrinsics.echo(module, "module");
        List list = (List) K4.alpha(((C2873w) module.amber(C2236g.foxtrot)).teal, C2873w.f13797a[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof df.c) {
                arrayList.add(obj2);
            }
        }
        return (df.c) CollectionsKt.gold(arrayList);
    }
}
