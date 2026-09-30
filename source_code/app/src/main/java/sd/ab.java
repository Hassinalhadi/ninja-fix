package sd;

import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import s6.AbstractC2743p6;
import t6.AbstractC2996g2;
import t6.AbstractC3001h2;

/* loaded from: classes2.dex */
public abstract class ab {
    public static final List alpha = kotlin.collections.ab.juliet("");

    public static final int alpha(int i4, int i5, String str) {
        boolean z2 = false;
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt != ':') {
                if (charAt != '[') {
                    if (charAt == ']') {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
            } else if (!z2) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0110, code lost:
    
        if (r15 >= 128) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c A[LOOP:4: B:70:0x00fe->B:77:0x011c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121 A[EDGE_INSN: B:78:0x0121->B:83:0x0121 BREAK  A[LOOP:4: B:70:0x00fe->B:77:0x011c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v24, types: [sd.y, G3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(aa aaVar, String urlString) {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        List emptyList;
        int xray;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        zd.p rVar;
        List list;
        int i18;
        List navy;
        int xray2;
        int i19;
        int i20;
        int i21;
        char lowerCase;
        int i22 = -1;
        int i23 = 1;
        Intrinsics.echo(aaVar, "<this>");
        Intrinsics.echo(urlString, "urlString");
        int length = urlString.length();
        int i24 = 0;
        while (true) {
            if (i24 < length) {
                if (!AbstractC2743p6.delta(urlString.charAt(i24))) {
                    break;
                } else {
                    i24++;
                }
            } else {
                i24 = -1;
                break;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i25 = length2 - 1;
                if (!AbstractC2743p6.delta(urlString.charAt(length2))) {
                    break;
                } else if (i25 < 0) {
                    break;
                } else {
                    length2 = i25;
                }
            }
        }
        length2 = -1;
        int i26 = length2 + 1;
        char charAt = urlString.charAt(i24);
        char c3 = 'A';
        if (('a' <= charAt && charAt < '{') || ('A' <= charAt && charAt < '[')) {
            i5 = -1;
            i4 = i24;
        } else {
            i4 = i24;
            i5 = i4;
        }
        while (true) {
            i10 = i23;
            if (i4 >= i26) {
                break;
            }
            char charAt2 = urlString.charAt(i4);
            if (charAt2 == ':') {
                if (i5 == -1) {
                    i11 = i4 - i24;
                } else {
                    throw new IllegalArgumentException(ao.ad.zulu(i5, "Illegal character in scheme at position "));
                }
            } else {
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i5 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i5 = i4;
                }
                i4++;
                i23 = i10;
            }
        }
        i11 = -1;
        if (i11 > 0) {
            String substring = urlString.substring(i24, i24 + i11);
            Intrinsics.delta(substring, "substring(...)");
            ac acVar = ac.red;
            int length3 = substring.length();
            int i27 = 0;
            while (true) {
                if (i27 < length3) {
                    char charAt3 = substring.charAt(i27);
                    if ('A' <= charAt3 && charAt3 < '[') {
                        lowerCase = (char) (charAt3 + ' ');
                    } else if (charAt3 >= 0 && charAt3 < 128) {
                        lowerCase = charAt3;
                    } else {
                        lowerCase = Character.toLowerCase(charAt3);
                    }
                    if (lowerCase != charAt3) {
                        break;
                    } else {
                        i27++;
                    }
                } else {
                    i27 = -1;
                    break;
                }
            }
            if (i27 != -1) {
                StringBuilder sb2 = new StringBuilder(substring.length());
                sb2.append((CharSequence) substring, 0, i27);
                int cyan = StringsKt.cyan(substring);
                if (i27 <= cyan) {
                    while (true) {
                        char charAt4 = substring.charAt(i27);
                        if (c3 <= charAt4 && charAt4 < '[') {
                            charAt4 = (char) (charAt4 + ' ');
                            sb2.append(charAt4);
                            if (i27 != cyan) {
                                break;
                            }
                            i27++;
                            c3 = 'A';
                        }
                        charAt4 = Character.toLowerCase(charAt4);
                        sb2.append(charAt4);
                        if (i27 != cyan) {
                        }
                    }
                }
                substring = sb2.toString();
            }
            ac acVar2 = (ac) ac.teal.get(substring);
            if (acVar2 == null) {
                acVar2 = new ac(substring, 0);
            }
            aaVar.delta = acVar2;
            i24 += i11 + 1;
        }
        if (Intrinsics.areEqual(aaVar.charlie().alpha, Column.DATA)) {
            String substring2 = urlString.substring(i24, i26);
            Intrinsics.delta(substring2, "substring(...)");
            aaVar.alpha = substring2;
            return;
        }
        int i28 = 0;
        while (true) {
            i12 = i24 + i28;
            if (i12 >= i26 || urlString.charAt(i12) != '/') {
                break;
            } else {
                i28++;
            }
        }
        if (Intrinsics.areEqual(aaVar.charlie().alpha, CTVariableUtils.FILE)) {
            if (i28 != i10) {
                if (i28 != 2) {
                    if (i28 == 3) {
                        aaVar.alpha = "";
                        String substring3 = urlString.substring(i12, i26);
                        Intrinsics.delta(substring3, "substring(...)");
                        AbstractC3001h2.delta(aaVar, "/".concat(substring3));
                        return;
                    }
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                int emerald = StringsKt.emerald(urlString, '/', i12, 4);
                if (emerald != -1 && emerald != i26) {
                    String substring4 = urlString.substring(i12, emerald);
                    Intrinsics.delta(substring4, "substring(...)");
                    aaVar.alpha = substring4;
                    String substring5 = urlString.substring(emerald, i26);
                    Intrinsics.delta(substring5, "substring(...)");
                    AbstractC3001h2.delta(aaVar, substring5);
                    return;
                }
                String substring6 = urlString.substring(i12, i26);
                Intrinsics.delta(substring6, "substring(...)");
                aaVar.alpha = substring6;
                return;
            }
            aaVar.alpha = "";
            String substring7 = urlString.substring(i12, i26);
            Intrinsics.delta(substring7, "substring(...)");
            AbstractC3001h2.delta(aaVar, substring7);
            return;
        }
        Integer num = null;
        String str = null;
        if (Intrinsics.areEqual(aaVar.charlie().alpha, "mailto")) {
            if (i28 == 0) {
                int fuchsia = StringsKt.fuchsia(urlString, "@", i12, false, 4);
                if (fuchsia != -1) {
                    String substring8 = urlString.substring(i12, fuchsia);
                    Intrinsics.delta(substring8, "substring(...)");
                    String charlie = AbstractC2850a.charlie(substring8);
                    if (charlie != null) {
                        str = AbstractC2850a.echo(charlie, false);
                    }
                    aaVar.echo = str;
                    String substring9 = urlString.substring(fuchsia + 1, i26);
                    Intrinsics.delta(substring9, "substring(...)");
                    aaVar.alpha = substring9;
                    return;
                }
                throw new IllegalArgumentException(ao.ad.gray("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (Intrinsics.areEqual(aaVar.charlie().alpha, "about")) {
            if (i28 == 0) {
                String substring10 = urlString.substring(i12, i26);
                Intrinsics.delta(substring10, "substring(...)");
                aaVar.alpha = substring10;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (Intrinsics.areEqual(aaVar.charlie().alpha, "tel")) {
            if (i28 == 0) {
                String substring11 = urlString.substring(i12, i26);
                Intrinsics.delta(substring11, "substring(...)");
                aaVar.alpha = substring11;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i28 >= 2) {
            while (true) {
                char[] cArr = new char[5];
                int i29 = 0;
                for (int i30 = 5; i29 < i30; i30 = 5) {
                    cArr[i29] = "@/\\?#".charAt(i29);
                    i29++;
                }
                xray2 = StringsKt__StringsKt.xray(urlString, cArr, i12, false);
                Integer valueOf = Integer.valueOf(xray2);
                if (xray2 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i19 = valueOf.intValue();
                } else {
                    i19 = i26;
                }
                if (i19 >= i26 || urlString.charAt(i19) != '@') {
                    break;
                }
                int alpha2 = alpha(i12, i19, urlString);
                if (alpha2 != -1) {
                    String substring12 = urlString.substring(i12, alpha2);
                    Intrinsics.delta(substring12, "substring(...)");
                    aaVar.echo = substring12;
                    String substring13 = urlString.substring(alpha2 + 1, i19);
                    Intrinsics.delta(substring13, "substring(...)");
                    aaVar.foxtrot = substring13;
                } else {
                    String substring14 = urlString.substring(i12, i19);
                    Intrinsics.delta(substring14, "substring(...)");
                    aaVar.echo = substring14;
                }
                i12 = i19 + 1;
            }
            int alpha3 = alpha(i12, i19, urlString);
            Integer valueOf2 = Integer.valueOf(alpha3);
            if (alpha3 <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                i20 = valueOf2.intValue();
            } else {
                i20 = i19;
            }
            String substring15 = urlString.substring(i12, i20);
            Intrinsics.delta(substring15, "substring(...)");
            aaVar.alpha = substring15;
            int i31 = i20 + 1;
            if (i31 < i19) {
                String substring16 = urlString.substring(i31, i19);
                Intrinsics.delta(substring16, "substring(...)");
                i21 = Integer.parseInt(substring16);
            } else {
                i21 = 0;
            }
            aaVar.delta(i21);
            i12 = i19;
        }
        List list2 = alpha;
        if (i12 >= i26) {
            if (urlString.charAt(length2) != '/') {
                list2 = CollectionsKt.emptyList();
            }
            Intrinsics.echo(list2, "<set-?>");
            aaVar.hotel = list2;
            return;
        }
        if (i28 == 0) {
            emptyList = CollectionsKt.cyan(aaVar.hotel);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        Intrinsics.echo(emptyList, "<set-?>");
        aaVar.hotel = emptyList;
        char[] cArr2 = new char[2];
        for (int i32 = 0; i32 < 2; i32++) {
            cArr2[i32] = "?#".charAt(i32);
        }
        xray = StringsKt__StringsKt.xray(urlString, cArr2, i12, false);
        Integer valueOf3 = Integer.valueOf(xray);
        if (xray <= 0) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            i13 = valueOf3.intValue();
        } else {
            i13 = i26;
        }
        if (i13 > i12) {
            String substring17 = urlString.substring(i12, i13);
            Intrinsics.delta(substring17, "substring(...)");
            if (aaVar.hotel.size() == 1 && ((CharSequence) CollectionsKt.gold(aaVar.hotel)).length() == 0) {
                list = CollectionsKt.emptyList();
            } else {
                list = aaVar.hotel;
            }
            if (Intrinsics.areEqual(substring17, "/")) {
                navy = list2;
                i18 = 1;
                i14 = 0;
            } else {
                i18 = 1;
                i14 = 0;
                navy = StringsKt.navy(substring17, new char[]{'/'});
            }
            if (i28 != i18) {
                list2 = CollectionsKt.emptyList();
            }
            aaVar.hotel = CollectionsKt.a(list, CollectionsKt.a(list2, navy));
            i12 = i13;
        } else {
            i14 = 0;
        }
        if (i12 < i26 && urlString.charAt(i12) == '?') {
            int i33 = i12 + 1;
            if (i33 == i26) {
                aaVar.bravo = true;
                i12 = i26;
            } else {
                int emerald2 = StringsKt.emerald(urlString, '#', i33, 4);
                Integer valueOf4 = Integer.valueOf(emerald2);
                if (emerald2 > 0) {
                    num = valueOf4;
                }
                if (num != null) {
                    i15 = num.intValue();
                } else {
                    i15 = i26;
                }
                String substring18 = urlString.substring(i33, i15);
                Intrinsics.delta(substring18, "substring(...)");
                if (StringsKt.cyan(substring18) < 0) {
                    w.bravo.getClass();
                    rVar = h.charlie;
                } else {
                    l lVar = w.bravo;
                    ?? aVar = new G3.a(10);
                    int cyan2 = StringsKt.cyan(substring18);
                    if (cyan2 >= 0) {
                        int i34 = -1;
                        i16 = i14;
                        int i35 = i16;
                        i17 = i35;
                        while (i16 != 1000) {
                            char charAt5 = substring18.charAt(i35);
                            if (charAt5 != '&') {
                                if (charAt5 == '=' && i34 == -1) {
                                    i34 = i35;
                                }
                            } else {
                                AbstractC2996g2.alpha(aVar, substring18, i17, i34, i35);
                                i17 = i35 + 1;
                                i16++;
                                i34 = -1;
                            }
                            if (i35 != cyan2) {
                                i35++;
                            } else {
                                i22 = i34;
                            }
                        }
                        Map values = (Map) aVar.alpha;
                        Intrinsics.echo(values, "values");
                        rVar = new zd.r(values);
                    } else {
                        i16 = i14;
                        i17 = i16;
                    }
                    if (i16 != 1000) {
                        AbstractC2996g2.alpha(aVar, substring18, i17, i22, substring18.length());
                    }
                    Map values2 = (Map) aVar.alpha;
                    Intrinsics.echo(values2, "values");
                    rVar = new zd.r(values2);
                }
                rVar.hotel(new bz.af(20, aaVar));
                i12 = i15;
            }
        }
        if (i12 < i26 && urlString.charAt(i12) == '#') {
            String substring19 = urlString.substring(i12 + 1, i26);
            Intrinsics.delta(substring19, "substring(...)");
            aaVar.golf = substring19;
        }
    }
}
