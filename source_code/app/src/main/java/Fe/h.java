package Fe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;

/* loaded from: classes2.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.types.p implements kotlin.reflect.jvm.internal.impl.types.m {
    public final ae purple;

    public h(ae delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.purple = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        if (z2) {
            return this.purple.pink(true);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new h(this.purple.white(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final ae m() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final B sierra(y replacement) {
        Intrinsics.echo(replacement, "replacement");
        B ochre = replacement.ochre();
        if (!az.golf(ochre) && !az.foxtrot(ochre)) {
            return ochre;
        }
        if (ochre instanceof ae) {
            ae aeVar = (ae) ochre;
            ae pink = aeVar.pink(false);
            if (!az.golf(aeVar)) {
                return pink;
            }
            return new h(pink);
        }
        if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            kotlin.reflect.jvm.internal.impl.types.s sVar = (kotlin.reflect.jvm.internal.impl.types.s) ochre;
            ae aeVar2 = sVar.purple;
            ae pink2 = aeVar2.pink(false);
            if (az.golf(aeVar2)) {
                pink2 = new h(pink2);
            }
            ae aeVar3 = sVar.red;
            ae pink3 = aeVar3.pink(false);
            if (az.golf(aeVar3)) {
                pink3 = new h(pink3);
            }
            return kotlin.reflect.jvm.internal.impl.types.c.amber(ab.alpha(pink2, pink3), kotlin.reflect.jvm.internal.impl.types.c.echo(ochre));
        }
        throw new IllegalStateException(("Incorrect type: " + ochre).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final kotlin.reflect.jvm.internal.impl.types.p u(ae aeVar) {
        return new h(aeVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final boolean victor() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae, kotlin.reflect.jvm.internal.impl.types.B
    public final B white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new h(this.purple.white(newAttributes));
    }
}
