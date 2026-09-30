package Me;

import androidx.appcompat.widget.P0;
import ao.ad;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import s6.AbstractC2770s7;

/* loaded from: classes2.dex */
public abstract class b {
    public static final String alpha = CollectionsKt.maroon(CollectionsKt.listOf('k', 'o', Character.valueOf(Constants.INAPP_POSITION_TOP), Character.valueOf(Constants.INAPP_POSITION_LEFT), 'i', 'n'), "", null, null, null, 62);
    public static final LinkedHashMap bravo;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listOf = CollectionsKt.listOf("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int alpha2 = AbstractC2770s7.alpha(0, listOf.size() - 1, 2);
        if (alpha2 >= 0) {
            int i4 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = alpha;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listOf.get(i4));
                int i5 = i4 + 1;
                linkedHashMap.put(sb2.toString(), listOf.get(i5));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(P0.gold(sb3, (String) listOf.get(i4), "Array"), Constants.AES_PREFIX + ((String) listOf.get(i5)));
                if (i4 == alpha2) {
                    break;
                } else {
                    i4 += 2;
                }
            }
        }
        linkedHashMap.put(alpha + "/Unit", "V");
        alpha(linkedHashMap, "Any", "java/lang/Object");
        alpha(linkedHashMap, "Nothing", "java/lang/Void");
        alpha(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.listOf("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            alpha(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.listOf("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            alpha(linkedHashMap, q.echo("collections/", str3), "java/util/" + str3);
            alpha(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        alpha(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        alpha(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        alpha(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        alpha(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i10 = 0; i10 < 23; i10++) {
            String zulu = ad.zulu(i10, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = alpha;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i10);
            alpha(linkedHashMap, zulu, sb4.toString());
            alpha(linkedHashMap, "reflect/KFunction" + i10, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.listOf("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            alpha(linkedHashMap, P0.crimson(str5, ".Companion"), j.lima(new StringBuilder(), alpha, "/jvm/internal/", str5, "CompanionObject"));
        }
        bravo = linkedHashMap;
    }

    public static final void alpha(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(alpha + '/' + str, "L" + str2 + ';');
    }

    public static final String bravo(String classId) {
        Intrinsics.echo(classId, "classId");
        String str = (String) bravo.get(classId);
        if (str == null) {
            return "L" + r.november(classId, '.', '$') + ';';
        }
        return str;
    }
}
