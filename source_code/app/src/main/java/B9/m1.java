package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class m1 extends l1 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f560x;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f561t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f562u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f563v;

    /* renamed from: w, reason: collision with root package name */
    public long f564w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f560x = sparseIntArray;
        sparseIntArray.put(R.id.tv_busy_time_dis, 18);
        sparseIntArray.put(R.id.tv_delay_minutes, 19);
        sparseIntArray.put(R.id.tv_roaming, 20);
        sparseIntArray.put(R.id.tv_disconnected, 21);
        sparseIntArray.put(R.id.tv_pickup, 22);
        sparseIntArray.put(R.id.tv_delivery, 23);
        sparseIntArray.put(R.id.tv_return, 24);
        sparseIntArray.put(R.id.tv_total_delivered, 25);
        sparseIntArray.put(R.id.tv_earnings_dis, 26);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m1(View view) {
        super(null, view, r0, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        Object[] november = z1.g.november(view, 27, null, f560x);
        TextView textView = (TextView) november[2];
        TextView textView2 = (TextView) november[14];
        TextView textView3 = (TextView) november[10];
        TextView textView4 = (TextView) november[11];
        TextView textView5 = (TextView) november[7];
        TextView textView6 = (TextView) november[15];
        TextView textView7 = (TextView) november[8];
        TextView textView8 = (TextView) november[9];
        TextView textView9 = (TextView) november[12];
        TextView textView10 = (TextView) november[13];
        TextView textView11 = (TextView) november[6];
        TextView textView12 = (TextView) november[4];
        TextView textView13 = (TextView) november[16];
        TextView textView14 = (TextView) november[17];
        this.f564w = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        TextView textView15 = (TextView) november[1];
        this.f561t = textView15;
        textView15.setTag(null);
        TextView textView16 = (TextView) november[3];
        this.f562u = textView16;
        textView16.setTag(null);
        TextView textView17 = (TextView) november[5];
        this.f563v = textView17;
        textView17.setTag(null);
        this.f540f.setTag(null);
        this.f541g.setTag(null);
        this.f542h.setTag(null);
        this.f543i.setTag(null);
        this.f544j.setTag(null);
        this.f545k.setTag(null);
        this.f546l.setTag(null);
        this.f547m.setTag(null);
        this.f548n.setTag(null);
        this.f549o.setTag(null);
        this.f550p.setTag(null);
        this.f551q.setTag(null);
        this.f552r.setTag(null);
        this.f553s.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        long j6;
        synchronized (this) {
            j5 = this.f564w;
            this.f564w = 0L;
        }
        if ((j5 & 3) == 0) {
            int i4 = 0;
            if ((Http2Stream.EMIT_BUFFER_SIZE & j5) != 0 && 0.0d != 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j7 = j5 & 4;
            if (j7 != 0 && j7 != 0) {
                j5 |= 256;
            }
            long j10 = j5 & 3;
            if (j10 != 0) {
                str = "-";
                str2 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                str3 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                if (j10 != 0) {
                    if (z2) {
                        j6 = 2048;
                    } else {
                        j6 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    }
                    j5 |= j6;
                }
                if (!z2) {
                    i4 = 8;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if ((4 & j5) != 0) {
                str4 = "-";
            } else {
                str4 = null;
            }
            long j11 = j5 & 3;
            if (j11 == 0) {
                str4 = null;
            }
            if (j11 != 0) {
                J2.f.bravo(this.f561t, null);
                J2.f.bravo(this.f562u, null);
                J2.f.bravo(this.f563v, null);
                J2.f.bravo(this.f540f, str4);
                J2.f.bravo(this.f541g, str);
                J2.f.bravo(this.f542h, null);
                J2.f.bravo(this.f543i, null);
                J2.f.bravo(this.f544j, null);
                J2.f.bravo(this.f545k, str3);
                J2.f.bravo(this.f546l, null);
                J2.f.bravo(this.f547m, null);
                J2.f.bravo(this.f548n, null);
                J2.f.bravo(this.f549o, null);
                J2.f.bravo(this.f550p, null);
                J2.f.bravo(this.f551q, null);
                this.f552r.setVisibility(i4);
                J2.f.bravo(this.f553s, str2);
                this.f553s.setVisibility(i4);
                return;
            }
            return;
        }
        Intrinsics.echo(null, "<this>");
        throw null;
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f564w != 0) {
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
            this.f564w = 2L;
        }
        oscar();
    }
}
