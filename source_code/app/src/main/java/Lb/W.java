package Lb;

import a0.C0347ag;
import gf.C1791f;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import n.e0;
import okhttp3.Call;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import q0.AbstractC2375K;
import se.AbstractC2852b;
import se.C2851a;
import se.C2873w;
import xe.EnumC3339b;
import ze.C3510a;

/* loaded from: classes2.dex */
public final class W implements Function1 {
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ W() {
        this.alpha = 4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                ((ArrayList) this.purple).get(((Number) obj).intValue());
                return null;
            case 1:
                ((vf.aq) this.purple).dispose();
                return Unit.INSTANCE;
            case 2:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((vf.J) this.purple).whiskey(new CancellationException(th.getMessage()));
                }
                return Unit.INSTANCE;
            case 3:
                ((Call) this.purple).cancel();
                return Unit.INSTANCE;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                m0.x xVar = (m0.x) this.purple;
                if (xVar != null) {
                    xVar.red = booleanValue;
                }
                return Unit.INSTANCE;
            case 5:
                Ne.f fVar = (Ne.f) obj;
                se.z kilo = ((AbstractC2120h) this.purple).kilo();
                Ne.c cVar = me.n.juliet;
                Xe.j jVar = ((C2873w) kilo.amber(cVar)).yellow;
                if (jVar != null) {
                    InterfaceC2332h golf = jVar.golf(fVar, EnumC3339b.alpha);
                    if (golf != null) {
                        if (golf instanceof InterfaceC2330f) {
                            return (InterfaceC2330f) golf;
                        }
                        throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + golf);
                    }
                    throw new AssertionError("Built-in class " + cVar.charlie(fVar) + " is not found");
                }
                AbstractC2120h.alpha(11);
                throw null;
            case 6:
                q0.z zVar = (q0.z) obj;
                e0 delta = ((n.ax) this.purple).delta();
                if (delta != null) {
                    delta.charlie = zVar;
                }
                return Unit.INSTANCE;
            case 7:
                float[] fArr = ((C0347ag) obj).alpha;
                q0.z zVar2 = (q0.z) this.purple;
                if (zVar2.india()) {
                    AbstractC2375K.hotel(zVar2).blue(zVar2, fArr);
                }
                return Unit.INSTANCE;
            case 8:
                C2851a c2851a = (C2851a) this.purple;
                ((C1791f) obj).getClass();
                AbstractC2852b descriptor = c2851a.purple;
                Intrinsics.echo(descriptor, "descriptor");
                return (kotlin.reflect.jvm.internal.impl.types.ae) descriptor.purple.invoke();
            default:
                InterfaceC2328d interfaceC2328d = (InterfaceC2328d) obj;
                if (interfaceC2328d != null) {
                    ((C3510a) this.purple).bravo.bravo(interfaceC2328d);
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
        }
    }

    public /* synthetic */ W(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }
}
