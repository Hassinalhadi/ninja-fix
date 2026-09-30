package A2;

import android.util.Log;

/* loaded from: classes3.dex */
public final class z {
    public static final Object bravo = new Object();
    public static volatile z charlie;
    public final int alpha;

    public z(int i4) {
        this.alpha = i4;
    }

    public static z echo() {
        z zVar;
        synchronized (bravo) {
            try {
                if (charlie == null) {
                    charlie = new z(3);
                }
                zVar = charlie;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    public static String golf(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void alpha(String str, String str2) {
        if (this.alpha <= 3) {
            Log.d(str, str2);
        }
    }

    public final void bravo(String str, String str2, Throwable th) {
        if (this.alpha <= 3) {
            Log.d(str, str2, th);
        }
    }

    public final void charlie(String str, String str2) {
        if (this.alpha <= 6) {
            Log.e(str, str2);
        }
    }

    public final void delta(String str, String str2, Throwable th) {
        if (this.alpha <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void foxtrot(String str, String str2) {
        if (this.alpha <= 4) {
            Log.i(str, str2);
        }
    }

    public final void hotel(String str, String str2) {
        if (this.alpha <= 5) {
            Log.w(str, str2);
        }
    }
}
