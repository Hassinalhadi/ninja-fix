package t6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sb.C2844c;

/* renamed from: t6.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2986e2 {
    public static final Y1.aj alpha(Function1 function1) {
        Y1.ak akVar = new Y1.ak();
        function1.invoke(akVar);
        boolean z2 = akVar.bravo;
        Y1.ai aiVar = akVar.alpha;
        aiVar.alpha = z2;
        aiVar.bravo = akVar.charlie;
        int i4 = akVar.delta;
        boolean z10 = akVar.echo;
        boolean z11 = akVar.foxtrot;
        aiVar.charlie = i4;
        aiVar.delta = z10;
        aiVar.echo = z11;
        return aiVar.alpha();
    }

    public static final List bravo(String str) {
        int i4;
        int i5;
        List emptyList;
        int i10;
        List emptyList2;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new C2844c(1));
        for (int i11 = 0; i11 <= StringsKt.cyan(str); i11 = i4) {
            Lazy alpha2 = LazyKt.alpha(kotlin.i.purple, new C2844c(2));
            Integer num = null;
            i4 = i11;
            while (true) {
                if (i4 <= StringsKt.cyan(str)) {
                    char charAt = str.charAt(i4);
                    if (charAt != ',') {
                        if (charAt != ';') {
                            i4++;
                        } else {
                            if (num == null) {
                                num = Integer.valueOf(i4);
                            }
                            int i12 = i4 + 1;
                            int i13 = i12;
                            while (i13 <= StringsKt.cyan(str)) {
                                char charAt2 = str.charAt(i13);
                                if (charAt2 != ',' && charAt2 != ';') {
                                    if (charAt2 != '=') {
                                        i13++;
                                    } else {
                                        int i14 = i13 + 1;
                                        if (str.length() == i14) {
                                            pair2 = new Pair(Integer.valueOf(i14), "");
                                        } else {
                                            char c3 = '\"';
                                            if (str.charAt(i14) == '\"') {
                                                int i15 = i13 + 2;
                                                StringBuilder sb2 = new StringBuilder();
                                                while (i15 <= StringsKt.cyan(str)) {
                                                    char charAt3 = str.charAt(i15);
                                                    if (charAt3 == c3) {
                                                        int i16 = i15 + 1;
                                                        int i17 = i16;
                                                        while (i17 < str.length() && str.charAt(i17) == ' ') {
                                                            i17++;
                                                        }
                                                        if (i17 == str.length() || str.charAt(i17) == ';' || str.charAt(i17) == ',') {
                                                            pair = new Pair(Integer.valueOf(i16), sb2.toString());
                                                            break;
                                                        }
                                                    }
                                                    if (charAt3 == '\\' && i15 < StringsKt.cyan(str) - 2) {
                                                        sb2.append(str.charAt(i15 + 1));
                                                        i15 += 2;
                                                    } else {
                                                        sb2.append(charAt3);
                                                        i15++;
                                                    }
                                                    c3 = '\"';
                                                }
                                                Integer valueOf = Integer.valueOf(i15);
                                                String sb3 = sb2.toString();
                                                Intrinsics.delta(sb3, "toString(...)");
                                                pair = new Pair(valueOf, "\"".concat(sb3));
                                            } else {
                                                int i18 = i14;
                                                while (i18 <= StringsKt.cyan(str)) {
                                                    char charAt4 = str.charAt(i18);
                                                    if (charAt4 != ',' && charAt4 != ';') {
                                                        i18++;
                                                    } else {
                                                        pair = new Pair(Integer.valueOf(i18), delta(i14, i18, str));
                                                        break;
                                                    }
                                                }
                                                pair = new Pair(Integer.valueOf(i18), delta(i14, i18, str));
                                            }
                                            pair2 = pair;
                                        }
                                        int intValue = ((Number) pair2.first).intValue();
                                        charlie(alpha2, str, i12, i13, (String) pair2.second);
                                        i4 = intValue;
                                    }
                                } else {
                                    charlie(alpha2, str, i12, i13, "");
                                    break;
                                }
                            }
                            charlie(alpha2, str, i12, i13, "");
                            i4 = i13;
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) alpha.getValue();
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = i4;
                        }
                        String delta = delta(i11, i10, str);
                        if (alpha2.alpha()) {
                            emptyList2 = (List) alpha2.getValue();
                        } else {
                            emptyList2 = CollectionsKt.emptyList();
                        }
                        arrayList.add(new sd.i(delta, emptyList2));
                        i4++;
                    }
                } else {
                    ArrayList arrayList2 = (ArrayList) alpha.getValue();
                    if (num != null) {
                        i5 = num.intValue();
                    } else {
                        i5 = i4;
                    }
                    String delta2 = delta(i11, i5, str);
                    if (alpha2.alpha()) {
                        emptyList = (List) alpha2.getValue();
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    arrayList2.add(new sd.i(delta2, emptyList));
                }
            }
        }
        if (alpha.alpha()) {
            return (List) alpha.getValue();
        }
        return CollectionsKt.emptyList();
    }

    public static final void charlie(Lazy lazy, String str, int i4, int i5, String str2) {
        String delta = delta(i4, i5, str);
        if (delta.length() == 0) {
            return;
        }
        ((ArrayList) lazy.getValue()).add(new sd.j(delta, str2));
    }

    public static final String delta(int i4, int i5, String str) {
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        return StringsKt.b(substring).toString();
    }
}
