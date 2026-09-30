package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class ak extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f345g;

    /* renamed from: f, reason: collision with root package name */
    public long f346f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f345g = sparseIntArray;
        sparseIntArray.put(R.id.ivError, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvSubtitle, 3);
        sparseIntArray.put(R.id.btnGotIt, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 5, null, f345g);
        this.f346f = -1L;
        ((CardView) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f346f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f346f != 0) {
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
            this.f346f = 1L;
        }
        oscar();
    }
}
