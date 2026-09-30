package s6;

import android.graphics.Path;
import j1.C1931e;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class C5 {
    public static boolean alpha(C1931e[] c1931eArr, C1931e[] c1931eArr2) {
        if (c1931eArr == null || c1931eArr2 == null || c1931eArr.length != c1931eArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < c1931eArr.length; i4++) {
            C1931e c1931e = c1931eArr[i4];
            char c3 = c1931e.alpha;
            C1931e c1931e2 = c1931eArr2[i4];
            if (c3 != c1931e2.alpha || c1931e.bravo.length != c1931e2.bravo.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] bravo(float[] fArr, int i4) {
        if (i4 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i4, length);
                float[] fArr2 = new float[i4];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1931e[] charlie(String str) {
        int i4;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            while (i11 < str.length()) {
                char charAt = str.charAt(i11);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i11++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i10, i11).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i5) != 'z' && trim.charAt(i5) != 'Z') {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i12 = i5;
                                int i13 = 1;
                                while (i13 < length) {
                                    int i14 = i5;
                                    int i15 = i14;
                                    int i16 = i15;
                                    int i17 = i16;
                                    for (int i18 = i13; i18 < trim.length(); i18++) {
                                        char charAt2 = trim.charAt(i18);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i18 != i13 && i14 == 0) {
                                                            i14 = 0;
                                                            i16 = 1;
                                                            i17 = 1;
                                                            break;
                                                        }
                                                        i14 = 0;
                                                        break;
                                                    case '.':
                                                        if (i15 == 0) {
                                                            i14 = 0;
                                                            i15 = 1;
                                                            break;
                                                        }
                                                        i14 = 0;
                                                        i16 = 1;
                                                        i17 = 1;
                                                        break;
                                                    default:
                                                        i14 = 0;
                                                        break;
                                                }
                                            } else {
                                                i14 = 1;
                                            }
                                            if (i16 == 0) {
                                                if (i13 < i18) {
                                                    fArr2[i12] = Float.parseFloat(trim.substring(i13, i18));
                                                    i12++;
                                                }
                                                if (i17 == 0) {
                                                    i13 = i18;
                                                } else {
                                                    i13 = i18 + 1;
                                                }
                                                i5 = 0;
                                            }
                                        }
                                        i14 = 0;
                                        i16 = 1;
                                        if (i16 == 0) {
                                        }
                                    }
                                    if (i13 < i18) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    i5 = 0;
                                }
                                fArr = bravo(fArr2, i12);
                                i5 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(ao.ad.gray("error in parsing \"", trim, "\""), e);
                            }
                        } else {
                            fArr = new float[i5];
                        }
                        arrayList.add(new C1931e(trim.charAt(i5), fArr));
                    }
                    i10 = i11;
                    i11++;
                    i5 = 0;
                }
                i11++;
            }
            trim = str.substring(i10, i11).trim();
            if (!trim.isEmpty()) {
            }
            i10 = i11;
            i11++;
            i5 = 0;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            i4 = 0;
            arrayList.add(new C1931e(str.charAt(i10), new float[0]));
        } else {
            i4 = 0;
        }
        return (C1931e[]) arrayList.toArray(new C1931e[i4]);
    }

    public static Path delta(String str) {
        Path path = new Path();
        try {
            C1931e.bravo(charlie(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static C1931e[] echo(C1931e[] c1931eArr) {
        C1931e[] c1931eArr2 = new C1931e[c1931eArr.length];
        for (int i4 = 0; i4 < c1931eArr.length; i4++) {
            c1931eArr2[i4] = new C1931e(c1931eArr[i4]);
        }
        return c1931eArr2;
    }

    public static final D0.g foxtrot(I0.aa aaVar) {
        D0.g gVar = aaVar.alpha;
        gVar.getClass();
        long j5 = aaVar.bravo;
        return gVar.subSequence(D0.am.foxtrot(j5), D0.am.echo(j5));
    }

    public static final D0.g golf(I0.aa aaVar, int i4) {
        D0.g gVar = aaVar.alpha;
        long j5 = aaVar.bravo;
        return gVar.subSequence(D0.am.echo(j5), Math.min(D0.am.echo(j5) + i4, aaVar.alpha.purple.length()));
    }

    public static final D0.g hotel(I0.aa aaVar, int i4) {
        D0.g gVar = aaVar.alpha;
        long j5 = aaVar.bravo;
        return gVar.subSequence(Math.max(0, D0.am.foxtrot(j5) - i4), D0.am.foxtrot(j5));
    }
}
