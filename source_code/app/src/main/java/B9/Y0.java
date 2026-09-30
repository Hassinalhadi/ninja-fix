package B9;

import android.util.SparseIntArray;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class Y0 extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f274g;

    /* renamed from: f, reason: collision with root package name */
    public long f275f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f274g = sparseIntArray;
        sparseIntArray.put(R.id.ivAddressImage, 1);
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f275f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f275f != 0) {
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
            this.f275f = 1L;
        }
        oscar();
    }
}
