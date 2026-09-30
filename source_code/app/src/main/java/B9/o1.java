package B9;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.WithdrawHistory;
import com.app.network.network.models.WithdrawStatus;
import delivery.samurai.android.R;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2634d5;

/* loaded from: classes2.dex */
public final class o1 extends n1 {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f587n;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f588l;

    /* renamed from: m, reason: collision with root package name */
    public long f589m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f587n = sparseIntArray;
        sparseIntArray.put(R.id.view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o1(View view) {
        super(null, view, (TextView) r0[2], (ImageView) r0[1], (TextView) r0[3], (View) r0[5]);
        Object[] november = z1.g.november(view, 6, null, f587n);
        this.f589m = -1L;
        this.f576f.setTag(null);
        ((ConstraintLayout) november[0]).setTag(null);
        TextView textView = (TextView) november[4];
        this.f588l = textView;
        textView.setTag(null);
        this.f577g.setTag(null);
        this.f578h.setTag(null);
        papa(view);
        lima();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    @Override // z1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot() {
        long j5;
        int i4;
        long j6;
        int i5;
        String str;
        String str2;
        WithdrawStatus withdrawStatus;
        String str3;
        boolean booleanValue;
        long j7;
        synchronized (this) {
            j5 = this.f589m;
            this.f589m = 0L;
        }
        Boolean bool = this.f581k;
        WithdrawHistory withdrawHistory = this.f580j;
        long j10 = j5 & 5;
        int i10 = 0;
        if (j10 != 0) {
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (j10 != 0) {
                if (booleanValue) {
                    j7 = 16;
                } else {
                    j7 = 8;
                }
                j5 |= j7;
            }
            if (!booleanValue) {
                i4 = 8;
                j6 = 6 & j5;
                String str4 = null;
                Date date = null;
                if (j6 == 0) {
                    if (withdrawHistory != null) {
                        date = withdrawHistory.getCreatedAt();
                        str3 = withdrawHistory.getStatusColor();
                        str = withdrawHistory.getRefusalReason();
                        str2 = withdrawHistory.getStatusDisplayName();
                        withdrawStatus = withdrawHistory.getStatus();
                    } else {
                        withdrawStatus = null;
                        str3 = null;
                        str = null;
                        str2 = null;
                    }
                    str4 = AbstractC2634d5.bravo(date);
                    i5 = Color.parseColor(str3);
                    if (withdrawStatus != null) {
                        i10 = withdrawStatus.ordinal();
                    }
                } else {
                    i5 = 0;
                    str = null;
                    str2 = null;
                }
                if (j6 != 0) {
                    J2.f.bravo(this.f576f, str4);
                    J2.f.bravo(this.f588l, str);
                    ImageView imageView = this.f577g;
                    Intrinsics.echo(imageView, "imageView");
                    imageView.getDrawable().setLevel(i10);
                    J2.f.bravo(this.f578h, str2);
                    if (z1.g.f14183b >= 21) {
                        this.f577g.setBackgroundTintList(ColorStateList.valueOf(i5));
                    }
                }
                if ((j5 & 5) == 0) {
                    this.f588l.setVisibility(i4);
                    return;
                }
                return;
            }
        }
        i4 = 0;
        j6 = 6 & j5;
        String str42 = null;
        Date date2 = null;
        if (j6 == 0) {
        }
        if (j6 != 0) {
        }
        if ((j5 & 5) == 0) {
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f589m != 0) {
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
            this.f589m = 4L;
        }
        oscar();
    }

    @Override // B9.n1
    public final void romeo(Boolean bool) {
        this.f581k = bool;
        synchronized (this) {
            this.f589m |= 1;
        }
        delta();
        oscar();
    }
}
