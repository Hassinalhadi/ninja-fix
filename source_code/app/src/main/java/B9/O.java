package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class O extends N {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f208v;

    /* renamed from: u, reason: collision with root package name */
    public long f209u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f208v = sparseIntArray;
        sparseIntArray.put(R.id.ivNoteIcon, 5);
        sparseIntArray.put(R.id.cvDriverMap, 6);
        sparseIntArray.put(R.id.driverMap, 7);
        sparseIntArray.put(R.id.ivDriverCenterPin, 8);
        sparseIntArray.put(R.id.llVotes, 9);
        sparseIntArray.put(R.id.llUpVote, 10);
        sparseIntArray.put(R.id.ivThumbUp, 11);
        sparseIntArray.put(R.id.llDownVote, 12);
        sparseIntArray.put(R.id.ivThumbDown, 13);
        sparseIntArray.put(R.id.rvImages, 14);
        sparseIntArray.put(R.id.viewDivider, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O(View view) {
        super(null, view, r3, r4, r5, r6, (RecyclerView) r14[14], (TextView) r14[1], (TextView) r14[2], (TextView) r14[4], (TextView) r14[3], (View) r14[15]);
        Object[] november = z1.g.november(view, 16, null, f208v);
        MaterialCardView materialCardView = (MaterialCardView) november[6];
        MapView mapView = (MapView) november[7];
        LinearLayout linearLayout = (LinearLayout) november[12];
        LinearLayout linearLayout2 = (LinearLayout) november[10];
        this.f209u = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        this.f197k.setTag(null);
        this.f198l.setTag(null);
        this.f199m.setTag(null);
        this.f200n.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f209u;
            this.f209u = 0L;
        }
        String str2 = this.f205s;
        int i4 = this.f202p;
        int i5 = this.f203q;
        String str3 = this.f204r;
        long j6 = 17 & j5;
        long j7 = 18 & j5;
        String str4 = null;
        if (j7 != 0) {
            str = String.valueOf(i4);
        } else {
            str = null;
        }
        long j10 = 20 & j5;
        if (j10 != 0) {
            str4 = String.valueOf(i5);
        }
        if ((j5 & 24) != 0) {
            J2.f.bravo(this.f197k, str3);
        }
        if (j6 != 0) {
            J2.f.bravo(this.f198l, str2);
        }
        if (j10 != 0) {
            J2.f.bravo(this.f199m, str4);
        }
        if (j7 != 0) {
            J2.f.bravo(this.f200n, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f209u != 0) {
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
            this.f209u = 16L;
        }
        oscar();
    }

    @Override // B9.N
    public final void romeo(int i4) {
        this.f203q = i4;
        synchronized (this) {
            this.f209u |= 4;
        }
        delta();
        oscar();
    }

    @Override // B9.N
    public final void sierra(String str) {
        this.f205s = str;
        synchronized (this) {
            this.f209u |= 1;
        }
        delta();
        oscar();
    }

    @Override // B9.N
    public final void tango(int i4) {
        this.f202p = i4;
        synchronized (this) {
            this.f209u |= 2;
        }
        delta();
        oscar();
    }
}
