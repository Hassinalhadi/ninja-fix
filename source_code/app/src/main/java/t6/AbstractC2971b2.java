package t6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2971b2 {
    public static final /* synthetic */ int alpha = 0;

    public static final ArrayList alpha(Map map, Function1 function1) {
        Boolean bool;
        Intrinsics.echo(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Y1.k kVar = (Y1.k) entry.getValue();
            if (kVar != null) {
                bool = Boolean.valueOf(kVar.bravo);
            } else {
                bool = null;
            }
            Intrinsics.checkNotNull(bool);
            if (!bool.booleanValue() && !kVar.charlie) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
