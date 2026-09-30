package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.CsatResponse;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class au extends at {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f393v;

    /* renamed from: u, reason: collision with root package name */
    public long f394u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f393v = sparseIntArray;
        sparseIntArray.put(R.id.clRatting, 5);
        sparseIntArray.put(R.id.tvTitle, 6);
        sparseIntArray.put(R.id.btnClose, 7);
        sparseIntArray.put(R.id.tvContentText, 8);
        sparseIntArray.put(R.id.tvDetailsTitle, 9);
        sparseIntArray.put(R.id.cvDetails, 10);
        sparseIntArray.put(R.id.tvTicketIdHeader, 11);
        sparseIntArray.put(R.id.vIdsDivider, 12);
        sparseIntArray.put(R.id.tvOrderIdHeader, 13);
        sparseIntArray.put(R.id.vDetailsHDivider, 14);
        sparseIntArray.put(R.id.tvTicketTitleHeader, 15);
        sparseIntArray.put(R.id.tvRateTitle, 16);
        sparseIntArray.put(R.id.lnRattingBar, 17);
        sparseIntArray.put(R.id.ivStar1, 18);
        sparseIntArray.put(R.id.ivStar2, 19);
        sparseIntArray.put(R.id.ivStar3, 20);
        sparseIntArray.put(R.id.ivStar4, 21);
        sparseIntArray.put(R.id.ivStar5, 22);
        sparseIntArray.put(R.id.tvAddFeedBack, 23);
        sparseIntArray.put(R.id.ilFeedback, 24);
        sparseIntArray.put(R.id.etFName, 25);
        sparseIntArray.put(R.id.clSubmitRate, 26);
        sparseIntArray.put(R.id.btnSubmitRate, 27);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public au(View view) {
        super(null, view, r0, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, (View) r16[14], (View) r16[12]);
        Object[] november = z1.g.november(view, 28, null, f393v);
        MaterialButton materialButton = (MaterialButton) november[27];
        TextInputLayout textInputLayout = (TextInputLayout) november[24];
        ImageView imageView = (ImageView) november[18];
        ImageView imageView2 = (ImageView) november[19];
        ImageView imageView3 = (ImageView) november[20];
        ImageView imageView4 = (ImageView) november[21];
        ImageView imageView5 = (ImageView) november[22];
        TextView textView = (TextView) november[4];
        TextView textView2 = (TextView) november[2];
        TextView textView3 = (TextView) november[1];
        TextView textView4 = (TextView) november[3];
        this.f394u = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        this.f386m.setTag(null);
        this.f387n.setTag(null);
        this.f388o.setTag(null);
        this.f389p.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        Integer num;
        int intValue;
        synchronized (this) {
            j5 = this.f394u;
            this.f394u = 0L;
        }
        CsatResponse csatResponse = this.f392s;
        long j6 = 3 & j5;
        String str3 = null;
        Integer num2 = null;
        if (j6 != 0) {
            if (csatResponse != null) {
                String ticketTitle = csatResponse.getTicketTitle();
                Integer ticketId = csatResponse.getTicketId();
                num = csatResponse.getOrderId();
                str2 = ticketTitle;
                num2 = ticketId;
            } else {
                num = null;
                str2 = null;
            }
            int i4 = 0;
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
            }
            if (num != null) {
                i4 = num.intValue();
            }
            String valueOf = String.valueOf(intValue);
            str3 = String.valueOf(i4);
            str = valueOf;
        } else {
            str = null;
            str2 = null;
        }
        if ((j5 & 2) != 0) {
            J2.f.bravo(this.f386m, " ( " + this.f386m.getResources().getString(R.string.optional) + " )");
        }
        if (j6 != 0) {
            J2.f.bravo(this.f387n, str3);
            J2.f.bravo(this.f388o, str);
            J2.f.bravo(this.f389p, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f394u != 0) {
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
            this.f394u = 2L;
        }
        oscar();
    }
}
