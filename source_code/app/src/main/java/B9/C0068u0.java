package B9;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import delivery.samurai.android.R;
import t6.AbstractC3032n3;

/* renamed from: B9.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0068u0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f698f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f699g;

    /* renamed from: h, reason: collision with root package name */
    public long f700h;

    /* renamed from: i, reason: collision with root package name */
    public final View f701i;

    /* renamed from: j, reason: collision with root package name */
    public final View f702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068u0(z1.c cVar, View view, View view2, TextView textView, int i4) {
        super(view, 0, cVar);
        this.f698f = i4;
        this.f701i = view2;
        this.f699g = textView;
    }

    private final void romeo() {
        long j5;
        synchronized (this) {
            j5 = this.f700h;
            this.f700h = 0L;
        }
        if ((j5 & 3) != 0) {
            J2.f.bravo((TextView) this.f702j, null);
            J2.f.bravo(this.f699g, null);
        }
    }

    private final boolean sierra() {
        synchronized (this) {
            try {
                if (this.f700h != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void tango() {
        synchronized (this) {
            this.f700h = 2L;
        }
        oscar();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        Drawable drawable;
        Drawable drawable2;
        switch (this.f698f) {
            case 0:
                romeo();
                return;
            default:
                synchronized (this) {
                    j5 = this.f700h;
                    this.f700h = 0L;
                }
                long j6 = j5 & 3;
                if (j6 != 0) {
                    if (j6 != 0) {
                        j5 |= 20;
                    }
                    drawable = AbstractC3032n3.echo(R.drawable.radio_unselected_bg, ((ConstraintLayout) this.f702j).getContext());
                    drawable2 = AbstractC3032n3.echo(R.drawable.ic_radio_unselected, ((ImageView) this.f701i).getContext());
                } else {
                    drawable = null;
                    drawable2 = null;
                }
                if ((j5 & 3) != 0) {
                    ((ImageView) this.f701i).setImageDrawable(drawable2);
                    ((ConstraintLayout) this.f702j).setBackground(drawable);
                    J2.f.bravo(this.f699g, null);
                    return;
                }
                return;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        switch (this.f698f) {
            case 0:
                return sierra();
            default:
                synchronized (this) {
                    try {
                        if (this.f700h != 0) {
                            return true;
                        }
                        return false;
                    } finally {
                    }
                }
        }
    }

    @Override // z1.g
    public final void lima() {
        switch (this.f698f) {
            case 0:
                tango();
                return;
            default:
                synchronized (this) {
                    this.f700h = 2L;
                }
                oscar();
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0068u0(int i4, View view) {
        this(null, view, (LinearLayout) r13[0], (TextView) r13[2], 0);
        this.f698f = i4;
        switch (i4) {
            case 1:
                Object[] november = z1.g.november(view, 3, null, null);
                this(null, view, (ImageView) november[2], (TextView) november[1], 1);
                this.f700h = -1L;
                ((ImageView) this.f701i).setTag(null);
                ConstraintLayout constraintLayout = (ConstraintLayout) november[0];
                this.f702j = constraintLayout;
                constraintLayout.setTag(null);
                this.f699g.setTag(null);
                papa(view);
                lima();
                return;
            default:
                Object[] november2 = z1.g.november(view, 3, null, null);
                this.f700h = -1L;
                ((LinearLayout) this.f701i).setTag(null);
                TextView textView = (TextView) november2[1];
                this.f702j = textView;
                textView.setTag(null);
                this.f699g.setTag(null);
                papa(view);
                lima();
                return;
        }
    }
}
