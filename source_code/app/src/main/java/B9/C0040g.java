package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;

/* renamed from: B9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0040g extends AbstractC0038f {

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f462i;

    /* renamed from: h, reason: collision with root package name */
    public long f463h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f462i = sparseIntArray;
        sparseIntArray.put(R.id.qrCardView, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.description, 3);
        sparseIntArray.put(R.id.btnQrCode, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0040g(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 5, null, f462i);
        ImageButton imageButton = (ImageButton) november[4];
        this.f463h = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f463h = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f463h != 0) {
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
            this.f463h = 1L;
        }
        oscar();
    }
}
