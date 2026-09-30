package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ac extends y {
    public final ff.l purple;
    public final Lambda red;
    public final ff.i silver;

    /* JADX WARN: Multi-variable type inference failed */
    public ac(ff.l storageManager, Function0 function0) {
        Intrinsics.echo(storageManager, "storageManager");
        this.purple = storageManager;
        this.red = (Lambda) function0;
        this.silver = storageManager.bravo(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return pink().cyan();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final al gold() {
        return pink().gold();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final ap green() {
        return pink().green();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return pink().indigo();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final y ivory(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new ac(this.purple, new Xa.f(18, kotlinTypeRefiner, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final B ochre() {
        y pink = pink();
        while (pink instanceof ac) {
            pink = ((ac) pink).pink();
        }
        Intrinsics.charlie(pink, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (B) pink;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final Xe.n olive() {
        return pink().olive();
    }

    public final y pink() {
        return (y) this.silver.invoke();
    }

    public final String toString() {
        ff.i iVar = this.silver;
        if (iVar.red != ff.k.alpha && iVar.red != ff.k.purple) {
            return pink().toString();
        }
        return "<Not computed yet>";
    }
}
