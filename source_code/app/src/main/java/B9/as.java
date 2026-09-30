package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class as extends ar {

    /* renamed from: r, reason: collision with root package name */
    public static final SparseIntArray f376r;

    /* renamed from: q, reason: collision with root package name */
    public long f377q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f376r = sparseIntArray;
        sparseIntArray.put(R.id.coinContainer, 5);
        sparseIntArray.put(R.id.ivGifCoin, 6);
        sparseIntArray.put(R.id.ivGifBurst, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public as(View view) {
        super(null, view, r6, r7, (ImageView) r0[7], (ImageView) r0[6], (TextView) r0[2], (TextView) r0[1]);
        Object[] november = z1.g.november(view, 8, null, f376r);
        MaterialButton materialButton = (MaterialButton) november[3];
        MaterialButton materialButton2 = (MaterialButton) november[4];
        this.f377q = -1L;
        this.f366f.setTag(null);
        this.f367g.setTag(null);
        ((MaterialCardView) november[0]).setTag(null);
        this.f370j.setTag(null);
        this.f371k.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        boolean z2;
        boolean z10;
        long j6;
        synchronized (this) {
            j5 = this.f377q;
            this.f377q = 0L;
        }
        String str = this.f374n;
        String str2 = this.f373m;
        String str3 = this.f375o;
        String str4 = this.f372l;
        long j7 = j5 & 20;
        boolean z11 = true;
        int i4 = 0;
        if (j7 != 0) {
            if (str3 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j7 != 0) {
                j5 = z2 ? j5 | 64 : j5 | 32;
            }
        } else {
            z2 = false;
        }
        if ((32 & j5) != 0 && str3 != null) {
            z10 = str3.isEmpty();
        } else {
            z10 = false;
        }
        long j10 = j5 & 20;
        if (j10 != 0) {
            if (!z2) {
                z11 = z10;
            }
            if (j10 != 0) {
                if (z11) {
                    j6 = 256;
                } else {
                    j6 = 128;
                }
                j5 |= j6;
            }
            if (z11) {
                i4 = 8;
            }
        }
        if ((17 & j5) != 0) {
            J2.f.bravo(this.f366f, str);
        }
        if ((20 & j5) != 0) {
            J2.f.bravo(this.f367g, str3);
            this.f367g.setVisibility(i4);
        }
        if ((18 & j5) != 0) {
            J2.f.bravo(this.f370j, str2);
        }
        if ((j5 & 24) != 0) {
            J2.f.bravo(this.f371k, str4);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f377q != 0) {
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
            this.f377q = 16L;
        }
        oscar();
    }

    @Override // B9.ar
    public final void romeo(String str) {
        this.f373m = str;
        synchronized (this) {
            this.f377q |= 2;
        }
        delta();
        oscar();
    }

    @Override // B9.ar
    public final void sierra(String str) {
        this.f374n = str;
        synchronized (this) {
            this.f377q |= 1;
        }
        delta();
        oscar();
    }

    @Override // B9.ar
    public final void tango(String str) {
        this.f375o = str;
        synchronized (this) {
            this.f377q |= 4;
        }
        delta();
        oscar();
    }
}
