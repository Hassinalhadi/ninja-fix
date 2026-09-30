package Fe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s {
    public final String alpha;
    public final ArrayList bravo = new ArrayList();
    public Pair charlie = new Pair("V", null);

    public s(J2.c cVar, String str) {
        this.alpha = str;
    }

    public final void alpha(String type, f... fVarArr) {
        int collectionSizeOrDefault;
        v vVar;
        Intrinsics.echo(type, "type");
        ArrayList arrayList = this.bravo;
        if (fVarArr.length == 0) {
            vVar = null;
        } else {
            Lf.i iVar = new Lf.i(2, new kotlin.collections.n(0, fVarArr));
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iVar, 10);
            int quebec = y.quebec(collectionSizeOrDefault);
            if (quebec < 16) {
                quebec = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
            Iterator it = iVar.iterator();
            while (true) {
                kotlin.collections.w wVar = (kotlin.collections.w) it;
                if (!((Iterator) wVar.red).hasNext()) {
                    break;
                }
                kotlin.collections.v vVar2 = (kotlin.collections.v) wVar.next();
                linkedHashMap.put(Integer.valueOf(vVar2.alpha), (f) vVar2.bravo);
            }
            vVar = new v(linkedHashMap);
        }
        arrayList.add(new Pair(type, vVar));
    }

    public final void bravo(Ve.c type) {
        Intrinsics.echo(type, "type");
        String charlie = type.charlie();
        Intrinsics.delta(charlie, "type.desc");
        this.charlie = new Pair(charlie, null);
    }

    public final void charlie(String type, f... fVarArr) {
        int collectionSizeOrDefault;
        Intrinsics.echo(type, "type");
        Lf.i iVar = new Lf.i(2, new kotlin.collections.n(0, fVarArr));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iVar, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it = iVar.iterator();
        while (true) {
            kotlin.collections.w wVar = (kotlin.collections.w) it;
            if (((Iterator) wVar.red).hasNext()) {
                kotlin.collections.v vVar = (kotlin.collections.v) wVar.next();
                linkedHashMap.put(Integer.valueOf(vVar.alpha), (f) vVar.bravo);
            } else {
                this.charlie = new Pair(type, new v(linkedHashMap));
                return;
            }
        }
    }
}
