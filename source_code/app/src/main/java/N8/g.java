package N8;

import J8.C0186a;
import J8.C0187b;
import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {
    public final C0187b alpha;
    public final Nd.h bravo;

    public g(C0187b appInfo, Nd.h blockingDispatcher) {
        Intrinsics.echo(appInfo, "appInfo");
        Intrinsics.echo(blockingDispatcher, "blockingDispatcher");
        this.alpha = appInfo;
        this.bravo = blockingDispatcher;
    }

    public static final URL alpha(g gVar) {
        gVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0187b c0187b = gVar.alpha;
        Uri.Builder appendPath2 = appendPath.appendPath(c0187b.alpha).appendPath("settings");
        C0186a c0186a = c0187b.bravo;
        return new URL(appendPath2.appendQueryParameter("build_version", c0186a.charlie).appendQueryParameter("display_version", c0186a.bravo).build().toString());
    }
}
