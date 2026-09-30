package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ag extends q {
    public final al red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ae aeVar, al attributes) {
        super(aeVar);
        Intrinsics.echo(attributes, "attributes");
        this.red = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.y
    public final al gold() {
        return this.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final p u(ae aeVar) {
        return new ag(aeVar, this.red);
    }
}
