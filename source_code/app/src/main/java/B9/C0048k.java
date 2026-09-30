package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;

/* renamed from: B9.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0048k extends AbstractC0046j {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f510k;

    /* renamed from: j, reason: collision with root package name */
    public long f511j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f510k = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.swipe_refresh, 6);
        sparseIntArray.put(R.id.content_container, 7);
        sparseIntArray.put(R.id.platform, 8);
        sparseIntArray.put(R.id.receiptInfo, 9);
        sparseIntArray.put(R.id.rv_address_images, 10);
        sparseIntArray.put(R.id.clNotes, 11);
        sparseIntArray.put(R.id.ivAddNoteIcon, 12);
        sparseIntArray.put(R.id.tvAddNoteTitle, 13);
        sparseIntArray.put(R.id.rvNoteImages, 14);
        sparseIntArray.put(R.id.tv_confirmation_message, 15);
        sparseIntArray.put(R.id.bottom_actions, 16);
        sparseIntArray.put(R.id.btnCall, 17);
        sparseIntArray.put(R.id.ignoreBtn, 18);
        sparseIntArray.put(R.id.pb_loading, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0048k(View view) {
        super((z1.c) null, view, r6, r7, (TextView) r0[4], (TextView) r0[3]);
        Object[] november = z1.g.november(view, 20, null, f510k);
        TextView textView = (TextView) november[1];
        TextView textView2 = (TextView) november[2];
        this.f511j = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        this.f499f.setTag(null);
        this.f500g.setTag(null);
        this.f501h.setTag(null);
        this.f502i.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f511j;
            this.f511j = 0L;
        }
        long j6 = 5 & j5;
        long j7 = j5 & 6;
        if (j6 != 0) {
            J2.f.bravo(this.f499f, null);
            J2.f.bravo(this.f500g, null);
            J2.f.bravo(this.f502i, null);
        }
        if (j7 != 0) {
            J2.f.bravo(this.f501h, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f511j != 0) {
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
            this.f511j = 4L;
        }
        oscar();
    }
}
