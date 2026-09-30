package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class an extends c {
    public static final an bravo = new an(0);
    public static final an charlie = new an(1);
    public static final an delta = new an(2);
    public final /* synthetic */ int alpha;

    public /* synthetic */ an(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c
    public final p000if.d xray(ao state, p000if.c type) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(state, "state");
                Intrinsics.echo(type, "type");
                return state.charlie.lime(type);
            case 1:
                Intrinsics.echo(state, "state");
                Intrinsics.echo(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                Intrinsics.echo(state, "state");
                Intrinsics.echo(type, "type");
                return state.charlie.blue(type);
        }
    }
}
