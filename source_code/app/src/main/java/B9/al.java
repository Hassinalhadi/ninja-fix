package B9;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class al extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f347g;

    /* renamed from: f, reason: collision with root package name */
    public long f348f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f347g = sparseIntArray;
        sparseIntArray.put(R.id.headerContainer, 1);
        sparseIntArray.put(R.id.tvHeaderTitle, 2);
        sparseIntArray.put(R.id.btnClose, 3);
        sparseIntArray.put(R.id.ivPreview, 4);
        sparseIntArray.put(R.id.btnRetake, 5);
        sparseIntArray.put(R.id.btnConfirm, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 7, null, f347g);
        this.f348f = -1L;
        ((MaterialCardView) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f348f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f348f != 0) {
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
            this.f348f = 1L;
        }
        oscar();
    }
}
