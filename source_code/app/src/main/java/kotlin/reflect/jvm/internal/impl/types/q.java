package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q extends p {
    public final ae purple;

    public q(ae aeVar) {
        this.purple = aeVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        if (z2 == indigo()) {
            return this;
        }
        return this.purple.pink(z2).white(gold());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        if (newAttributes != gold()) {
            return new ag(this, newAttributes);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final ae m() {
        return this.purple;
    }
}
