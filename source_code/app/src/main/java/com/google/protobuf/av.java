package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class av {
    public static final Class alpha;
    public static final B bravo;
    public static final D charlie;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.protobuf.D] */
    static {
        Class<?> cls;
        Class<?> cls2;
        B b2 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        alpha = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                b2 = (B) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        bravo = b2;
        charlie = new Object();
    }

    public static int alpha(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1514q) {
            C1514q c1514q = (C1514q) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1503f.foxtrot(c1514q.hotel(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1503f.foxtrot(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int bravo(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1503f.hotel(i4) + 4) * size;
    }

    public static int charlie(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1503f.hotel(i4) + 8) * size;
    }

    public static int delta(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1514q) {
            C1514q c1514q = (C1514q) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1503f.foxtrot(c1514q.hotel(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1503f.foxtrot(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int echo(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1503f.juliet(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int foxtrot(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1514q) {
            C1514q c1514q = (C1514q) list;
            int i5 = 0;
            while (i4 < size) {
                int hotel = c1514q.hotel(i4);
                i5 += C1503f.india((hotel >> 31) ^ (hotel << 1));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i10 += C1503f.india((intValue >> 31) ^ (intValue << 1));
            i4++;
        }
        return i10;
    }

    public static int golf(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C1503f.juliet((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    public static int hotel(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1514q) {
            C1514q c1514q = (C1514q) list;
            int i5 = 0;
            while (i4 < size) {
                i5 += C1503f.india(c1514q.hotel(i4));
                i4++;
            }
            return i5;
        }
        int i10 = 0;
        while (i4 < size) {
            i10 += C1503f.india(((Integer) list.get(i4)).intValue());
            i4++;
        }
        return i10;
    }

    public static int india(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1503f.juliet(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static void juliet(B b2, Object obj, Object obj2) {
        ((D) b2).getClass();
        AbstractC1513p abstractC1513p = (AbstractC1513p) obj;
        C c3 = abstractC1513p.unknownFields;
        C c4 = ((AbstractC1513p) obj2).unknownFields;
        C c10 = C.foxtrot;
        if (!c10.equals(c4)) {
            if (c10.equals(c3)) {
                int i4 = c3.alpha + c4.alpha;
                int[] copyOf = Arrays.copyOf(c3.bravo, i4);
                System.arraycopy(c4.bravo, 0, copyOf, c3.alpha, c4.alpha);
                Object[] copyOf2 = Arrays.copyOf(c3.charlie, i4);
                System.arraycopy(c4.charlie, 0, copyOf2, c3.alpha, c4.alpha);
                c3 = new C(i4, copyOf, copyOf2, true);
            } else {
                c3.getClass();
                if (!c4.equals(c10)) {
                    if (c3.echo) {
                        int i5 = c3.alpha;
                        int i10 = c4.alpha + i5;
                        int[] iArr = c3.bravo;
                        if (i10 > iArr.length) {
                            int i11 = (i5 / 2) + i5;
                            if (i11 < i10) {
                                i11 = i10;
                            }
                            if (i11 < 8) {
                                i11 = 8;
                            }
                            c3.bravo = Arrays.copyOf(iArr, i11);
                            c3.charlie = Arrays.copyOf(c3.charlie, i11);
                        }
                        System.arraycopy(c4.bravo, 0, c3.bravo, c3.alpha, c4.alpha);
                        System.arraycopy(c4.charlie, 0, c3.charlie, c3.alpha, c4.alpha);
                        c3.alpha = i10;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC1513p.unknownFields = c3;
    }

    public static boolean kilo(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void lima(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            if (z2) {
                c1503f.tango(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Boolean) list.get(i10)).getClass();
                    Logger logger = C1503f.golf;
                    i5++;
                }
                c1503f.uniform(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1503f.kilo(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                boolean booleanValue = ((Boolean) list.get(i12)).booleanValue();
                c1503f.tango(i4, 0);
                c1503f.kilo(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void mike(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).getClass();
                    Logger logger = C1503f.golf;
                    i10 += 8;
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.quebec(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                c1503f.getClass();
                c1503f.papa(i4, Double.doubleToRawLongBits(doubleValue));
                i5++;
            }
        }
    }

    public static void november(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            if (z2) {
                c1503f.tango(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i5 += C1503f.foxtrot(((Integer) list.get(i10)).intValue());
                }
                c1503f.uniform(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1503f.romeo(((Integer) list.get(i11)).intValue());
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                c1503f.tango(i4, 0);
                c1503f.romeo(intValue);
            }
        }
    }

    public static void oscar(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C1503f.golf;
                    i10 += 4;
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.oscar(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1503f.november(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void papa(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C1503f.golf;
                    i10 += 8;
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.quebec(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1503f.papa(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void quebec(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).getClass();
                    Logger logger = C1503f.golf;
                    i10 += 4;
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.oscar(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                c1503f.getClass();
                c1503f.november(i4, Float.floatToRawIntBits(floatValue));
                i5++;
            }
        }
    }

    public static void romeo(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            if (z2) {
                c1503f.tango(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i5 += C1503f.foxtrot(((Integer) list.get(i10)).intValue());
                }
                c1503f.uniform(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1503f.romeo(((Integer) list.get(i11)).intValue());
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                c1503f.tango(i4, 0);
                c1503f.romeo(intValue);
            }
        }
    }

    public static void sierra(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1503f.juliet(((Long) list.get(i11)).longValue());
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.whiskey(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1503f.victor(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void tango(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C1503f.golf;
                    i10 += 4;
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.oscar(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1503f.november(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void uniform(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C1503f.golf;
                    i10 += 8;
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.quebec(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1503f.papa(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void victor(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            if (z2) {
                c1503f.tango(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i5 += C1503f.india((intValue >> 31) ^ (intValue << 1));
                }
                c1503f.uniform(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    c1503f.uniform((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue3 = ((Integer) list.get(i12)).intValue();
                c1503f.tango(i4, 0);
                c1503f.uniform((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void whiskey(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += C1503f.juliet((longValue >> 63) ^ (longValue << 1));
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    long longValue2 = ((Long) list.get(i5)).longValue();
                    c1503f.whiskey((longValue2 >> 63) ^ (longValue2 << 1));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                c1503f.victor(i4, (longValue3 >> 63) ^ (longValue3 << 1));
                i5++;
            }
        }
    }

    public static void xray(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            if (z2) {
                c1503f.tango(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i5 += C1503f.india(((Integer) list.get(i10)).intValue());
                }
                c1503f.uniform(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1503f.uniform(((Integer) list.get(i11)).intValue());
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                c1503f.tango(i4, 0);
                c1503f.uniform(intValue);
            }
        }
    }

    public static void yankee(int i4, List list, ac acVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1503f c1503f = (C1503f) acVar.alpha;
            int i5 = 0;
            if (z2) {
                c1503f.tango(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1503f.juliet(((Long) list.get(i11)).longValue());
                }
                c1503f.uniform(i10);
                while (i5 < list.size()) {
                    c1503f.whiskey(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1503f.victor(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }
}
