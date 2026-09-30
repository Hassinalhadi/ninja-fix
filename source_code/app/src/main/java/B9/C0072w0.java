package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.Image;
import s6.AbstractC2634d5;
import s6.AbstractC2643e5;

/* renamed from: B9.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0072w0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f710f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f711g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f712h;

    /* renamed from: i, reason: collision with root package name */
    public EnvelopNotification f713i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f714j;

    /* renamed from: k, reason: collision with root package name */
    public long f715k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0072w0(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 5, null, null);
        ImageView imageView = (ImageView) november[1];
        TextView textView = (TextView) november[3];
        TextView textView2 = (TextView) november[2];
        this.f710f = imageView;
        this.f711g = textView;
        this.f712h = textView2;
        this.f715k = -1L;
        this.f710f.setTag(null);
        ((CardView) november[0]).setTag(null);
        TextView textView3 = (TextView) november[4];
        this.f714j = textView3;
        textView3.setTag(null);
        this.f711g.setTag(null);
        this.f712h.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        String str3;
        Image image;
        String str4;
        synchronized (this) {
            j5 = this.f715k;
            this.f715k = 0L;
        }
        EnvelopNotification envelopNotification = this.f713i;
        long j6 = j5 & 3;
        String str5 = null;
        if (j6 != 0) {
            if (envelopNotification != null) {
                image = envelopNotification.getFile();
                str2 = envelopNotification.getTitle();
                str3 = envelopNotification.getMessage();
                str4 = envelopNotification.getCreatedAt();
            } else {
                image = null;
                str2 = null;
                str4 = null;
                str3 = null;
            }
            if (image != null) {
                str5 = image.getUrl();
            }
            str = AbstractC2634d5.alpha(str4);
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.delta(this.f710f, str5);
            J2.f.bravo(this.f714j, str3);
            J2.f.bravo(this.f711g, str);
            J2.f.bravo(this.f712h, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f715k != 0) {
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
            this.f715k = 2L;
        }
        oscar();
    }
}
