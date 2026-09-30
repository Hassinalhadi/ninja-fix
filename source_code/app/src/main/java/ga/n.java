package ga;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.UserInfo;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MoreFragment;
import e3.InterfaceC1628b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t6.AbstractC3090z2;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ MoreFragment purple;

    public /* synthetic */ n(MoreFragment moreFragment, int i4) {
        this.alpha = i4;
        this.purple = moreFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Envelop envelop;
        String trainingUrl;
        Object m206constructorimpl;
        Envelop envelop2;
        String faqUrl;
        Envelop envelop3;
        String privacyPolicyUrl;
        Context context;
        MoreFragment moreFragment = this.purple;
        switch (this.alpha) {
            case 0:
                String bravo = ((N9.d) ((InterfaceC1628b) moreFragment.f12061a.getValue())).bravo("about_us_url");
                Context context2 = moreFragment.getContext();
                if (context2 != null) {
                    L9.d.coral(context2, bravo);
                    return;
                }
                return;
            case 1:
                UserInfo userInfo = (UserInfo) moreFragment.kilo().oscar().getValue();
                if (userInfo != null && (envelop = userInfo.getEnvelop()) != null && (trainingUrl = envelop.getTrainingUrl()) != null) {
                    if (StringsKt.beige(trainingUrl, "youtube", false)) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(Uri.parse(trainingUrl).getQueryParameter(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                        }
                        String str = null;
                        if (m206constructorimpl instanceof kotlin.k) {
                            m206constructorimpl = null;
                        }
                        String str2 = (String) m206constructorimpl;
                        if (str2 != null && !StringsKt.gray(str2)) {
                            str = str2;
                        }
                        try {
                            if (str != null) {
                                moreFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:".concat(str))));
                            } else {
                                moreFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(trainingUrl)));
                            }
                            return;
                        } catch (ActivityNotFoundException unused) {
                            moreFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(trainingUrl)));
                            return;
                        }
                    }
                    Context context3 = moreFragment.getContext();
                    if (context3 != null) {
                        L9.d.coral(context3, trainingUrl);
                        return;
                    }
                    return;
                }
                androidx.fragment.app.an requireActivity = moreFragment.requireActivity();
                Intrinsics.delta(requireActivity, "requireActivity(...)");
                String string = moreFragment.getString(R.string.error_something_went_wrong);
                Intrinsics.delta(string, "getString(...)");
                L9.d.pink(requireActivity, string);
                return;
            case 2:
                UserInfo userInfo2 = (UserInfo) moreFragment.kilo().oscar().getValue();
                if (userInfo2 != null && (envelop2 = userInfo2.getEnvelop()) != null && (faqUrl = envelop2.getFaqUrl()) != null) {
                    String beige = L9.d.beige(faqUrl);
                    if (beige != null) {
                        try {
                            moreFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(beige)));
                            return;
                        } catch (Exception unused2) {
                            androidx.fragment.app.an requireActivity2 = moreFragment.requireActivity();
                            Intrinsics.delta(requireActivity2, "requireActivity(...)");
                            String string2 = moreFragment.getString(R.string.error_something_went_wrong);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(requireActivity2, string2);
                            return;
                        }
                    }
                    return;
                }
                androidx.fragment.app.an requireActivity3 = moreFragment.requireActivity();
                Intrinsics.delta(requireActivity3, "requireActivity(...)");
                String string3 = moreFragment.getString(R.string.error_something_went_wrong);
                Intrinsics.delta(string3, "getString(...)");
                L9.d.pink(requireActivity3, string3);
                return;
            case 3:
                moreFragment.tango(R.id.nav_component_showcase);
                return;
            case 4:
                String romeo = moreFragment.romeo();
                if (romeo != null && !StringsKt.gray(romeo)) {
                    Context requireContext = moreFragment.requireContext();
                    Intrinsics.delta(requireContext, "requireContext(...)");
                    AbstractC3090z2.bravo(requireContext, romeo);
                    return;
                }
                return;
            case 5:
                moreFragment.uniform(new Y1.a(R.id.action_nav_more_to_btnMyAccount2));
                return;
            case 6:
                moreFragment.uniform(new Y1.a(R.id.action_nav_more_to_nav_agreement));
                return;
            case 7:
                moreFragment.tango(R.id.nav_trophies_collections);
                return;
            case 8:
                moreFragment.uniform(new Y1.a(R.id.action_nav_more_to_nav_order_history));
                return;
            case 9:
                moreFragment.uniform(new Y1.a(R.id.action_nav_more_to_nav_withdraw_history));
                return;
            case 10:
                moreFragment.uniform(new Y1.a(R.id.action_nav_more_to_nav_referral_program));
                return;
            case 11:
                moreFragment.uniform(new Y1.a(R.id.action_nav_more_to_nav_score));
                return;
            case 12:
                moreFragment.tango(R.id.action_nav_more_to_nav_captains_uniforms);
                return;
            default:
                UserInfo userInfo3 = (UserInfo) moreFragment.kilo().oscar().getValue();
                if (userInfo3 != null && (envelop3 = userInfo3.getEnvelop()) != null && (privacyPolicyUrl = envelop3.getPrivacyPolicyUrl()) != null && (context = moreFragment.getContext()) != null) {
                    L9.d.coral(context, privacyPolicyUrl);
                    return;
                }
                return;
        }
    }
}
