package Jb;

import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.t0;
import androidx.drawerlayout.widget.DrawerLayout;
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.ZenDeskCredentials;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.android.material.navigation.NavigationView;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import t6.AbstractC3090z2;

/* loaded from: classes2.dex */
public final /* synthetic */ class as implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ HomeActivityV2 purple;

    public /* synthetic */ as(HomeActivityV2 homeActivityV2, int i4) {
        this.alpha = i4;
        this.purple = homeActivityV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Menu menu;
        MenuItem findItem;
        ZenDeskCredentials zenDeskCredentials;
        ZenDeskCredentials zenDeskCredentials2;
        Object m206constructorimpl;
        Envelop envelop;
        String faqUrl;
        Envelop envelop2;
        String privacyPolicyUrl;
        Envelop envelop3;
        String trainingUrl;
        Object m206constructorimpl2;
        String str = null;
        boolean z2 = false;
        HomeActivityV2 homeActivityV2 = this.purple;
        boolean z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        switch (this.alpha) {
            case 0:
                UserInfo userInfo = (UserInfo) obj;
                if (homeActivityV2.f12278P) {
                    HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) homeActivityV2.f12280S.getValue();
                    UserInfo sierra = L9.d.sierra(homeActivityV2.lima());
                    ArrayList gray = homeActivityV2.gray();
                    String string = homeActivityV2.getString(R.string.nav_header_app_version, Integer.valueOf(Smooth$Close.expectedVersionCode), Smooth$Close.expectedVersionName);
                    Intrinsics.delta(string, "getString(...)");
                    homeViewModelV2.bravo(sierra, gray, string);
                    if (userInfo != null) {
                        zenDeskCredentials2 = userInfo.getZendesk();
                    } else {
                        zenDeskCredentials2 = null;
                    }
                    if (zenDeskCredentials2 != null) {
                        z2 = true;
                    }
                    ((t0) homeActivityV2.f12275M).setValue(Boolean.valueOf(z2));
                } else {
                    NavigationView navigationView = homeActivityV2.f12277O;
                    if (navigationView != null && (menu = navigationView.getMenu()) != null && (findItem = menu.findItem(R.id.nav_support)) != null) {
                        if (userInfo != null) {
                            zenDeskCredentials = userInfo.getZendesk();
                        } else {
                            zenDeskCredentials = null;
                        }
                        if (zenDeskCredentials != null) {
                            z2 = true;
                        }
                        findItem.setVisible(z2);
                    }
                }
                N9.m mVar = homeActivityV2.f12272J;
                if (mVar != null) {
                    mVar.alpha(userInfo);
                    q3.g gVar = homeActivityV2.f12273K;
                    if (gVar != null) {
                        Log.d("UnleashTest", "test-samurai-app flag = " + ((N9.i) gVar).bravo(N9.a.echo));
                        return Unit.INSTANCE;
                    }
                    Intrinsics.lima("featureFlagProvider");
                    throw null;
                }
                Intrinsics.lima("unleashContextUpdater");
                throw null;
            case 1:
                int i4 = HomeActivityV2.f12269k0;
                int i5 = ((C2492a) obj).alpha;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            homeActivityV2.bronze();
                        }
                    } else {
                        homeActivityV2.tango();
                        homeActivityV2.november().golf();
                        homeActivityV2.november().bravo();
                        Object systemService = homeActivityV2.getSystemService("notification");
                        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).cancelAll();
                        homeActivityV2.getWindow().clearFlags(128);
                    }
                } else {
                    String string2 = homeActivityV2.getString(R.string.error_message);
                    Intrinsics.delta(string2, "getString(...)");
                    L9.d.pink(homeActivityV2, string2);
                    homeActivityV2.tango();
                }
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj).intValue();
                int i10 = HomeActivityV2.f12269k0;
                switch (intValue) {
                    case R.id.nav_about_us /* 2131362808 */:
                        L9.d.coral(homeActivityV2, ((N9.d) homeActivityV2.papa()).bravo("about_us_url"));
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        break;
                    case R.id.nav_assets /* 2131362812 */:
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            homeActivityV2.startActivity(new Intent(homeActivityV2, (Class<?>) AssetsListActivity.class));
                            m206constructorimpl = Result.m206constructorimpl(Boolean.TRUE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                        if (m207exceptionOrNullimpl != null) {
                            Log.e("HomeActivityV2", "Failed to open AssetsListActivity", m207exceptionOrNullimpl);
                            String string3 = homeActivityV2.getString(R.string.error_something_went_wrong);
                            Intrinsics.delta(string3, "getString(...)");
                            L9.d.pink(homeActivityV2, string3);
                            m206constructorimpl = Boolean.FALSE;
                        }
                        z10 = ((Boolean) m206constructorimpl).booleanValue();
                        break;
                    case R.id.nav_faqs /* 2131362819 */:
                        UserInfo userInfo2 = (UserInfo) homeActivityV2.oscar().getValue();
                        if (userInfo2 != null && (envelop = userInfo2.getEnvelop()) != null && (faqUrl = envelop.getFaqUrl()) != null) {
                            L9.d.coral(homeActivityV2, faqUrl);
                        }
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        break;
                    case R.id.nav_logout /* 2131362823 */:
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        ((AuthViewModel) homeActivityV2.f12279R.getValue()).onLogout().observe(homeActivityV2, new Dc.t(4, new as(homeActivityV2, z10 ? 1 : 0)));
                        break;
                    case R.id.nav_ninja_store /* 2131362825 */:
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        String indigo = homeActivityV2.indigo();
                        if (indigo != null && !StringsKt.gray(indigo)) {
                            AbstractC3090z2.bravo(homeActivityV2, indigo);
                            break;
                        } else {
                            String string4 = homeActivityV2.getString(R.string.error_something_went_wrong);
                            Intrinsics.delta(string4, "getString(...)");
                            L9.d.pink(homeActivityV2, string4);
                            break;
                        }
                        break;
                    case R.id.nav_privacy_policy /* 2131362830 */:
                        UserInfo userInfo3 = (UserInfo) homeActivityV2.oscar().getValue();
                        if (userInfo3 != null && (envelop2 = userInfo3.getEnvelop()) != null && (privacyPolicyUrl = envelop2.getPrivacyPolicyUrl()) != null) {
                            L9.d.coral(homeActivityV2, privacyPolicyUrl);
                        }
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        break;
                    case R.id.nav_training /* 2131362841 */:
                        UserInfo userInfo4 = (UserInfo) homeActivityV2.oscar().getValue();
                        if (userInfo4 != null && (envelop3 = userInfo4.getEnvelop()) != null && (trainingUrl = envelop3.getTrainingUrl()) != null) {
                            if (StringsKt.beige(trainingUrl, "youtube", false)) {
                                try {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    m206constructorimpl2 = Result.m206constructorimpl(Uri.parse(trainingUrl).getQueryParameter(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE));
                                } catch (Throwable th2) {
                                    Result.Companion companion4 = Result.INSTANCE;
                                    m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
                                }
                                if (m206constructorimpl2 instanceof kotlin.k) {
                                    m206constructorimpl2 = null;
                                }
                                String str2 = (String) m206constructorimpl2;
                                if (str2 != null && !StringsKt.gray(str2)) {
                                    str = str2;
                                }
                                try {
                                    if (str != null) {
                                        homeActivityV2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:".concat(str))));
                                    } else {
                                        homeActivityV2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(trainingUrl)));
                                    }
                                } catch (ActivityNotFoundException unused) {
                                    homeActivityV2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(trainingUrl)));
                                }
                            } else {
                                L9.d.coral(homeActivityV2, trainingUrl);
                            }
                        }
                        ((DrawerLayout) homeActivityV2.jade().red).charlie(false);
                        break;
                    default:
                        z10 = homeActivityV2.maroon(intValue, null);
                        break;
                }
                return Boolean.valueOf(z10);
        }
    }
}
