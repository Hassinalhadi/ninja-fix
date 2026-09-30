package B9;

import android.util.SparseIntArray;
import com.app.network.network.models.Country;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class h1 extends g1 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f486l;

    /* renamed from: k, reason: collision with root package name */
    public long f487k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f486l = sparseIntArray;
        sparseIntArray.put(R.id.vDivider, 2);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f487k;
            this.f487k = 0L;
        }
        Country country = this.f471i;
        long j6 = j5 & 3;
        if (j6 != 0 && country != null) {
            str = country.getLocalizedName();
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f469g, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f487k != 0) {
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
            this.f487k = 2L;
        }
        oscar();
    }
}
