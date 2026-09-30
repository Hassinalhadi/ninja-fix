package t6;

import android.view.View;
import com.clevertap.android.sdk.network.api.CtApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import pd.AbstractC2304b;
import pf.AbstractC2360j;

/* renamed from: t6.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2991f2 {
    public static final Long alpha(AbstractC2304b abstractC2304b) {
        Intrinsics.echo(abstractC2304b, "<this>");
        sd.m alpha = abstractC2304b.alpha();
        List list = sd.q.alpha;
        String str = alpha.get("Content-Length");
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final sd.e bravo(C2226c c2226c) {
        Intrinsics.echo(c2226c, "<this>");
        List list = sd.q.alpha;
        String K6 = c2226c.charlie.K(CtApi.HEADER_CONTENT_TYPE);
        if (K6 != null) {
            sd.e eVar = sd.e.white;
            return AbstractC2976c2.bravo(K6);
        }
        return null;
    }

    public static final sd.e charlie(sd.r rVar) {
        Intrinsics.echo(rVar, "<this>");
        sd.m alpha = rVar.alpha();
        List list = sd.q.alpha;
        String str = alpha.get(CtApi.HEADER_CONTENT_TYPE);
        if (str != null) {
            sd.e eVar = sd.e.white;
            return AbstractC2976c2.bravo(str);
        }
        return null;
    }

    public static final void delta(C2226c c2226c, sd.e type) {
        Intrinsics.echo(type, "type");
        List list = sd.q.alpha;
        String value = type.toString();
        sd.n nVar = c2226c.charlie;
        nVar.getClass();
        Intrinsics.echo(value, "value");
        nVar.V(value);
        List J4 = nVar.J(CtApi.HEADER_CONTENT_TYPE);
        J4.clear();
        J4.add(value);
    }

    public static final Y1.r echo(View view) {
        Intrinsics.echo(view, "view");
        Y1.r rVar = (Y1.r) AbstractC2360j.india(AbstractC2360j.papa(AbstractC2360j.lima(view, new X9.i(8)), new X9.i(9)));
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
