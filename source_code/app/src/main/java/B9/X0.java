package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class X0 extends C0 {

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f269i;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f270g;

    /* renamed from: h, reason: collision with root package name */
    public long f271h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f269i = sparseIntArray;
        sparseIntArray.put(R.id.flag, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 3, null, f269i);
        ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
        this.f271h = -1L;
        ((ConstraintLayout) this.f100f).setTag(null);
        TextView textView = (TextView) november[1];
        this.f270g = textView;
        textView.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f271h;
            this.f271h = 0L;
        }
        long j6 = 5 & j5;
        if ((j5 & 6) != 0) {
            AbstractC2643e5.echo(this.f270g, null);
        }
        if (j6 != 0) {
            J2.f.bravo(this.f270g, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f271h != 0) {
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
            this.f271h = 4L;
        }
        oscar();
    }
}
