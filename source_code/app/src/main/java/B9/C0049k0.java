package B9;

import android.util.SparseIntArray;
import com.app.network.network.models.City;
import delivery.samurai.android.R;

/* renamed from: B9.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0049k0 extends AbstractC0047j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f512l;

    /* renamed from: k, reason: collision with root package name */
    public long f513k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f512l = sparseIntArray;
        sparseIntArray.put(R.id.vDivider, 2);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f513k;
            this.f513k = 0L;
        }
        City city = this.f507i;
        long j6 = j5 & 3;
        if (j6 != 0 && city != null) {
            str = city.getLocalizedName();
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f505g, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f513k != 0) {
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
            this.f513k = 2L;
        }
        oscar();
    }
}
