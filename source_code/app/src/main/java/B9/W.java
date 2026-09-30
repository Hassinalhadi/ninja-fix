package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.app.network.network.models.SignedAppAgreement;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import java.util.Date;
import s6.AbstractC2634d5;

/* loaded from: classes2.dex */
public final class W extends V {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f256j;

    /* renamed from: i, reason: collision with root package name */
    public long f257i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f256j = sparseIntArray;
        sparseIntArray.put(R.id.container, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W(View view) {
        super(null, view, r1, (TextView) r0[2]);
        Object[] november = z1.g.november(view, 4, null, f256j);
        TextView textView = (TextView) november[1];
        this.f257i = -1L;
        this.f251f.setTag(null);
        ((FrameLayout) november[0]).setTag(null);
        this.f252g.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        Date date;
        synchronized (this) {
            j5 = this.f257i;
            this.f257i = 0L;
        }
        SignedAppAgreement signedAppAgreement = this.f253h;
        long j6 = j5 & 3;
        String str3 = null;
        if (j6 != 0) {
            AndroidApp androidApp = AndroidApp.yellow;
            if (signedAppAgreement != null) {
                str2 = signedAppAgreement.getName();
                date = signedAppAgreement.getSignedAt();
            } else {
                str2 = null;
                date = null;
            }
            String bravo = AbstractC2634d5.bravo(date);
            if (androidApp != null) {
                str3 = androidApp.getString(R.string.signed_on, bravo);
            }
            str = str3;
            str3 = str2;
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f251f, str3);
            J2.f.bravo(this.f252g, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f257i != 0) {
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
            this.f257i = 2L;
        }
        oscar();
    }
}
