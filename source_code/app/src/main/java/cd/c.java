package cd;

import F2.m;
import Nd.h;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.recyclerview.widget.RecyclerView;
import bz.h0;
import d.C1534h0;
import dd.C1614e;
import fd.f;
import h9.z;
import hd.AbstractC1848d;
import hd.ad;
import hd.ah;
import hd.ai;
import hd.am;
import hd.n;
import hd.v;
import hd.x;
import id.C1915c;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import od.C2229f;
import org.jetbrains.annotations.NotNull;
import pd.C2303a;
import qd.AbstractC2463a;
import rd.C2516a;
import vf.H;
import vf.I;
import vf.J;
import vf.ab;
import zd.C3509a;
import zd.i;

/* loaded from: classes2.dex */
public final class c implements ab, Closeable, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3489d = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    public final i f3490a;
    public final fd.d alpha;

    /* renamed from: b, reason: collision with root package name */
    public final C2516a f3491b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3492c;

    @NotNull
    private volatile /* synthetic */ int closed = 0;
    public final J purple;
    public final h red;
    public final C2229f silver;
    public final C2303a teal;
    public final C2229f white;
    public final C2303a yellow;

    public c(fd.d dVar, d dVar2) {
        int i4 = 11;
        this.alpha = dVar;
        J j5 = new J((I) dVar.charlie().get(H.alpha));
        this.purple = j5;
        this.red = dVar.charlie().plus(j5);
        this.silver = new C2229f(0);
        this.teal = new C2303a(1);
        C2229f c2229f = new C2229f(1);
        this.white = c2229f;
        this.yellow = new C2303a(0);
        this.f3490a = new i();
        this.f3491b = new C2516a();
        d dVar3 = new d();
        this.f3492c = dVar3;
        Nd.c cVar = null;
        c2229f.golf(C2229f.oscar, new fd.c(this, (f) dVar, null));
        c2229f.golf(C2229f.papa, new a(this, cVar, 0));
        dVar3.alpha(ai.bravo, new h0(i4));
        dVar3.alpha(AbstractC1848d.charlie, new h0(i4));
        dVar3.alpha(n.delta, new h0(i4));
        if (dVar2.echo) {
            dVar3.charlie.put("DefaultTransformers", new h0(10));
        }
        dVar3.alpha(am.bravo, new h0(i4));
        C1915c c1915c = v.bravo;
        dVar3.alpha(c1915c, new h0(i4));
        if (dVar2.delta) {
            dVar3.alpha(ah.delta, new h0(i4));
        }
        dVar3.delta = dVar2.delta;
        dVar3.echo = dVar2.echo;
        dVar3.foxtrot = dVar2.foxtrot;
        dVar3.alpha.putAll(dVar2.alpha);
        dVar3.bravo.putAll(dVar2.bravo);
        dVar3.charlie.putAll(dVar2.charlie);
        if (dVar2.echo) {
            dVar3.alpha(ad.bravo, new h0(i4));
        }
        C3509a c3509a = hd.f.alpha;
        dVar3.alpha(c1915c, new C1534h0(8, dVar3));
        Iterator it = dVar3.alpha.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = dVar3.charlie.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        this.teal.golf(C2303a.juliet, new m(this, cVar, 3));
    }

    @Override // vf.ab
    public final h charlie() {
        return this.red;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!f3489d.compareAndSet(this, 0, 1)) {
            return;
        }
        i iVar = (i) this.f3490a.charlie(x.alpha);
        for (C3509a c3509a : CollectionsKt.z(iVar.delta().keySet())) {
            Intrinsics.charlie(c3509a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            Object charlie = iVar.charlie(c3509a);
            if (charlie instanceof AutoCloseable) {
                AutoCloseable autoCloseable = (AutoCloseable) charlie;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    z.tango((ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else if (autoCloseable instanceof ContentProviderClient) {
                    ((ContentProviderClient) autoCloseable).release();
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        this.purple.yellow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object echo(C2226c c2226c, Pd.c cVar) {
        b bVar;
        int i4;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = bVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = bVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    this.f3491b.alpha(AbstractC2463a.alpha);
                    Object obj2 = c2226c.delta;
                    bVar.red = 1;
                    obj = this.silver.alpha(c2226c, obj2, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Intrinsics.charlie(obj, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
                return (C1614e) obj;
            }
        }
        bVar = new b(this, cVar);
        Object obj3 = bVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar.red;
        if (i4 == 0) {
        }
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (C1614e) obj3;
    }

    public final String toString() {
        return "HttpClient[" + this.alpha + ']';
    }
}
