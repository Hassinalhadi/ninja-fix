package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class k1 extends C0 {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f514n;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f515g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f516h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f517i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f518j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f519k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f520l;

    /* renamed from: m, reason: collision with root package name */
    public long f521m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f514n = sparseIntArray;
        sparseIntArray.put(R.id.iv_location, 7);
        sparseIntArray.put(R.id.btnTakeBreak, 8);
        sparseIntArray.put(R.id.btnCancelShift, 9);
        sparseIntArray.put(R.id.breakContainer, 10);
        sparseIntArray.put(R.id.tvBreakTitle, 11);
        sparseIntArray.put(R.id.tvBreakSubtitle, 12);
        sparseIntArray.put(R.id.cl_timer_group, 13);
        sparseIntArray.put(R.id.tvBreakMinutes, 14);
        sparseIntArray.put(R.id.tvBreakColon, 15);
        sparseIntArray.put(R.id.tvBreakSeconds, 16);
        sparseIntArray.put(R.id.tv_minutes_label, 17);
        sparseIntArray.put(R.id.tv_seconds_label, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k1(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 19, null, f514n);
        LinearLayout linearLayout = (LinearLayout) november[0];
        this.f521m = -1L;
        TextView textView = (TextView) november[1];
        this.f515g = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) november[2];
        this.f516h = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) november[3];
        this.f517i = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) november[4];
        this.f518j = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) november[5];
        this.f519k = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) november[6];
        this.f520l = textView6;
        textView6.setTag(null);
        ((LinearLayout) this.f100f).setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        Object obj;
        synchronized (this) {
            j5 = this.f521m;
            this.f521m = 0L;
        }
        long j6 = j5 & 3;
        if (j6 != 0 && j6 != 0) {
            j5 |= 4;
        }
        long j7 = j5 & 4;
        if (j7 != 0 && j7 != 0) {
            j5 |= 16;
        }
        if ((4 & j5) != 0) {
            obj = Character.valueOf(NumberOnlyZipVisualTransformation.HYPHEN);
        } else {
            obj = null;
        }
        long j10 = j5 & 3;
        if (j10 == 0) {
            obj = null;
        }
        if (j10 != 0) {
            J2.f.bravo(this.f515g, null);
            J2.f.bravo(this.f516h, (CharSequence) obj);
            J2.f.bravo(this.f517i, null);
            J2.f.bravo(this.f518j, null);
            J2.f.bravo(this.f519k, null);
            J2.f.bravo(this.f520l, null);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f521m != 0) {
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
            this.f521m = 2L;
        }
        oscar();
    }
}
