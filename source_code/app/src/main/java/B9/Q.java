package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class Q extends P {

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f216i;

    /* renamed from: h, reason: collision with root package name */
    public long f217h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f216i = sparseIntArray;
        sparseIntArray.put(R.id.ivAddressImage, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q(View view) {
        super(null, view, (ImageView) r0[1]);
        Object[] november = z1.g.november(view, 2, null, f216i);
        this.f217h = -1L;
        ((CardView) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f217h = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f217h != 0) {
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
            this.f217h = 1L;
        }
        oscar();
    }
}
