package Cf;

import androidx.appcompat.widget.P0;
import vf.ad;

/* loaded from: classes2.dex */
public final class j extends i {
    public final Runnable red;

    public j(Runnable runnable, long j5, boolean z2) {
        super(j5, z2);
        this.red = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.red.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.red;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(ad.romeo(runnable));
        sb2.append(", ");
        sb2.append(this.alpha);
        sb2.append(", ");
        if (this.purple) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return P0.fuchsia(sb2, str, ']');
    }
}
