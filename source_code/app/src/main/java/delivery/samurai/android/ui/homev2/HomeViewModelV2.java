package delivery.samurai.android.ui.homev2;

import Af.n;
import Cf.e;
import Jb.E;
import Jb.aj;
import Jb.r;
import L9.d;
import V1.a;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.captian.User;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2956a;
import t3.InterfaceC2957b;
import vf.ad;
import vf.ao;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldelivery/samurai/android/ui/homev2/HomeViewModelV2;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "service", "Lt3/a;", "authService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;Lt3/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeViewModelV2 extends BaseViewModel {
    public final AndroidApp alpha;
    public final InterfaceC2957b bravo;
    public final InterfaceC2956a charlie;
    public final N delta;
    public final av echo;
    public long foxtrot;
    public final N golf;
    public final av hotel;
    public final N india;
    public final av juliet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModelV2(@NotNull AndroidApp app, @NotNull InterfaceC2957b service, @NotNull InterfaceC2956a authService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(service, "service");
        Intrinsics.echo(authService, "authService");
        this.alpha = app;
        this.bravo = service;
        this.charlie = authService;
        N charlie = AbstractC3428A.charlie(Boolean.FALSE);
        this.delta = charlie;
        this.echo = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(new aj(new r("", "", "", null, ""), CollectionsKt.emptyList()));
        this.golf = charlie2;
        this.hotel = new av(charlie2);
        N charlie3 = AbstractC3428A.charlie(CollectionsKt.emptyList());
        this.india = charlie3;
        this.juliet = new av(charlie3);
    }

    public final void alpha(String str) {
        a hotel = T.hotel(this);
        e eVar = ao.alpha;
        ad.zulu(hotel, n.alpha, null, new E(this, str, null), 2);
    }

    public final void bravo(UserInfo userInfo, ArrayList arrayList, String str) {
        Captain captain;
        User user;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer id2;
        if (userInfo != null) {
            captain = userInfo.getCaptain();
        } else {
            captain = null;
        }
        if (captain != null) {
            user = captain.getUser();
        } else {
            user = null;
        }
        N n5 = this.golf;
        aj ajVar = (aj) n5.getValue();
        if (captain != null && (id2 = captain.getId()) != null) {
            str2 = id2.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (user != null) {
            str3 = user.getName();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (user != null) {
            str4 = user.getEmail();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        AtomicInteger atomicInteger = d.alpha;
        AndroidApp androidApp = this.alpha;
        Intrinsics.echo(androidApp, "<this>");
        String string = d.plum(androidApp).getString("user_image", null);
        if (string != null && !StringsKt.gray(string)) {
            str6 = str2;
            str7 = str;
            str8 = string;
        } else {
            str6 = str2;
            str7 = str;
            str8 = null;
        }
        r rVar = new r(str6, str3, str5, str8, str7);
        ajVar.getClass();
        aj ajVar2 = new aj(rVar, arrayList);
        n5.getClass();
        n5.juliet(null, ajVar2);
    }
}
