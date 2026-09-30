package com.checkout.components.kmp.rememberme.utils;

import Q4.a;
import Vc.i;
import Wf.ad;
import Wf.ag;
import Wf.r;
import Wf.s;
import Wf.u;
import Wf.w;
import Wf.x;
import Wf.y;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.TranslationKey;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3067v;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "", "", "Lcom/checkout/components/kmp/rememberme/shared/model/TranslationKey;", "", "translation", "<init>", "(Ljava/util/Map;)V", "LWf/ad;", "resId", "getString", "(LWf/ad;Landroidx/compose/runtime/m;I)Ljava/lang/String;", "arg", "(LWf/ad;Ljava/lang/String;Landroidx/compose/runtime/m;I)Ljava/lang/String;", "Ljava/util/Map;", "Companion", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourceProvider {

    @Nullable
    private final Map<TranslationKey, String> translation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<ResourceProvider> DEFAULT$delegate = LazyKt.lazy(new a(28));

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider$Companion;", "", "<init>", "()V", "", "Lcom/checkout/components/kmp/rememberme/shared/model/TranslationKey;", "", "translation", "LWf/ad;", "resId", "arg", "getTranslationString", "(Ljava/util/Map;LWf/ad;Ljava/lang/String;)Ljava/lang/String;", "getTranslationKey", "(LWf/ad;)Lcom/checkout/components/kmp/rememberme/shared/model/TranslationKey;", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "DEFAULT$delegate", "Lkotlin/Lazy;", "getDEFAULT", "()Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "DEFAULT", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResourceProvider getDEFAULT() {
            return (ResourceProvider) ResourceProvider.DEFAULT$delegate.getValue();
        }

        @Nullable
        public final TranslationKey getTranslationKey(@NotNull ad resId) {
            Intrinsics.echo(resId, "resId");
            Res.string stringVar = Res.string.INSTANCE;
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_resend_countdown(stringVar))) {
                return TranslationKey.OTP_RESEND_COUNTDOWN;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_resend_description(stringVar))) {
                return TranslationKey.OTP_RESEND_DESCRIPTION;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_resend_cta(stringVar))) {
                return TranslationKey.OTP_RESEND_CTA;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_max_retries(stringVar))) {
                return TranslationKey.OTP_MAX_RETRIES;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_max_resends(stringVar))) {
                return TranslationKey.OTP_MAX_RESENDS;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_resend_email(stringVar))) {
                return TranslationKey.OTP_RESEND_EMAIL;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_resend_phone(stringVar))) {
                return TranslationKey.OTP_RESEND_PHONE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_use_saved_details(stringVar))) {
                return TranslationKey.REMEMBER_ME_USE_SAVED_DETAILS;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_continue_without_saved_details(stringVar))) {
                return TranslationKey.REMEMBER_ME_CONTINUE_WITHOUT_SAVED_DETAILS;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_change(stringVar))) {
                return TranslationKey.REMEMBER_ME_CHANGE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code(stringVar))) {
                return TranslationKey.OTP_CODE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_description_email(stringVar))) {
                return TranslationKey.OTP_CODE_DESCRIPTION_EMAIL;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_description(stringVar))) {
                return TranslationKey.OTP_CODE_DESCRIPTION;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_error(stringVar))) {
                return TranslationKey.OTP_CODE_ERROR;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_expired(stringVar))) {
                return TranslationKey.OTP_CODE_EXPIRED;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_send(stringVar))) {
                return TranslationKey.OTP_CODE_SEND;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_description_phone(stringVar))) {
                return TranslationKey.OTP_CODE_DESCRIPTION_PHONE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_description_whatsapp(stringVar))) {
                return TranslationKey.OTP_CODE_DESCRIPTION_WHATSAPP;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_email(stringVar))) {
                return TranslationKey.OTP_CODE_EMAIL;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_phone(stringVar))) {
                return TranslationKey.OTP_CODE_PHONE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_code_whatsapp(stringVar))) {
                return TranslationKey.OTP_CODE_WHATSAPP;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_cta(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_CTA;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_otp_different_method(stringVar))) {
                return TranslationKey.OTP_DIFFERENT_METHOD;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_line1_subtitle(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_LINE1_SUBTITLE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_line1_body(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_LINE1_BODY;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_line2_subtitle(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_LINE2_SUBTITLE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_line2_body(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_LINE2_BODY;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_line3_subtitle(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_LINE3_SUBTITLE;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_line3_body(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_LINE3_BODY;
            }
            if (Intrinsics.areEqual(resId, String0_commonMainKt.getCko_remember_me_modal_close_cta(stringVar))) {
                return TranslationKey.REMEMBER_ME_MODAL_CLOSE_CTA;
            }
            return null;
        }

        @Nullable
        public final String getTranslationString(@Nullable Map<TranslationKey, String> translation, @NotNull ad resId, @NotNull String arg) {
            String str;
            Intrinsics.echo(resId, "resId");
            Intrinsics.echo(arg, "arg");
            try {
                TranslationKey translationKey = getTranslationKey(resId);
                if (translationKey == null || translation == null || (str = translation.get(translationKey)) == null) {
                    return null;
                }
                return Extensions_androidKt.formatString(str, arg);
            } catch (Exception e) {
                System.out.print(e);
                return null;
            }
        }

        private Companion() {
        }
    }

    public ResourceProvider(@Nullable Map<TranslationKey, String> map) {
        this.translation = map;
    }

    public static final ResourceProvider DEFAULT_delegate$lambda$0() {
        return new ResourceProvider(null);
    }

    @NotNull
    public final String getString(@NotNull ad resId, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(resId, "resId");
        return getString(resId, "", interfaceC0581m, ((i4 << 3) & 896) | (i4 & 14) | 48);
    }

    @NotNull
    public final String getString(@NotNull ad resId, @NotNull String arg, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2 = true;
        Intrinsics.echo(resId, "resId");
        Intrinsics.echo(arg, "arg");
        String translationString = INSTANCE.getTranslationString(this.translation, resId, arg);
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (translationString == null) {
            c0585q.purple(-439758989);
            Object[] objArr = {arg};
            c0585q.purple(-217376913);
            x charlie = AbstractC3067v.charlie(w.bravo, c0585q);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(objArr[0].toString());
            c0585q.purple(1773732844);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new i(12);
                c0585q.f(jade);
            }
            Function0 getDefault = (Function0) jade;
            c0585q.quebec(false);
            c0585q.purple(1773733164);
            if ((((i4 & 14) ^ 6) <= 4 || !c0585q.golf(resId)) && (i4 & 6) != 4) {
                z2 = false;
            }
            boolean india = c0585q.india(arrayList) | z2 | c0585q.india(charlie);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                jade2 = new ag(resId, arrayList, charlie, null);
                c0585q.f(jade2);
            }
            l block = (l) jade2;
            c0585q.quebec(false);
            Intrinsics.echo(getDefault, "getDefault");
            Intrinsics.echo(block, "block");
            c0585q.purple(1165507973);
            ((s) c0585q.kilo(u.bravo)).getClass();
            r alpha = s.alpha(c0585q);
            c0585q.purple(406048553);
            boolean golf = c0585q.golf(resId) | c0585q.golf(arrayList) | c0585q.golf(alpha);
            Object jade3 = c0585q.jade();
            if (golf || jade3 == asVar) {
                jade3 = C0564b.zulu(vf.ad.amber(Nd.i.alpha, new y(block, alpha, null)));
                c0585q.f(jade3);
            }
            c0585q.quebec(false);
            c0585q.quebec(false);
            String str = (String) ((ax) jade3).getValue();
            c0585q.quebec(false);
            c0585q.quebec(false);
            return str;
        }
        c0585q.purple(-439760508);
        c0585q.quebec(false);
        return translationString;
    }
}
