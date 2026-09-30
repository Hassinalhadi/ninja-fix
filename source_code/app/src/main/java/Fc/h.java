package Fc;

import com.app.network.network.models.Captain;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.captian.User;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AuthViewModel purple;

    public /* synthetic */ h(AuthViewModel authViewModel, int i4) {
        this.alpha = i4;
        this.purple = authViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        boolean z2;
        String str2;
        String str3;
        User user;
        Jwt jwt;
        Boolean referralProgramEnabled;
        switch (this.alpha) {
            case 0:
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNull(th);
                this.purple.onHandleError(th);
                return Unit.INSTANCE;
            case 1:
                UserInfo userInfo = (UserInfo) obj;
                AuthViewModel authViewModel = this.purple;
                L9.d.emerald(AuthViewModel.access$getApp$p(authViewModel), userInfo.getAppUpdate());
                AndroidApp access$getApp$p = AuthViewModel.access$getApp$p(authViewModel);
                Envelop envelop = userInfo.getEnvelop();
                String str4 = null;
                if (envelop != null) {
                    str = envelop.getPrivacyPolicyUrl();
                } else {
                    str = null;
                }
                Intrinsics.echo(access$getApp$p, "<this>");
                L9.k.golf(access$getApp$p).edit().putString("privacyUrl", str).apply();
                AndroidApp access$getApp$p2 = AuthViewModel.access$getApp$p(authViewModel);
                Envelop envelop2 = userInfo.getEnvelop();
                if (envelop2 != null && (referralProgramEnabled = envelop2.getReferralProgramEnabled()) != null) {
                    z2 = referralProgramEnabled.booleanValue();
                } else {
                    z2 = false;
                }
                Intrinsics.echo(access$getApp$p2, "<this>");
                L9.k.golf(access$getApp$p2).edit().putBoolean("isReferralAllowed", z2).apply();
                L9.d.maroon(AuthViewModel.access$getApp$p(authViewModel), userInfo.getDisclaimer());
                L9.d.jade(AuthViewModel.access$getApp$p(authViewModel), userInfo.getUniformsDeepLink());
                L9.d.indigo(AuthViewModel.access$getApp$p(authViewModel), userInfo.getPayment());
                UserInfo sierra = L9.d.sierra(AuthViewModel.access$getApp$p(authViewModel));
                if (userInfo.getJwt() == null) {
                    if (sierra != null) {
                        jwt = sierra.getJwt();
                    } else {
                        jwt = null;
                    }
                    userInfo.setJwt(jwt);
                }
                String hmacSecret = userInfo.getHmacSecret();
                if (hmacSecret == null || StringsKt.gray(hmacSecret)) {
                    if (sierra != null) {
                        str2 = sierra.getHmacSecret();
                    } else {
                        str2 = null;
                    }
                    userInfo.setHmacSecret(str2);
                }
                L9.d.lavender(AuthViewModel.access$getApp$p(authViewModel), userInfo);
                AndroidApp access$getApp$p3 = AuthViewModel.access$getApp$p(authViewModel);
                Captain captain = userInfo.getCaptain();
                if (captain != null && (user = captain.getUser()) != null) {
                    str3 = user.getProfilePictureUrl();
                } else {
                    str3 = null;
                }
                L9.d.navy(access$getApp$p3, str3);
                AuthViewModel.access$getUnleashContextUpdater$p(authViewModel).alpha(userInfo);
                AndroidApp access$getApp$p4 = AuthViewModel.access$getApp$p(authViewModel);
                Boolean incogniaEventsEnabled = userInfo.getIncogniaEventsEnabled();
                Intrinsics.echo(access$getApp$p4, "<this>");
                access$getApp$p4.getSharedPreferences("incognia_tracker", 0).edit().putBoolean("incognia_events_enabled", Intrinsics.areEqual(incogniaEventsEnabled, Boolean.TRUE)).apply();
                L9.d.gold(AuthViewModel.access$getApp$p(authViewModel), userInfo.getIncogniaTokenRequired());
                AndroidApp access$getApp$p5 = AuthViewModel.access$getApp$p(authViewModel);
                Captain captain2 = userInfo.getCaptain();
                if (captain2 != null) {
                    str4 = captain2.getType();
                }
                Intrinsics.echo(access$getApp$p5, "<this>");
                access$getApp$p5.getSharedPreferences("incognia_tracker", 0).edit().putString("incognia_captain_type", str4).apply();
                Intrinsics.checkNotNull(userInfo);
                AuthViewModel.access$trackShiftStartIfNeeded(authViewModel, userInfo);
                AuthViewModel.access$trackShiftEndIfNeeded(authViewModel, userInfo);
                if (userInfo.getMissingAttributes() != null) {
                    L9.d.green(AuthViewModel.access$getApp$p(authViewModel), userInfo.getMissingAttributes());
                } else {
                    L9.d.foxtrot(AuthViewModel.access$getApp$p(authViewModel));
                }
                return Unit.INSTANCE;
            default:
                Throwable th2 = (Throwable) obj;
                Intrinsics.checkNotNull(th2);
                this.purple.onHandleError(th2);
                return Unit.INSTANCE;
        }
    }
}
