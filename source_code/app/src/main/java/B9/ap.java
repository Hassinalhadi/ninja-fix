package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.Country;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderStatus;
import com.app.network.network.models.PaymentType;
import com.app.network.network.models.Platform;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import j3.C1943b;
import j3.InterfaceC1942a;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import s6.AbstractC2634d5;
import t6.Q2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class ap extends ao {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f357u;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f358n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f359o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f360p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f361q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f362r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f363s;

    /* renamed from: t, reason: collision with root package name */
    public long f364t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f357u = sparseIntArray;
        sparseIntArray.put(R.id.textView22, 8);
        sparseIntArray.put(R.id.progress, 9);
        sparseIntArray.put(R.id.btnClose, 10);
        sparseIntArray.put(R.id.backendNo, 11);
        sparseIntArray.put(R.id.textView6, 12);
        sparseIntArray.put(R.id.notesRecyclerView, 13);
        sparseIntArray.put(R.id.pickupLocations, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ap(View view) {
        super(null, view, r6, r7, r8, r9, r10, r11);
        Object[] november = z1.g.november(view, 15, null, f357u);
        TextView textView = (TextView) november[11];
        ImageButton imageButton = (ImageButton) november[10];
        RecyclerView recyclerView = (RecyclerView) november[13];
        RecyclerView recyclerView2 = (RecyclerView) november[14];
        ProgressBar progressBar = (ProgressBar) november[9];
        TextView textView2 = (TextView) november[7];
        this.f364t = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        TextView textView3 = (TextView) november[1];
        this.f358n = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout = (LinearLayout) november[2];
        this.f359o = linearLayout;
        linearLayout.setTag(null);
        TextView textView4 = (TextView) november[3];
        this.f360p = textView4;
        textView4.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) november[4];
        this.f361q = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView5 = (TextView) november[5];
        this.f362r = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) november[6];
        this.f363s = textView6;
        textView6.setTag(null);
        this.f355k.setTag(null);
        papa(view);
        lima();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0268 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    @Override // z1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot() {
        long j5;
        long j6;
        long j7;
        long j10;
        int i4;
        String str;
        int i5;
        int i10;
        int i11;
        String str2;
        String str3;
        int i12;
        String str4;
        int i13;
        OrderStatus orderStatus;
        boolean z2;
        String str5;
        long j11;
        Object m206constructorimpl;
        Object obj;
        int i14;
        Float f5;
        PaymentType paymentType;
        Platform platform;
        Date date;
        Float f10;
        Country country;
        boolean z10;
        boolean z11;
        float floatValue;
        float floatValue2;
        boolean z12;
        Currency currency;
        boolean z13;
        String str6;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        synchronized (this) {
            j5 = this.f364t;
            this.f364t = 0L;
        }
        Order order = this.f356l;
        long j17 = j5 & 3;
        if (j17 != 0) {
            String name = OrderStatus.DELIVERED.name();
            if (order != null) {
                platform = order.getPlatform();
                String status = order.getStatus();
                PaymentType paymentType2 = order.getPaymentType();
                date = order.getCreatedAt();
                orderStatus = order.getOrderStatusEnum();
                f10 = order.getActualEarnings();
                f5 = order.getEarnings();
                str = status;
                paymentType = paymentType2;
                j6 = 0;
            } else {
                j6 = 0;
                f5 = null;
                str = null;
                paymentType = null;
                platform = null;
                date = null;
                orderStatus = null;
                f10 = null;
            }
            if (platform != null) {
                country = platform.getCountry();
            } else {
                country = null;
            }
            boolean z14 = true;
            if (str == name) {
                z10 = true;
            } else {
                z10 = false;
            }
            String bravo = AbstractC2634d5.bravo(date);
            if (orderStatus == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (f10 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (f10 == null) {
                floatValue = 0.0f;
            } else {
                floatValue = f10.floatValue();
            }
            if (f5 == null) {
                floatValue2 = 0.0f;
            } else {
                floatValue2 = f5.floatValue();
            }
            if (f5 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (j17 != 0) {
                if (z10) {
                    j16 = 128;
                } else {
                    j16 = 64;
                }
                j5 |= j16;
            }
            if ((j5 & 3) != j6) {
                if (z2) {
                    j5 |= 8192;
                } else {
                    j5 |= 4096;
                }
            }
            if ((j5 & 3) != j6) {
                if (z11) {
                    j15 = 32;
                } else {
                    j15 = 16;
                }
                j5 |= j15;
            }
            if ((j5 & 3) != j6) {
                if (z12) {
                    j14 = 512;
                } else {
                    j14 = 256;
                }
                j5 |= j14;
            }
            if (paymentType != null) {
                i5 = paymentType.getType();
            } else {
                i5 = 0;
            }
            if (country != null) {
                currency = country.getCurrency();
            } else {
                currency = null;
            }
            j7 = 3;
            TextView textView = this.f363s;
            if (z10) {
                i11 = z1.g.india(R.color.colorGreen, textView);
            } else {
                i11 = z1.g.india(R.color.colorRed, textView);
            }
            if (z11) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            j10 = 4096;
            String bravo2 = Q2.bravo(floatValue);
            if (floatValue >= 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            String bravo3 = Q2.bravo(floatValue2);
            if (floatValue2 < 0.0f) {
                z14 = false;
            }
            if (z12) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            if ((j5 & 3) != j6) {
                if (z13) {
                    j13 = 2048;
                } else {
                    j13 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                }
                j5 |= j13;
            }
            if ((j5 & 3) != j6) {
                if (z14) {
                    j12 = 8;
                } else {
                    j12 = 4;
                }
                j5 |= j12;
            }
            if (currency != null) {
                str6 = currency.getLocalizedName();
            } else {
                str6 = null;
            }
            String concat = bravo2.concat(" ");
            if (z13) {
                i12 = z1.g.india(R.color.colorGreen, this.f362r);
            } else {
                i12 = z1.g.india(R.color.colorRed, this.f362r);
            }
            String concat2 = bravo3.concat(" ");
            if (z14) {
                i10 = z1.g.india(R.color.colorGreen, this.f360p);
            } else {
                i10 = z1.g.india(R.color.colorRed, this.f360p);
            }
            str3 = androidx.appcompat.widget.P0.crimson(concat, str6);
            str2 = androidx.appcompat.widget.P0.crimson(concat2, str6);
            str4 = bravo;
        } else {
            j6 = 0;
            j7 = 3;
            j10 = 4096;
            i4 = 0;
            str = null;
            i5 = 0;
            i10 = 0;
            i11 = 0;
            str2 = null;
            str3 = null;
            i12 = 0;
            str4 = null;
            i13 = 0;
            orderStatus = null;
            z2 = false;
        }
        if ((j5 & j10) != j6) {
            AndroidApp androidApp = AndroidApp.yellow;
            if (orderStatus != null) {
                i14 = orderStatus.getToString();
            } else {
                i14 = 0;
            }
            if (androidApp != null) {
                str5 = androidApp.getString(i14);
                j11 = j5 & j7;
                if (j11 == j6) {
                    if (!z2) {
                        str = str5;
                    }
                } else {
                    str = null;
                }
                if (j11 == j6) {
                    J2.f.bravo(this.f358n, str4);
                    this.f359o.setVisibility(i4);
                    J2.f.bravo(this.f360p, str2);
                    this.f360p.setTextColor(i10);
                    this.f361q.setVisibility(i13);
                    J2.f.bravo(this.f362r, str3);
                    this.f362r.setTextColor(i12);
                    J2.f.bravo(this.f363s, str);
                    this.f363s.setTextColor(i11);
                    TextView textView2 = this.f355k;
                    Integer valueOf = Integer.valueOf(i5);
                    Intrinsics.echo(textView2, "textView");
                    if (i5 != 0) {
                        textView2.setText(i5);
                        return;
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(textView2.getResources().getResourceEntryName(textView2.getId()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (m206constructorimpl instanceof kotlin.k) {
                        obj = null;
                    } else {
                        obj = m206constructorimpl;
                    }
                    String str7 = (String) obj;
                    if (str7 == null) {
                        str7 = "no-id";
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("BindingAdapter:textResource received null/0 resId for viewId=".concat(str7));
                    C1943b c1943b = C1943b.bravo;
                    if (c1943b != null) {
                        InterfaceC1942a interfaceC1942a = c1943b.alpha;
                        C1943b c1943b2 = C1943b.bravo;
                        if (c1943b2 != null) {
                            c1943b2.alpha.getClass();
                            String message = "invalid textResource (view=" + str7 + ", resId=" + valueOf + ")";
                            ((M9.a) interfaceC1942a).getClass();
                            Intrinsics.echo(message, "message");
                            C3462a.alpha("API", 8, message, illegalArgumentException);
                            textView2.setText("");
                            return;
                        }
                        throw new IllegalStateException("ExtensionsLoggerHolder not initialized. Call initialize() first.");
                    }
                    throw new IllegalStateException("ExtensionsLoggerHolder not initialized. Call initialize() first.");
                }
                return;
            }
        }
        str5 = null;
        j11 = j5 & j7;
        if (j11 == j6) {
        }
        if (j11 == j6) {
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f364t != 0) {
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
            this.f364t = 2L;
        }
        oscar();
    }
}
