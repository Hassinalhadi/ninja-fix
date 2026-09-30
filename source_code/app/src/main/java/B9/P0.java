package B9;

import android.util.SparseIntArray;
import delivery.samurai.android.R;
import t6.Q2;

/* loaded from: classes2.dex */
public final class P0 extends O0 {

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f214i;

    /* renamed from: h, reason: collision with root package name */
    public long f215h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f214i = sparseIntArray;
        sparseIntArray.put(R.id.container, 3);
        sparseIntArray.put(R.id.btnRequest, 4);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f215h;
            this.f215h = 0L;
        }
        long j6 = 7 & j5;
        if (j6 != 0) {
            str = androidx.appcompat.widget.P0.crimson(Q2.bravo(0.0f).concat(" "), null);
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f210f, str);
        }
        if ((j5 & 5) != 0) {
            J2.f.bravo(this.f211g, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f215h != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f215h = 4L;
        }
        oscar();
    }
}
