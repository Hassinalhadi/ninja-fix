package Fc;

import B2.ap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.al;
import androidx.lifecycle.az;
import cb.C0841f;
import com.app.network.network.models.AppState;
import com.app.network.network.models.Captain;
import com.app.network.network.models.Envelop;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.captian.User;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.splash.AuthViewModel;
import i.C1860i;
import i.InterfaceC1869r;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kb.C2028d;
import kb.C2029e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ g(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = z2;
        this.silver = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Jwt jwt;
        String str;
        boolean z2;
        User user;
        Boolean referralProgramEnabled;
        String str2 = null;
        Object obj2 = this.silver;
        final boolean z10 = this.purple;
        Object obj3 = this.red;
        switch (this.alpha) {
            case 0:
                UserInfo userInfo = (UserInfo) obj;
                AuthViewModel authViewModel = (AuthViewModel) obj3;
                az azVar = (az) obj2;
                if (!z10) {
                    AndroidApp access$getApp$p = AuthViewModel.access$getApp$p(authViewModel);
                    Envelop envelop = userInfo.getEnvelop();
                    if (envelop != null) {
                        str = envelop.getPrivacyPolicyUrl();
                    } else {
                        str = null;
                    }
                    AtomicInteger atomicInteger = L9.d.alpha;
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
                    L9.d.indigo(AuthViewModel.access$getApp$p(authViewModel), userInfo.getPayment());
                    L9.d.jade(AuthViewModel.access$getApp$p(authViewModel), userInfo.getUniformsDeepLink());
                    AndroidApp access$getApp$p3 = AuthViewModel.access$getApp$p(authViewModel);
                    Captain captain = userInfo.getCaptain();
                    if (captain != null && (user = captain.getUser()) != null) {
                        str2 = user.getProfilePictureUrl();
                    }
                    L9.d.navy(access$getApp$p3, str2);
                    if (userInfo.getMissingAttributes() != null) {
                        L9.d.green(AuthViewModel.access$getApp$p(authViewModel), userInfo.getMissingAttributes());
                    } else {
                        L9.d.foxtrot(AuthViewModel.access$getApp$p(authViewModel));
                    }
                    L9.d.gold(AuthViewModel.access$getApp$p(authViewModel), userInfo.getIncogniaTokenRequired());
                    azVar.postValue(AppState.CAPTAIN_NOT_LOGGED_IN);
                } else {
                    L9.d.emerald(AuthViewModel.access$getApp$p(authViewModel), userInfo.getAppUpdate());
                    if (userInfo.getCaptain() == null) {
                        azVar.postValue(AppState.CAPTAIN_LOGGED_OUT);
                        L9.d.blue(AuthViewModel.access$getApp$p(authViewModel));
                        return Unit.INSTANCE;
                    }
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
                        }
                        userInfo.setHmacSecret(str2);
                    }
                    L9.d.jade(AuthViewModel.access$getApp$p(authViewModel), userInfo.getUniformsDeepLink());
                    L9.d.lavender(AuthViewModel.access$getApp$p(authViewModel), userInfo);
                    L9.d.gold(AuthViewModel.access$getApp$p(authViewModel), userInfo.getIncogniaTokenRequired());
                    AuthViewModel.access$getUnleashContextUpdater$p(authViewModel).alpha(userInfo);
                    L9.d.maroon(AuthViewModel.access$getApp$p(authViewModel), userInfo.getDisclaimer());
                    azVar.postValue(AppState.CAPTAIN_LOGGED_IN);
                }
                return Unit.INSTANCE;
            case 1:
                final Y1.l lVar = (Y1.l) obj3;
                final SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                androidx.lifecycle.aj ajVar = new androidx.lifecycle.aj() { // from class: a2.j
                    @Override // androidx.lifecycle.aj
                    public final void onStateChanged(al alVar, androidx.lifecycle.aa aaVar) {
                        Y1.l lVar2 = lVar;
                        boolean z11 = z10;
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        if (z11 && !snapshotStateList2.contains(lVar2)) {
                            snapshotStateList2.add(lVar2);
                        }
                        if (aaVar == androidx.lifecycle.aa.ON_START && !snapshotStateList2.contains(lVar2)) {
                            snapshotStateList2.add(lVar2);
                        }
                        if (aaVar == androidx.lifecycle.aa.ON_STOP) {
                            snapshotStateList2.remove(lVar2);
                        }
                    }
                };
                lVar.f2268a.kilo.alpha(ajVar);
                return new Cb.af(5, lVar, ajVar);
            default:
                InterfaceC1869r LazyRow = (InterfaceC1869r) obj;
                Intrinsics.echo(LazyRow, "$this$LazyRow");
                List list = ((C0841f) obj3).bravo;
                ((C1860i) LazyRow).quebec(list.size(), null, new ap(23, C2028d.purple, list), new P.d(new C2029e(list, z10, (Xd.l) obj2), -632812321, true));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(boolean z2, AuthViewModel authViewModel, az azVar) {
        this.alpha = 0;
        this.purple = z2;
        this.red = authViewModel;
        this.silver = azVar;
    }
}
