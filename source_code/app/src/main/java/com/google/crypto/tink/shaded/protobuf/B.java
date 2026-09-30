package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class B {
    public static final Class alpha;
    public static final C bravo;
    public static final C charlie;
    public static final E delta;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.crypto.tink.shaded.protobuf.E, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        alpha = cls;
        bravo = whiskey(false);
        charlie = whiskey(true);
        delta = new Object();
    }

    public static int alpha(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int coral = C1494l.coral(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            coral += C1494l.amber((AbstractC1490h) list.get(i5));
        }
        return coral;
    }

    public static void amber(int i4, List list, C1495m c1495m) {
        if (list != null && !list.isEmpty()) {
            c1495m.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                AbstractC1490h abstractC1490h = (AbstractC1490h) list.get(i5);
                C1494l c1494l = (C1494l) c1495m.alpha;
                c1494l.jade(i4, 2);
                c1494l.lavender(abstractC1490h.size());
                C1489g c1489g = (C1489g) abstractC1490h;
                c1494l.fuchsia(c1489g.silver, c1489g.lima(), c1489g.size());
            }
        }
    }

    public static void azure(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).getClass();
                    Logger logger = C1494l.echo;
                    i10 += 8;
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.indigo(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                c1494l.getClass();
                c1494l.green(i4, Double.doubleToRawLongBits(doubleValue));
                i5++;
            }
        }
    }

    public static void beige(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            if (z2) {
                c1494l.jade(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i5 += C1494l.blue(((Integer) list.get(i10)).intValue());
                }
                c1494l.lavender(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1494l.ivory(((Integer) list.get(i11)).intValue());
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                c1494l.jade(i4, 0);
                c1494l.ivory(intValue);
            }
        }
    }

    public static void black(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C1494l.echo;
                    i10 += 4;
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.gray(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1494l.gold(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void blue(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C1494l.echo;
                    i10 += 8;
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.indigo(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1494l.green(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static int bravo(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * size) + charlie(list);
    }

    public static void bronze(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).getClass();
                    Logger logger = C1494l.echo;
                    i10 += 4;
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.gray(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                c1494l.getClass();
                c1494l.gold(i4, Float.floatToRawIntBits(floatValue));
                i5++;
            }
        }
    }

    public static int charlie(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1494l.blue(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static void coral(int i4, List list, C1495m c1495m, A a6) {
        if (list != null && !list.isEmpty()) {
            c1495m.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                c1495m.bravo(i4, list.get(i5), a6);
            }
        }
    }

    public static void crimson(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            if (z2) {
                c1494l.jade(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i5 += C1494l.blue(((Integer) list.get(i10)).intValue());
                }
                c1494l.lavender(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1494l.ivory(((Integer) list.get(i11)).intValue());
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                c1494l.jade(i4, 0);
                c1494l.ivory(intValue);
            }
        }
    }

    public static void cyan(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1494l.cyan(((Long) list.get(i11)).longValue());
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.magenta(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1494l.lime(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static int delta(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1494l.azure(i4) * size;
    }

    public static int echo(List list) {
        return list.size() * 4;
    }

    public static void emerald(int i4, List list, C1495m c1495m, A a6) {
        if (list != null && !list.isEmpty()) {
            c1495m.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                c1495m.charlie(i4, list.get(i5), a6);
            }
        }
    }

    public static int foxtrot(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1494l.beige(i4) * size;
    }

    public static void fuchsia(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C1494l.echo;
                    i10 += 4;
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.gray(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1494l.gold(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void gold(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C1494l.echo;
                    i10 += 8;
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.indigo(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1494l.green(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static int golf(List list) {
        return list.size() * 8;
    }

    public static void gray(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            if (z2) {
                c1494l.jade(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i5 += C1494l.crimson((intValue >> 31) ^ (intValue << 1));
                }
                c1494l.lavender(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    c1494l.lavender((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue3 = ((Integer) list.get(i12)).intValue();
                c1494l.jade(i4, 0);
                c1494l.lavender((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void green(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += C1494l.cyan((longValue >> 63) ^ (longValue << 1));
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    long longValue2 = ((Long) list.get(i5)).longValue();
                    c1494l.magenta((longValue2 >> 63) ^ (longValue2 << 1));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                c1494l.lime(i4, (longValue3 >> 63) ^ (longValue3 << 1));
                i5++;
            }
        }
    }

    public static int hotel(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * size) + india(list);
    }

    public static int india(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1494l.blue(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static void indigo(int i4, List list, C1495m c1495m) {
        if (list != null && !list.isEmpty()) {
            c1495m.getClass();
            boolean z2 = list instanceof ae;
            C1494l c1494l = (C1494l) c1495m.alpha;
            if (z2) {
                ae aeVar = (ae) list;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    Object juliet = aeVar.juliet(i5);
                    if (juliet instanceof String) {
                        String str = (String) juliet;
                        c1494l.jade(i4, 2);
                        int i10 = c1494l.delta;
                        try {
                            int crimson = C1494l.crimson(str.length() * 3);
                            int crimson2 = C1494l.crimson(str.length());
                            byte[] bArr = c1494l.bravo;
                            int i11 = c1494l.charlie;
                            if (crimson2 == crimson) {
                                int i12 = i10 + crimson2;
                                c1494l.delta = i12;
                                int sierra = O.alpha.sierra(str, bArr, i12, i11 - i12);
                                c1494l.delta = i10;
                                c1494l.lavender((sierra - i10) - crimson2);
                                c1494l.delta = sierra;
                            } else {
                                c1494l.lavender(O.bravo(str));
                                int i13 = c1494l.delta;
                                c1494l.delta = O.alpha.sierra(str, bArr, i13, i11 - i13);
                            }
                        } catch (Utf8$UnpairedSurrogateException e) {
                            c1494l.delta = i10;
                            C1494l.echo.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                            byte[] bytes = str.getBytes(ab.alpha);
                            try {
                                c1494l.lavender(bytes.length);
                                c1494l.fuchsia(bytes, 0, bytes.length);
                            } catch (CodedOutputStream$OutOfSpaceException e4) {
                                throw e4;
                            } catch (IndexOutOfBoundsException e5) {
                                throw new CodedOutputStream$OutOfSpaceException(e5);
                            }
                        } catch (IndexOutOfBoundsException e10) {
                            throw new CodedOutputStream$OutOfSpaceException(e10);
                        }
                    } else {
                        AbstractC1490h abstractC1490h = (AbstractC1490h) juliet;
                        c1494l.jade(i4, 2);
                        c1494l.lavender(abstractC1490h.size());
                        C1489g c1489g = (C1489g) abstractC1490h;
                        c1494l.fuchsia(c1489g.silver, c1489g.lima(), c1489g.size());
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                String str2 = (String) list.get(i14);
                c1494l.jade(i4, 2);
                int i15 = c1494l.delta;
                try {
                    int crimson3 = C1494l.crimson(str2.length() * 3);
                    int crimson4 = C1494l.crimson(str2.length());
                    byte[] bArr2 = c1494l.bravo;
                    int i16 = c1494l.charlie;
                    if (crimson4 == crimson3) {
                        int i17 = i15 + crimson4;
                        c1494l.delta = i17;
                        int sierra2 = O.alpha.sierra(str2, bArr2, i17, i16 - i17);
                        c1494l.delta = i15;
                        c1494l.lavender((sierra2 - i15) - crimson4);
                        c1494l.delta = sierra2;
                    } else {
                        c1494l.lavender(O.bravo(str2));
                        int i18 = c1494l.delta;
                        c1494l.delta = O.alpha.sierra(str2, bArr2, i18, i16 - i18);
                    }
                } catch (Utf8$UnpairedSurrogateException e11) {
                    c1494l.delta = i15;
                    C1494l.echo.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
                    byte[] bytes2 = str2.getBytes(ab.alpha);
                    try {
                        c1494l.lavender(bytes2.length);
                        c1494l.fuchsia(bytes2, 0, bytes2.length);
                    } catch (CodedOutputStream$OutOfSpaceException e12) {
                        throw e12;
                    } catch (IndexOutOfBoundsException e13) {
                        throw new CodedOutputStream$OutOfSpaceException(e13);
                    }
                } catch (IndexOutOfBoundsException e14) {
                    throw new CodedOutputStream$OutOfSpaceException(e14);
                }
            }
        }
    }

    public static void ivory(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            if (z2) {
                c1494l.jade(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i5 += C1494l.crimson(((Integer) list.get(i10)).intValue());
                }
                c1494l.lavender(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1494l.lavender(((Integer) list.get(i11)).intValue());
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                c1494l.jade(i4, 0);
                c1494l.lavender(intValue);
            }
        }
    }

    public static void jade(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            int i5 = 0;
            if (z2) {
                c1494l.jade(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C1494l.cyan(((Long) list.get(i11)).longValue());
                }
                c1494l.lavender(i10);
                while (i5 < list.size()) {
                    c1494l.magenta(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c1494l.lime(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static int juliet(int i4, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * list.size()) + kilo(list);
    }

    public static int kilo(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof ai) {
            ai aiVar = (ai) list;
            if (size <= 0) {
                return 0;
            }
            aiVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1494l.cyan(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int lima(int i4, List list, A a6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int coral = C1494l.coral(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC1483a abstractC1483a = (AbstractC1483a) ((ao) list.get(i5));
            abstractC1483a.getClass();
            x xVar = (x) abstractC1483a;
            int i10 = xVar.memoizedSerializedSize;
            if (i10 == -1) {
                i10 = a6.india(abstractC1483a);
                xVar.memoizedSerializedSize = i10;
            }
            coral += C1494l.crimson(i10) + i10;
        }
        return coral;
    }

    public static int mike(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * size) + november(list);
    }

    public static int november(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) list.get(i5)).intValue();
            i4 += C1494l.crimson((intValue >> 31) ^ (intValue << 1));
        }
        return i4;
    }

    public static int oscar(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * size) + papa(list);
    }

    public static int papa(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof ai) {
            ai aiVar = (ai) list;
            if (size <= 0) {
                return 0;
            }
            aiVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C1494l.cyan((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    public static int quebec(int i4, List list) {
        int bronze;
        int bronze2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int coral = C1494l.coral(i4) * size;
        if (list instanceof ae) {
            ae aeVar = (ae) list;
            while (i5 < size) {
                Object juliet = aeVar.juliet(i5);
                if (juliet instanceof AbstractC1490h) {
                    bronze2 = C1494l.amber((AbstractC1490h) juliet);
                } else {
                    bronze2 = C1494l.bronze((String) juliet);
                }
                coral = bronze2 + coral;
                i5++;
            }
            return coral;
        }
        while (i5 < size) {
            Object obj = list.get(i5);
            if (obj instanceof AbstractC1490h) {
                bronze = C1494l.amber((AbstractC1490h) obj);
            } else {
                bronze = C1494l.bronze((String) obj);
            }
            coral = bronze + coral;
            i5++;
        }
        return coral;
    }

    public static int romeo(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * size) + sierra(list);
    }

    public static int sierra(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1494l.crimson(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int tango(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1494l.coral(i4) * size) + uniform(list);
    }

    public static int uniform(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof ai) {
            ai aiVar = (ai) list;
            if (size <= 0) {
                return 0;
            }
            aiVar.delta(0);
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1494l.cyan(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static Object victor(int i4, List list, Object obj, C c3) {
        return obj;
    }

    public static C whiskey(boolean z2) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (C) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static void xray(C c3, x xVar, x xVar2) {
        ((E) c3).getClass();
        D d4 = xVar.unknownFields;
        D d9 = xVar2.unknownFields;
        if (!d9.equals(D.foxtrot)) {
            int i4 = d4.alpha + d9.alpha;
            int[] copyOf = Arrays.copyOf(d4.bravo, i4);
            System.arraycopy(d9.bravo, 0, copyOf, d4.alpha, d9.alpha);
            Object[] copyOf2 = Arrays.copyOf(d4.charlie, i4);
            System.arraycopy(d9.charlie, 0, copyOf2, d4.alpha, d9.alpha);
            d4 = new D(i4, copyOf, copyOf2, true);
        }
        xVar.unknownFields = d4;
    }

    public static boolean yankee(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void zulu(int i4, List list, C1495m c1495m, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C1494l c1494l = (C1494l) c1495m.alpha;
            if (z2) {
                c1494l.jade(i4, 2);
                int i5 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Boolean) list.get(i10)).getClass();
                    Logger logger = C1494l.echo;
                    i5++;
                }
                c1494l.lavender(i5);
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c1494l.emerald(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                boolean booleanValue = ((Boolean) list.get(i12)).booleanValue();
                c1494l.jade(i4, 0);
                c1494l.emerald(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }
}
