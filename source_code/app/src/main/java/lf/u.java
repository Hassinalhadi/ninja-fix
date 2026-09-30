package lf;

import gf.InterfaceC1789d;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2345u;
import se.C2871u;

/* loaded from: classes2.dex */
public final class u extends Lambda implements Function1 {
    public static final u alpha = new Lambda(1);

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r7 == false) goto L33;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        boolean z10;
        Ne.b foxtrot;
        ef.s sVar;
        kotlin.reflect.jvm.internal.impl.types.y returnType;
        InterfaceC2345u $receiver = (InterfaceC2345u) obj;
        Intrinsics.echo($receiver, "$this$$receiver");
        C2871u a6 = $receiver.a();
        if (a6 == null) {
            a6 = $receiver.g();
        }
        List list = v.bravo;
        boolean z11 = false;
        if (a6 != null) {
            kotlin.reflect.jvm.internal.impl.types.y returnType2 = $receiver.getReturnType();
            if (returnType2 != null) {
                z2 = InterfaceC1789d.alpha.bravo(returnType2, a6.getType());
            } else {
                z2 = false;
            }
            if (!z2) {
                Ye.d Z4 = a6.Z();
                Intrinsics.delta(Z4, "receiver.value");
                if (Z4 instanceof Ye.c) {
                    InterfaceC2330f interfaceC2330f = ((Ye.c) Z4).alpha;
                    if (interfaceC2330f.emerald() && (foxtrot = Ue.e.foxtrot(interfaceC2330f)) != null) {
                        InterfaceC2332h echo = AbstractC2347w.echo(Ue.e.juliet(interfaceC2330f), foxtrot);
                        if (echo instanceof ef.s) {
                            sVar = (ef.s) echo;
                        } else {
                            sVar = null;
                        }
                        if (sVar != null && (returnType = $receiver.getReturnType()) != null) {
                            z10 = InterfaceC1789d.alpha.bravo(returnType, sVar.a0());
                        }
                    }
                }
                z10 = false;
            }
            z11 = true;
        }
        if (z11) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
