package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class N {
    public static final ah alpha;

    static {
        H h4 = H.charlie;
        alpha = new ah(6);
    }

    public static void alpha(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof an;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                an anVar = (an) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < anVar.red; i11++) {
                        int bravo = anVar.bravo(i11);
                        i10 += aa.romeo((bravo >> 31) ^ (bravo + bravo));
                    }
                    aaVar.bronze(i10);
                    while (i5 < anVar.red) {
                        int bravo2 = anVar.bravo(i5);
                        aaVar.bronze((bravo2 >> 31) ^ (bravo2 + bravo2));
                        i5++;
                    }
                    return;
                }
                while (i5 < anVar.red) {
                    int bravo3 = anVar.bravo(i5);
                    aaVar.blue(i4, (bravo3 >> 31) ^ (bravo3 + bravo3));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += aa.romeo((intValue >> 31) ^ (intValue + intValue));
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    int intValue2 = ((Integer) list.get(i5)).intValue();
                    aaVar.bronze((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                aaVar.blue(i4, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
        }
    }

    public static void amber(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    i10 += 8;
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    aaVar.zulu(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.yankee(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void bravo(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += aa.sierra((longValue >> 63) ^ (longValue + longValue));
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    long longValue2 = ((Long) list.get(i5)).longValue();
                    aaVar.crimson((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                aaVar.coral(i4, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
        }
    }

    public static void charlie(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof an;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                an anVar = (an) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < anVar.red; i11++) {
                        i10 += aa.romeo(anVar.bravo(i11));
                    }
                    aaVar.bronze(i10);
                    while (i5 < anVar.red) {
                        aaVar.bronze(anVar.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < anVar.red) {
                    aaVar.blue(i4, anVar.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += aa.romeo(((Integer) list.get(i13)).intValue());
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    aaVar.bronze(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.blue(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void delta(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += aa.sierra(((Long) list.get(i11)).longValue());
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    aaVar.crimson(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.coral(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static boolean echo(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int foxtrot(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof an) {
            an anVar = (an) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += aa.sierra(anVar.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += aa.sierra(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int golf(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (aa.romeo(i4 << 3) + 4) * size;
    }

    public static int hotel(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (aa.romeo(i4 << 3) + 8) * size;
    }

    public static int india(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof an) {
            an anVar = (an) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += aa.sierra(anVar.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += aa.sierra(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int juliet(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += aa.sierra(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int kilo(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof an) {
            an anVar = (an) list;
            int i5 = 0;
            while (i4 < size) {
                int bravo = anVar.bravo(i4);
                i5 += aa.romeo((bravo >> 31) ^ (bravo + bravo));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i10 += aa.romeo((intValue >> 31) ^ (intValue + intValue));
            i4++;
        }
        return i10;
    }

    public static int lima(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += aa.sierra((longValue >> 63) ^ (longValue + longValue));
        }
        return i4;
    }

    public static int mike(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof an) {
            an anVar = (an) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += aa.romeo(anVar.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += aa.romeo(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int november(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += aa.sierra(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r4 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object oscar(int i4, int i5, Object obj, Object obj2) {
        Object obj3;
        if (obj2 == null) {
            am amVar = (am) obj;
            Q q4 = amVar.zzc;
            obj3 = q4;
            if (q4 == Q.foxtrot) {
                Q bravo = Q.bravo();
                amVar.zzc = bravo;
                obj3 = bravo;
            }
        }
        ((Q) obj3).charlie(i4 << 3, Long.valueOf(i5));
        return obj3;
    }

    public static void papa(Object obj, Object obj2) {
        ae aeVar = ((aj) obj2).zzb;
        if (!aeVar.alpha.isEmpty()) {
            aj ajVar = (aj) obj;
            ae aeVar2 = ajVar.zzb;
            if (aeVar2.bravo) {
                ajVar.zzb = aeVar2.clone();
            }
            ae aeVar3 = ajVar.zzb;
            aeVar3.getClass();
            O o5 = aeVar.alpha;
            int i4 = o5.purple;
            for (int i5 = 0; i5 < i4; i5++) {
                aeVar3.golf(o5.charlie(i5));
            }
            Iterator it = o5.alpha().iterator();
            while (it.hasNext()) {
                aeVar3.golf((Map.Entry) it.next());
            }
        }
    }

    public static void quebec(Object obj, Object obj2) {
        am amVar = (am) obj;
        Q q4 = amVar.zzc;
        Q q5 = ((am) obj2).zzc;
        Q q10 = Q.foxtrot;
        if (!q10.equals(q5)) {
            if (q10.equals(q4)) {
                int i4 = q4.alpha + q5.alpha;
                int[] copyOf = Arrays.copyOf(q4.bravo, i4);
                System.arraycopy(q5.bravo, 0, copyOf, q4.alpha, q5.alpha);
                Object[] copyOf2 = Arrays.copyOf(q4.charlie, i4);
                System.arraycopy(q5.charlie, 0, copyOf2, q4.alpha, q5.alpha);
                q4 = new Q(i4, copyOf, copyOf2, true);
            } else {
                q4.getClass();
                if (!q5.equals(q10)) {
                    if (q4.echo) {
                        int i5 = q4.alpha + q5.alpha;
                        q4.echo(i5);
                        System.arraycopy(q5.bravo, 0, q4.bravo, q4.alpha, q5.alpha);
                        System.arraycopy(q5.charlie, 0, q4.charlie, q4.alpha, q5.alpha);
                        q4.alpha = i5;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        amVar.zzc = q4;
    }

    public static void romeo(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).getClass();
                    i10++;
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    aaVar.tango(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                aaVar.bronze(i4 << 3);
                aaVar.tango(booleanValue ? (byte) 1 : (byte) 0);
                i5++;
            }
        }
    }

    public static void sierra(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).getClass();
                    i10 += 8;
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    aaVar.zulu(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.yankee(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
        }
    }

    public static void tango(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof an;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                an anVar = (an) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < anVar.red; i11++) {
                        i10 += aa.sierra(anVar.bravo(i11));
                    }
                    aaVar.bronze(i10);
                    while (i5 < anVar.red) {
                        aaVar.azure(anVar.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < anVar.red) {
                    aaVar.amber(i4, anVar.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += aa.sierra(((Integer) list.get(i13)).intValue());
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    aaVar.azure(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.amber(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void uniform(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof an;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                an anVar = (an) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < anVar.red; i11++) {
                        anVar.bravo(i11);
                        i10 += 4;
                    }
                    aaVar.bronze(i10);
                    while (i5 < anVar.red) {
                        aaVar.xray(anVar.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < anVar.red) {
                    aaVar.whiskey(i4, anVar.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    i12 += 4;
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    aaVar.xray(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.whiskey(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void victor(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    i10 += 8;
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    aaVar.zulu(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.yankee(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void whiskey(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof ag;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                ag agVar = (ag) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < agVar.red; i11++) {
                        agVar.delta(i11);
                        float f5 = agVar.purple[i11];
                        i10 += 4;
                    }
                    aaVar.bronze(i10);
                    while (i5 < agVar.red) {
                        agVar.delta(i5);
                        aaVar.xray(Float.floatToRawIntBits(agVar.purple[i5]));
                        i5++;
                    }
                    return;
                }
                while (i5 < agVar.red) {
                    agVar.delta(i5);
                    aaVar.whiskey(i4, Float.floatToRawIntBits(agVar.purple[i5]));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).getClass();
                    i12 += 4;
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    aaVar.xray(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.whiskey(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
        }
    }

    public static void xray(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof an;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                an anVar = (an) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < anVar.red; i11++) {
                        i10 += aa.sierra(anVar.bravo(i11));
                    }
                    aaVar.bronze(i10);
                    while (i5 < anVar.red) {
                        aaVar.azure(anVar.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < anVar.red) {
                    aaVar.amber(i4, anVar.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += aa.sierra(((Integer) list.get(i13)).intValue());
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    aaVar.azure(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.amber(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void yankee(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            aa aaVar = (aa) axVar.alpha;
            int i5 = 0;
            if (z2) {
                aaVar.black(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += aa.sierra(((Long) list.get(i11)).longValue());
                }
                aaVar.bronze(i10);
                while (i5 < list.size()) {
                    aaVar.crimson(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.coral(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void zulu(int i4, List list, ax axVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            axVar.getClass();
            boolean z10 = list instanceof an;
            int i5 = 0;
            aa aaVar = (aa) axVar.alpha;
            if (z10) {
                an anVar = (an) list;
                if (z2) {
                    aaVar.black(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < anVar.red; i11++) {
                        anVar.bravo(i11);
                        i10 += 4;
                    }
                    aaVar.bronze(i10);
                    while (i5 < anVar.red) {
                        aaVar.xray(anVar.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < anVar.red) {
                    aaVar.whiskey(i4, anVar.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                aaVar.black(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    i12 += 4;
                }
                aaVar.bronze(i12);
                while (i5 < list.size()) {
                    aaVar.xray(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                aaVar.whiskey(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }
}
