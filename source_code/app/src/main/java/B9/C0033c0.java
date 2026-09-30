package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.captian.Assets;
import delivery.samurai.android.R;

/* renamed from: B9.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0033c0 extends AbstractC0031b0 {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f429m;

    /* renamed from: l, reason: collision with root package name */
    public long f430l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f429m = sparseIntArray;
        sparseIntArray.put(R.id.container, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0033c0(View view) {
        super(null, view, r6, r7, (ImageView) r0[2], (TextView) r0[4], (TextView) r0[5]);
        Object[] november = z1.g.november(view, 7, null, f429m);
        TextView textView = (TextView) november[1];
        TextView textView2 = (TextView) november[3];
        this.f430l = -1L;
        this.f416f.setTag(null);
        this.f417g.setTag(null);
        this.f418h.setTag(null);
        this.f419i.setTag(null);
        ((FrameLayout) november[0]).setTag(null);
        this.f420j.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        String str3;
        String str4;
        double d4;
        String str5;
        boolean z2;
        long j6;
        synchronized (this) {
            j5 = this.f430l;
            this.f430l = 0L;
        }
        Assets assets = this.f421k;
        long j7 = j5 & 3;
        int i4 = 0;
        String str6 = null;
        if (j7 != 0) {
            if (assets != null) {
                d4 = assets.getCost();
                str5 = assets.getImageUrl();
                str4 = assets.getExternalId();
                str3 = assets.getName();
                str = assets.getReturnLocationName();
            } else {
                str = null;
                str4 = null;
                str3 = null;
                d4 = 0.0d;
                str5 = null;
            }
            String valueOf = String.valueOf(d4);
            if (str5 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j7 != 0) {
                if (z2) {
                    j6 = 8;
                } else {
                    j6 = 4;
                }
                j5 |= j6;
            }
            String echo = av.q.echo("-", valueOf);
            if (!z2) {
                i4 = 8;
            }
            str2 = echo;
            str6 = str4;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((j5 & 3) != 0) {
            J2.f.bravo(this.f416f, str6);
            J2.f.bravo(this.f417g, str3);
            this.f418h.setVisibility(i4);
            J2.f.bravo(this.f419i, str);
            J2.f.bravo(this.f420j, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f430l != 0) {
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
            this.f430l = 2L;
        }
        oscar();
    }
}
