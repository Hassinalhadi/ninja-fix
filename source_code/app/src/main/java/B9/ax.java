package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class ax extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f395g;

    /* renamed from: f, reason: collision with root package name */
    public long f396f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f395g = sparseIntArray;
        sparseIntArray.put(R.id.btnClose, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvSubtitle, 3);
        sparseIntArray.put(R.id.rv_times, 4);
        sparseIntArray.put(R.id.btnStartBreak, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 6, null, f395g);
        this.f396f = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f396f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f396f != 0) {
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
            this.f396f = 1L;
        }
        oscar();
    }
}
