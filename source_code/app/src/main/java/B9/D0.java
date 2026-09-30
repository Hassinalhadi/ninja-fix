package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class D0 extends C0 {

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f101i;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f102g;

    /* renamed from: h, reason: collision with root package name */
    public long f103h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f101i = sparseIntArray;
        sparseIntArray.put(R.id.textView17, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 4, null, f101i);
        TextView textView = (TextView) november[1];
        this.f103h = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) november[2];
        this.f102g = appCompatTextView;
        appCompatTextView.setTag(null);
        ((TextView) this.f100f).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f103h;
            this.f103h = 0L;
        }
        if ((j5 & 3) != 0) {
            J2.f.bravo(this.f102g, null);
            J2.f.bravo((TextView) this.f100f, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f103h != 0) {
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
            this.f103h = 2L;
        }
        oscar();
    }
}
