package B9;

import android.util.SparseIntArray;
import com.app.network.network.models.PlatformListResponse;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class j1 extends i1 {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f508m;

    /* renamed from: l, reason: collision with root package name */
    public long f509l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f508m = sparseIntArray;
        sparseIntArray.put(R.id.cvUnavailableTag, 3);
        sparseIntArray.put(R.id.vDivider, 4);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.f509l;
            this.f509l = 0L;
        }
        PlatformListResponse platformListResponse = this.f498j;
        long j6 = j5 & 3;
        if (j6 != 0 && platformListResponse != null) {
            str = platformListResponse.getImageUrl();
            str2 = platformListResponse.getLocalizedName();
        } else {
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.alpha(this.f495g, str);
            J2.f.bravo(this.f496h, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f509l != 0) {
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
            this.f509l = 2L;
        }
        oscar();
    }
}
