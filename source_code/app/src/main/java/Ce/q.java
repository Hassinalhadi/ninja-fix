package Ce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s6.AbstractC2625c5;
import s6.K4;
import ue.C3158b;

/* loaded from: classes2.dex */
public final class q extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair;
        String str;
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                r rVar = this.purple;
                Be.a aVar = (Be.a) rVar.f922a.purple;
                rVar.teal.bravo();
                aVar.lima.getClass();
                List<String> emptyList = CollectionsKt.emptyList();
                ArrayList arrayList = new ArrayList();
                for (String str2 : emptyList) {
                    Ne.b juliet = Ne.b.juliet(new Ne.c(Ve.b.delta(str2).alpha.replace('/', '.')));
                    Be.a aVar2 = (Be.a) rVar.f922a.purple;
                    C3158b bravo = AbstractC2625c5.bravo(aVar2.charlie, juliet, rVar.f923b);
                    if (bravo != null) {
                        pair = new Pair(str2, bravo);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return kotlin.collections.y.yankee(arrayList);
            case 1:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) K4.alpha(this.purple.f924c, r.f921g[0])).entrySet()) {
                    String str3 = (String) entry.getKey();
                    C3158b c3158b = (C3158b) entry.getValue();
                    Ve.b delta = Ve.b.delta(str3);
                    He.b bVar = c3158b.bravo;
                    He.a aVar3 = (He.a) bVar.delta;
                    int ordinal = aVar3.ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 5) {
                            if (aVar3 == He.a.MULTIFILE_CLASS_PART) {
                                str = bVar.bravo;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                hashMap.put(delta, Ve.b.delta(str));
                            }
                        }
                    } else {
                        hashMap.put(delta, delta);
                    }
                }
                return hashMap;
            default:
                this.purple.yellow.getClass();
                List emptyList2 = CollectionsKt.emptyList();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = emptyList2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ve.aa) it.next()).alpha);
                }
                return arrayList2;
        }
    }
}
