package s6;

import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import vf.C3215t;

/* loaded from: classes2.dex */
public abstract class B0 {
    public static Map alpha(UserInfo userInfo) {
        Captain captain;
        Integer num;
        boolean z2;
        String str;
        String str2;
        String str3;
        Integer platformId;
        Integer defaultCityId;
        String str4 = null;
        if (userInfo != null) {
            captain = userInfo.getCaptain();
        } else {
            captain = null;
        }
        if (captain != null) {
            num = captain.getId();
        } else {
            num = null;
        }
        if (num != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Pair pair = new Pair("is_logged_in", String.valueOf(z2));
        if (captain != null) {
            str = captain.getStatus();
        } else {
            str = null;
        }
        Pair pair2 = new Pair("captain_status", str);
        if (captain != null && (defaultCityId = captain.getDefaultCityId()) != null) {
            str2 = defaultCityId.toString();
        } else {
            str2 = null;
        }
        Pair pair3 = new Pair("city_id", str2);
        if (captain != null && (platformId = captain.getPlatformId()) != null) {
            str3 = platformId.toString();
        } else {
            str3 = null;
        }
        Pair pair4 = new Pair("platform_id", str3);
        if (captain != null) {
            str4 = captain.getType();
        }
        return kotlin.collections.y.sierra(pair, pair2, pair3, pair4, new Pair("app_role", str4));
    }

    public static final Object bravo(Af.q qVar, boolean z2, Af.q qVar2, Xd.l lVar) {
        Object c3215t;
        Object maroon;
        try {
            if (!av.q.kilo(lVar)) {
                c3215t = J6.echo(lVar, qVar2, qVar);
            } else {
                kotlin.jvm.internal.x.echo(2, lVar);
                c3215t = lVar.invoke(qVar2, qVar);
            }
        } catch (DispatchException e) {
            qVar.magenta(new C3215t(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            c3215t = new C3215t(th, false);
        }
        Od.a aVar = Od.a.alpha;
        if (c3215t == aVar || (maroon = qVar.maroon(c3215t)) == vf.ad.echo) {
            return aVar;
        }
        qVar.c();
        if (maroon instanceof C3215t) {
            if (!z2) {
                Throwable th2 = ((C3215t) maroon).alpha;
                if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == qVar) {
                    if (c3215t instanceof C3215t) {
                        throw ((C3215t) c3215t).alpha;
                    }
                    return c3215t;
                }
            }
            throw ((C3215t) maroon).alpha;
        }
        return vf.ad.black(maroon);
    }
}
