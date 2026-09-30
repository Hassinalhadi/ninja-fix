package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class ah extends ag {

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f341i;

    /* renamed from: h, reason: collision with root package name */
    public long f342h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f341i = sparseIntArray;
        sparseIntArray.put(R.id.animationView, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvMessage, 3);
        sparseIntArray.put(R.id.btnOk, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ah(View view) {
        super(null, view, r1, r3);
        Object[] november = z1.g.november(view, 5, null, f341i);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) november[1];
        MaterialButton materialButton = (MaterialButton) november[4];
        this.f342h = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f342h = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f342h != 0) {
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
            this.f342h = 2L;
        }
        oscar();
    }
}
