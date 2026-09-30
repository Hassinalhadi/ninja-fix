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
import s6.AbstractC2634d5;
import s6.AbstractC2643e5;

/* renamed from: B9.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0052m extends AbstractC0050l {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f554l;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f555i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f556j;

    /* renamed from: k, reason: collision with root package name */
    public long f557k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f554l = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0052m(View view) {
        super(null, view, (Toolbar) r0[4], (TextView) r0[3]);
        Object[] november = z1.g.november(view, 5, null, f554l);
        this.f557k = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        ImageView imageView = (ImageView) november[1];
        this.f555i = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) november[2];
        this.f556j = textView;
        textView.setTag(null);
        this.f523g.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        Image image;
        String str3;
        synchronized (this) {
            j5 = this.f557k;
            this.f557k = 0L;
        }
        EnvelopNotification envelopNotification = this.f524h;
        long j6 = j5 & 3;
        String str4 = null;
        if (j6 != 0) {
            if (envelopNotification != null) {
                image = envelopNotification.getFile();
                str3 = envelopNotification.getCreatedAt();
                str2 = envelopNotification.getMessage();
            } else {
                image = null;
                str3 = null;
                str2 = null;
            }
            if (image != null) {
                str4 = image.getUrl();
            }
            str = AbstractC2634d5.alpha(str3);
        } else {
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.delta(this.f555i, str4);
            J2.f.bravo(this.f556j, str);
            J2.f.bravo(this.f523g, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f557k != 0) {
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
            this.f557k = 2L;
        }
        oscar();
    }

    @Override // B9.AbstractC0050l
    public final void romeo(EnvelopNotification envelopNotification) {
        this.f524h = envelopNotification;
        synchronized (this) {
            this.f557k |= 1;
        }
        delta();
        oscar();
    }
}
