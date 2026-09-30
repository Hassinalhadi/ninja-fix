package delivery.samurai.android.ui.about;

import P.d;
import af.AbstractC0434e;
import android.os.Bundle;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.lifecycle.T;
import bz.af;
import com.app.base.BaseViewModel;
import d3.k;
import ga.C1759b;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import vf.ad;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/about/AccountQrCodeActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccountQrCodeActivity extends k {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f12107I = 0;

    /* renamed from: H, reason: collision with root package name */
    public final ax f12108H = C0564b.zulu(null);

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_qr_text");
        if (stringExtra == null) {
            stringExtra = "";
        }
        AbstractC0434e.alpha(this, new d(new af(9, this), -1334615070, true));
        if (!StringsKt.gray(stringExtra)) {
            ad.zulu(T.foxtrot(this), null, null, new C1759b(this, stringExtra, null), 3);
        }
    }
}
