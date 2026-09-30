package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class ad extends ac {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f327q;

    /* renamed from: p, reason: collision with root package name */
    public long f328p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f327q = sparseIntArray;
        sparseIntArray.put(R.id.tv_label, 5);
        sparseIntArray.put(R.id.tv_cost, 6);
        sparseIntArray.put(R.id.v_cost_divider, 7);
        sparseIntArray.put(R.id.tv_balance, 8);
        sparseIntArray.put(R.id.tv_balance_value, 9);
        sparseIntArray.put(R.id.v_balance_divider, 10);
        sparseIntArray.put(R.id.tv_remaining, 11);
        sparseIntArray.put(R.id.btn_redeem, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ad(View view) {
        super(null, view, r6, r7, r8, r9, r10, (TextView) r0[4], (View) r0[10], (View) r0[7]);
        Object[] november = z1.g.november(view, 13, null, f327q);
        MaterialButton materialButton = (MaterialButton) november[12];
        ImageView imageView = (ImageView) november[1];
        TextView textView = (TextView) november[9];
        TextView textView2 = (TextView) november[3];
        TextView textView3 = (TextView) november[2];
        this.f328p = -1L;
        this.f319g.setTag(null);
        ((ConstraintLayout) november[0]).setTag(null);
        this.f321i.setTag(null);
        this.f322j.setTag(null);
        this.f323k.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        String str3;
        int i4;
        double d4;
        String str4;
        int i5;
        synchronized (this) {
            j5 = this.f328p;
            this.f328p = 0L;
        }
        PointRewardResponse pointRewardResponse = this.f326n;
        long j6 = j5 & 3;
        String str5 = null;
        if (j6 != 0) {
            if (pointRewardResponse != null) {
                str5 = pointRewardResponse.getName();
                i4 = pointRewardResponse.getUsageCount();
                d4 = pointRewardResponse.getPoints();
                str4 = pointRewardResponse.getImageUrl();
                i5 = pointRewardResponse.getUsageLimit();
            } else {
                i4 = 0;
                d4 = 0.0d;
                str4 = null;
                i5 = 0;
            }
            str3 = String.valueOf(d4);
            String valueOf = String.valueOf(i5 - i4);
            str = str5;
            str5 = str4;
            str2 = valueOf;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.delta(this.f319g, str5);
            J2.f.bravo(this.f321i, str3);
            J2.f.bravo(this.f322j, str);
            J2.f.bravo(this.f323k, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f328p != 0) {
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
            this.f328p = 2L;
        }
        oscar();
    }
}
