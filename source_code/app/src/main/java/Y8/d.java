package Y8;

import A2.p;
import Nd.h;
import V0.k;
import Xd.l;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t6.AbstractC3003i;
import vf.ac;

/* loaded from: classes2.dex */
public abstract class d {
    public static k alpha(h context, l lVar) {
        ac acVar = ac.alpha;
        Intrinsics.echo(context, "context");
        return AbstractC3003i.alpha(new p(context, acVar, lVar));
    }

    public static LinkedHashMap bravo(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = list.size();
        for (int i4 = 1; i4 < size; i4++) {
            String str = (String) list.get(i4);
            if (str.length() == 0) {
                break;
            }
            int emerald = StringsKt.emerald(str, ':', 0, 6);
            if (emerald > 0) {
                String substring = str.substring(0, emerald);
                Intrinsics.delta(substring, "substring(...)");
                String obj = StringsKt.b(substring).toString();
                if (!linkedHashMap.containsKey(obj)) {
                    String substring2 = str.substring(emerald + 1);
                    Intrinsics.delta(substring2, "substring(...)");
                    linkedHashMap.put(obj, StringsKt.b(substring2).toString());
                }
            }
        }
        return linkedHashMap;
    }
}
