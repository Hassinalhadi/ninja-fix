package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class at {
    public static final Class alpha;
    public static final aw bravo;
    public static final ay charlie;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.datastore.preferences.protobuf.ay] */
    static {
        Class<?> cls;
        Class<?> cls2;
        ap apVar = ap.charlie;
        aw awVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        alpha = cls;
        try {
            ap apVar2 = ap.charlie;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                awVar = (aw) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        bravo = awVar;
        charlie = new Object();
    }

    public static int alpha(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0602i.lima(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int bravo(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0602i.juliet(i4) + 4) * size;
    }

    public static int charlie(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0602i.juliet(i4) + 8) * size;
    }

    public static int delta(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0602i.lima(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int echo(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0602i.lima(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int foxtrot(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) list.get(i5)).intValue();
            i4 += C0602i.kilo((intValue >> 31) ^ (intValue << 1));
        }
        return i4;
    }

    public static int golf(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C0602i.lima((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    public static int hotel(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0602i.kilo(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int india(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0602i.lima(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static Object juliet(Object obj, int i4, t tVar, Object obj2, aw awVar) {
        return obj2;
    }

    public static void kilo(aw awVar, Object obj, Object obj2) {
        ((ay) awVar).getClass();
        s sVar = (s) obj;
        ax axVar = sVar.unknownFields;
        ax axVar2 = ((s) obj2).unknownFields;
        ax axVar3 = ax.foxtrot;
        if (!axVar3.equals(axVar2)) {
            if (axVar3.equals(axVar)) {
                int i4 = axVar.alpha + axVar2.alpha;
                int[] copyOf = Arrays.copyOf(axVar.bravo, i4);
                System.arraycopy(axVar2.bravo, 0, copyOf, axVar.alpha, axVar2.alpha);
                Object[] copyOf2 = Arrays.copyOf(axVar.charlie, i4);
                System.arraycopy(axVar2.charlie, 0, copyOf2, axVar.alpha, axVar2.alpha);
                axVar = new ax(i4, copyOf, copyOf2, true);
            } else {
                axVar.getClass();
                if (!axVar2.equals(axVar3)) {
                    if (axVar.echo) {
                        int i5 = axVar.alpha + axVar2.alpha;
                        axVar.alpha(i5);
                        System.arraycopy(axVar2.bravo, 0, axVar.bravo, axVar.alpha, axVar2.alpha);
                        System.arraycopy(axVar2.charlie, 0, axVar.charlie, axVar.alpha, axVar2.alpha);
                        axVar.alpha = i5;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        sVar.unknownFields = axVar;
    }

    public static boolean lima(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void mike(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10++;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.oscar(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.quebec(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
        }
    }

    public static void november(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10 += 8;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.whiskey(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                c0602i.getClass();
                c0602i.victor(i4, Double.doubleToRawLongBits(doubleValue));
                i5++;
            }
        }
    }

    public static void oscar(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0602i.lima(((Integer) list.get(i11)).intValue());
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.yankee(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.xray(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void papa(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10 += 4;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.uniform(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.tango(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void quebec(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10 += 8;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.whiskey(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.victor(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void romeo(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10 += 4;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.uniform(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                c0602i.getClass();
                c0602i.tango(i4, Float.floatToRawIntBits(floatValue));
                i5++;
            }
        }
    }

    public static void sierra(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0602i.lima(((Integer) list.get(i11)).intValue());
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.yankee(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.xray(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void tango(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0602i.lima(((Long) list.get(i11)).longValue());
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.coral(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.bronze(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void uniform(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10 += 4;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.uniform(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.tango(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void victor(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C0602i.foxtrot;
                    i10 += 8;
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.whiskey(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.victor(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void whiskey(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    i10 += C0602i.kilo((intValue >> 31) ^ (intValue << 1));
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    int intValue2 = ((Integer) list.get(i5)).intValue();
                    c0602i.blue((intValue2 >> 31) ^ (intValue2 << 1));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                c0602i.black(i4, (intValue3 >> 31) ^ (intValue3 << 1));
                i5++;
            }
        }
    }

    public static void xray(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += C0602i.lima((longValue >> 63) ^ (longValue << 1));
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    long longValue2 = ((Long) list.get(i5)).longValue();
                    c0602i.coral((longValue2 >> 63) ^ (longValue2 << 1));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                c0602i.bronze(i4, (longValue3 >> 63) ^ (longValue3 << 1));
                i5++;
            }
        }
    }

    public static void yankee(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0602i.kilo(((Integer) list.get(i11)).intValue());
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.blue(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.black(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void zulu(int i4, List list, aa aaVar, boolean z2) {
        if (list != null && !list.isEmpty()) {
            C0602i c0602i = (C0602i) aaVar.alpha;
            int i5 = 0;
            if (z2) {
                c0602i.beige(i4, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0602i.lima(((Long) list.get(i11)).longValue());
                }
                c0602i.blue(i10);
                while (i5 < list.size()) {
                    c0602i.coral(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                c0602i.bronze(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }
}
