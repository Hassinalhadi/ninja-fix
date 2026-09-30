package s6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class J6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Nd.c alpha(Nd.c cVar, Nd.c cVar2, Xd.l lVar) {
        Intrinsics.echo(lVar, "<this>");
        if (lVar instanceof Pd.a) {
            return ((Pd.a) lVar).create(cVar, cVar2);
        }
        Nd.h context = cVar2.getContext();
        if (context == Nd.i.alpha) {
            return new Od.c(cVar2, cVar, lVar);
        }
        return new Od.d(cVar2, context, lVar, cVar);
    }

    public static void bravo() {
        Od.a aVar = Od.a.alpha;
    }

    public static final float charlie(double d4, double d9, double d10, double d11) {
        double radians = Math.toRadians(d10 - d4);
        double radians2 = Math.toRadians(d11 - d9);
        double d12 = 2;
        double d13 = radians / d12;
        double d14 = radians2 / d12;
        double sin = (Math.sin(d14) * Math.sin(d14) * Math.cos(Math.toRadians(d10)) * Math.cos(Math.toRadians(d4))) + (Math.sin(d13) * Math.sin(d13));
        return (float) (Math.atan2(Math.sqrt(sin), Math.sqrt(1 - sin)) * d12 * 6371000.0d);
    }

    public static Nd.c delta(Nd.c cVar) {
        Pd.c cVar2;
        Nd.c<Object> intercepted;
        Intrinsics.echo(cVar, "<this>");
        if (cVar instanceof Pd.c) {
            cVar2 = (Pd.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static Object echo(Xd.l lVar, Object obj, Nd.c cVar) {
        Object cVar2;
        Intrinsics.echo(lVar, "<this>");
        Nd.h context = cVar.getContext();
        if (context == Nd.i.alpha) {
            cVar2 = new Pd.g(cVar);
        } else {
            cVar2 = new Pd.c(cVar, context);
        }
        kotlin.jvm.internal.x.echo(2, lVar);
        return lVar.invoke(obj, cVar2);
    }
}
