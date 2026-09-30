package Ue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import of.InterfaceC2247b;
import pe.InterfaceC2328d;
import se.aq;

/* loaded from: classes2.dex */
public final class a implements InterfaceC2247b {
    public static final a purple = new a(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // of.InterfaceC2247b
    public final Iterable golf(Object obj) {
        int collectionSizeOrDefault;
        Collection collection;
        switch (this.alpha) {
            case 0:
                int i4 = e.alpha;
                Collection mike = ((aq) obj).mike();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mike, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = ((ArrayList) mike).iterator();
                while (it.hasNext()) {
                    arrayList.add(((aq) it.next()).alpha());
                }
                return arrayList;
            default:
                InterfaceC2328d interfaceC2328d = (InterfaceC2328d) obj;
                if (interfaceC2328d != null) {
                    collection = interfaceC2328d.mike();
                } else {
                    collection = null;
                }
                if (collection == null) {
                    return CollectionsKt.emptyList();
                }
                return collection;
        }
    }
}
