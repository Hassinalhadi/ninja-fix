package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.OrderAsset;
import delivery.samurai.android.R;

/* renamed from: B9.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0029a0 extends Z {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f313m;

    /* renamed from: l, reason: collision with root package name */
    public long f314l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f313m = sparseIntArray;
        sparseIntArray.put(R.id.container, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0029a0(View view) {
        super(null, view, r6, r7, (ImageView) r0[2], (TextView) r0[4], (TextView) r0[5]);
        Object[] november = z1.g.november(view, 7, null, f313m);
        TextView textView = (TextView) november[1];
        TextView textView2 = (TextView) november[3];
        this.f314l = -1L;
        this.f276f.setTag(null);
        this.f277g.setTag(null);
        this.f278h.setTag(null);
        this.f279i.setTag(null);
        ((FrameLayout) november[0]).setTag(null);
        this.f280j.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        double doubleValue;
        boolean z2;
        long j6;
        synchronized (this) {
            j5 = this.f314l;
            this.f314l = 0L;
        }
        OrderAsset orderAsset = this.f281k;
        long j7 = j5 & 3;
        int i4 = 0;
        String str6 = null;
        Double d4 = null;
        if (j7 != 0) {
            if (orderAsset != null) {
                d4 = orderAsset.getCost();
                str4 = orderAsset.getImageUrl();
                str5 = orderAsset.getExternalId();
                str3 = orderAsset.getName();
                str = orderAsset.getReturnLocationName();
            } else {
                str = null;
                str4 = null;
                str5 = null;
                str3 = null;
            }
            if (d4 == null) {
                doubleValue = 0.0d;
            } else {
                doubleValue = d4.doubleValue();
            }
            if (str4 != null) {
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
            String valueOf = String.valueOf(doubleValue);
            if (!z2) {
                i4 = 8;
            }
            str2 = av.q.echo("-", valueOf);
            str6 = str5;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((j5 & 3) != 0) {
            J2.f.bravo(this.f276f, str6);
            J2.f.bravo(this.f277g, str3);
            this.f278h.setVisibility(i4);
            J2.f.bravo(this.f279i, str);
            J2.f.bravo(this.f280j, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f314l != 0) {
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
            this.f314l = 2L;
        }
        oscar();
    }
}
