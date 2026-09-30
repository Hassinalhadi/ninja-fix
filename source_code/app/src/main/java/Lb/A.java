package Lb;

import android.content.Context;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.t0;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AttributeSubmission;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.app.network.network.models.ProfileAttributesRequest;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ D purple;

    public /* synthetic */ A(D d4, int i4) {
        this.alpha = i4;
        this.purple = d4;
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        long j5;
        Integer num;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                D d4 = this.purple;
                androidx.compose.runtime.ax axVar = d4.C;
                androidx.compose.runtime.ax axVar2 = d4.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
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
                        androidx.compose.runtime.ax axVar3 = d4.f1711w;
                        androidx.compose.runtime.ax axVar4 = d4.f1708H;
                        String str = null;
                        if (z2 && captainProfileAttributeOtpResponse.getOtpVerificationId() != null) {
                            r0 r0Var = d4.f1704D;
                            Long otpVerificationId = captainProfileAttributeOtpResponse.getOtpVerificationId();
                            if (otpVerificationId != null) {
                                j5 = otpVerificationId.longValue();
                            } else {
                                j5 = 0;
                            }
                            r0Var.kilo(j5);
                            ((t0) d4.f1705E).setValue(captainProfileAttributeOtpResponse.getOtpTitle());
                            ((t0) d4.f1706F).setValue(captainProfileAttributeOtpResponse.getOtpSubtitle());
                            ((t0) d4.f1707G).setValue(captainProfileAttributeOtpResponse.getOtpDescription());
                            ((t0) axVar4).setValue(captainProfileAttributeOtpResponse.getSuccessMessage());
                            ((t0) d4.A).setValue(null);
                            ((t0) d4.f1714z).setValue("");
                            ((t0) axVar).setValue(null);
                            ((t0) axVar3).setValue(B.purple);
                        } else {
                            if (captainProfileAttributeOtpResponse != null) {
                                z10 = Intrinsics.areEqual(captainProfileAttributeOtpResponse.getOtpRequired(), bool);
                            }
                            if (z10) {
                                ((t0) axVar4).setValue(captainProfileAttributeOtpResponse.getSuccessMessage());
                                ((t0) axVar3).setValue(B.red);
                            } else {
                                Context context = d4.getContext();
                                if (context != null) {
                                    str = context.getString(R.string.error_something_went_wrong);
                                }
                                ((t0) axVar).setValue(str);
                            }
                        }
                    }
                } else {
                    ((t0) axVar2).setValue(Boolean.FALSE);
                    ((t0) axVar).setValue(c2492a.bravo);
                }
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a2 = (C2492a) obj;
                int i5 = c2492a2.alpha;
                D d9 = this.purple;
                androidx.compose.runtime.ax axVar5 = d9.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ((t0) axVar5).setValue(Boolean.TRUE);
                        }
                    } else {
                        ((t0) axVar5).setValue(Boolean.FALSE);
                        ((t0) d9.f1711w).setValue(B.red);
                    }
                } else {
                    ((t0) axVar5).setValue(Boolean.FALSE);
                    String str2 = "";
                    ((t0) d9.f1714z).setValue("");
                    String str3 = c2492a2.bravo;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    List maroon = StringsKt.maroon(str2, new String[]{"|||retriesLeft="}, 6);
                    String str4 = (String) CollectionsKt.jade(0, maroon);
                    if (str4 != null) {
                        str2 = str4;
                    }
                    String str5 = (String) CollectionsKt.jade(1, maroon);
                    if (str5 != null) {
                        num = kotlin.text.r.tango(str5);
                    } else {
                        num = null;
                    }
                    ((t0) d9.C).setValue(str2);
                    androidx.compose.runtime.ax axVar6 = d9.A;
                    if (num != null) {
                        ((t0) axVar6).setValue(num);
                    } else {
                        ((t0) axVar6).setValue(null);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                String it = (String) obj;
                Intrinsics.echo(it, "it");
                D d10 = this.purple;
                ((t0) d10.f1712x).setValue(it);
                ((t0) d10.f1713y).setValue(null);
                return Unit.INSTANCE;
            case 3:
                String value = (String) obj;
                Intrinsics.echo(value, "value");
                D d11 = this.purple;
                String obj2 = StringsKt.b(value).toString();
                String str6 = null;
                if (!StringsKt.gray(obj2) && obj2.length() >= 9) {
                    t0 t0Var = (t0) d11.B;
                    if (!((Boolean) t0Var.getValue()).booleanValue()) {
                        t0Var.setValue(Boolean.TRUE);
                        ((t0) d11.C).setValue(null);
                        ProfileAttributesRequest profileAttributesRequest = new ProfileAttributesRequest(kotlin.collections.ab.juliet(new AttributeSubmission("STC_PAY_ACCOUNT_ID", obj2)));
                        MyAccountViewModel myAccountViewModel = (MyAccountViewModel) d11.f1709u.getValue();
                        ?? auVar = new androidx.lifecycle.au(new C2492a(2, "loading"));
                        BaseViewModel.launchApi$default(myAccountViewModel, null, new ga.ak(myAccountViewModel, profileAttributesRequest, auVar, null), 1, null);
                        auVar.observe(d11.getViewLifecycleOwner(), new Dc.t(7, new A(d11, 0)));
                    }
                } else {
                    androidx.compose.runtime.ax axVar7 = d11.f1713y;
                    Context context2 = d11.getContext();
                    if (context2 != null) {
                        str6 = context2.getString(R.string.VALIDATION_STC_MOBILE);
                    }
                    ((t0) axVar7).setValue(str6);
                }
                return Unit.INSTANCE;
            case 4:
                String it2 = (String) obj;
                Intrinsics.echo(it2, "it");
                D d12 = this.purple;
                ((t0) d12.f1714z).setValue(it2);
                ((t0) d12.C).setValue(null);
                return Unit.INSTANCE;
            default:
                String code = (String) obj;
                Intrinsics.echo(code, "code");
                D d13 = this.purple;
                t0 t0Var2 = (t0) d13.B;
                if (!((Boolean) t0Var2.getValue()).booleanValue()) {
                    t0Var2.setValue(Boolean.TRUE);
                    ((t0) d13.C).setValue(null);
                    MyAccountViewModel myAccountViewModel2 = (MyAccountViewModel) d13.f1709u.getValue();
                    long juliet = d13.f1704D.juliet();
                    ?? auVar2 = new androidx.lifecycle.au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(myAccountViewModel2, null, new ga.am(myAccountViewModel2, juliet, code, auVar2, null), 1, null);
                    auVar2.observe(d13.getViewLifecycleOwner(), new Dc.t(7, new A(d13, 1)));
                }
                return Unit.INSTANCE;
        }
    }
}
