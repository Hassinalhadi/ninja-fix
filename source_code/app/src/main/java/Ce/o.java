package Ce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pf.AbstractC2360j;

/* loaded from: classes2.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                List bravo = this.purple.oscar.bravo();
                ArrayList arrayList = new ArrayList();
                for (Object obj : bravo) {
                    if (((ve.w) obj).alpha.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
                if (quebec < 16) {
                    quebec = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((ve.w) next).charlie(), next);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.purple.oscar.alpha.getDeclaredClasses();
                Intrinsics.delta(declaredClasses, "klass.declaredClasses");
                return CollectionsKt.D(AbstractC2360j.quebec(AbstractC2360j.papa(AbstractC2360j.hotel(ArraysKt.tango(declaredClasses), ve.n.alpha), ve.o.alpha)));
            default:
                p pVar = this.purple;
                return kotlin.collections.ab.mike(pVar.bravo(), pVar.echo());
        }
    }
}
