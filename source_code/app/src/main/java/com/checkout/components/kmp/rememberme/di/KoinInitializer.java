package com.checkout.components.kmp.rememberme.di;

import Q0.c;
import ao.ad;
import av.ao;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.measurement.internal.C1467s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.time.d;
import kotlin.time.j;
import kotlin.time.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/kmp/rememberme/di/KoinInitializer;", "", "<init>", "()V", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", com.clevertap.android.sdk.Constants.KEY_CONFIG, "", "initialize", "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;)V", "cleanup", "", "isInitialized", "()Z", "Leg/b;", "koinApp", "Leg/b;", "Leg/a;", "getKoin$rememberme_release", "()Leg/a;", "koin", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KoinInitializer {

    @Nullable
    private static eg.b koinApp;

    @NotNull
    public static final KoinInitializer INSTANCE = new KoinInitializer();
    public static final int $stable = 8;

    private KoinInitializer() {
    }

    private static final Unit initialize$lambda$0(jg.a aVar, eg.b koinApplication) {
        Intrinsics.echo(koinApplication, "$this$koinApplication");
        List<jg.a> modules = KoinModulesKt.rememberMeModules(aVar);
        Intrinsics.echo(modules, "modules");
        eg.a aVar2 = koinApplication.alpha;
        C1467s c1467s = aVar2.alpha;
        ig.a aVar3 = ig.a.purple;
        c1467s.getClass();
        if (ig.a.teal.compareTo(aVar3) <= 0) {
            long alpha = j.alpha();
            koinApplication.alpha(modules);
            long alpha2 = k.alpha(alpha);
            StringBuilder sierra = c.sierra(((ConcurrentHashMap) aVar2.delta.red).size(), "Started ", " definitions in ");
            int i4 = kotlin.time.b.silver;
            sierra.append(kotlin.time.b.golf(alpha2, d.red) / 1000.0d);
            sierra.append(" ms");
            String msg = sierra.toString();
            aVar2.alpha.getClass();
            Intrinsics.echo(msg, "msg");
        } else {
            koinApplication.alpha(modules);
        }
        return Unit.INSTANCE;
    }

    public final void cleanup() {
        eg.b bVar = koinApp;
        if (bVar != null) {
            eg.a aVar = bVar.alpha;
            mg.a aVar2 = aVar.charlie;
            for (Object obj : aVar2.charlie.values().toArray(new og.a[0])) {
                og.a aVar3 = (og.a) obj;
                aVar3.getClass();
                n nVar = new n(9, aVar3);
                synchronized (aVar3) {
                    nVar.invoke();
                }
            }
            aVar2.charlie.clear();
            aVar2.bravo.clear();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.delta.red;
            for (hg.b bVar2 : (hg.b[]) concurrentHashMap.values().toArray(new hg.b[0])) {
                bVar2.bravo();
            }
            concurrentHashMap.clear();
            ((ConcurrentHashMap) aVar.echo.purple).clear();
            Collection values = aVar.foxtrot.alpha.values();
            Intrinsics.delta(values, "<get-values>(...)");
            Iterator it = values.iterator();
            if (it.hasNext()) {
                throw ad.yankee(it);
            }
        }
        koinApp = null;
    }

    @Nullable
    public final eg.a getKoin$rememberme_release() {
        eg.b bVar = koinApp;
        if (bVar != null) {
            return bVar.alpha;
        }
        return null;
    }

    public final void initialize(@NotNull RememberMeConfig config) {
        Intrinsics.echo(config, "config");
        cleanup();
        jg.a createConfigModule = KoinModulesKt.createConfigModule(config);
        eg.b bVar = new eg.b();
        initialize$lambda$0(createConfigModule, bVar);
        eg.a aVar = bVar.alpha;
        C1467s c1467s = aVar.alpha;
        c1467s.charlie("Create eager instances ...");
        long alpha = j.alpha();
        C1298c c1298c = aVar.delta;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1298c.silver;
        hg.d[] dVarArr = (hg.d[]) concurrentHashMap.values().toArray(new hg.d[0]);
        ArrayList azure = CollectionsKt.azure(Arrays.copyOf(dVarArr, dVarArr.length));
        concurrentHashMap.clear();
        eg.a aVar2 = (eg.a) c1298c.purple;
        ao aoVar = new ao(aVar2.alpha, aVar2.charlie.delta, u.alpha.bravo(hg.c.class), null, null);
        Iterator it = azure.iterator();
        while (it.hasNext()) {
            ((hg.d) it.next()).charlie(aoVar);
        }
        long alpha2 = k.alpha(alpha);
        StringBuilder sb2 = new StringBuilder("Created eager instances in ");
        int i4 = kotlin.time.b.silver;
        sb2.append(kotlin.time.b.golf(alpha2, d.red) / 1000.0d);
        sb2.append(" ms");
        c1467s.charlie(sb2.toString());
        koinApp = bVar;
    }

    public final boolean isInitialized() {
        if (koinApp != null) {
            return true;
        }
        return false;
    }
}
