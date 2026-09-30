package G6;

import Ie.ap;
import Ie.aq;
import Ie.aw;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import s6.V4;

/* loaded from: classes2.dex */
public final class j implements c {
    public final List alpha;

    public j(List list) {
        this.alpha = list;
    }

    public aq alpha(int i4) {
        return (aq) this.alpha.get(i4);
    }

    @Override // G6.c
    public /* bridge */ /* synthetic */ Object ivory(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.alpha);
        return V4.echo(arrayList);
    }

    public j(aw typeTable) {
        int collectionSizeOrDefault;
        Intrinsics.echo(typeTable, "typeTable");
        List list = typeTable.red;
        if ((typeTable.purple & 1) == 1) {
            int i4 = typeTable.silver;
            Intrinsics.delta(list, "typeTable.typeList");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i5 = 0;
            for (Object obj : list) {
                int i10 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                aq aqVar = (aq) obj;
                if (i5 >= i4) {
                    aqVar.getClass();
                    ap romeo = aq.romeo(aqVar);
                    romeo.silver |= 2;
                    romeo.white = true;
                    aqVar = romeo.kilo();
                    if (!aqVar.alpha()) {
                        throw new UninitializedMessageException(aqVar);
                    }
                }
                arrayList.add(aqVar);
                i5 = i10;
            }
            list = arrayList;
        }
        Intrinsics.delta(list, "run {\n        val origin… else originalTypes\n    }");
        this.alpha = list;
    }
}
