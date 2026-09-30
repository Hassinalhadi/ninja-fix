package B9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.PlatformListResponse;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;
import t6.AbstractC3032n3;

/* loaded from: classes2.dex */
public final class R0 extends Q0 {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f223m;

    /* renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f224k;

    /* renamed from: l, reason: collision with root package name */
    public long f225l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f223m = sparseIntArray;
        sparseIntArray.put(R.id.cvUnavailableTag, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R0(View view) {
        super(null, view, (ImageView) r0[3], (ImageView) r0[1], (TextView) r0[2]);
        Object[] november = z1.g.november(view, 5, null, f223m);
        this.f225l = -1L;
        this.f218f.setTag(null);
        this.f219g.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
        this.f224k = constraintLayout;
        constraintLayout.setTag(null);
        this.f220h.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        Drawable drawable;
        Drawable drawable2;
        String str;
        boolean booleanValue;
        int i4;
        Context context;
        int i5;
        long j6;
        synchronized (this) {
            j5 = this.f225l;
            this.f225l = 0L;
        }
        Boolean bool = this.f222j;
        PlatformListResponse platformListResponse = this.f221i;
        long j7 = j5 & 5;
        String str2 = null;
        if (j7 != 0) {
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (j7 != 0) {
                if (booleanValue) {
                    j6 = 80;
                } else {
                    j6 = 40;
                }
                j5 |= j6;
            }
            Context context2 = this.f224k.getContext();
            if (booleanValue) {
                i4 = R.drawable.radio_selected_bg;
            } else {
                i4 = R.drawable.radio_unselected_bg;
            }
            drawable2 = AbstractC3032n3.echo(i4, context2);
            if (booleanValue) {
                context = this.f218f.getContext();
                i5 = R.drawable.ic_radio_selected;
            } else {
                context = this.f218f.getContext();
                i5 = R.drawable.ic_radio_unselected;
            }
            drawable = AbstractC3032n3.echo(i5, context);
        } else {
            drawable = null;
            drawable2 = null;
        }
        long j10 = 6 & j5;
        if (j10 != 0 && platformListResponse != null) {
            str2 = platformListResponse.getImageUrl();
            str = platformListResponse.getLocalizedName();
        } else {
            str = null;
        }
        if ((j5 & 5) != 0) {
            this.f218f.setImageDrawable(drawable);
            this.f224k.setBackground(drawable2);
        }
        if (j10 != 0) {
            AbstractC2643e5.alpha(this.f219g, str2);
            J2.f.bravo(this.f220h, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f225l != 0) {
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
            this.f225l = 4L;
        }
        oscar();
    }

    @Override // B9.Q0
    public final void romeo(Boolean bool) {
        this.f222j = bool;
        synchronized (this) {
            this.f225l |= 1;
        }
        delta();
        oscar();
    }
}
