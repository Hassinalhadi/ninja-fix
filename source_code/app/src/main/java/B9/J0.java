package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC0075y {

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f156k;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f157i;

    /* renamed from: j, reason: collision with root package name */
    public long f158j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f156k = sparseIntArray;
        sparseIntArray.put(R.id.cardView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J0(View view) {
        super(null, view, (ImageView) r0[2], (TextView) r0[3], (TextView) r0[1]);
        Object[] november = z1.g.november(view, 6, null, f156k);
        this.f158j = -1L;
        ((ImageView) this.f725f).setTag(null);
        ((ConstraintLayout) november[0]).setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) november[4];
        this.f157i = appCompatTextView;
        appCompatTextView.setTag(null);
        ((TextView) this.f726g).setTag(null);
        ((TextView) this.f727h).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f158j;
            this.f158j = 0L;
        }
        long j6 = j5 & 3;
        if (j6 != 0) {
            str = "null X ";
        } else {
            str = null;
        }
        if (j6 != 0) {
            ImageView imageView = (ImageView) this.f725f;
            Intrinsics.echo(imageView, "imageView");
            AbstractC2643e5.charlie(imageView, null, 0, 2);
            J2.f.bravo(this.f157i, null);
            J2.f.bravo((TextView) this.f726g, null);
            J2.f.bravo((TextView) this.f727h, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f158j != 0) {
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
            this.f158j = 2L;
        }
        oscar();
    }
}
