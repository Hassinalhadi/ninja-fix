package d3;

import Jb.S;
import android.app.NotificationManager;
import android.content.Context;
import com.app.network.network.models.Captain;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import e3.InterfaceC1627a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vf.ab;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements Xd.l {
    public final /* synthetic */ k alpha;
    public final /* synthetic */ UserInfo purple;
    public final /* synthetic */ S red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, UserInfo userInfo, S s3, Nd.c cVar) {
        super(2, cVar);
        this.alpha = kVar;
        this.purple = userInfo;
        this.red = s3;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Jwt jwt;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        k kVar = this.alpha;
        InterfaceC1627a quebec = kVar.quebec();
        UserInfo userInfo = this.purple;
        L9.d.emerald(((z9.j) quebec).alpha, userInfo.getAppUpdate());
        L9.d.maroon(((z9.j) kVar.quebec()).alpha, userInfo.getDisclaimer());
        L9.d.indigo(((z9.j) kVar.quebec()).alpha, userInfo.getPayment());
        L9.d.jade(((z9.j) kVar.quebec()).alpha, userInfo.getUniformsDeepLink());
        InterfaceC1627a quebec2 = kVar.quebec();
        Intrinsics.checkNotNull(userInfo);
        ((z9.j) quebec2).bravo(userInfo);
        Captain captain = userInfo.getCaptain();
        S s3 = this.red;
        String str2 = null;
        if (captain == null) {
            L9.d.blue(((z9.j) kVar.quebec()).alpha);
            Object systemService = kVar.getSystemService("notification");
            Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancelAll();
            if (s3 != null) {
                s3.invoke(null);
            }
            kVar.romeo();
            kVar.november().golf();
            kVar.november().bravo();
            return Unit.INSTANCE;
        }
        UserInfo sierra = L9.d.sierra(((z9.j) kVar.quebec()).alpha);
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
                str = sierra.getHmacSecret();
            } else {
                str = null;
            }
            userInfo.setHmacSecret(str);
        }
        InterfaceC1627a quebec3 = kVar.quebec();
        Captain captain2 = userInfo.getCaptain();
        if (captain2 != null) {
            str2 = captain2.getStatus();
        }
        boolean areEqual = Intrinsics.areEqual(str2, "NAQL_BLOCKED");
        Context context = ((z9.j) quebec3).alpha;
        Intrinsics.echo(context, "<this>");
        L9.k.golf(context).edit().putBoolean("isNaqlBlocked", areEqual).apply();
        InterfaceC1627a quebec4 = kVar.quebec();
        Intrinsics.checkNotNull(userInfo);
        L9.d.lavender(((z9.j) quebec4).alpha, userInfo);
        if (s3 != null) {
            s3.invoke(userInfo);
        }
        kVar.oscar().postValue(userInfo);
        return Unit.INSTANCE;
    }
}
