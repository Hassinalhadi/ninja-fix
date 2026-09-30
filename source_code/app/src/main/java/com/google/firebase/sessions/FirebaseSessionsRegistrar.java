package com.google.firebase.sessions;

import B5.f;
import B7.g;
import H7.a;
import H7.b;
import I7.c;
import I7.j;
import I7.p;
import J8.al;
import J8.at;
import J8.av;
import J8.i;
import J8.m;
import J8.s;
import J8.t;
import J8.w;
import J8.x;
import J8.y;
import Nd.h;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i8.InterfaceC1904b;
import j8.InterfaceC1947d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.H0;
import vf.AbstractC3220y;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LI7/b;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "J8/x", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    @NotNull
    public static final String TAG = "FirebaseSessions";

    @NotNull
    private static final x Companion = new Object();

    @NotNull
    private static final p appContext = p.alpha(Context.class);

    @NotNull
    private static final p firebaseApp = p.alpha(g.class);

    @NotNull
    private static final p firebaseInstallationsApi = p.alpha(InterfaceC1947d.class);

    @NotNull
    private static final p backgroundDispatcher = new p(a.class, AbstractC3220y.class);

    @NotNull
    private static final p blockingDispatcher = new p(b.class, AbstractC3220y.class);

    @NotNull
    private static final p transportFactory = p.alpha(f.class);

    @NotNull
    private static final p firebaseSessionsComponent = p.alpha(s.class);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J8.x] */
    static {
        try {
            int i4 = w.alpha;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    public static final J8.p getComponents$lambda$0(c cVar) {
        return (J8.p) ((i) ((s) cVar.oscar(firebaseSessionsComponent))).india.get();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [J8.s, java.lang.Object, J8.i] */
    public static final s getComponents$lambda$1(c cVar) {
        Object oscar = cVar.oscar(appContext);
        Intrinsics.delta(oscar, "container[appContext]");
        Object oscar2 = cVar.oscar(backgroundDispatcher);
        Intrinsics.delta(oscar2, "container[backgroundDispatcher]");
        Object oscar3 = cVar.oscar(blockingDispatcher);
        Intrinsics.delta(oscar3, "container[blockingDispatcher]");
        Object oscar4 = cVar.oscar(firebaseApp);
        Intrinsics.delta(oscar4, "container[firebaseApp]");
        Object oscar5 = cVar.oscar(firebaseInstallationsApi);
        Intrinsics.delta(oscar5, "container[firebaseInstallationsApi]");
        InterfaceC1904b mike = cVar.mike(transportFactory);
        Intrinsics.delta(mike, "container.getProvider(transportFactory)");
        ?? obj = new Object();
        obj.alpha = M8.c.alpha((g) oscar4);
        M8.c alpha = M8.c.alpha((Context) oscar);
        obj.bravo = alpha;
        obj.charlie = M8.a.alpha(new m(alpha, 5));
        obj.delta = M8.c.alpha((h) oscar2);
        obj.echo = M8.c.alpha((InterfaceC1947d) oscar5);
        Kd.a alpha2 = M8.a.alpha(new m(obj.alpha, 1));
        obj.foxtrot = alpha2;
        obj.golf = M8.a.alpha(new al(alpha2, obj.delta));
        obj.hotel = M8.a.alpha(new av(obj.charlie, M8.a.alpha(new at(obj.delta, obj.echo, obj.foxtrot, obj.golf, M8.a.alpha(new m(M8.a.alpha(new m(obj.bravo, 2)), 6)), 1)), 1));
        obj.india = M8.a.alpha(new y(obj.alpha, obj.hotel, obj.delta, M8.a.alpha(new m(obj.bravo, 4))));
        obj.juliet = M8.a.alpha(new al(obj.delta, M8.a.alpha(new m(obj.bravo, 3))));
        obj.kilo = M8.a.alpha(new at(obj.alpha, obj.echo, obj.hotel, M8.a.alpha(new m(M8.c.alpha(mike), 0)), obj.delta, 0));
        obj.lima = M8.a.alpha(t.alpha);
        obj.mike = M8.a.alpha(new av(obj.lima, M8.a.alpha(t.bravo), 0));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<I7.b> getComponents() {
        I7.a bravo = I7.b.bravo(J8.p.class);
        bravo.alpha = LIBRARY_NAME;
        bravo.alpha(j.bravo(firebaseSessionsComponent));
        bravo.foxtrot = new A8.a(21);
        bravo.charlie(2);
        I7.b bravo2 = bravo.bravo();
        I7.a bravo3 = I7.b.bravo(s.class);
        bravo3.alpha = "fire-sessions-component";
        bravo3.alpha(j.bravo(appContext));
        bravo3.alpha(j.bravo(backgroundDispatcher));
        bravo3.alpha(j.bravo(blockingDispatcher));
        bravo3.alpha(j.bravo(firebaseApp));
        bravo3.alpha(j.bravo(firebaseInstallationsApi));
        bravo3.alpha(new j(transportFactory, 1, 1));
        bravo3.foxtrot = new A8.a(22);
        return CollectionsKt.listOf(bravo2, bravo3.bravo(), H0.alpha(LIBRARY_NAME, "2.1.2"));
    }
}
