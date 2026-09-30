package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class Y extends X {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f272l;

    /* renamed from: k, reason: collision with root package name */
    public long f273k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f272l = sparseIntArray;
        sparseIntArray.put(R.id.container, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Y(View view) {
        super((z1.c) null, view, r6, r7, (ImageView) r0[2], (TextView) r0[4], (TextView) r0[5]);
        Object[] november = z1.g.november(view, 7, null, f272l);
        TextView textView = (TextView) november[1];
        TextView textView2 = (TextView) november[3];
        this.f273k = -1L;
        this.f264f.setTag(null);
        this.f265g.setTag(null);
        ((ImageView) this.f268j).setTag(null);
        this.f266h.setTag(null);
        ((FrameLayout) november[0]).setTag(null);
        this.f267i.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        int i4;
        String str;
        synchronized (this) {
            j5 = this.f273k;
            this.f273k = 0L;
        }
        long j6 = j5 & 3;
        if (j6 != 0) {
            if (j6 != 0) {
                j5 |= 4;
            }
            str = av.q.echo("-", String.valueOf(0.0d));
            i4 = 8;
        } else {
            i4 = 0;
            str = null;
        }
        if ((j5 & 3) != 0) {
            J2.f.bravo(this.f264f, null);
            J2.f.bravo(this.f265g, null);
            ((ImageView) this.f268j).setVisibility(i4);
            J2.f.bravo(this.f266h, null);
            J2.f.bravo(this.f267i, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f273k != 0) {
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
            this.f273k = 2L;
        }
        oscar();
    }
}
