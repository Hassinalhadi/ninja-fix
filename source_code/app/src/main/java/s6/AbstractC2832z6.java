package s6;

import Lb.C0222e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.z6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2832z6 {
    public static final /* synthetic */ int alpha = 0;

    public static Nd.f alpha(Nd.f fVar, Nd.g key) {
        Intrinsics.echo(key, "key");
        if (Intrinsics.areEqual(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static Nd.h bravo(Nd.f fVar, Nd.g key) {
        Intrinsics.echo(key, "key");
        if (Intrinsics.areEqual(fVar.getKey(), key)) {
            return Nd.i.alpha;
        }
        return fVar;
    }

    public static Nd.h charlie(Nd.f fVar, Nd.h context) {
        Intrinsics.echo(context, "context");
        if (context == Nd.i.alpha) {
            return fVar;
        }
        return (Nd.h) context.fold(fVar, new C0222e(18));
    }
}
