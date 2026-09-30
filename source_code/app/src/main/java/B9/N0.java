package B9;

import android.util.SparseIntArray;
import com.app.network.network.models.OrderTask;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class N0 extends M0 {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f206o;

    /* renamed from: n, reason: collision with root package name */
    public long f207n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f206o = sparseIntArray;
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.imageView3, 3);
        sparseIntArray.put(R.id.rl_eta, 4);
        sparseIntArray.put(R.id.tv_eta_desc, 5);
        sparseIntArray.put(R.id.tv_eta, 6);
        sparseIntArray.put(R.id.tv_actual_eta_desc, 7);
        sparseIntArray.put(R.id.tv_actual_eta, 8);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f207n;
            this.f207n = 0L;
        }
        OrderTask orderTask = this.f190m;
        long j6 = j5 & 3;
        if (j6 != 0 && orderTask != null) {
            str = orderTask.getDescription();
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f185h, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f207n != 0) {
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
            this.f207n = 2L;
        }
        oscar();
    }
}
