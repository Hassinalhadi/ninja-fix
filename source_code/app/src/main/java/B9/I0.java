package B9;

import android.util.SparseIntArray;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class I0 extends H0 {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f154o;

    /* renamed from: n, reason: collision with root package name */
    public long f155n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f154o = sparseIntArray;
        sparseIntArray.put(R.id.timelineIndicator, 8);
        sparseIntArray.put(R.id.textView18, 9);
        sparseIntArray.put(R.id.imageView2, 10);
        sparseIntArray.put(R.id.actions, 11);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        int i4;
        synchronized (this) {
            j5 = this.f155n;
            this.f155n = 0L;
        }
        long j6 = j5 & 6;
        if (j6 != 0) {
            if (j6 != 0) {
                j5 |= 512;
            }
            if ((j5 & 6) != 0) {
                j5 |= 128;
            }
            if ((j5 & 6) != 0) {
                j5 |= 2048;
            }
            if ((j5 & 6) != 0) {
                j5 |= 8;
            }
            if ((j5 & 6) != 0) {
                j5 |= 32;
            }
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i5 = i4;
        if ((j5 & 6) != 0) {
            this.f146f.setVisibility(i4);
            this.f147g.setVisibility(i5);
            this.f148h.setVisibility(i5);
            this.f149i.setVisibility(i5);
            J2.f.bravo(this.f151k, null);
            J2.f.bravo(this.f152l, null);
            this.f152l.setVisibility(i5);
            J2.f.bravo(this.f153m, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f155n != 0) {
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
            this.f155n = 4L;
        }
        oscar();
    }
}
