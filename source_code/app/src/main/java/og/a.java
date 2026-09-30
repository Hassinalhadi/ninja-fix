package og;

import av.ao;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.measurement.internal.C1467s;
import com.google.android.material.internal.ab;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.d;
import kotlin.time.j;
import kotlin.time.k;
import lg.b;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoDefinitionFoundException;

/* loaded from: classes2.dex */
public final class a {
    public final b alpha;
    public final eg.a bravo;
    public final LinkedHashSet charlie;
    public ThreadLocal delta;
    public boolean echo;

    public a(b scopeQualifier, eg.a _koin) {
        Intrinsics.echo(scopeQualifier, "scopeQualifier");
        Intrinsics.echo(_koin, "_koin");
        this.alpha = scopeQualifier;
        this.bravo = _koin;
        new ArrayList();
        this.charlie = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r4 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(InterfaceC1772d clazz, b bVar) {
        String str;
        Intrinsics.echo(clazz, "clazz");
        eg.a aVar = this.bravo;
        C1467s c1467s = aVar.alpha;
        ig.a aVar2 = ig.a.alpha;
        c1467s.getClass();
        if (ig.a.teal.compareTo(aVar2) <= 0) {
            if (bVar != null) {
                str = " with qualifier '" + bVar + '\'';
            }
            str = "";
            String msg = "|- '" + pg.a.alpha(clazz) + '\'' + str + "...";
            aVar.alpha.getClass();
            Intrinsics.echo(msg, "msg");
            long alpha = j.alpha();
            Object charlie = charlie(bVar, clazz, null);
            long alpha2 = k.alpha(alpha);
            StringBuilder sb2 = new StringBuilder("|- '");
            sb2.append(pg.a.alpha(clazz));
            sb2.append("' in ");
            int i4 = kotlin.time.b.silver;
            sb2.append(kotlin.time.b.golf(alpha2, d.red) / 1000.0d);
            sb2.append(" ms");
            String msg2 = sb2.toString();
            Intrinsics.echo(msg2, "msg");
            return charlie;
        }
        return charlie(bVar, clazz, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        if (r1 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(ao aoVar) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        l lVar;
        ab abVar = this.bravo.bravo;
        abVar.getClass();
        abVar.getClass();
        Object obj3 = null;
        kg.a aVar = (kg.a) aoVar.teal;
        InterfaceC1772d clazz = (InterfaceC1772d) aoVar.red;
        String str3 = (String) aoVar.white;
        C1467s c1467s = (C1467s) aoVar.alpha;
        if (aVar != null && !aVar.alpha.isEmpty()) {
            c1467s.charlie("|- ? " + str3 + " look in injected parameters");
            obj = aVar.alpha(clazz);
        } else {
            obj = null;
        }
        if (obj == null) {
            C1298c c1298c = ((eg.a) abVar.purple).delta;
            b scopeQualifier = this.alpha;
            c1298c.getClass();
            Intrinsics.echo(clazz, "clazz");
            Intrinsics.echo(scopeQualifier, "scopeQualifier");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pg.a.alpha(clazz));
            sb2.append(':');
            b bVar = (b) aoVar.silver;
            if (bVar != null) {
                str2 = bVar.alpha;
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(':');
            sb2.append(scopeQualifier);
            hg.b bVar2 = (hg.b) ((ConcurrentHashMap) c1298c.red).get(sb2.toString());
            if (bVar2 != null) {
                obj2 = bVar2.charlie(aoVar);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                ThreadLocal threadLocal = this.delta;
                if (threadLocal != null) {
                    lVar = (l) threadLocal.get();
                } else {
                    lVar = null;
                }
                if (lVar != null && !lVar.isEmpty()) {
                    c1467s.charlie("|- ? " + str3 + " look in stack parameters");
                    kg.a aVar2 = (kg.a) lVar.india();
                    if (aVar2 != null) {
                        obj2 = aVar2.alpha(clazz);
                    }
                }
                obj2 = null;
            }
            obj3 = obj2;
        } else {
            obj3 = obj;
        }
        if (obj3 == null) {
            b bVar3 = (b) aoVar.silver;
            if (bVar3 != null) {
                str = " and qualifier '" + bVar3 + '\'';
            }
            str = "";
            throw new NoDefinitionFoundException("No definition found for type '" + pg.a.alpha((InterfaceC1772d) aoVar.red) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!");
        }
        return obj3;
    }

    public final Object charlie(b bVar, InterfaceC1772d interfaceC1772d, kg.a aVar) {
        l lVar;
        if (!this.echo) {
            eg.a aVar2 = this.bravo;
            ao aoVar = new ao(aVar2.alpha, this, interfaceC1772d, bVar, aVar);
            if (aVar == null) {
                return bravo(aoVar);
            }
            C1467s c1467s = aVar2.alpha;
            ig.a aVar3 = ig.a.alpha;
            c1467s.getClass();
            if (ig.a.teal.compareTo(aVar3) <= 0) {
                String msg = "| >> parameters " + aVar;
                Intrinsics.echo(msg, "msg");
            }
            ThreadLocal threadLocal = this.delta;
            if (threadLocal == null || (lVar = (l) threadLocal.get()) == null) {
                lVar = new l();
                ThreadLocal threadLocal2 = new ThreadLocal();
                this.delta = threadLocal2;
                threadLocal2.set(lVar);
            }
            lVar.addFirst(aVar);
            try {
                return bravo(aoVar);
            } finally {
                c1467s.charlie("| << parameters");
                if (!lVar.isEmpty()) {
                    lVar.removeFirst();
                }
                if (lVar.isEmpty()) {
                    ThreadLocal threadLocal3 = this.delta;
                    if (threadLocal3 != null) {
                        threadLocal3.remove();
                    }
                    this.delta = null;
                }
            }
        }
        throw new ClosedScopeException("Scope '_root_' is closed");
    }

    public final String toString() {
        return "['_root_']";
    }
}
