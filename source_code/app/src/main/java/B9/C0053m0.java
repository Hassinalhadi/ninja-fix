package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Image;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderStatus;
import com.app.network.network.models.Platform;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2634d5;
import s6.AbstractC2643e5;
import t6.Q2;

/* renamed from: B9.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0053m0 extends AbstractC0051l0 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f558v;

    /* renamed from: u, reason: collision with root package name */
    public long f559u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f558v = sparseIntArray;
        sparseIntArray.put(R.id.cardView2, 10);
        sparseIntArray.put(R.id.view2, 11);
        sparseIntArray.put(R.id.lbOrderBackendNo, 12);
        sparseIntArray.put(R.id.lbStatus, 13);
        sparseIntArray.put(R.id.lbPaymentType, 14);
        sparseIntArray.put(R.id.backendNo, 15);
        sparseIntArray.put(R.id.tvPaymentType, 16);
        sparseIntArray.put(R.id.constraintLayout, 17);
        sparseIntArray.put(R.id.orderFromLb, 18);
        sparseIntArray.put(R.id.btnSeeDetails, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0053m0(View view) {
        super(null, view, r0, r4, r5, r6, (TextView) r17[5], (TextView) r17[18], (TextView) r17[9], (TextView) r17[8], (View) r17[6], (TextView) r17[2], (TextView) r17[1], (TextView) r17[16], (TextView) r17[3], (View) r17[11]);
        Object[] november = z1.g.november(view, 20, null, f558v);
        TextView textView = (TextView) november[15];
        MaterialButton materialButton = (MaterialButton) november[19];
        ImageView imageView = (ImageView) november[4];
        ImageView imageView2 = (ImageView) november[7];
        this.f559u = -1L;
        this.f527h.setTag(null);
        this.f528i.setTag(null);
        ((FrameLayout) november[0]).setTag(null);
        this.f529j.setTag(null);
        this.f531l.setTag(null);
        this.f532m.setTag(null);
        this.f533n.setTag(null);
        this.f534o.setTag(null);
        this.f535p.setTag(null);
        this.f537r.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        long j6;
        long j7;
        int i4;
        int i5;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        Platform platform;
        String str5;
        Date date;
        Float f5;
        Image image;
        Country country;
        boolean z10;
        float floatValue;
        int i10;
        Currency currency;
        String str6;
        int india;
        long j10;
        long j11;
        long j12;
        synchronized (this) {
            j5 = this.f559u;
            this.f559u = 0L;
        }
        Order order = this.f539t;
        long j13 = j5 & 3;
        int i11 = 0;
        String str7 = null;
        if (j13 != 0) {
            String name = OrderStatus.DELIVERED.name();
            if (order != null) {
                platform = order.getPlatform();
                str5 = order.getStatus();
                date = order.getCreatedAt();
                str4 = order.getOrderToName();
                f5 = order.getEarnings();
                z2 = order.shouldShowOrderTo();
            } else {
                z2 = false;
                platform = null;
                str5 = null;
                date = null;
                str4 = null;
                f5 = null;
            }
            if (j13 != 0) {
                if (z2) {
                    j12 = 32;
                } else {
                    j12 = 16;
                }
                j5 |= j12;
            }
            if (platform != null) {
                str2 = platform.getName();
                country = platform.getCountry();
                image = platform.getImage();
            } else {
                str2 = null;
                image = null;
                country = null;
            }
            if (str5 != null) {
                z10 = str5.equals(name);
            } else {
                z10 = false;
            }
            if ((j5 & 3) != 0) {
                if (z10) {
                    j11 = 128;
                } else {
                    j11 = 64;
                }
                j5 |= j11;
            }
            str3 = AbstractC2634d5.bravo(date);
            if (f5 == null) {
                floatValue = 0.0f;
            } else {
                floatValue = f5.floatValue();
            }
            if (z2) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (country != null) {
                currency = country.getCurrency();
            } else {
                currency = null;
            }
            if (image != null) {
                str6 = image.getUrl();
            } else {
                str6 = null;
            }
            j6 = 0;
            if (z10) {
                i5 = z1.g.india(R.color.colorGreen, this.f537r);
            } else {
                i5 = z1.g.india(R.color.colorRed, this.f537r);
            }
            j7 = 3;
            String bravo = Q2.bravo(floatValue);
            if (floatValue >= 0.0f) {
                i11 = 1;
            }
            if ((j5 & 3) != 0) {
                if (i11 != 0) {
                    j10 = 8;
                } else {
                    j10 = 4;
                }
                j5 |= j10;
            }
            if (currency != null) {
                str7 = currency.getLocalizedName();
            }
            String concat = bravo.concat(" ");
            if (i11 != 0) {
                india = z1.g.india(R.color.colorGreen, this.f534o);
            } else {
                india = z1.g.india(R.color.colorRed, this.f534o);
            }
            i11 = i10;
            i4 = india;
            str = androidx.appcompat.widget.P0.crimson(concat, str7);
            str7 = str6;
        } else {
            j6 = 0;
            j7 = 3;
            i4 = 0;
            i5 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((j5 & j7) != j6) {
            ImageView imageView = this.f527h;
            Intrinsics.echo(imageView, "imageView");
            AbstractC2643e5.charlie(imageView, str7, R.dimen.spacing_25, 4);
            this.f528i.setVisibility(i11);
            J2.f.bravo(this.f529j, str2);
            J2.f.bravo(this.f531l, str4);
            this.f531l.setVisibility(i11);
            this.f532m.setVisibility(i11);
            this.f533n.setVisibility(i11);
            J2.f.bravo(this.f534o, str);
            this.f534o.setTextColor(i4);
            J2.f.bravo(this.f535p, str3);
            this.f537r.setTextColor(i5);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f559u != 0) {
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
            this.f559u = 2L;
        }
        oscar();
    }
}
