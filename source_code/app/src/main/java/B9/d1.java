package B9;

import android.util.SparseIntArray;
import com.app.network.network.models.Bank;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class d1 extends c1 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f442l;

    /* renamed from: k, reason: collision with root package name */
    public long f443k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f442l = sparseIntArray;
        sparseIntArray.put(R.id.vDivider, 2);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f443k;
            this.f443k = 0L;
        }
        Bank bank = this.f435i;
        long j6 = j5 & 3;
        if (j6 != 0 && bank != null) {
            str = bank.getLocalizedName();
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f433g, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f443k != 0) {
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
            this.f443k = 2L;
        }
        oscar();
    }
}
