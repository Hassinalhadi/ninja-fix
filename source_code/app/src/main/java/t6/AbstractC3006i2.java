package t6;

import g.C1718a;
import io.ktor.http.URLParserException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: t6.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3006i2 {
    public static final sd.af alpha(String urlString) {
        Intrinsics.echo(urlString, "urlString");
        sd.aa aaVar = new sd.aa();
        if (!StringsKt.gray(urlString)) {
            try {
                sd.ab.bravo(aaVar, urlString);
            } catch (Throwable th) {
                throw new URLParserException(urlString, th);
            }
        }
        return aaVar.bravo();
    }

    public static final sd.af bravo(sd.aa builder) {
        Intrinsics.echo(builder, "builder");
        sd.aa aaVar = new sd.aa();
        delta(aaVar, builder);
        return aaVar.bravo();
    }

    public static int charlie(int i4) {
        if (i4 != 0) {
            if (i4 != 90) {
                if (i4 != 180) {
                    if (i4 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException(ao.ad.zulu(i4, "Invalid rotation: "));
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [zd.q, sd.y, java.lang.Object, G3.a] */
    public static final void delta(sd.aa aaVar, sd.aa url) {
        Intrinsics.echo(aaVar, "<this>");
        Intrinsics.echo(url, "url");
        aaVar.delta = url.delta;
        String str = url.alpha;
        Intrinsics.echo(str, "<set-?>");
        aaVar.alpha = str;
        aaVar.delta(url.charlie);
        List list = url.hotel;
        Intrinsics.echo(list, "<set-?>");
        aaVar.hotel = list;
        aaVar.echo = url.echo;
        aaVar.foxtrot = url.foxtrot;
        ?? aVar = new G3.a(10);
        tg.k.alpha(aVar, url.india);
        aaVar.india = aVar;
        aaVar.juliet = new C1718a(27, (Object) aVar);
        String str2 = url.golf;
        Intrinsics.echo(str2, "<set-?>");
        aaVar.golf = str2;
        aaVar.bravo = url.bravo;
    }
}
