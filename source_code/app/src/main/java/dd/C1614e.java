package dd;

import androidx.recyclerview.widget.RecyclerView;
import ge.InterfaceC1772d;
import ge.w;
import hd.n;
import io.ktor.client.call.DoubleReceiveException;
import io.ktor.client.call.NoTransformationFoundException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import od.InterfaceC2225b;
import org.jetbrains.annotations.NotNull;
import pd.AbstractC2304b;
import pd.C2303a;
import pd.C2305c;
import t6.AbstractC3062u;
import vf.ab;
import vf.ad;
import zd.C3509a;
import zd.i;

/* renamed from: dd.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1614e implements ab {
    public static final /* synthetic */ AtomicIntegerFieldUpdater silver;
    public static final C3509a teal;
    public final cd.c alpha;
    public InterfaceC2225b purple;

    @NotNull
    private volatile /* synthetic */ int received;
    public AbstractC2304b red;

    static {
        w wVar;
        InterfaceC1772d bravo = u.alpha.bravo(Object.class);
        try {
            wVar = u.alpha(Object.class);
        } catch (Throwable unused) {
            wVar = null;
        }
        teal = new C3509a("CustomResponse", new Ed.a(bravo, wVar));
        silver = AtomicIntegerFieldUpdater.newUpdater(C1614e.class, "received");
    }

    public C1614e(cd.c client) {
        Intrinsics.echo(client, "client");
        this.alpha = client;
        this.received = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r8 != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Ed.a aVar, Pd.c cVar) {
        C1613d c1613d;
        int i4;
        try {
            if (cVar instanceof C1613d) {
                c1613d = (C1613d) cVar;
                int i5 = c1613d.silver;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c1613d.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = c1613d.purple;
                    Od.a aVar2 = Od.a.alpha;
                    i4 = c1613d.silver;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                aVar = c1613d.alpha;
                                ResultKt.alpha(obj);
                                Object obj2 = ((C2305c) obj).bravo;
                                if (Intrinsics.areEqual(obj2, vd.b.alpha)) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    InterfaceC1772d type = aVar.alpha;
                                    Intrinsics.echo(type, "type");
                                    if (!AbstractC3062u.bravo(type).isInstance(obj2)) {
                                        throw new NoTransformationFoundException(echo(), u.alpha.bravo(obj2.getClass()), aVar.alpha);
                                    }
                                }
                                return obj2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = c1613d.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        AbstractC2304b echo = echo();
                        InterfaceC1772d type2 = aVar.alpha;
                        Intrinsics.echo(type2, "type");
                        if (AbstractC3062u.bravo(type2).isInstance(echo)) {
                            return echo();
                        }
                        if (!bravo() && !n.bravo(echo()) && !silver.compareAndSet(this, 0, 1)) {
                            throw new DoubleReceiveException(this);
                        }
                        obj = beige().echo(teal);
                        if (obj == null) {
                            c1613d.alpha = aVar;
                            c1613d.silver = 1;
                            obj = foxtrot();
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    C2305c c2305c = new C2305c(aVar, obj);
                    C2303a c2303a = this.alpha.teal;
                    c1613d.alpha = aVar;
                    c1613d.silver = 2;
                    obj = c2303a.alpha(this, c2305c, c1613d);
                }
            }
            if (i4 == 0) {
            }
            C2305c c2305c2 = new C2305c(aVar, obj);
            C2303a c2303a2 = this.alpha.teal;
            c1613d.alpha = aVar;
            c1613d.silver = 2;
            obj = c2303a2.alpha(this, c2305c2, c1613d);
        } catch (Throwable th) {
            ad.kilo(echo(), ad.alpha("Receive failed", th));
            throw th;
        }
        c1613d = new C1613d(this, cVar);
        Object obj3 = c1613d.purple;
        Od.a aVar22 = Od.a.alpha;
        i4 = c1613d.silver;
    }

    public final i beige() {
        return delta().beige();
    }

    public boolean bravo() {
        return false;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return echo().charlie();
    }

    public final InterfaceC2225b delta() {
        InterfaceC2225b interfaceC2225b = this.purple;
        if (interfaceC2225b != null) {
            return interfaceC2225b;
        }
        Intrinsics.lima("request");
        throw null;
    }

    public final AbstractC2304b echo() {
        AbstractC2304b abstractC2304b = this.red;
        if (abstractC2304b != null) {
            return abstractC2304b;
        }
        Intrinsics.lima("response");
        throw null;
    }

    public Object foxtrot() {
        return echo().delta();
    }

    public final String toString() {
        return "HttpClientCall[" + delta().getUrl() + ", " + echo().golf() + ']';
    }
}
