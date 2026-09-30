package B9;

import android.util.SparseIntArray;
import delivery.samurai.android.R;

/* renamed from: B9.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0066t0 extends AbstractC0064s0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f692l;

    /* renamed from: k, reason: collision with root package name */
    public long f693k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f692l = sparseIntArray;
        sparseIntArray.put(R.id.status, 3);
        sparseIntArray.put(R.id.chev, 4);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.f693k;
            this.f693k = 0L;
        }
        Ib.a aVar = this.f689i;
        long j6 = j5 & 3;
        if (j6 != 0 && aVar != null) {
            str = aVar.bravo;
            str2 = aVar.charlie;
        } else {
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f687g, str2);
            J2.f.bravo(this.f688h, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f693k != 0) {
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
            this.f693k = 2L;
        }
        oscar();
    }
}
