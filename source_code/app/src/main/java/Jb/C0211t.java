package Jb;

import B9.AbstractC0067u;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.PaymentSession;
import com.app.network.network.models.WalletTopUpResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.withdraw.WalletTopUpActivity;
import g3.EnumC1742c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.C2097a;
import r3.C2492a;
import t6.U2;
import zendesk.classic.messaging.ui.InputBox;

/* renamed from: Jb.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0211t implements androidx.lifecycle.A {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C0211t(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.lifecycle.A
    public final void onChanged(Object obj) {
        int i4;
        String str;
        String str2;
        String str3;
        PaymentSession paymentSession;
        String url;
        PaymentSession paymentSession2;
        PaymentSession paymentSession3;
        PaymentSession paymentSession4;
        String str4 = "";
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                C2097a c2097a = ((C0217z) obj).alpha;
                C0215x c0215x = (C0215x) obj2;
                J2.i iVar = c0215x.f1664p;
                Intrinsics.checkNotNull(iVar);
                ((TextView) iVar.red).setText(c2097a.bravo);
                StringBuilder sb2 = new StringBuilder();
                String str5 = CaptainLocationMonitoringService.f12071I;
                if (c2097a.alpha == EnumC1742c.f12645d && str5 != null && !StringsKt.gray(str5)) {
                    sb2.append(str5);
                }
                Long l10 = CaptainLocationMonitoringService.f12074L;
                if (l10 != null && System.currentTimeMillis() > l10.longValue()) {
                    int currentTimeMillis = (int) ((System.currentTimeMillis() - l10.longValue()) / 1000);
                    int i5 = currentTimeMillis / 60;
                    int i10 = currentTimeMillis % 60;
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(c0215x.getString(R.string.offline_duration_fmt, Integer.valueOf(i5), Integer.valueOf(i10)));
                }
                if (sb2.length() > 0) {
                    J2.i iVar2 = c0215x.f1664p;
                    Intrinsics.checkNotNull(iVar2);
                    ((TextView) iVar2.purple).setText(sb2.toString());
                    J2.i iVar3 = c0215x.f1664p;
                    Intrinsics.checkNotNull(iVar3);
                    ((TextView) iVar3.purple).setVisibility(0);
                } else {
                    J2.i iVar4 = c0215x.f1664p;
                    Intrinsics.checkNotNull(iVar4);
                    ((TextView) iVar4.purple).setVisibility(8);
                }
                androidx.lifecycle.al viewLifecycleOwner = c0215x.getViewLifecycleOwner();
                Intrinsics.delta(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                vf.ad.zulu(androidx.lifecycle.T.foxtrot(viewLifecycleOwner), null, null, new C0214w(c0215x, null), 3);
                return;
            case 1:
                C2492a c2492a = (C2492a) obj;
                int i11 = WalletTopUpActivity.f12536L;
                int i12 = c2492a.alpha;
                WalletTopUpActivity walletTopUpActivity = (WalletTopUpActivity) obj2;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            walletTopUpActivity.bronze();
                            return;
                        }
                        return;
                    }
                    AbstractC0067u abstractC0067u = walletTopUpActivity.f12540K;
                    if (abstractC0067u != null) {
                        abstractC0067u.f694f.setEnabled(true);
                        walletTopUpActivity.tango();
                        WalletTopUpResponse walletTopUpResponse = (WalletTopUpResponse) c2492a.charlie;
                        if (walletTopUpResponse != null) {
                            i4 = walletTopUpResponse.getId();
                        } else {
                            i4 = -1;
                        }
                        if (walletTopUpResponse == null || (paymentSession4 = walletTopUpResponse.getPaymentSession()) == null || (str = paymentSession4.getId()) == null) {
                            str = "";
                        }
                        if (walletTopUpResponse == null || (paymentSession3 = walletTopUpResponse.getPaymentSession()) == null || (str2 = paymentSession3.getSecret()) == null) {
                            str2 = "";
                        }
                        if (walletTopUpResponse == null || (paymentSession2 = walletTopUpResponse.getPaymentSession()) == null || (str3 = paymentSession2.getToken()) == null) {
                            str3 = "";
                        }
                        if (walletTopUpResponse != null && (paymentSession = walletTopUpResponse.getPaymentSession()) != null && (url = paymentSession.getUrl()) != null) {
                            str4 = url;
                        }
                        PaymentSession paymentSession5 = new PaymentSession(str, str2, str3, str4);
                        Wc.l lVar = new Wc.l();
                        lVar.f2228u = i4;
                        lVar.f2229v = paymentSession5;
                        lVar.f14101q = true;
                        lVar.romeo(walletTopUpActivity.getSupportFragmentManager(), "TopUpDialog");
                        return;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                walletTopUpActivity.tango();
                String str6 = c2492a.bravo;
                if (str6 == null) {
                    str6 = walletTopUpActivity.getString(R.string.error_something_went_wrong);
                    Intrinsics.delta(str6, "getString(...)");
                }
                L9.d.pink(walletTopUpActivity, str6);
                return;
            case 2:
                ((xf.q) ((xf.r) obj2)).mike(obj);
                return;
            case 3:
                ((av.t) obj2).setValue(obj);
                return;
            case 4:
                Fc.b it = (Fc.b) obj;
                int i13 = SignUpActivity.f12184d0;
                Intrinsics.echo(it, "it");
                SignUpActivity signUpActivity = (SignUpActivity) obj2;
                signUpActivity.green().f635S.setError("");
                signUpActivity.green().f640X.setError("");
                signUpActivity.green().f637U.setError("");
                signUpActivity.green().f634R.setError("");
                signUpActivity.green().f644b0.setError("");
                signUpActivity.green().f643a0.setError("");
                signUpActivity.green().f642Z.setError("");
                signUpActivity.green().Q.setError("");
                signUpActivity.green().f633P.setError("");
                signUpActivity.green().f641Y.setError("");
                signUpActivity.green().f636T.setError("");
                signUpActivity.green().f646d0.setError("");
                signUpActivity.green().f647e0.setError("");
                signUpActivity.green().f638V.setError("");
                signUpActivity.green().f639W.setError("");
                signUpActivity.green().f632O.setError("");
                TextView idSnapErrorMsg = signUpActivity.green().f631N;
                Intrinsics.delta(idSnapErrorMsg, "idSnapErrorMsg");
                idSnapErrorMsg.setVisibility(8);
                TextView drivingSnapErrorMsg = signUpActivity.green().f666o;
                Intrinsics.delta(drivingSnapErrorMsg, "drivingSnapErrorMsg");
                drivingSnapErrorMsg.setVisibility(8);
                TextView registrationSnapErrorMsg = signUpActivity.green().f663m0;
                Intrinsics.delta(registrationSnapErrorMsg, "registrationSnapErrorMsg");
                registrationSnapErrorMsg.setVisibility(8);
                TextView profileSnapErrorMsg = signUpActivity.green().f661l0;
                Intrinsics.delta(profileSnapErrorMsg, "profileSnapErrorMsg");
                profileSnapErrorMsg.setVisibility(8);
                signUpActivity.green().f679u0.getBackground().setLevel(0);
                signUpActivity.green().f677t0.getBackground().setLevel(0);
                signUpActivity.green().f675s0.getBackground().setLevel(0);
                signUpActivity.green().v0.getBackground().setLevel(0);
                Fc.b bVar = Fc.b.purple;
                int ordinal = it.ordinal();
                int i14 = it.alpha;
                if (1 <= ordinal && ordinal <= 16) {
                    ConstraintLayout container = signUpActivity.green().f664n;
                    Intrinsics.delta(container, "container");
                    U2.delta(container, i14);
                }
                if (it.ordinal() >= 17) {
                    ConstraintLayout container2 = signUpActivity.green().f664n;
                    Intrinsics.delta(container2, "container");
                    d3.k.sierra(signUpActivity, container2);
                }
                switch (it.ordinal()) {
                    case 1:
                        signUpActivity.green().f635S.setError(signUpActivity.getString(i14));
                        return;
                    case 2:
                        signUpActivity.green().f640X.setError(signUpActivity.getString(i14));
                        return;
                    case 3:
                        signUpActivity.green().f637U.setError(signUpActivity.getString(i14));
                        return;
                    case 4:
                        signUpActivity.green().f634R.setError(signUpActivity.getString(i14));
                        return;
                    case 5:
                        signUpActivity.green().f644b0.setError(signUpActivity.getString(i14));
                        return;
                    case 6:
                        signUpActivity.green().f643a0.setError(signUpActivity.getString(i14));
                        return;
                    case 7:
                        signUpActivity.green().f646d0.setError(signUpActivity.getString(i14));
                        return;
                    case 8:
                        signUpActivity.green().f647e0.setError(signUpActivity.getString(i14));
                        return;
                    case 9:
                        signUpActivity.green().f642Z.setError(signUpActivity.getString(i14));
                        return;
                    case 10:
                        signUpActivity.green().Q.setError(signUpActivity.getString(i14));
                        return;
                    case 11:
                        signUpActivity.green().f633P.setError(signUpActivity.getString(i14));
                        return;
                    case 12:
                        signUpActivity.green().f641Y.setError(signUpActivity.getString(i14));
                        return;
                    case 13:
                        signUpActivity.green().f636T.setError(signUpActivity.getString(i14));
                        return;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return;
                    case 17:
                        int[] iArr = new int[2];
                        signUpActivity.green().f628K.getLocationOnScreen(iArr);
                        signUpActivity.green().f665n0.smoothScrollTo(0, iArr[1]);
                        signUpActivity.green().f679u0.getBackground().setLevel(1);
                        TextView idSnapErrorMsg2 = signUpActivity.green().f631N;
                        Intrinsics.delta(idSnapErrorMsg2, "idSnapErrorMsg");
                        idSnapErrorMsg2.setVisibility(0);
                        ConstraintLayout container3 = signUpActivity.green().f664n;
                        Intrinsics.delta(container3, "container");
                        U2.delta(container3, i14);
                        return;
                    case 18:
                        ConstraintLayout container4 = signUpActivity.green().f664n;
                        Intrinsics.delta(container4, "container");
                        U2.delta(container4, i14);
                        int[] iArr2 = new int[2];
                        signUpActivity.green().f627J.getLocationOnScreen(iArr2);
                        signUpActivity.green().f665n0.smoothScrollTo(0, iArr2[1]);
                        signUpActivity.green().f677t0.getBackground().setLevel(1);
                        TextView drivingSnapErrorMsg2 = signUpActivity.green().f666o;
                        Intrinsics.delta(drivingSnapErrorMsg2, "drivingSnapErrorMsg");
                        drivingSnapErrorMsg2.setVisibility(0);
                        return;
                    case 19:
                        ConstraintLayout container5 = signUpActivity.green().f664n;
                        Intrinsics.delta(container5, "container");
                        U2.delta(container5, i14);
                        int[] iArr3 = new int[2];
                        signUpActivity.green().f629L.getLocationOnScreen(iArr3);
                        signUpActivity.green().f665n0.smoothScrollTo(0, iArr3[1]);
                        signUpActivity.green().f675s0.getBackground().setLevel(1);
                        TextView registrationSnapErrorMsg2 = signUpActivity.green().f663m0;
                        Intrinsics.delta(registrationSnapErrorMsg2, "registrationSnapErrorMsg");
                        registrationSnapErrorMsg2.setVisibility(0);
                        return;
                    case 20:
                        ConstraintLayout container6 = signUpActivity.green().f664n;
                        Intrinsics.delta(container6, "container");
                        U2.delta(container6, i14);
                        int[] iArr4 = new int[2];
                        signUpActivity.green().f630M.getLocationOnScreen(iArr4);
                        signUpActivity.green().f665n0.smoothScrollTo(0, iArr4[1]);
                        signUpActivity.green().v0.getBackground().setLevel(1);
                        TextView profileSnapErrorMsg2 = signUpActivity.green().f661l0;
                        Intrinsics.delta(profileSnapErrorMsg2, "profileSnapErrorMsg");
                        profileSnapErrorMsg2.setVisibility(0);
                        return;
                }
            default:
                ((InputBox) obj2).setAttachmentsCount(((Integer) obj).intValue());
                return;
        }
    }
}
