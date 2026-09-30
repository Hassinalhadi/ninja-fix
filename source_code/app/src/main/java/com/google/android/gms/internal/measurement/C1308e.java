package com.google.android.gms.internal.measurement;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1308e implements Iterable, InterfaceC1355o, InterfaceC1338k {
    public final TreeMap alpha;
    public final TreeMap purple;

    public C1308e() {
        this.alpha = new TreeMap();
        this.purple = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Double alpha() {
        TreeMap treeMap = this.alpha;
        if (treeMap.size() == 1) {
            return oscar(0).alpha();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final String bravo() {
        return quebec(Constants.SEPARATOR_COMMA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final boolean delta(String str) {
        if (!"length".equals(str) && !this.purple.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1308e) {
                C1308e c1308e = (C1308e) obj;
                if (november() == c1308e.november()) {
                    TreeMap treeMap = this.alpha;
                    if (treeMap.isEmpty()) {
                        return c1308e.alpha.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!oscar(intValue).equals(c1308e.oscar(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode() * 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x083c, code lost:
    
        if (com.bumptech.glide.d.delta(r29, r31, (com.google.android.gms.internal.measurement.C1351n) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).november() == november()) goto L381;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x01d9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0284  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        String str6;
        char c3;
        char c4;
        InterfaceC1355o interfaceC1355o;
        double d4;
        InterfaceC1355o interfaceC1355o2;
        double d9;
        double d10;
        double min;
        String str7 = "toString";
        String str8 = "splice";
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str)) {
            str2 = "filter";
            str3 = "sort";
        } else {
            str2 = "filter";
            str3 = "sort";
            if (!str3.equals(str)) {
                obj = "reduce";
                if (!str8.equals(str)) {
                    str8 = str8;
                    if (!str7.equals(str)) {
                        str7 = str7;
                        str4 = "unshift";
                        if (!str4.equals(str)) {
                            return com.bumptech.glide.c.charlie(this, new r(str), iVar, arrayList);
                        }
                        switch (str.hashCode()) {
                            case -1776922004:
                                str5 = str2;
                                str6 = str7;
                                if (str.equals(str6)) {
                                    c3 = 18;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1354795244:
                                str5 = str2;
                                if (str.equals("concat")) {
                                    str6 = str7;
                                    c3 = 0;
                                    break;
                                }
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case -1274492040:
                                str5 = str2;
                                if (str.equals(str5)) {
                                    str6 = str7;
                                    c3 = 2;
                                    break;
                                }
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case -934873754:
                                if (str.equals(obj)) {
                                    c3 = '\n';
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case -895859076:
                                if (str.equals(str8)) {
                                    c3 = 17;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case -678635926:
                                if (str.equals("forEach")) {
                                    str5 = str2;
                                    str6 = str7;
                                    c3 = 3;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case -467511597:
                                if (str.equals("lastIndexOf")) {
                                    c3 = 6;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case -277637751:
                                if (str.equals(str4)) {
                                    c3 = 19;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 107868:
                                if (str.equals("map")) {
                                    c3 = 7;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 111185:
                                if (str.equals("pop")) {
                                    c3 = '\b';
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 3267882:
                                if (str.equals("join")) {
                                    c3 = 5;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 3452698:
                                if (str.equals("push")) {
                                    c3 = '\t';
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 3536116:
                                if (str.equals("some")) {
                                    c3 = 15;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 3536286:
                                if (str.equals(str3)) {
                                    c3 = 16;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 96891675:
                                if (str.equals("every")) {
                                    str5 = str2;
                                    str6 = str7;
                                    c3 = 1;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 109407362:
                                if (str.equals("shift")) {
                                    c3 = '\r';
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 109526418:
                                if (str.equals("slice")) {
                                    c3 = 14;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 965561430:
                                if (str.equals("reduceRight")) {
                                    c3 = 11;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 1099846370:
                                if (str.equals("reverse")) {
                                    c3 = '\f';
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            case 1943291465:
                                if (str.equals("indexOf")) {
                                    c3 = 4;
                                    str5 = str2;
                                    str6 = str7;
                                    break;
                                }
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                            default:
                                str5 = str2;
                                str6 = str7;
                                c3 = 65535;
                                break;
                        }
                        C1370s c1370s = InterfaceC1355o.gold;
                        c4 = c3;
                        String str9 = Constants.SEPARATOR_COMMA;
                        TreeMap treeMap = this.alpha;
                        String str10 = str5;
                        AbstractC1328i abstractC1328i = null;
                        switch (c4) {
                            case 0:
                                C1308e c1308e = (C1308e) zzd();
                                if (!arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        InterfaceC1355o alpha = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) it.next());
                                        if (!(alpha instanceof C1318g)) {
                                            int november = c1308e.november();
                                            if (alpha instanceof C1308e) {
                                                C1308e c1308e2 = (C1308e) alpha;
                                                Iterator romeo = c1308e2.romeo();
                                                while (romeo.hasNext()) {
                                                    Integer num = (Integer) romeo.next();
                                                    c1308e.uniform(num.intValue() + november, c1308e2.oscar(num.intValue()));
                                                }
                                            } else {
                                                c1308e.uniform(november, alpha);
                                            }
                                        } else {
                                            throw new IllegalStateException("Failed evaluation of arguments");
                                        }
                                    }
                                }
                                return c1308e;
                            case 1:
                                AbstractC1295b1.hotel(arrayList, 1, "every");
                                InterfaceC1355o alpha2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                if (alpha2 instanceof C1351n) {
                                    if (november() != 0) {
                                        break;
                                    }
                                    return InterfaceC1355o.jade;
                                }
                                throw new IllegalArgumentException("Callback should be a method");
                            case 2:
                                AbstractC1295b1.hotel(arrayList, 1, str10);
                                InterfaceC1355o alpha3 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                if (alpha3 instanceof C1351n) {
                                    if (treeMap.size() == 0) {
                                        return new C1308e();
                                    }
                                    C1308e c1308e3 = (C1308e) zzd();
                                    C1308e delta = com.bumptech.glide.d.delta(this, iVar, (C1351n) alpha3, null, Boolean.TRUE);
                                    C1308e c1308e4 = new C1308e();
                                    Iterator romeo2 = delta.romeo();
                                    while (romeo2.hasNext()) {
                                        c1308e4.uniform(c1308e4.november(), c1308e3.oscar(((Integer) romeo2.next()).intValue()));
                                    }
                                    return c1308e4;
                                }
                                throw new IllegalArgumentException("Callback should be a method");
                            case 3:
                                AbstractC1295b1.hotel(arrayList, 1, "forEach");
                                InterfaceC1355o alpha4 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                if (alpha4 instanceof C1351n) {
                                    if (treeMap.size() != 0) {
                                        com.bumptech.glide.d.delta(this, iVar, (C1351n) alpha4, null, null);
                                        return c1370s;
                                    }
                                    return c1370s;
                                }
                                throw new IllegalArgumentException("Callback should be a method");
                            case 4:
                                AbstractC1295b1.juliet(2, "indexOf", arrayList);
                                if (!arrayList.isEmpty()) {
                                    interfaceC1355o = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                } else {
                                    interfaceC1355o = c1370s;
                                }
                                if (arrayList.size() > 1) {
                                    double bravo = AbstractC1295b1.bravo(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue());
                                    if (bravo >= november()) {
                                        return new C1323h(Double.valueOf(-1.0d));
                                    }
                                    if (bravo < 0.0d) {
                                        d4 = november() + bravo;
                                    } else {
                                        d4 = bravo;
                                    }
                                } else {
                                    d4 = 0.0d;
                                }
                                Iterator romeo3 = romeo();
                                while (romeo3.hasNext()) {
                                    int intValue = ((Integer) romeo3.next()).intValue();
                                    double d11 = intValue;
                                    if (d11 >= d4 && AbstractC1295b1.lima(oscar(intValue), interfaceC1355o)) {
                                        return new C1323h(Double.valueOf(d11));
                                    }
                                }
                                return new C1323h(Double.valueOf(-1.0d));
                            case 5:
                                AbstractC1295b1.juliet(1, "join", arrayList);
                                if (november() == 0) {
                                    return InterfaceC1355o.lime;
                                }
                                if (!arrayList.isEmpty()) {
                                    InterfaceC1355o alpha5 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                    if (!(alpha5 instanceof C1347m) && !(alpha5 instanceof C1370s)) {
                                        str9 = alpha5.bravo();
                                    } else {
                                        str9 = "";
                                    }
                                }
                                return new r(quebec(str9));
                            case 6:
                                AbstractC1295b1.juliet(2, "lastIndexOf", arrayList);
                                if (!arrayList.isEmpty()) {
                                    interfaceC1355o2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                } else {
                                    interfaceC1355o2 = c1370s;
                                }
                                int november2 = november() - 1;
                                if (arrayList.size() > 1) {
                                    InterfaceC1355o alpha6 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                                    d10 = Double.isNaN(alpha6.alpha().doubleValue()) ? november() - 1 : AbstractC1295b1.bravo(alpha6.alpha().doubleValue());
                                    d9 = 0.0d;
                                    if (d10 < 0.0d) {
                                        d10 += november();
                                    }
                                } else {
                                    d9 = 0.0d;
                                    d10 = november2;
                                }
                                if (d10 < d9) {
                                    return new C1323h(Double.valueOf(-1.0d));
                                }
                                for (int min2 = (int) Math.min(november(), d10); min2 >= 0; min2--) {
                                    if (victor(min2) && AbstractC1295b1.lima(oscar(min2), interfaceC1355o2)) {
                                        return new C1323h(Double.valueOf(min2));
                                    }
                                }
                                return new C1323h(Double.valueOf(-1.0d));
                            case 7:
                                AbstractC1295b1.hotel(arrayList, 1, "map");
                                InterfaceC1355o alpha7 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                if (alpha7 instanceof C1351n) {
                                    if (november() == 0) {
                                        return new C1308e();
                                    }
                                    return com.bumptech.glide.d.delta(this, iVar, (C1351n) alpha7, null, null);
                                }
                                throw new IllegalArgumentException("Callback should be a method");
                            case '\b':
                                AbstractC1295b1.hotel(arrayList, 0, "pop");
                                int november3 = november();
                                if (november3 != 0) {
                                    int i4 = november3 - 1;
                                    InterfaceC1355o oscar = oscar(i4);
                                    tango(i4);
                                    return oscar;
                                }
                                return c1370s;
                            case '\t':
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        uniform(november(), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) it2.next()));
                                    }
                                }
                                return new C1323h(Double.valueOf(november()));
                            case '\n':
                                return com.bumptech.glide.d.echo(this, iVar, arrayList, true);
                            case 11:
                                return com.bumptech.glide.d.echo(this, iVar, arrayList, false);
                            case '\f':
                                AbstractC1295b1.hotel(arrayList, 0, "reverse");
                                int november4 = november();
                                if (november4 != 0) {
                                    for (int i5 = 0; i5 < november4 / 2; i5++) {
                                        if (victor(i5)) {
                                            InterfaceC1355o oscar2 = oscar(i5);
                                            uniform(i5, null);
                                            int i10 = (november4 - 1) - i5;
                                            if (victor(i10)) {
                                                uniform(i5, oscar(i10));
                                            }
                                            uniform(i10, oscar2);
                                        }
                                    }
                                }
                                return this;
                            case '\r':
                                AbstractC1295b1.hotel(arrayList, 0, "shift");
                                if (november() != 0) {
                                    InterfaceC1355o oscar3 = oscar(0);
                                    tango(0);
                                    return oscar3;
                                }
                                return c1370s;
                            case 14:
                                AbstractC1295b1.juliet(2, "slice", arrayList);
                                if (arrayList.isEmpty()) {
                                    return zzd();
                                }
                                double november5 = november();
                                double bravo2 = AbstractC1295b1.bravo(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue());
                                if (bravo2 < 0.0d) {
                                    min = Math.max(bravo2 + november5, 0.0d);
                                } else {
                                    min = Math.min(bravo2, november5);
                                }
                                if (arrayList.size() == 2) {
                                    double bravo3 = AbstractC1295b1.bravo(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue());
                                    if (bravo3 < 0.0d) {
                                        november5 = Math.max(november5 + bravo3, 0.0d);
                                    } else {
                                        november5 = Math.min(november5, bravo3);
                                    }
                                }
                                C1308e c1308e5 = new C1308e();
                                for (int i11 = (int) min; i11 < november5; i11++) {
                                    c1308e5.uniform(c1308e5.november(), oscar(i11));
                                }
                                return c1308e5;
                            case 15:
                                AbstractC1295b1.hotel(arrayList, 1, "some");
                                InterfaceC1355o alpha8 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                if (alpha8 instanceof AbstractC1328i) {
                                    if (november() != 0) {
                                        AbstractC1328i abstractC1328i2 = (AbstractC1328i) alpha8;
                                        Iterator romeo4 = romeo();
                                        while (romeo4.hasNext()) {
                                            int intValue2 = ((Integer) romeo4.next()).intValue();
                                            if (victor(intValue2) && abstractC1328i2.charlie(iVar, Arrays.asList(oscar(intValue2), new C1323h(Double.valueOf(intValue2)), this)).kilo().booleanValue()) {
                                                return InterfaceC1355o.jade;
                                            }
                                        }
                                    }
                                    return InterfaceC1355o.lavender;
                                }
                                throw new IllegalArgumentException("Callback should be a method");
                            case 16:
                                AbstractC1295b1.juliet(1, str3, arrayList);
                                if (november() >= 2) {
                                    ArrayList sierra = sierra();
                                    if (!arrayList.isEmpty()) {
                                        InterfaceC1355o alpha9 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                        if (alpha9 instanceof AbstractC1328i) {
                                            abstractC1328i = (AbstractC1328i) alpha9;
                                        } else {
                                            throw new IllegalArgumentException("Comparator should be a method");
                                        }
                                    }
                                    Collections.sort(sierra, new C1382v(abstractC1328i, iVar));
                                    treeMap.clear();
                                    Iterator it3 = sierra.iterator();
                                    int i12 = 0;
                                    while (it3.hasNext()) {
                                        uniform(i12, (InterfaceC1355o) it3.next());
                                        i12++;
                                    }
                                }
                                return this;
                            case 17:
                                if (arrayList.isEmpty()) {
                                    return new C1308e();
                                }
                                int bravo4 = (int) AbstractC1295b1.bravo(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue());
                                if (bravo4 < 0) {
                                    bravo4 = Math.max(0, november() + bravo4);
                                } else if (bravo4 > november()) {
                                    bravo4 = november();
                                }
                                int november6 = november();
                                C1308e c1308e6 = new C1308e();
                                if (arrayList.size() > 1) {
                                    InterfaceC1355o interfaceC1355o3 = (InterfaceC1355o) arrayList.get(1);
                                    C1378u c1378u = (C1378u) iVar.purple;
                                    int max = Math.max(0, (int) AbstractC1295b1.bravo(c1378u.alpha(iVar, interfaceC1355o3).alpha().doubleValue()));
                                    if (max > 0) {
                                        for (int i13 = bravo4; i13 < Math.min(november6, bravo4 + max); i13++) {
                                            c1308e6.uniform(c1308e6.november(), oscar(bravo4));
                                            tango(bravo4);
                                        }
                                    }
                                    if (arrayList.size() > 2) {
                                        for (int i14 = 2; i14 < arrayList.size(); i14++) {
                                            InterfaceC1355o alpha10 = c1378u.alpha(iVar, (InterfaceC1355o) arrayList.get(i14));
                                            if (!(alpha10 instanceof C1318g)) {
                                                int i15 = (bravo4 + i14) - 2;
                                                if (i15 >= 0) {
                                                    if (i15 >= november()) {
                                                        uniform(i15, alpha10);
                                                    } else {
                                                        for (int intValue3 = ((Integer) treeMap.lastKey()).intValue(); intValue3 >= i15; intValue3--) {
                                                            Integer valueOf = Integer.valueOf(intValue3);
                                                            InterfaceC1355o interfaceC1355o4 = (InterfaceC1355o) treeMap.get(valueOf);
                                                            if (interfaceC1355o4 != null) {
                                                                uniform(intValue3 + 1, interfaceC1355o4);
                                                                treeMap.remove(valueOf);
                                                            }
                                                        }
                                                        uniform(i15, alpha10);
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException(ao.ad.zulu(i15, "Invalid value index: "));
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Failed to parse elements to add");
                                            }
                                        }
                                    }
                                } else {
                                    while (bravo4 < november6) {
                                        c1308e6.uniform(c1308e6.november(), oscar(bravo4));
                                        uniform(bravo4, null);
                                        bravo4++;
                                    }
                                }
                                return c1308e6;
                            case 18:
                                AbstractC1295b1.hotel(arrayList, 0, str6);
                                return new r(quebec(Constants.SEPARATOR_COMMA));
                            case 19:
                                if (!arrayList.isEmpty()) {
                                    C1308e c1308e7 = new C1308e();
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        InterfaceC1355o alpha11 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) it4.next());
                                        if (!(alpha11 instanceof C1318g)) {
                                            c1308e7.uniform(c1308e7.november(), alpha11);
                                        } else {
                                            throw new IllegalStateException("Argument evaluation failed");
                                        }
                                    }
                                    int november7 = c1308e7.november();
                                    Iterator romeo5 = romeo();
                                    while (romeo5.hasNext()) {
                                        Integer num2 = (Integer) romeo5.next();
                                        c1308e7.uniform(num2.intValue() + november7, oscar(num2.intValue()));
                                    }
                                    treeMap.clear();
                                    Iterator romeo6 = c1308e7.romeo();
                                    while (romeo6.hasNext()) {
                                        Integer num3 = (Integer) romeo6.next();
                                        uniform(num3.intValue(), c1308e7.oscar(num3.intValue()));
                                    }
                                }
                                return new C1323h(Double.valueOf(november()));
                            default:
                                throw new IllegalArgumentException("Command not supported");
                        }
                    }
                    str7 = str7;
                } else {
                    str8 = str8;
                }
                str4 = "unshift";
                switch (str.hashCode()) {
                    case -1776922004:
                        break;
                    case -1354795244:
                        break;
                    case -1274492040:
                        break;
                    case -934873754:
                        break;
                    case -895859076:
                        break;
                    case -678635926:
                        break;
                    case -467511597:
                        break;
                    case -277637751:
                        break;
                    case 107868:
                        break;
                    case 111185:
                        break;
                    case 3267882:
                        break;
                    case 3452698:
                        break;
                    case 3536116:
                        break;
                    case 3536286:
                        break;
                    case 96891675:
                        break;
                    case 109407362:
                        break;
                    case 109526418:
                        break;
                    case 965561430:
                        break;
                    case 1099846370:
                        break;
                    case 1943291465:
                        break;
                }
                C1370s c1370s2 = InterfaceC1355o.gold;
                c4 = c3;
                String str92 = Constants.SEPARATOR_COMMA;
                TreeMap treeMap2 = this.alpha;
                String str102 = str5;
                AbstractC1328i abstractC1328i3 = null;
                switch (c4) {
                }
            }
        }
        obj = "reduce";
        str4 = "unshift";
        switch (str.hashCode()) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
        C1370s c1370s22 = InterfaceC1355o.gold;
        c4 = c3;
        String str922 = Constants.SEPARATOR_COMMA;
        TreeMap treeMap22 = this.alpha;
        String str1022 = str5;
        AbstractC1328i abstractC1328i32 = null;
        switch (c4) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final void india(String str, InterfaceC1355o interfaceC1355o) {
        TreeMap treeMap = this.purple;
        if (interfaceC1355o == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC1355o);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1363q(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Boolean kilo() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final Iterator lima() {
        return new C1303d(this.alpha.keySet().iterator(), this.purple.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1338k
    public final InterfaceC1355o mike(String str) {
        InterfaceC1355o interfaceC1355o;
        if ("length".equals(str)) {
            return new C1323h(Double.valueOf(november()));
        }
        if (delta(str) && (interfaceC1355o = (InterfaceC1355o) this.purple.get(str)) != null) {
            return interfaceC1355o;
        }
        return InterfaceC1355o.gold;
    }

    public final int november() {
        TreeMap treeMap = this.alpha;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final InterfaceC1355o oscar(int i4) {
        InterfaceC1355o interfaceC1355o;
        if (i4 < november()) {
            if (victor(i4) && (interfaceC1355o = (InterfaceC1355o) this.alpha.get(Integer.valueOf(i4))) != null) {
                return interfaceC1355o;
            }
            return InterfaceC1355o.gold;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String quebec(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.alpha.isEmpty()) {
            int i4 = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i4 >= november()) {
                    break;
                }
                InterfaceC1355o oscar = oscar(i4);
                sb2.append(str2);
                if (!(oscar instanceof C1370s) && !(oscar instanceof C1347m)) {
                    sb2.append(oscar.bravo());
                }
                i4++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final Iterator romeo() {
        return this.alpha.keySet().iterator();
    }

    public final ArrayList sierra() {
        ArrayList arrayList = new ArrayList(november());
        for (int i4 = 0; i4 < november(); i4++) {
            arrayList.add(oscar(i4));
        }
        return arrayList;
    }

    public final void tango(int i4) {
        TreeMap treeMap = this.alpha;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i4 <= intValue && i4 >= 0) {
            treeMap.remove(Integer.valueOf(i4));
            if (i4 == intValue) {
                int i5 = i4 - 1;
                Integer valueOf = Integer.valueOf(i5);
                if (!treeMap.containsKey(valueOf) && i5 >= 0) {
                    treeMap.put(valueOf, InterfaceC1355o.gold);
                    return;
                }
                return;
            }
            while (true) {
                i4++;
                if (i4 <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i4);
                    InterfaceC1355o interfaceC1355o = (InterfaceC1355o) treeMap.get(valueOf2);
                    if (interfaceC1355o != null) {
                        treeMap.put(Integer.valueOf(i4 - 1), interfaceC1355o);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return quebec(Constants.SEPARATOR_COMMA);
    }

    public final void uniform(int i4, InterfaceC1355o interfaceC1355o) {
        if (i4 <= 32468) {
            if (i4 >= 0) {
                TreeMap treeMap = this.alpha;
                if (interfaceC1355o == null) {
                    treeMap.remove(Integer.valueOf(i4));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i4), interfaceC1355o);
                    return;
                }
            }
            throw new IndexOutOfBoundsException(ao.ad.zulu(i4, "Out of bounds index: "));
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean victor(int i4) {
        if (i4 >= 0) {
            TreeMap treeMap = this.alpha;
            if (i4 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i4));
            }
        }
        throw new IndexOutOfBoundsException(ao.ad.zulu(i4, "Out of bounds index: "));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        C1308e c1308e = new C1308e();
        for (Map.Entry entry : this.alpha.entrySet()) {
            boolean z2 = entry.getValue() instanceof InterfaceC1338k;
            TreeMap treeMap = c1308e.alpha;
            if (z2) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC1355o) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC1355o) entry.getValue()).zzd());
            }
        }
        return c1308e;
    }

    public C1308e(List list) {
        this();
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                uniform(i4, (InterfaceC1355o) list.get(i4));
            }
        }
    }
}
