package B9;

import android.util.SparseIntArray;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class a1 extends Z0 {

    /* renamed from: r, reason: collision with root package name */
    public static final SparseIntArray f315r;

    /* renamed from: q, reason: collision with root package name */
    public long f316q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f315r = sparseIntArray;
        sparseIntArray.put(R.id.pb_remaining, 3);
        sparseIntArray.put(R.id.tv_progress_percent, 4);
        sparseIntArray.put(R.id.tv_points, 5);
        sparseIntArray.put(R.id.tv_remaining, 6);
        sparseIntArray.put(R.id.tv_status_badge, 7);
        sparseIntArray.put(R.id.btn_redeem, 8);
        sparseIntArray.put(R.id.tv_label_use, 9);
        sparseIntArray.put(R.id.tv_button_redeem_amount, 10);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.f316q;
            this.f316q = 0L;
        }
        PointRewardResponse pointRewardResponse = this.f292o;
        long j6 = j5 & 3;
        if (j6 != 0 && pointRewardResponse != null) {
            str = pointRewardResponse.getDisplayName();
            str2 = pointRewardResponse.getImageUrl();
        } else {
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.delta(this.f284g, str2);
            J2.f.bravo(this.f287j, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f316q != 0) {
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
            this.f316q = 2L;
        }
        oscar();
    }
}
