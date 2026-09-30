package u8;

import android.util.Log;
import java.util.Locale;

/* renamed from: u8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3146a {
    public static volatile C3146a charlie;
    public final b alpha;
    public boolean bravo = false;

    public C3146a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.purple == null) {
                    b.purple = new b(0);
                }
                bVar = b.purple;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.alpha = bVar;
    }

    public static C3146a delta() {
        if (charlie == null) {
            synchronized (C3146a.class) {
                try {
                    if (charlie == null) {
                        charlie = new C3146a();
                    }
                } finally {
                }
            }
        }
        return charlie;
    }

    public final void alpha(String str) {
        if (this.bravo) {
            this.alpha.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void bravo(String str, Object... objArr) {
        if (this.bravo) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.alpha.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    public final void charlie(String str, Object... objArr) {
        if (this.bravo) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.alpha.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void echo(String str, Object... objArr) {
        if (this.bravo) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.alpha.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    public final void foxtrot(String str) {
        if (this.bravo) {
            this.alpha.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void golf(String str, Object... objArr) {
        if (this.bravo) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.alpha.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
