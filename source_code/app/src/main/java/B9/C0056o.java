package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.Image;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* renamed from: B9.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0056o extends AbstractC0054n {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f582m;

    /* renamed from: l, reason: collision with root package name */
    public long f583l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f582m = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.tvCategory, 4);
        sparseIntArray.put(R.id.tvTimestamp, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0056o(View view) {
        super(null, view, (ImageView) r0[1], (Toolbar) r0[3], (TextView) r0[4], (TextView) r0[2], (TextView) r0[5]);
        Object[] november = z1.g.november(view, 6, null, f582m);
        this.f583l = -1L;
        this.f565f.setTag(null);
        ((ConstraintLayout) november[0]).setTag(null);
        this.f568i.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        Image image;
        synchronized (this) {
            j5 = this.f583l;
            this.f583l = 0L;
        }
        EnvelopNotification envelopNotification = this.f570k;
        long j6 = j5 & 3;
        String str2 = null;
        if (j6 != 0) {
            if (envelopNotification != null) {
                image = envelopNotification.getFile();
                str = envelopNotification.getMessage();
            } else {
                image = null;
                str = null;
            }
            if (image != null) {
                str2 = image.getUrl();
            }
        } else {
            str = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.delta(this.f565f, str2);
            J2.f.bravo(this.f568i, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f583l != 0) {
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
            this.f583l = 2L;
        }
        oscar();
    }

    @Override // B9.AbstractC0054n
    public final void romeo(EnvelopNotification envelopNotification) {
        this.f570k = envelopNotification;
        synchronized (this) {
            this.f583l |= 1;
        }
        delta();
        oscar();
    }
}
