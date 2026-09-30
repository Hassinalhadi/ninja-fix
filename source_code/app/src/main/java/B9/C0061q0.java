package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import delivery.samurai.android.R;

/* renamed from: B9.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0061q0 extends ai {

    /* renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f608g;

    /* renamed from: f, reason: collision with root package name */
    public long f609f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f608g = sparseIntArray;
        sparseIntArray.put(R.id.rvAddressImage, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061q0(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 2, null, f608g);
        this.f609f = -1L;
        ((RelativeLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f609f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f609f != 0) {
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
            this.f609f = 1L;
        }
        oscar();
    }
}
