package com.checkout.components.kmp.rememberme.view.challenge;

import O0.l;
import T.p;
import T.s;
import Wf.e;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import com.checkout.components.kmp.rememberme.generated.resources.Drawable0_commonMainKt;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.utils.TestTags;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aQ\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "whatsappHint", "emailHint", "phoneHint", "Lkotlin/Function1;", "", "createChallenge", "ChallengeButtonsView", "(Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChallengeButtonsViewKt {
    public static final void ChallengeButtonsView(@NotNull ResourceProvider resourceProvider, @NotNull DesignTokens designTokens, @Nullable final Hint hint, @Nullable final Hint hint2, @Nullable final Hint hint3, @NotNull final Function1<? super Hint, Unit> createChallenge, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        boolean z11;
        as asVar;
        p pVar;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        as asVar2;
        p pVar2;
        int i11;
        boolean z15;
        boolean z16;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(createChallenge, "createChallenge");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(293459937);
        if ((i4 & 6) == 0) {
            if (c0585q.india(resourceProvider)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(designTokens)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i5 |= i16;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(hint)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i5 |= i15;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(hint2)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i14;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(hint3)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i5 |= i13;
        }
        if ((i4 & 196608) == 0) {
            if (c0585q.india(createChallenge)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i5 |= i12;
        }
        boolean z17 = true;
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            as asVar3 = C0580l.alpha;
            p pVar3 = p.alpha;
            if (hint3 == null) {
                c0585q.purple(-2088166903);
                c0585q.quebec(false);
                i10 = i5;
                asVar = asVar3;
                pVar = pVar3;
                z12 = false;
            } else {
                c0585q.purple(-2088166902);
                Font subheading = designTokens.getFonts().getSubheading();
                Res.string stringVar = Res.string.INSTANCE;
                TextViewKt.m125TextView7O2jLU0((s) null, ExtensionsKt.secondaryColor(designTokens), subheading, ExtensionsKt.m118emboldenPartialTextmxwnekA(ExtensionsKt.buildTextForEmbolden(resourceProvider, String0_commonMainKt.getCko_otp_code_send(stringVar), c0585q, i5 & 14), hint3.getValue(), ExtensionsKt.primaryColor(designTokens)), 0, (l) null, c0585q, 0, 49);
                s alpha = androidx.compose.ui.platform.a.alpha(pVar3, TestTags.AUTH_SMS_BUTTON);
                e cko_ic_phone = Drawable0_commonMainKt.getCko_ic_phone(Res.drawable.INSTANCE);
                String string = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_phone(stringVar), c0585q, (i5 << 3) & 112);
                int i18 = i5;
                long actionColor = ExtensionsKt.actionColor(designTokens);
                if ((i18 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = z10;
                if ((i18 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z19 = z18 | z11;
                Object jade = c0585q.jade();
                if (z19 || jade == asVar3) {
                    final int i19 = 0;
                    jade = new Function0() { // from class: com.checkout.components.kmp.rememberme.view.challenge.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ChallengeButtonsView$lambda$2$lambda$1$lambda$0;
                            Unit ChallengeButtonsView$lambda$5$lambda$4$lambda$3;
                            Unit ChallengeButtonsView$lambda$8$lambda$7$lambda$6;
                            switch (i19) {
                                case 0:
                                    ChallengeButtonsView$lambda$2$lambda$1$lambda$0 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$2$lambda$1$lambda$0(createChallenge, hint3);
                                    return ChallengeButtonsView$lambda$2$lambda$1$lambda$0;
                                case 1:
                                    ChallengeButtonsView$lambda$5$lambda$4$lambda$3 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$5$lambda$4$lambda$3(createChallenge, hint3);
                                    return ChallengeButtonsView$lambda$5$lambda$4$lambda$3;
                                default:
                                    ChallengeButtonsView$lambda$8$lambda$7$lambda$6 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$8$lambda$7$lambda$6(createChallenge, hint3);
                                    return ChallengeButtonsView$lambda$8$lambda$7$lambda$6;
                            }
                        }
                    };
                    c0585q.f(jade);
                }
                asVar = asVar3;
                pVar = pVar3;
                i10 = i18;
                z12 = false;
                ChallengeButtonViewKt.m119ChallengeButtonViewFHprtrg(cko_ic_phone, designTokens, string, (Function0) jade, actionColor, alpha, c0585q, (i18 & 112) | 196608, 0);
                c0585q.quebec(false);
            }
            if (hint == null) {
                c0585q.purple(-2087435706);
                c0585q.quebec(z12);
                z15 = z12;
                i11 = i10;
                asVar2 = asVar;
                pVar2 = pVar;
            } else {
                c0585q.purple(-2087435705);
                p pVar4 = pVar;
                s alpha2 = androidx.compose.ui.platform.a.alpha(pVar4, TestTags.AUTH_WHATSAPP_BUTTON);
                e cko_ic_whatsapp = Drawable0_commonMainKt.getCko_ic_whatsapp(Res.drawable.INSTANCE);
                int i20 = i10;
                String string2 = resourceProvider.getString(String0_commonMainKt.getCko_otp_code_whatsapp(Res.string.INSTANCE), c0585q, (i20 << 3) & 112);
                long secondaryColor = ExtensionsKt.secondaryColor(designTokens);
                if ((i20 & 458752) == 131072) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i20 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z20 = z13 | z14;
                Object jade2 = c0585q.jade();
                asVar2 = asVar;
                if (z20 || jade2 == asVar2) {
                    final int i21 = 1;
                    jade2 = new Function0() { // from class: com.checkout.components.kmp.rememberme.view.challenge.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ChallengeButtonsView$lambda$2$lambda$1$lambda$0;
                            Unit ChallengeButtonsView$lambda$5$lambda$4$lambda$3;
                            Unit ChallengeButtonsView$lambda$8$lambda$7$lambda$6;
                            switch (i21) {
                                case 0:
                                    ChallengeButtonsView$lambda$2$lambda$1$lambda$0 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$2$lambda$1$lambda$0(createChallenge, hint);
                                    return ChallengeButtonsView$lambda$2$lambda$1$lambda$0;
                                case 1:
                                    ChallengeButtonsView$lambda$5$lambda$4$lambda$3 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$5$lambda$4$lambda$3(createChallenge, hint);
                                    return ChallengeButtonsView$lambda$5$lambda$4$lambda$3;
                                default:
                                    ChallengeButtonsView$lambda$8$lambda$7$lambda$6 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$8$lambda$7$lambda$6(createChallenge, hint);
                                    return ChallengeButtonsView$lambda$8$lambda$7$lambda$6;
                            }
                        }
                    };
                    c0585q.f(jade2);
                }
                pVar2 = pVar4;
                i11 = i20;
                ChallengeButtonViewKt.m119ChallengeButtonViewFHprtrg(cko_ic_whatsapp, designTokens, string2, (Function0) jade2, secondaryColor, alpha2, c0585q, (i20 & 112) | 196608, 0);
                z15 = false;
                c0585q.quebec(false);
            }
            if (hint2 == null) {
                c0585q.purple(-2087016152);
                c0585q.quebec(z15);
            } else {
                c0585q.purple(-2087016151);
                s alpha3 = androidx.compose.ui.platform.a.alpha(pVar2, TestTags.AUTH_EMAIL_BUTTON);
                String string3 = resourceProvider.getString(String0_commonMainKt.getCko_otp_resend_email(Res.string.INSTANCE), c0585q, (i11 << 3) & 112);
                if ((i11 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i11 & 7168) != 2048) {
                    z17 = false;
                }
                boolean z21 = z16 | z17;
                Object jade3 = c0585q.jade();
                if (z21 || jade3 == asVar2) {
                    final int i22 = 2;
                    jade3 = new Function0() { // from class: com.checkout.components.kmp.rememberme.view.challenge.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ChallengeButtonsView$lambda$2$lambda$1$lambda$0;
                            Unit ChallengeButtonsView$lambda$5$lambda$4$lambda$3;
                            Unit ChallengeButtonsView$lambda$8$lambda$7$lambda$6;
                            switch (i22) {
                                case 0:
                                    ChallengeButtonsView$lambda$2$lambda$1$lambda$0 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$2$lambda$1$lambda$0(createChallenge, hint2);
                                    return ChallengeButtonsView$lambda$2$lambda$1$lambda$0;
                                case 1:
                                    ChallengeButtonsView$lambda$5$lambda$4$lambda$3 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$5$lambda$4$lambda$3(createChallenge, hint2);
                                    return ChallengeButtonsView$lambda$5$lambda$4$lambda$3;
                                default:
                                    ChallengeButtonsView$lambda$8$lambda$7$lambda$6 = ChallengeButtonsViewKt.ChallengeButtonsView$lambda$8$lambda$7$lambda$6(createChallenge, hint2);
                                    return ChallengeButtonsView$lambda$8$lambda$7$lambda$6;
                            }
                        }
                    };
                    c0585q.f(jade3);
                }
                TextButtonViewKt.TextButtonView(string3, designTokens, alpha3, (Function0) jade3, c0585q, (i11 & 112) | 384, 0);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.e(resourceProvider, designTokens, hint, hint2, hint3, createChallenge, i4);
        }
    }

    public static final Unit ChallengeButtonsView$lambda$2$lambda$1$lambda$0(Function1 function1, Hint hint) {
        function1.invoke(hint);
        return Unit.INSTANCE;
    }

    public static final Unit ChallengeButtonsView$lambda$5$lambda$4$lambda$3(Function1 function1, Hint hint) {
        function1.invoke(hint);
        return Unit.INSTANCE;
    }

    public static final Unit ChallengeButtonsView$lambda$8$lambda$7$lambda$6(Function1 function1, Hint hint) {
        function1.invoke(hint);
        return Unit.INSTANCE;
    }

    public static final Unit ChallengeButtonsView$lambda$9(ResourceProvider resourceProvider, DesignTokens designTokens, Hint hint, Hint hint2, Hint hint3, Function1 function1, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ChallengeButtonsView(resourceProvider, designTokens, hint, hint2, hint3, function1, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
