package t6;

import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pf.C2361k;

/* renamed from: t6.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3001h2 {
    public static final void alpha(sd.aa aaVar, StringBuilder sb2) {
        List list;
        sb2.append(aaVar.charlie().alpha);
        String str = aaVar.charlie().alpha;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = aaVar.echo;
                    String str3 = aaVar.foxtrot;
                    if (str2 != null) {
                        sb3.append(str2);
                        if (str3 != null) {
                            sb3.append(':');
                            sb3.append(str3);
                        }
                        sb3.append("@");
                    }
                    CharSequence sb4 = sb3.toString();
                    CharSequence charSequence = aaVar.alpha;
                    sb2.append(":");
                    sb2.append(sb4);
                    sb2.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = aaVar.alpha;
                    sb2.append(":");
                    sb2.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals(Column.DATA)) {
                    CharSequence charSequence3 = aaVar.alpha;
                    sb2.append(":");
                    sb2.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals(CTVariableUtils.FILE)) {
                    CharSequence charSequence4 = aaVar.alpha;
                    String charlie = charlie(aaVar);
                    sb2.append("://");
                    sb2.append(charSequence4);
                    if (!StringsKt.orange(charlie, '/')) {
                        sb2.append('/');
                    }
                    sb2.append((CharSequence) charlie);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = aaVar.alpha;
                    sb2.append(":");
                    sb2.append(charSequence5);
                    return;
                }
                break;
        }
        sb2.append("://");
        sb2.append(bravo(aaVar));
        String encodedPath = charlie(aaVar);
        sd.y encodedQueryParameters = aaVar.india;
        boolean z2 = aaVar.bravo;
        Intrinsics.echo(encodedPath, "encodedPath");
        Intrinsics.echo(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.gray(encodedPath) && !kotlin.text.r.quebec(encodedPath, "/", false)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) encodedPath);
        if (!((Map) encodedQueryParameters.alpha).isEmpty() || z2) {
            sb2.append("?");
        }
        Set<Map.Entry> foxtrot = encodedQueryParameters.foxtrot();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : foxtrot) {
            String str4 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = kotlin.collections.ab.juliet(new Pair(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.blue(list2));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it.next()));
                }
                list = arrayList2;
            }
            CollectionsKt.zulu(arrayList, list);
        }
        CollectionsKt.magenta(arrayList, sb2, "&", null, null, new C2361k(3), 60);
        if (aaVar.golf.length() > 0) {
            sb2.append('#');
            sb2.append(aaVar.golf);
        }
    }

    public static final String bravo(sd.aa aaVar) {
        Intrinsics.echo(aaVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = aaVar.echo;
        String str2 = aaVar.foxtrot;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append("@");
        }
        sb2.append(sb3.toString());
        sb2.append(aaVar.alpha);
        int i4 = aaVar.charlie;
        if (i4 != 0 && i4 != aaVar.charlie().purple) {
            sb2.append(":");
            sb2.append(String.valueOf(aaVar.charlie));
        }
        return sb2.toString();
    }

    public static final String charlie(sd.aa aaVar) {
        Intrinsics.echo(aaVar, "<this>");
        List list = aaVar.hotel;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            if (((CharSequence) CollectionsKt.gold(list)).length() == 0) {
                return "/";
            }
            return (String) CollectionsKt.gold(list);
        }
        return CollectionsKt.maroon(list, "/", null, null, null, 62);
    }

    public static final void delta(sd.aa aaVar, String value) {
        List B;
        Intrinsics.echo(aaVar, "<this>");
        Intrinsics.echo(value, "value");
        if (StringsKt.gray(value)) {
            B = CollectionsKt.emptyList();
        } else if (Intrinsics.areEqual(value, "/")) {
            B = sd.ab.alpha;
        } else {
            B = CollectionsKt.B(StringsKt.navy(value, new char[]{'/'}));
        }
        Intrinsics.echo(B, "<set-?>");
        aaVar.hotel = B;
    }
}
