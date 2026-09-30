package w8;

import C8.g;
import u8.C3146a;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3239a extends e {
    public static final C3146a bravo = C3146a.delta();
    public final g alpha;

    public C3239a(g gVar) {
        this.alpha = gVar;
    }

    @Override // w8.e
    public final boolean alpha() {
        C3146a c3146a = bravo;
        g gVar = this.alpha;
        if (gVar == null) {
            c3146a.foxtrot("ApplicationInfo is null");
        } else if (!gVar.beige()) {
            c3146a.foxtrot("GoogleAppId is null");
        } else if (!gVar.amber()) {
            c3146a.foxtrot("AppInstanceId is null");
        } else if (!gVar.azure()) {
            c3146a.foxtrot("ApplicationProcessState is null");
        } else if (gVar.zulu()) {
            if (!gVar.xray().whiskey()) {
                c3146a.foxtrot("AndroidAppInfo.packageName is null");
            } else if (!gVar.xray().xray()) {
                c3146a.foxtrot("AndroidAppInfo.sdkVersion is null");
            } else {
                return true;
            }
        } else {
            return true;
        }
        c3146a.foxtrot("ApplicationInfo is invalid");
        return false;
    }
}
