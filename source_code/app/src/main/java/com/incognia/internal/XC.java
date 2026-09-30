package com.incognia.internal;

import A0.z;
import fe.C1713e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class XC {
    public static String b(String str, String[][] strArr) {
        int collectionSizeOrDefault;
        boolean z2;
        int i4;
        int i5;
        CharSequence charSequence;
        int i10;
        boolean z10;
        int i11;
        Integer num;
        int i12;
        int i13;
        int i14 = 0;
        String[] strArr2 = strArr[0];
        Intrinsics.echo(strArr2, "<this>");
        C1713e c1713e = new C1713e(0, strArr2.length - 1, 1);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(c1713e, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i15 = c1713e.red;
        int i16 = c1713e.purple;
        if (i15 <= 0 ? i16 <= 0 : i16 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i4 = 0;
        } else {
            i4 = i16;
        }
        while (z2) {
            if (i4 == i16) {
                if (z2) {
                    z2 = false;
                    i10 = i4;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                i10 = i4 + i15;
            }
            if (strArr.length == 0) {
                num = null;
            } else {
                Integer valueOf = Integer.valueOf(strArr[0][i4].length());
                C1713e c1713e2 = new C1713e(1, strArr.length - 1, 1);
                int i17 = c1713e2.red;
                int i18 = c1713e2.purple;
                if (i17 <= 0 ? 1 >= i18 : 1 <= i18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = i18;
                }
                while (z10) {
                    if (i11 == i18) {
                        if (z10) {
                            z10 = false;
                            i12 = i11;
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        i12 = i11 + i17;
                    }
                    Integer valueOf2 = Integer.valueOf(strArr[i11][i4].length());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                    i11 = i12;
                }
                num = valueOf;
            }
            if (num != null) {
                i13 = num.intValue();
            } else {
                i13 = 0;
            }
            arrayList.add(Integer.valueOf(i13));
            i4 = i10;
        }
        Iterator it = arrayList.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            i19 += ((Number) it.next()).intValue();
        }
        int foxtrot = z.foxtrot(strArr[0].length, 2, 2, i19);
        String mike = kotlin.text.r.mike(foxtrot, "═");
        StringBuilder sb2 = new StringBuilder(" \n");
        sb2.append(String.format("╔%s╗\n", Arrays.copyOf(new Object[]{mike}, 1)));
        sb2.append("║ ");
        int length = (foxtrot - 2) - str.length();
        int i20 = length / 2;
        sb2.append(kotlin.text.r.mike(i20, " ") + str + kotlin.text.r.mike(length - i20, " "));
        sb2.append(" ║\n");
        sb2.append(String.format("╠%s╣\n", Arrays.copyOf(new Object[]{mike}, 1)));
        int length2 = strArr.length;
        int i21 = 0;
        while (i21 < length2) {
            sb2.append("║ ");
            int length3 = strArr[i21].length;
            int i22 = i14;
            while (i22 < length3) {
                String str2 = strArr[i21][i22];
                int intValue = ((Number) arrayList.get(i22)).intValue();
                Intrinsics.echo(str2, "<this>");
                if (intValue >= 0) {
                    if (intValue <= str2.length()) {
                        charSequence = str2.subSequence(i14, str2.length());
                        i5 = i14;
                    } else {
                        StringBuilder sb3 = new StringBuilder(intValue);
                        sb3.append((CharSequence) str2);
                        int length4 = intValue - str2.length();
                        if (1 <= length4) {
                            int i23 = 1;
                            i5 = i14;
                            while (true) {
                                sb3.append(' ');
                                if (i23 == length4) {
                                    break;
                                }
                                i23++;
                            }
                        } else {
                            i5 = i14;
                        }
                        charSequence = sb3;
                    }
                    sb2.append(charSequence.toString());
                    sb2.append(" ║ ");
                    i22++;
                    i14 = i5;
                } else {
                    throw new IllegalArgumentException(av.q.delta(intValue, "Desired length ", " is less than zero."));
                }
            }
            sb2.delete(sb2.length() - 3, sb2.length());
            sb2.append(" ║\n");
            i21++;
            i14 = i14;
        }
        Object[] objArr = new Object[1];
        objArr[i14] = mike;
        sb2.append(String.format("╚%s╝\n", Arrays.copyOf(objArr, 1)));
        return sb2.toString();
    }
}
