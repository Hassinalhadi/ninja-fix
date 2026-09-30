package N8;

import J8.C0187b;
import J8.aa;
import J8.ab;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import j8.InterfaceC1947d;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import vf.ad;

/* loaded from: classes2.dex */
public final class e implements o {
    public final InterfaceC1947d alpha;
    public final C0187b bravo;
    public final g charlie;
    public final L8.a delta;
    public final Ef.c echo;

    public e(Nd.h backgroundDispatcher, InterfaceC1947d firebaseInstallationsApi, C0187b appInfo, g configsFetcher, L8.a lazySettingsCache) {
        Intrinsics.echo(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.echo(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.echo(appInfo, "appInfo");
        Intrinsics.echo(configsFetcher, "configsFetcher");
        Intrinsics.echo(lazySettingsCache, "lazySettingsCache");
        this.alpha = firebaseInstallationsApi;
        this.bravo = appInfo;
        this.charlie = configsFetcher;
        this.delta = lazySettingsCache;
        this.echo = Ef.d.alpha();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:25:0x0050, B:26:0x00b3, B:28:0x00bd, B:31:0x00c5, B:37:0x017b, B:39:0x008a, B:41:0x0094, B:42:0x00a1), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:25:0x0050, B:26:0x00b3, B:28:0x00bd, B:31:0x00c5, B:37:0x017b, B:39:0x008a, B:41:0x0094, B:42:0x00a1), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:25:0x0050, B:26:0x00b3, B:28:0x00bd, B:31:0x00c5, B:37:0x017b, B:39:0x008a, B:41:0x0094, B:42:0x00a1), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:25:0x0050, B:26:0x00b3, B:28:0x00bd, B:31:0x00c5, B:37:0x017b, B:39:0x008a, B:41:0x0094, B:42:0x00a1), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [N8.d, Pd.i] */
    @Override // N8.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Nd.c cVar) {
        b bVar;
        ?? r10;
        Ef.a aVar;
        Ef.a aVar2;
        e eVar;
        Unit unit;
        String str;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i4 = bVar.teal;
                if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    bVar.teal = i4 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = bVar.red;
                    Od.a aVar3 = Od.a.alpha;
                    r10 = bVar.teal;
                    if (r10 == 0) {
                        if (r10 != 1) {
                            if (r10 != 2) {
                                if (r10 == 3) {
                                    aVar = (Ef.a) bVar.alpha;
                                    try {
                                        ResultKt.alpha(obj);
                                        ((Ef.c) aVar).foxtrot(null);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        ((Ef.c) aVar).foxtrot(null);
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = bVar.purple;
                            eVar = (e) bVar.alpha;
                            ResultKt.alpha(obj);
                            str = ((ab) obj).alpha;
                            if (!Intrinsics.areEqual(str, "")) {
                                Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                                unit = Unit.INSTANCE;
                                ((Ef.c) aVar2).foxtrot(null);
                                return unit;
                            }
                            Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                            eVar.getClass();
                            Pair pair2 = new Pair("X-Crashlytics-Device-Model", new Regex("/").foxtrot(format, ""));
                            String INCREMENTAL = Build.VERSION.INCREMENTAL;
                            Intrinsics.delta(INCREMENTAL, "INCREMENTAL");
                            Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", new Regex("/").foxtrot(INCREMENTAL, ""));
                            String RELEASE = Build.VERSION.RELEASE;
                            Intrinsics.delta(RELEASE, "RELEASE");
                            Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", new Regex("/").foxtrot(RELEASE, ""));
                            eVar.bravo.getClass();
                            Map sierra = y.sierra(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "2.1.2"));
                            Log.d("SessionConfigFetcher", "Fetching settings from server.");
                            g gVar = eVar.charlie;
                            c cVar2 = new c(eVar, null);
                            ?? iVar = new Pd.i(2, null);
                            bVar.alpha = aVar2;
                            bVar.purple = null;
                            bVar.teal = 3;
                            gVar.getClass();
                            Object blue = ad.blue(gVar.bravo, new f(gVar, sierra, cVar2, iVar, null), bVar);
                            if (blue != aVar3) {
                                blue = Unit.INSTANCE;
                            }
                            if (blue != aVar3) {
                                aVar = aVar2;
                                ((Ef.c) aVar).foxtrot(null);
                                return Unit.INSTANCE;
                            }
                            return aVar3;
                        }
                        aVar2 = bVar.purple;
                        eVar = (e) bVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        Ef.c cVar3 = this.echo;
                        if (!cVar3.charlie() && !echo().bravo()) {
                            return Unit.INSTANCE;
                        }
                        bVar.alpha = this;
                        bVar.purple = cVar3;
                        bVar.teal = 1;
                        if (cVar3.delta(bVar) != aVar3) {
                            aVar2 = cVar3;
                            eVar = this;
                        }
                        return aVar3;
                    }
                    if (eVar.echo().bravo()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        unit = Unit.INSTANCE;
                        ((Ef.c) aVar2).foxtrot(null);
                        return unit;
                    }
                    aa aaVar = ab.charlie;
                    InterfaceC1947d interfaceC1947d = eVar.alpha;
                    bVar.alpha = eVar;
                    bVar.purple = aVar2;
                    bVar.teal = 2;
                    obj = aaVar.alpha(interfaceC1947d, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    str = ((ab) obj).alpha;
                    if (!Intrinsics.areEqual(str, "")) {
                    }
                }
            }
            if (r10 == 0) {
            }
            if (eVar.echo().bravo()) {
            }
        } catch (Throwable th2) {
            th = th2;
            aVar = r10;
        }
        bVar = new b(this, (Pd.c) cVar);
        Object obj2 = bVar.red;
        Od.a aVar32 = Od.a.alpha;
        r10 = bVar.teal;
    }

    @Override // N8.o
    public final Boolean bravo() {
        h hVar = echo().bravo;
        if (hVar != null) {
            return hVar.alpha;
        }
        Intrinsics.lima("sessionConfigs");
        throw null;
    }

    @Override // N8.o
    public final kotlin.time.b charlie() {
        h hVar = echo().bravo;
        if (hVar != null) {
            Integer num = hVar.charlie;
            if (num == null) {
                return null;
            }
            int i4 = kotlin.time.b.silver;
            return new kotlin.time.b(kotlin.time.g.papa(num.intValue(), kotlin.time.d.teal));
        }
        Intrinsics.lima("sessionConfigs");
        throw null;
    }

    @Override // N8.o
    public final Double delta() {
        h hVar = echo().bravo;
        if (hVar != null) {
            return hVar.bravo;
        }
        Intrinsics.lima("sessionConfigs");
        throw null;
    }

    public final n echo() {
        Object obj = this.delta.get();
        Intrinsics.delta(obj, "lazySettingsCache.get()");
        return (n) obj;
    }
}
