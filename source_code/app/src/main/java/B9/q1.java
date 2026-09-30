package B9;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.SparseIntArray;
import android.widget.ImageView;
import com.app.network.network.models.Currency;
import com.app.network.network.models.WithdrawStatus;
import com.app.network.network.models.WithdrawTransaction;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2634d5;

/* loaded from: classes2.dex */
public final class q1 extends p1 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f610q;

    /* renamed from: p, reason: collision with root package name */
    public long f611p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f610q = sparseIntArray;
        sparseIntArray.put(R.id.arrow, 9);
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        long j6;
        long j7;
        int i4;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i5;
        int i10;
        int i11;
        String str6;
        Float f5;
        Currency currency;
        Boolean bool;
        Integer num;
        String str7;
        WithdrawStatus withdrawStatus;
        String str8;
        Date date;
        String str9;
        boolean booleanValue;
        boolean z2;
        String str10;
        int i12;
        long j10;
        long j11;
        synchronized (this) {
            j5 = this.f611p;
            this.f611p = 0L;
        }
        WithdrawTransaction withdrawTransaction = this.f606o;
        long j12 = j5 & 3;
        String str11 = null;
        if (j12 != 0) {
            AndroidApp androidApp = AndroidApp.yellow;
            if (withdrawTransaction != null) {
                f5 = withdrawTransaction.getAmount();
                currency = withdrawTransaction.getCurrency();
                bool = withdrawTransaction.getCanCancel();
                String statusDisplayName = withdrawTransaction.getStatusDisplayName();
                num = withdrawTransaction.getId();
                str7 = withdrawTransaction.getStatusColor();
                withdrawStatus = withdrawTransaction.getStatus();
                str8 = withdrawTransaction.getPlatformName();
                date = withdrawTransaction.getCreatedAt();
                str3 = withdrawTransaction.getTransactionTypeDisplayName();
                str6 = statusDisplayName;
            } else {
                str6 = null;
                str3 = null;
                f5 = null;
                currency = null;
                bool = null;
                num = null;
                str7 = null;
                withdrawStatus = null;
                str8 = null;
                date = null;
            }
            int i13 = 0;
            if (currency != null) {
                str9 = currency.getLocalizedName();
            } else {
                str9 = null;
            }
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            j6 = 0;
            String echo = av.q.echo(" (", str6);
            int parseColor = Color.parseColor(str7);
            if (str8 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String bravo = AbstractC2634d5.bravo(date);
            if (j12 != 0) {
                if (booleanValue) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j5 |= j11;
            }
            if ((j5 & 3) != 0) {
                if (z2) {
                    j10 = 32;
                } else {
                    j10 = 16;
                }
                j5 |= j10;
            }
            if (androidApp != null) {
                j7 = 3;
                str4 = androidApp.getString(R.string.transaction_id, num);
            } else {
                j7 = 3;
                str4 = null;
            }
            if (withdrawStatus != null) {
                i11 = withdrawStatus.ordinal();
            } else {
                i11 = 0;
            }
            if (androidApp != null) {
                String string = androidApp.getString(R.string.simple_amount, f5, str9);
                str11 = androidApp.getString(R.string.requested_on, bravo);
                str10 = string;
            } else {
                str10 = null;
            }
            if (booleanValue) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            String crimson = androidx.appcompat.widget.P0.crimson(echo, ")");
            if (!z2) {
                i13 = 8;
            }
            String str12 = str11;
            str11 = str10;
            i5 = i13;
            i4 = parseColor;
            str = str12;
            str5 = crimson;
            i10 = i12;
            str2 = str8;
        } else {
            j6 = 0;
            j7 = 3;
            i4 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            i5 = 0;
            i10 = 0;
            i11 = 0;
        }
        if ((j5 & j7) != j6) {
            this.f598g.setVisibility(i10);
            ImageView imageView = this.f599h;
            Intrinsics.echo(imageView, "imageView");
            imageView.getDrawable().setLevel(i11);
            J2.f.bravo(this.f600i, str11);
            J2.f.bravo(this.f601j, str4);
            J2.f.bravo(this.f602k, str);
            J2.f.bravo(this.f603l, str3);
            J2.f.bravo(this.f604m, str2);
            this.f604m.setVisibility(i5);
            J2.f.bravo(this.f605n, str5);
            if (z1.g.f14183b >= 21) {
                this.f599h.setBackgroundTintList(ColorStateList.valueOf(i4));
            }
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f611p != 0) {
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
            this.f611p = 2L;
        }
        oscar();
    }

    @Override // B9.p1
    public final void romeo(WithdrawTransaction withdrawTransaction) {
        this.f606o = withdrawTransaction;
        synchronized (this) {
            this.f611p |= 1;
        }
        delta();
        oscar();
    }
}
