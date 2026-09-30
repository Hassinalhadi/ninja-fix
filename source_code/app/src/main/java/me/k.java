package me;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import oe.C2237h;
import pe.InterfaceC2325ah;
import se.C2862l;
import se.C2873w;
import se.z;

/* loaded from: classes2.dex */
public final class k extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ z purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(z zVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                return ((C2873w) this.purple.amber(n.hotel)).yellow;
            case 1:
                return new C2237h(this.purple);
            default:
                z zVar = this.purple;
                com.google.android.play.core.integrity.c cVar = zVar.yellow;
                if (cVar != null) {
                    zVar.Y();
                    List list = (List) cVar.purple;
                    list.contains(zVar);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((z) it.next()).getClass();
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2325ah interfaceC2325ah = ((z) it2.next()).f13798a;
                        Intrinsics.checkNotNull(interfaceC2325ah);
                        arrayList.add(interfaceC2325ah);
                    }
                    return new C2862l(arrayList, "CompositeProvider@ModuleDescriptor for " + zVar.getName());
                }
                StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                String str = zVar.getName().alpha;
                Intrinsics.delta(str, "name.toString()");
                sb2.append(str);
                sb2.append(" were not set before querying module content");
                throw new AssertionError(sb2.toString());
        }
    }
}
