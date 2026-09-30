package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Country;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class f1 extends e1 {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f459n;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f460l;

    /* renamed from: m, reason: collision with root package name */
    public long f461m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f459n = sparseIntArray;
        sparseIntArray.put(R.id.vDivider, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f1(View view) {
        super(null, view, (ConstraintLayout) r0[0], (MaterialCardView) r0[1], (TextView) r0[3], (View) r0[4]);
        Object[] november = z1.g.november(view, 5, null, f459n);
        this.f461m = -1L;
        this.f448f.setTag(null);
        this.f449g.setTag(null);
        TextView textView = (TextView) november[2];
        this.f460l = textView;
        textView.setTag(null);
        this.f450h.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        boolean z2;
        long j6;
        synchronized (this) {
            j5 = this.f461m;
            this.f461m = 0L;
        }
        Country country = this.f452j;
        long j7 = j5 & 3;
        String str2 = null;
        int i4 = 0;
        if (j7 != 0) {
            if (country != null) {
                String localizedName = country.getLocalizedName();
                str2 = country.getEmoji();
                str = localizedName;
            } else {
                str = null;
            }
            if (str2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j7 != 0) {
                if (z2) {
                    j6 = 8;
                } else {
                    j6 = 4;
                }
                j5 |= j6;
            }
            if (!z2) {
                i4 = 4;
            }
        } else {
            str = null;
        }
        if ((j5 & 3) != 0) {
            this.f449g.setVisibility(i4);
            J2.f.bravo(this.f460l, str2);
            J2.f.bravo(this.f450h, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f461m != 0) {
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
            this.f461m = 2L;
        }
        oscar();
    }
}
