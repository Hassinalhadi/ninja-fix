package N8;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;

/* loaded from: classes2.dex */
public final class n {
    public static final G1.f charlie = new G1.f("firebase_sessions_enabled");
    public static final G1.f delta = new G1.f("firebase_sessions_sampling_rate");
    public static final G1.f echo = new G1.f("firebase_sessions_restart_timeout");
    public static final G1.f foxtrot = new G1.f("firebase_sessions_cache_duration");
    public static final G1.f golf = new G1.f("firebase_sessions_cache_updated_time");
    public final C1.h alpha;
    public h bravo;

    public n(C1.h dataStore) {
        Intrinsics.echo(dataStore, "dataStore");
        this.alpha = dataStore;
        ad.amber(Nd.i.alpha, new k(this, null));
    }

    public static final void alpha(n nVar, G1.b bVar) {
        nVar.getClass();
        nVar.bravo = new h((Boolean) bVar.charlie(charlie), (Double) bVar.charlie(delta), (Integer) bVar.charlie(echo), (Integer) bVar.charlie(foxtrot), (Long) bVar.charlie(golf));
    }

    public final boolean bravo() {
        Integer num;
        h hVar = this.bravo;
        if (hVar != null) {
            if (hVar != null) {
                Long l10 = hVar.echo;
                if (l10 != null && (num = hVar.delta) != null && (System.currentTimeMillis() - l10.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            Intrinsics.lima("sessionConfigs");
            throw null;
        }
        Intrinsics.lima("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object charlie(G1.f fVar, Object obj, Pd.c cVar) {
        l lVar;
        int i4;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i5 = lVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                lVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = lVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = lVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    C1.h hVar = this.alpha;
                    m mVar = new m(obj, fVar, this, null);
                    lVar.red = 1;
                    if (hVar.bravo(new G1.h(mVar, null), lVar) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        lVar = new l(this, cVar);
        Object obj22 = lVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = lVar.red;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
