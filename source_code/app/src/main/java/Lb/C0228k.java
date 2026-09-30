package Lb;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.t0;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.CaptainProfileAttributeOtpResponse;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import e3.InterfaceC1627a;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;

/* renamed from: Lb.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0228k implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0233p purple;

    public /* synthetic */ C0228k(C0233p c0233p, int i4) {
        this.alpha = i4;
        this.purple = c0233p;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        String str;
        String str2;
        String group;
        long j5;
        switch (this.alpha) {
            case 0:
                String v4 = (String) obj;
                Intrinsics.echo(v4, "v");
                C0233p c0233p = this.purple;
                ((t0) c0233p.B).setValue(v4);
                ((t0) c0233p.f1802F).setValue(null);
                return Unit.INSTANCE;
            case 1:
                String pin = (String) obj;
                Intrinsics.echo(pin, "pin");
                C0233p c0233p2 = this.purple;
                t0 t0Var = (t0) c0233p2.f1801E;
                if (!((Boolean) t0Var.getValue()).booleanValue()) {
                    t0Var.setValue(Boolean.TRUE);
                    ((t0) c0233p2.f1802F).setValue(null);
                    HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) c0233p2.f1810v.getValue();
                    long juliet = c0233p2.f1800D.juliet();
                    ?? auVar = new androidx.lifecycle.au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(homeViewModelV2, null, new Jb.O(homeViewModelV2, juliet, pin, auVar, null), 1, null);
                    auVar.observe(c0233p2.getViewLifecycleOwner(), new Dc.t(6, new C0228k(c0233p2, 2)));
                }
                return Unit.INSTANCE;
            case 2:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                C0233p c0233p3 = this.purple;
                androidx.compose.runtime.ax axVar = c0233p3.f1801E;
                int i5 = 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ((t0) axVar).setValue(Boolean.TRUE);
                        }
                    } else {
                        ((t0) axVar).setValue(Boolean.FALSE);
                        ((t0) c0233p3.f1813y).setValue(EnumC0231n.red);
                    }
                } else {
                    ((t0) axVar).setValue(Boolean.FALSE);
                    String str3 = "";
                    ((t0) c0233p3.B).setValue("");
                    String str4 = c2492a.bravo;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    boolean beige = StringsKt.beige(str3, "Maximum OTP attempts", true);
                    androidx.compose.runtime.ax axVar2 = c0233p3.f1802F;
                    if (!beige && !StringsKt.beige(str3, "تم الوصول إلى الحد الأقصى", true)) {
                        if (!StringsKt.beige(str3, "Invalid OTP", true) && !StringsKt.beige(str3, "رمز OTP غير صحيح", true)) {
                            ((t0) axVar2).setValue(str3);
                        } else {
                            p0 p0Var = c0233p3.C;
                            int juliet2 = p0Var.juliet() - 1;
                            if (juliet2 >= 1) {
                                i5 = juliet2;
                            }
                            p0Var.kilo(i5);
                            ((t0) axVar2).setValue(str3);
                        }
                    } else {
                        ((t0) axVar2).setValue(str3);
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0226i(c0233p3, 0), Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    }
                }
                return Unit.INSTANCE;
            default:
                C2492a c2492a2 = (C2492a) obj;
                int i10 = c2492a2.alpha;
                C0233p c0233p4 = this.purple;
                androidx.compose.runtime.ax axVar3 = c0233p4.f1802F;
                androidx.compose.runtime.ax axVar4 = c0233p4.f1801E;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ((t0) axVar4).setValue(Boolean.TRUE);
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        ((t0) axVar4).setValue(bool);
                        CaptainProfileAttributeOtpResponse captainProfileAttributeOtpResponse = (CaptainProfileAttributeOtpResponse) c2492a2.charlie;
                        boolean z10 = false;
                        if (captainProfileAttributeOtpResponse != null) {
                            z2 = Intrinsics.areEqual(captainProfileAttributeOtpResponse.getOtpRequired(), Boolean.TRUE);
                        } else {
                            z2 = false;
                        }
                        String str5 = "";
                        if (z2 && captainProfileAttributeOtpResponse.getOtpVerificationId() != null) {
                            androidx.compose.runtime.ax axVar5 = c0233p4.f1803G;
                            String str6 = (String) CollectionsKt.gray(c0233p4.f1814z.silver);
                            if (str6 == null) {
                                str6 = "";
                            }
                            ((t0) axVar5).setValue(str6);
                            r0 r0Var = c0233p4.f1800D;
                            Long otpVerificationId = captainProfileAttributeOtpResponse.getOtpVerificationId();
                            if (otpVerificationId != null) {
                                j5 = otpVerificationId.longValue();
                            } else {
                                j5 = 0;
                            }
                            r0Var.kilo(j5);
                            c0233p4.C.kilo(3);
                            ((t0) c0233p4.B).setValue("");
                            ((t0) axVar3).setValue(null);
                            ((t0) c0233p4.f1804H).setValue(captainProfileAttributeOtpResponse.getOtpTitle());
                            ((t0) c0233p4.f1805I).setValue(captainProfileAttributeOtpResponse.getOtpSubtitle());
                            ((t0) c0233p4.f1806J).setValue(captainProfileAttributeOtpResponse.getOtpDescription());
                            ((t0) c0233p4.f1807K).setValue(captainProfileAttributeOtpResponse.getSuccessMessage());
                            ((t0) c0233p4.f1813y).setValue(EnumC0231n.purple);
                        } else {
                            if (captainProfileAttributeOtpResponse != null) {
                                z10 = Intrinsics.areEqual(captainProfileAttributeOtpResponse.getOtpRequired(), bool);
                            }
                            if (z10) {
                                HomeViewModelV2 homeViewModelV22 = (HomeViewModelV2) c0233p4.f1810v.getValue();
                                Lazy lazy = c0233p4.f1808L;
                                AttributeGroup attributeGroup = (AttributeGroup) lazy.getValue();
                                if (attributeGroup == null || (str = attributeGroup.getGroup()) == null) {
                                    str = "";
                                }
                                homeViewModelV22.alpha(str);
                                InterfaceC1627a interfaceC1627a = c0233p4.f1809u;
                                if (interfaceC1627a != null) {
                                    AttributeGroup attributeGroup2 = (AttributeGroup) lazy.getValue();
                                    if (attributeGroup2 == null || (str2 = attributeGroup2.getGroup()) == null) {
                                        str2 = "";
                                    }
                                    ((z9.j) interfaceC1627a).alpha(str2);
                                    ga.v vVar = c0233p4.f1811w;
                                    if (vVar != null) {
                                        AttributeGroup attributeGroup3 = (AttributeGroup) lazy.getValue();
                                        if (attributeGroup3 != null && (group = attributeGroup3.getGroup()) != null) {
                                            str5 = group;
                                        }
                                        vVar.invoke(str5);
                                    }
                                    c0233p4.kilo();
                                } else {
                                    Intrinsics.lima("userManager");
                                    throw null;
                                }
                            } else {
                                ((t0) axVar3).setValue(c0233p4.getString(R.string.error_something_went_wrong));
                            }
                        }
                    }
                } else {
                    ((t0) axVar4).setValue(Boolean.FALSE);
                    ((t0) axVar3).setValue(c2492a2.bravo);
                }
                return Unit.INSTANCE;
        }
    }
}
