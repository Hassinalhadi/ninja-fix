package B9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Country;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;
import t6.AbstractC3032n3;

/* renamed from: B9.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0059p0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCardView f590f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f591g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f592h;

    /* renamed from: i, reason: collision with root package name */
    public Country f593i;

    /* renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f594j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f595k;

    /* renamed from: l, reason: collision with root package name */
    public long f596l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059p0(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 5, null, null);
        MaterialCardView materialCardView = (MaterialCardView) november[1];
        ImageView imageView = (ImageView) november[4];
        TextView textView = (TextView) november[3];
        this.f590f = materialCardView;
        this.f591g = imageView;
        this.f592h = textView;
        this.f596l = -1L;
        this.f590f.setTag(null);
        this.f591g.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
        this.f594j = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView2 = (TextView) november[2];
        this.f595k = textView2;
        textView2.setTag(null);
        this.f592h.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        Drawable drawable;
        boolean z2;
        String str3;
        int i4;
        Context context;
        int i5;
        boolean z10;
        long j6;
        long j7;
        synchronized (this) {
            j5 = this.f596l;
            this.f596l = 0L;
        }
        Country country = this.f593i;
        long j10 = j5 & 3;
        int i10 = 0;
        Drawable drawable2 = null;
        String str4 = null;
        if (j10 != 0) {
            if (country != null) {
                String localizedName = country.getLocalizedName();
                z2 = country.getIsSelected();
                str4 = country.getEmoji();
                str3 = localizedName;
            } else {
                z2 = false;
                str3 = null;
            }
            if (j10 != 0) {
                if (z2) {
                    j7 = 136;
                } else {
                    j7 = 68;
                }
                j5 |= j7;
            }
            Context context2 = this.f591g.getContext();
            if (z2) {
                i4 = R.drawable.ic_radio_selected;
            } else {
                i4 = R.drawable.ic_radio_unselected;
            }
            Drawable echo = AbstractC3032n3.echo(i4, context2);
            if (z2) {
                context = this.f594j.getContext();
                i5 = R.drawable.radio_selected_bg;
            } else {
                context = this.f594j.getContext();
                i5 = R.drawable.radio_unselected_bg;
            }
            drawable = AbstractC3032n3.echo(i5, context);
            if (str4 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((j5 & 3) != 0) {
                if (z10) {
                    j6 = 32;
                } else {
                    j6 = 16;
                }
                j5 |= j6;
            }
            if (!z10) {
                i10 = 8;
            }
            str2 = str3;
            str = str4;
            drawable2 = echo;
        } else {
            str = null;
            str2 = null;
            drawable = null;
        }
        if ((j5 & 3) != 0) {
            this.f590f.setVisibility(i10);
            this.f591g.setImageDrawable(drawable2);
            this.f594j.setBackground(drawable);
            J2.f.bravo(this.f595k, str);
            J2.f.bravo(this.f592h, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f596l != 0) {
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
            this.f596l = 2L;
        }
        oscar();
    }
}
