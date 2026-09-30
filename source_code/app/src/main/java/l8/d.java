package l8;

import com.google.android.gms.measurement.internal.C1477x;
import j8.C1953j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d {
    public static final long delta = TimeUnit.HOURS.toMillis(24);
    public static final long echo = TimeUnit.MINUTES.toMillis(30);
    public final C1953j alpha;
    public long bravo;
    public int charlie;

    public d() {
        if (C1477x.purple == null) {
            Pattern pattern = C1953j.charlie;
            C1477x.purple = new C1477x(11);
        }
        C1477x c1477x = C1477x.purple;
        if (C1953j.delta == null) {
            C1953j.delta = new C1953j(c1477x);
        }
        this.alpha = C1953j.delta;
    }

    public final synchronized long alpha(int i4) {
        boolean z2;
        if (i4 != 429 && (i4 < 500 || i4 >= 600)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return delta;
        }
        double pow = Math.pow(2.0d, this.charlie);
        this.alpha.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), echo);
    }

    public final synchronized boolean bravo() {
        boolean z2;
        if (this.charlie != 0) {
            this.alpha.alpha.getClass();
            if (System.currentTimeMillis() <= this.bravo) {
                z2 = false;
            }
        }
        z2 = true;
        return z2;
    }

    public final synchronized void charlie() {
        this.charlie = 0;
    }

    public final synchronized void delta(int i4) {
        if ((i4 < 200 || i4 >= 300) && i4 != 401 && i4 != 404) {
            this.charlie++;
            long alpha = alpha(i4);
            this.alpha.alpha.getClass();
            this.bravo = System.currentTimeMillis() + alpha;
            return;
        }
        charlie();
    }
}
