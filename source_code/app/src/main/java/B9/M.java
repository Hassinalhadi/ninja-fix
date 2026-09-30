package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.captian.User;
import com.app.network.network.models.captian.UserMobile;
import delivery.samurai.android.R;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class M extends L {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f181v;

    /* renamed from: u, reason: collision with root package name */
    public long f182u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f181v = sparseIntArray;
        sparseIntArray.put(R.id.cardView3, 5);
        sparseIntArray.put(R.id.cardView5, 6);
        sparseIntArray.put(R.id.cardView4, 7);
        sparseIntArray.put(R.id.textView7, 8);
        sparseIntArray.put(R.id.textView14, 9);
        sparseIntArray.put(R.id.textView17, 10);
        sparseIntArray.put(R.id.textView18, 11);
        sparseIntArray.put(R.id.tvFintech, 12);
        sparseIntArray.put(R.id.ivEditStcPay, 13);
        sparseIntArray.put(R.id.textViewUrPayIdLabel, 14);
        sparseIntArray.put(R.id.tvUrPayIdValue, 15);
        sparseIntArray.put(R.id.textViewUrPayLabel, 16);
        sparseIntArray.put(R.id.tvUrPayValue, 17);
        sparseIntArray.put(R.id.ivEditUrPay, 18);
        sparseIntArray.put(R.id.textView19, 19);
        sparseIntArray.put(R.id.tvBlocked, 20);
        sparseIntArray.put(R.id.ivCaptainQr, 21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M(View view) {
        super(null, view, r0, r4, r5, r6, r7, r8, r9, r10, r11, (TextView) r16[20], (TextView) r16[12], (TextView) r16[15], (TextView) r16[17]);
        Object[] november = z1.g.november(view, 22, null, f181v);
        ImageView imageView = (ImageView) november[21];
        ImageView imageView2 = (ImageView) november[13];
        ImageView imageView3 = (ImageView) november[18];
        ImageView imageView4 = (ImageView) november[1];
        TextView textView = (TextView) november[4];
        TextView textView2 = (TextView) november[11];
        TextView textView3 = (TextView) november[19];
        TextView textView4 = (TextView) november[3];
        TextView textView5 = (TextView) november[2];
        this.f182u = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        this.f167i.setTag(null);
        this.f168j.setTag(null);
        this.f171m.setTag(null);
        this.f172n.setTag(null);
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
        UserMobile userMobile;
        synchronized (this) {
            j5 = this.f182u;
            this.f182u = 0L;
        }
        User user = this.f177s;
        long j6 = j5 & 3;
        String str5 = null;
        if (j6 != 0) {
            if (user != null) {
                str4 = user.getProfilePictureUrl();
                str2 = user.getName();
                str3 = user.getEmail();
                userMobile = user.getUserMobile();
            } else {
                str4 = null;
                str2 = null;
                userMobile = null;
                str3 = null;
            }
            if (userMobile != null) {
                str5 = userMobile.getMobileNumber();
            }
            String str6 = str4;
            str = str5;
            str5 = str6;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j6 != 0) {
            AbstractC2643e5.alpha(this.f167i, str5);
            J2.f.bravo(this.f168j, str);
            J2.f.bravo(this.f171m, str3);
            J2.f.bravo(this.f172n, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f182u != 0) {
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
            this.f182u = 2L;
        }
        oscar();
    }
}
