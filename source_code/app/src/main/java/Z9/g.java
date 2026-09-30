package Z9;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class g {
    public static String alpha(String str, String str2, String str3, Integer num, Long l10, Long l11, String str4, String str5, Long l12, Long l13, Integer num2, String str6, Map map, int i4) {
        Long l14;
        Long l15;
        String str7;
        String str8;
        Long l16;
        Long l17;
        String str9;
        Map map2 = null;
        if ((i4 & 4) != 0) {
            str3 = null;
        }
        if ((i4 & 16) != 0) {
            l14 = null;
        } else {
            l14 = l10;
        }
        if ((i4 & 32) != 0) {
            l15 = null;
        } else {
            l15 = l11;
        }
        if ((i4 & 64) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i4 & 128) != 0) {
            str8 = null;
        } else {
            str8 = str5;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            l16 = null;
        } else {
            l16 = l12;
        }
        if ((i4 & 512) != 0) {
            l17 = null;
        } else {
            l17 = l13;
        }
        if ((i4 & 2048) != 0) {
            str9 = null;
        } else {
            str9 = str6;
        }
        if ((i4 & 4096) == 0) {
            map2 = map;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("evt=".concat(str));
        arrayList.add("state=".concat(str2));
        if (str3 != null) {
            arrayList.add("prev=".concat(str3));
        }
        if (num != null) {
            arrayList.add("attempt=" + num.intValue());
        }
        if (l14 != null) {
            arrayList.add("elapsedMs=" + l14.longValue());
        }
        if (l15 != null) {
            arrayList.add("hbMs=" + l15.longValue());
        }
        if (str7 != null) {
            arrayList.add("closeReason=".concat(str7));
        }
        if (str8 != null) {
            arrayList.add("errClass=".concat(str8));
        }
        if (l16 != null) {
            arrayList.add("connectionDurationMs=" + l16.longValue());
        }
        if (l17 != null) {
            arrayList.add("backoffMs=" + l17.longValue());
        }
        arrayList.add("consecutiveFailures=" + num2.intValue());
        if (str9 != null) {
            arrayList.add("quality=".concat(str9));
        }
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
        }
        return CollectionsKt.maroon(arrayList, " ", null, null, null, 62);
    }
}
