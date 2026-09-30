package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Y1 {
    public static final C1384v1 alpha;

    static {
        U1 u12 = U1.charlie;
        alpha = new C1384v1(6);
    }

    public static void alpha(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof C1396y1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                C1396y1 c1396y1 = (C1396y1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < c1396y1.red; i11++) {
                        int bravo = c1396y1.bravo(i11);
                        i10 += C1365q1.romeo((bravo >> 31) ^ (bravo + bravo));
                    }
                    c1365q1.november(i10);
                    while (i5 < c1396y1.red) {
                        int bravo2 = c1396y1.bravo(i5);
                        c1365q1.november((bravo2 >> 31) ^ (bravo2 + bravo2));
                        i5++;
                    }
                    return;
                }
                while (i5 < c1396y1.red) {
                    int bravo3 = c1396y1.bravo(i5);
                    c1365q1.mike(i4, (bravo3 >> 31) ^ (bravo3 + bravo3));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += C1365q1.romeo((intValue >> 31) ^ (intValue + intValue));
                }
                c1365q1.november(i12);
                while (i5 < list.size()) {
                    int intValue2 = ((Integer) list.get(i5)).intValue();
                    c1365q1.november((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                c1365q1.mike(i4, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
        }
    }

    public static void bravo(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof I1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                I1 i12 = (I1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < i12.red; i11++) {
                        long bravo = i12.bravo(i11);
                        i10 += C1365q1.bravo((bravo >> 63) ^ (bravo + bravo));
                    }
                    c1365q1.november(i10);
                    while (i5 < i12.red) {
                        long bravo2 = i12.bravo(i5);
                        c1365q1.papa((bravo2 >> 63) ^ (bravo2 + bravo2));
                        i5++;
                    }
                    return;
                }
                while (i5 < i12.red) {
                    long bravo3 = i12.bravo(i5);
                    c1365q1.oscar(i4, (bravo3 >> 63) ^ (bravo3 + bravo3));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += C1365q1.bravo((longValue >> 63) ^ (longValue + longValue));
                }
                c1365q1.november(i13);
                while (i5 < list.size()) {
                    long longValue2 = ((Long) list.get(i5)).longValue();
                    c1365q1.papa((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                c1365q1.oscar(i4, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
        }
    }

    public static void charlie(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof C1396y1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                C1396y1 c1396y1 = (C1396y1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < c1396y1.red; i11++) {
                        i10 += C1365q1.romeo(c1396y1.bravo(i11));
                    }
                    c1365q1.november(i10);
                    while (i5 < c1396y1.red) {
                        c1365q1.november(c1396y1.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < c1396y1.red) {
                    c1365q1.mike(i4, c1396y1.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += C1365q1.romeo(((Integer) list.get(i13)).intValue());
                }
                c1365q1.november(i12);
                while (i5 < list.size()) {
                    c1365q1.november(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.mike(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void delta(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof I1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                I1 i12 = (I1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < i12.red; i11++) {
                        i10 += C1365q1.bravo(i12.bravo(i11));
                    }
                    c1365q1.november(i10);
                    while (i5 < i12.red) {
                        c1365q1.papa(i12.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < i12.red) {
                    c1365q1.oscar(i4, i12.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += C1365q1.bravo(((Long) list.get(i14)).longValue());
                }
                c1365q1.november(i13);
                while (i5 < list.size()) {
                    c1365q1.papa(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.oscar(i4, ((Long) list.get(i5)).longValue());
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
        if (list instanceof C1396y1) {
            C1396y1 c1396y1 = (C1396y1) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1365q1.bravo(c1396y1.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1365q1.bravo(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int golf(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1365q1.romeo(i4 << 3) + 4) * size;
    }

    public static int hotel(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1365q1.romeo(i4 << 3) + 8) * size;
    }

    public static int india(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1396y1) {
            C1396y1 c1396y1 = (C1396y1) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1365q1.bravo(c1396y1.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1365q1.bravo(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int juliet(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I1) {
            I1 i12 = (I1) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1365q1.bravo(i12.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1365q1.bravo(((Long) list.get(i4)).longValue());
            i4++;
        }
        return i10;
    }

    public static int kilo(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1396y1) {
            C1396y1 c1396y1 = (C1396y1) list;
            int i5 = 0;
            while (i4 < size) {
                int bravo = c1396y1.bravo(i4);
                i5 += C1365q1.romeo((bravo >> 31) ^ (bravo + bravo));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i10 += C1365q1.romeo((intValue >> 31) ^ (intValue + intValue));
            i4++;
        }
        return i10;
    }

    public static int lima(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I1) {
            I1 i12 = (I1) list;
            int i5 = 0;
            while (i4 < size) {
                long bravo = i12.bravo(i4);
                i5 += C1365q1.bravo((bravo >> 63) ^ (bravo + bravo));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            long longValue = ((Long) list.get(i4)).longValue();
            i10 += C1365q1.bravo((longValue >> 63) ^ (longValue + longValue));
            i4++;
        }
        return i10;
    }

    public static int mike(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1396y1) {
            C1396y1 c1396y1 = (C1396y1) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1365q1.romeo(c1396y1.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1365q1.romeo(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int november(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I1) {
            I1 i12 = (I1) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1365q1.bravo(i12.bravo(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1365q1.bravo(((Long) list.get(i4)).longValue());
            i4++;
        }
        return i10;
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
            AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) obj;
            Z1 z12 = abstractC1392x1.zzc;
            obj3 = z12;
            if (z12 == Z1.foxtrot) {
                Z1 bravo = Z1.bravo();
                abstractC1392x1.zzc = bravo;
                obj3 = bravo;
            }
        }
        ((Z1) obj3).charlie(i4 << 3, Long.valueOf(i5));
        return obj3;
    }

    public static void papa(Object obj, Object obj2) {
        AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) obj;
        Z1 z12 = abstractC1392x1.zzc;
        Z1 z13 = ((AbstractC1392x1) obj2).zzc;
        Z1 z14 = Z1.foxtrot;
        if (!z14.equals(z13)) {
            if (z14.equals(z12)) {
                int i4 = z12.alpha + z13.alpha;
                int[] copyOf = Arrays.copyOf(z12.bravo, i4);
                System.arraycopy(z13.bravo, 0, copyOf, z12.alpha, z13.alpha);
                Object[] copyOf2 = Arrays.copyOf(z12.charlie, i4);
                System.arraycopy(z13.charlie, 0, copyOf2, z12.alpha, z13.alpha);
                z12 = new Z1(i4, copyOf, copyOf2, true);
            } else {
                z12.getClass();
                if (!z13.equals(z14)) {
                    if (z12.echo) {
                        int i5 = z12.alpha + z13.alpha;
                        z12.echo(i5);
                        System.arraycopy(z13.bravo, 0, z12.bravo, z12.alpha, z13.alpha);
                        System.arraycopy(z13.charlie, 0, z12.charlie, z12.alpha, z13.alpha);
                        z12.alpha = i5;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC1392x1.zzc = z12;
    }

    public static void quebec(int i4, List list, J1 j12, boolean z2) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list != null && !list.isEmpty()) {
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z2) {
                c1365q1.lima(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).getClass();
                    i10++;
                }
                c1365q1.november(i10);
                while (i5 < list.size()) {
                    byte booleanValue = ((Boolean) list.get(i5)).booleanValue();
                    int i12 = c1365q1.golf;
                    try {
                        int i13 = i12 + 1;
                        try {
                            c1365q1.echo[i12] = booleanValue;
                            c1365q1.golf = i13;
                            i5++;
                        } catch (IndexOutOfBoundsException e) {
                            indexOutOfBoundsException2 = e;
                            i12 = i13;
                            throw new zzli(i12, c1365q1.foxtrot, 1, indexOutOfBoundsException2);
                        }
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException2 = e4;
                    }
                }
                return;
            }
            while (i5 < list.size()) {
                byte booleanValue2 = ((Boolean) list.get(i5)).booleanValue();
                c1365q1.november(i4 << 3);
                int i14 = c1365q1.golf;
                try {
                    int i15 = i14 + 1;
                    try {
                        c1365q1.echo[i14] = booleanValue2;
                        c1365q1.golf = i15;
                        i5++;
                    } catch (IndexOutOfBoundsException e5) {
                        indexOutOfBoundsException = e5;
                        i14 = i15;
                        throw new zzli(i14, c1365q1.foxtrot, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
            }
        }
    }

    public static void romeo(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z2) {
                c1365q1.lima(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).getClass();
                    i10 += 8;
                }
                c1365q1.november(i10);
                while (i5 < list.size()) {
                    c1365q1.hotel(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.golf(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
        }
    }

    public static void sierra(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof C1396y1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                C1396y1 c1396y1 = (C1396y1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < c1396y1.red; i11++) {
                        i10 += C1365q1.bravo(c1396y1.bravo(i11));
                    }
                    c1365q1.november(i10);
                    while (i5 < c1396y1.red) {
                        c1365q1.juliet(c1396y1.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < c1396y1.red) {
                    c1365q1.india(i4, c1396y1.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += C1365q1.bravo(((Integer) list.get(i13)).intValue());
                }
                c1365q1.november(i12);
                while (i5 < list.size()) {
                    c1365q1.juliet(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.india(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void tango(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof C1396y1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                C1396y1 c1396y1 = (C1396y1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < c1396y1.red; i11++) {
                        c1396y1.bravo(i11);
                        i10 += 4;
                    }
                    c1365q1.november(i10);
                    while (i5 < c1396y1.red) {
                        c1365q1.foxtrot(c1396y1.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < c1396y1.red) {
                    c1365q1.echo(i4, c1396y1.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    i12 += 4;
                }
                c1365q1.november(i12);
                while (i5 < list.size()) {
                    c1365q1.foxtrot(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.echo(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void uniform(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof I1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                I1 i12 = (I1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < i12.red; i11++) {
                        i12.bravo(i11);
                        i10 += 8;
                    }
                    c1365q1.november(i10);
                    while (i5 < i12.red) {
                        c1365q1.hotel(i12.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < i12.red) {
                    c1365q1.golf(i4, i12.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                c1365q1.november(i13);
                while (i5 < list.size()) {
                    c1365q1.hotel(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.golf(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void victor(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z2) {
                c1365q1.lima(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).getClass();
                    i10 += 4;
                }
                c1365q1.november(i10);
                while (i5 < list.size()) {
                    c1365q1.foxtrot(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.echo(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
        }
    }

    public static void whiskey(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof C1396y1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                C1396y1 c1396y1 = (C1396y1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < c1396y1.red; i11++) {
                        i10 += C1365q1.bravo(c1396y1.bravo(i11));
                    }
                    c1365q1.november(i10);
                    while (i5 < c1396y1.red) {
                        c1365q1.juliet(c1396y1.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < c1396y1.red) {
                    c1365q1.india(i4, c1396y1.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += C1365q1.bravo(((Integer) list.get(i13)).intValue());
                }
                c1365q1.november(i12);
                while (i5 < list.size()) {
                    c1365q1.juliet(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.india(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void xray(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof I1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                I1 i12 = (I1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < i12.red; i11++) {
                        i10 += C1365q1.bravo(i12.bravo(i11));
                    }
                    c1365q1.november(i10);
                    while (i5 < i12.red) {
                        c1365q1.papa(i12.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < i12.red) {
                    c1365q1.oscar(i4, i12.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += C1365q1.bravo(((Long) list.get(i14)).longValue());
                }
                c1365q1.november(i13);
                while (i5 < list.size()) {
                    c1365q1.papa(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.oscar(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void yankee(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof C1396y1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                C1396y1 c1396y1 = (C1396y1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < c1396y1.red; i11++) {
                        c1396y1.bravo(i11);
                        i10 += 4;
                    }
                    c1365q1.november(i10);
                    while (i5 < c1396y1.red) {
                        c1365q1.foxtrot(c1396y1.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < c1396y1.red) {
                    c1365q1.echo(i4, c1396y1.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    i12 += 4;
                }
                c1365q1.november(i12);
                while (i5 < list.size()) {
                    c1365q1.foxtrot(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.echo(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void zulu(int i4, List list, J1 j12, boolean z2) {
        if (list != null && !list.isEmpty()) {
            j12.getClass();
            boolean z10 = list instanceof I1;
            C1365q1 c1365q1 = (C1365q1) j12.alpha;
            int i5 = 0;
            if (z10) {
                I1 i12 = (I1) list;
                if (z2) {
                    c1365q1.lima(i4, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < i12.red; i11++) {
                        i12.bravo(i11);
                        i10 += 8;
                    }
                    c1365q1.november(i10);
                    while (i5 < i12.red) {
                        c1365q1.hotel(i12.bravo(i5));
                        i5++;
                    }
                    return;
                }
                while (i5 < i12.red) {
                    c1365q1.golf(i4, i12.bravo(i5));
                    i5++;
                }
                return;
            }
            if (z2) {
                c1365q1.lima(i4, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                c1365q1.november(i13);
                while (i5 < list.size()) {
                    c1365q1.hotel(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1365q1.golf(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }
}
