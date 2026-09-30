package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class r implements Iterable, InterfaceC1355o {
    public final String alpha;

    public r(String str) {
        if (str != null) {
            this.alpha = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        String str = this.alpha;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.alpha.equals(((r) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c3;
        int i4;
        int i5;
        double doubleValue;
        double doubleValue2;
        double bravo;
        String bravo2;
        int i10;
        double d4;
        double min;
        double length;
        double min2;
        long j5;
        int i11;
        int i12;
        J2.i iVar2;
        int i13;
        int length2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c3 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c3 = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c3 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c3 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c3 = 0;
                    break;
                }
                str4 = str2;
                c3 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c3 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c3 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -906336856:
                if (str.equals("search")) {
                    c3 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c3 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c3 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c3 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c3 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c3 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c3 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c3 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c3 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c3 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c3 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
        }
        String str6 = "undefined";
        char c4 = c3;
        String str7 = this.alpha;
        switch (c4) {
            case 0:
                AbstractC1295b1.juliet(1, str5, arrayList);
                if (!arrayList.isEmpty()) {
                    i4 = (int) AbstractC1295b1.bravo(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue());
                } else {
                    i4 = 0;
                }
                if (i4 >= 0 && i4 < str7.length()) {
                    return new r(String.valueOf(str7.charAt(i4)));
                }
                return InterfaceC1355o.lime;
            case 1:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(str7);
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sb2.append(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(i14)).bravo());
                    }
                    return new r(sb2.toString());
                }
                return this;
            case 2:
                AbstractC1295b1.hotel(arrayList, 1, str4);
                InterfaceC1355o alpha = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                boolean equals = "length".equals(alpha.bravo());
                C1313f c1313f = InterfaceC1355o.jade;
                if (equals) {
                    return c1313f;
                }
                double doubleValue3 = alpha.alpha().doubleValue();
                if (doubleValue3 == Math.floor(doubleValue3) && (i5 = (int) doubleValue3) >= 0 && i5 < str7.length()) {
                    return c1313f;
                }
                return InterfaceC1355o.lavender;
            case 3:
                AbstractC1295b1.juliet(2, "indexOf", arrayList);
                if (arrayList.size() > 0) {
                    str6 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                }
                String str8 = str6;
                if (arrayList.size() < 2) {
                    doubleValue = 0.0d;
                } else {
                    doubleValue = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue();
                }
                return new C1323h(Double.valueOf(str7.indexOf(str8, (int) AbstractC1295b1.bravo(doubleValue))));
            case 4:
                AbstractC1295b1.juliet(2, "lastIndexOf", arrayList);
                if (arrayList.size() > 0) {
                    str6 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                }
                String str9 = str6;
                if (arrayList.size() < 2) {
                    doubleValue2 = Double.NaN;
                } else {
                    doubleValue2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue();
                }
                if (Double.isNaN(doubleValue2)) {
                    bravo = Double.POSITIVE_INFINITY;
                } else {
                    bravo = AbstractC1295b1.bravo(doubleValue2);
                }
                return new C1323h(Double.valueOf(str7.lastIndexOf(str9, (int) bravo)));
            case 5:
                AbstractC1295b1.juliet(1, "match", arrayList);
                if (arrayList.size() <= 0) {
                    bravo2 = "";
                } else {
                    bravo2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                }
                Matcher matcher = Pattern.compile(bravo2).matcher(str7);
                if (matcher.find()) {
                    return new C1308e(Arrays.asList(new r(matcher.group())));
                }
                return InterfaceC1355o.gray;
            case 6:
                AbstractC1295b1.juliet(2, "replace", arrayList);
                InterfaceC1355o interfaceC1355o = InterfaceC1355o.gold;
                if (!arrayList.isEmpty()) {
                    str6 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                    if (arrayList.size() > 1) {
                        interfaceC1355o = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                    }
                }
                String str10 = str6;
                int indexOf = str7.indexOf(str10);
                if (indexOf >= 0) {
                    if (interfaceC1355o instanceof AbstractC1328i) {
                        i10 = 0;
                        interfaceC1355o = ((AbstractC1328i) interfaceC1355o).charlie(iVar, Arrays.asList(new r(str10), new C1323h(Double.valueOf(indexOf)), this));
                    } else {
                        i10 = 0;
                    }
                    return new r(ao.ad.amber(str7.substring(i10, indexOf), interfaceC1355o.bravo(), str7.substring(str10.length() + indexOf)));
                }
                return this;
            case 7:
                AbstractC1295b1.juliet(1, "search", arrayList);
                if (!arrayList.isEmpty()) {
                    str6 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                }
                if (Pattern.compile(str6).matcher(str7).find()) {
                    return new C1323h(Double.valueOf(r1.start()));
                }
                return new C1323h(Double.valueOf(-1.0d));
            case '\b':
                AbstractC1295b1.juliet(2, "slice", arrayList);
                if (!arrayList.isEmpty()) {
                    d4 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue();
                } else {
                    d4 = 0.0d;
                }
                double bravo3 = AbstractC1295b1.bravo(d4);
                if (bravo3 < 0.0d) {
                    min = Math.max(str7.length() + bravo3, 0.0d);
                } else {
                    min = Math.min(bravo3, str7.length());
                }
                if (arrayList.size() > 1) {
                    length = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue();
                } else {
                    length = str7.length();
                }
                double bravo4 = AbstractC1295b1.bravo(length);
                if (bravo4 < 0.0d) {
                    min2 = Math.max(str7.length() + bravo4, 0.0d);
                } else {
                    min2 = Math.min(bravo4, str7.length());
                }
                int i15 = (int) min;
                return new r(str7.substring(i15, Math.max(0, ((int) min2) - i15) + i15));
            case '\t':
                AbstractC1295b1.juliet(2, "split", arrayList);
                if (str7.length() == 0) {
                    return new C1308e(Arrays.asList(this));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String bravo5 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                    if (arrayList.size() > 1) {
                        j5 = AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue()) & 4294967295L;
                    } else {
                        j5 = 2147483647L;
                    }
                    if (j5 == 0) {
                        return new C1308e();
                    }
                    String[] split = str7.split(Pattern.quote(bravo5), ((int) j5) + 1);
                    int length3 = split.length;
                    if (bravo5.isEmpty() && length3 > 0) {
                        boolean isEmpty = split[0].isEmpty();
                        i11 = length3 - 1;
                        i12 = isEmpty;
                        if (!split[i11].isEmpty()) {
                            i11 = length3;
                            i12 = isEmpty;
                        }
                    } else {
                        i11 = length3;
                        i12 = 0;
                    }
                    if (length3 > j5) {
                        i11--;
                    }
                    while (i12 < i11) {
                        arrayList2.add(new r(split[i12]));
                        i12++;
                    }
                }
                return new C1308e(arrayList2);
            case '\n':
                AbstractC1295b1.juliet(2, "substring", arrayList);
                if (!arrayList.isEmpty()) {
                    iVar2 = iVar;
                    i13 = (int) AbstractC1295b1.bravo(((C1378u) iVar2.purple).alpha(iVar2, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue());
                } else {
                    iVar2 = iVar;
                    i13 = 0;
                }
                if (arrayList.size() > 1) {
                    length2 = (int) AbstractC1295b1.bravo(((C1378u) iVar2.purple).alpha(iVar2, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue());
                } else {
                    length2 = str7.length();
                }
                int min3 = Math.min(Math.max(i13, 0), str7.length());
                int min4 = Math.min(Math.max(length2, 0), str7.length());
                return new r(str7.substring(Math.min(min3, min4), Math.max(min3, min4)));
            case 11:
                AbstractC1295b1.hotel(arrayList, 0, "toLocaleUpperCase");
                return new r(str7.toUpperCase());
            case '\f':
                AbstractC1295b1.hotel(arrayList, 0, "toLocaleLowerCase");
                return new r(str7.toLowerCase());
            case '\r':
                AbstractC1295b1.hotel(arrayList, 0, "toLowerCase");
                return new r(str7.toLowerCase(Locale.ENGLISH));
            case 14:
                AbstractC1295b1.hotel(arrayList, 0, "toString");
                return this;
            case 15:
                AbstractC1295b1.hotel(arrayList, 0, "toUpperCase");
                return new r(str7.toUpperCase(Locale.ENGLISH));
            case 16:
                AbstractC1295b1.hotel(arrayList, 0, "toUpperCase");
                return new r(str7.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1363q(1, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        return Boolean.valueOf(!this.alpha.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return new C1363q(0, this);
    }

    public final String toString() {
        return androidx.appcompat.widget.P0.gold(new StringBuilder("\""), this.alpha, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return new r(this.alpha);
    }
}
