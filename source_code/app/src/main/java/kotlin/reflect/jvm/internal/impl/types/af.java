package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class af extends ae {
    public final ap purple;
    public final List red;
    public final boolean silver;
    public final Xe.n teal;
    public final Function1 white;

    public af(ap constructor, List arguments, boolean z2, Xe.n memberScope, Function1 function1) {
        Intrinsics.echo(constructor, "constructor");
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(memberScope, "memberScope");
        this.purple = constructor;
        this.red = arguments;
        this.silver = z2;
        this.teal = memberScope;
        this.white = function1;
        if (!(memberScope instanceof hf.e) || (memberScope instanceof hf.j)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return this.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        if (z2 == this.silver) {
            return this;
        }
        if (z2) {
            return new ad(this, 1);
        }
        return new ad(this, 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        if (newAttributes.isEmpty()) {
            return this;
        }
        return new ag(this, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final al gold() {
        al.purple.getClass();
        return al.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final ap green() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return this.silver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final y ivory(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae aeVar = (ae) this.white.invoke(kotlinTypeRefiner);
        if (aeVar == null) {
            return this;
        }
        return aeVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final Xe.n olive() {
        return this.teal;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae aeVar = (ae) this.white.invoke(kotlinTypeRefiner);
        if (aeVar == null) {
            return this;
        }
        return aeVar;
    }
}
