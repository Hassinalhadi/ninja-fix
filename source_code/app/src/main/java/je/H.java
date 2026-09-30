package je;

import androidx.appcompat.widget.P0;
import ge.InterfaceC1785q;
import ke.InterfaceC2037e;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public abstract class H extends F implements InterfaceC1785q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ge.v[] f12888a;
    public final T white = V.kilo(null, new G(this, 1));
    public final Object yellow = LazyKt.alpha(kotlin.i.alpha, new G(this, 0));

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        f12888a = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(H.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof H) && Intrinsics.areEqual(xray(), ((H) obj).xray())) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1771c
    public final String getName() {
        return P0.fuchsia(new StringBuilder("<get-"), xray().yellow, '>');
    }

    public final int hashCode() {
        return xray().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // je.r
    public final InterfaceC2037e quebec() {
        return (InterfaceC2037e) this.yellow.getValue();
    }

    @Override // je.r
    public final InterfaceC2328d tango() {
        ge.v vVar = f12888a[0];
        Object invoke = this.white.invoke();
        Intrinsics.delta(invoke, "<get-descriptor>(...)");
        return (se.ai) invoke;
    }

    public final String toString() {
        return "getter of " + xray();
    }

    @Override // je.F
    public final pe.ak whiskey() {
        ge.v vVar = f12888a[0];
        Object invoke = this.white.invoke();
        Intrinsics.delta(invoke, "<get-descriptor>(...)");
        return (se.ai) invoke;
    }
}
