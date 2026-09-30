package Ob;

import A2.q;
import Dc.t;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.t0;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.missingAttributes.AttributeMissingViewModel;
import delivery.samurai.android.ui.missingAttributes.AttributesMissingActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AttributesMissingActivity purple;

    public /* synthetic */ g(AttributesMissingActivity attributesMissingActivity, int i4) {
        this.alpha = i4;
        this.purple = attributesMissingActivity;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        long j5;
        int i4 = 3;
        String str = "";
        int i5 = 1;
        AttributesMissingActivity attributesMissingActivity = this.purple;
        switch (this.alpha) {
            case 0:
                String v4 = (String) obj;
                int i10 = AttributesMissingActivity.f12319a0;
                Intrinsics.echo(v4, "v");
                ((t0) attributesMissingActivity.Q).setValue(v4);
                ((t0) attributesMissingActivity.f12332U).setValue(null);
                return Unit.INSTANCE;
            case 1:
                String pin = (String) obj;
                int i11 = AttributesMissingActivity.f12319a0;
                Intrinsics.echo(pin, "pin");
                t0 t0Var = (t0) attributesMissingActivity.f12331T;
                if (!((Boolean) t0Var.getValue()).booleanValue()) {
                    t0Var.setValue(Boolean.TRUE);
                    ((t0) attributesMissingActivity.f12332U).setValue(null);
                    AttributeMissingViewModel attributeMissingViewModel = (AttributeMissingViewModel) attributesMissingActivity.f12321I.getValue();
                    long juliet = attributesMissingActivity.f12330S.juliet();
                    ?? auVar = new au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(attributeMissingViewModel, null, new c(attributeMissingViewModel, juliet, pin, auVar, null), 1, null);
                    auVar.observe(attributesMissingActivity, new t(8, new g(attributesMissingActivity, i4)));
                }
                return Unit.INSTANCE;
            case 2:
                C2492a c2492a = (C2492a) obj;
                int i12 = AttributesMissingActivity.f12319a0;
                int i13 = c2492a.alpha;
                ax axVar = attributesMissingActivity.f12332U;
                ax axVar2 = attributesMissingActivity.f12331T;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            ((t0) axVar2).setValue(Boolean.TRUE);
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        ((t0) axVar2).setValue(bool);
                        CaptainProfileAttributeOtpResponse captainProfileAttributeOtpResponse = (CaptainProfileAttributeOtpResponse) c2492a.charlie;
                        boolean z10 = false;
                        if (captainProfileAttributeOtpResponse != null) {
                            z2 = Intrinsics.areEqual(captainProfileAttributeOtpResponse.getOtpRequired(), Boolean.TRUE);
                        } else {
                            z2 = false;
                        }
                        if (z2 && captainProfileAttributeOtpResponse.getOtpVerificationId() != null) {
                            ax axVar3 = attributesMissingActivity.f12333V;
                            String str2 = (String) CollectionsKt.gray(attributesMissingActivity.f12327O.silver);
                            if (str2 == null) {
                                str2 = "";
                            }
                            ((t0) axVar3).setValue(str2);
                            r0 r0Var = attributesMissingActivity.f12330S;
                            Long otpVerificationId = captainProfileAttributeOtpResponse.getOtpVerificationId();
                            if (otpVerificationId != null) {
                                j5 = otpVerificationId.longValue();
                            } else {
                                j5 = 0;
                            }
                            r0Var.kilo(j5);
                            attributesMissingActivity.f12329R.kilo(3);
                            ((t0) attributesMissingActivity.Q).setValue("");
                            ((t0) axVar).setValue(null);
                            ((t0) attributesMissingActivity.f12334W).setValue(captainProfileAttributeOtpResponse.getOtpTitle());
                            ((t0) attributesMissingActivity.f12335X).setValue(captainProfileAttributeOtpResponse.getOtpSubtitle());
                            ((t0) attributesMissingActivity.f12336Y).setValue(captainProfileAttributeOtpResponse.getOtpDescription());
                            ((t0) attributesMissingActivity.f12337Z).setValue(captainProfileAttributeOtpResponse.getSuccessMessage());
                            ((t0) attributesMissingActivity.f12326N).setValue(h.purple);
                        } else {
                            if (captainProfileAttributeOtpResponse != null) {
                                z10 = Intrinsics.areEqual(captainProfileAttributeOtpResponse.getOtpRequired(), bool);
                            }
                            if (z10) {
                                attributesMissingActivity.f12325M = true;
                                attributesMissingActivity.gold();
                            } else {
                                ((t0) axVar).setValue(attributesMissingActivity.getString(R.string.error_something_went_wrong));
                            }
                        }
                    }
                } else {
                    ((t0) axVar2).setValue(Boolean.FALSE);
                    ((t0) axVar).setValue(c2492a.bravo);
                }
                return Unit.INSTANCE;
            default:
                C2492a c2492a2 = (C2492a) obj;
                int i14 = AttributesMissingActivity.f12319a0;
                int i15 = c2492a2.alpha;
                ax axVar4 = attributesMissingActivity.f12331T;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            ((t0) axVar4).setValue(Boolean.TRUE);
                        }
                    } else {
                        ((t0) axVar4).setValue(Boolean.FALSE);
                        ((t0) attributesMissingActivity.f12326N).setValue(h.red);
                    }
                } else {
                    ((t0) axVar4).setValue(Boolean.FALSE);
                    ((t0) attributesMissingActivity.Q).setValue("");
                    String str3 = c2492a2.bravo;
                    if (str3 != null) {
                        str = str3;
                    }
                    boolean beige = StringsKt.beige(str, "Maximum OTP attempts", true);
                    ax axVar5 = attributesMissingActivity.f12332U;
                    if (!beige && !StringsKt.beige(str, "تم الوصول إلى الحد الأقصى", true)) {
                        if (!StringsKt.beige(str, "Invalid OTP", true) && !StringsKt.beige(str, "رمز OTP غير صحيح", true)) {
                            ((t0) axVar5).setValue(str);
                        } else {
                            p0 p0Var = attributesMissingActivity.f12329R;
                            int juliet2 = p0Var.juliet() - 1;
                            if (juliet2 >= 1) {
                                i5 = juliet2;
                            }
                            p0Var.kilo(i5);
                            ((t0) axVar5).setValue(str);
                        }
                    } else {
                        ((t0) axVar5).setValue(str);
                        new Handler(Looper.getMainLooper()).postDelayed(new q(12, attributesMissingActivity), Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
