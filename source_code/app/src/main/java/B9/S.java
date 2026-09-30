package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class S extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f226g;

    /* renamed from: f, reason: collision with root package name */
    public long f227f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f226g = sparseIntArray;
        sparseIntArray.put(R.id.ivAddressImage, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 2, null, f226g);
        this.f227f = -1L;
        ((CardView) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f227f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f227f != 0) {
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
            this.f227f = 1L;
        }
        oscar();
    }
}
