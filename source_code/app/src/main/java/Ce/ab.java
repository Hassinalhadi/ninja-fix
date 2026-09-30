package Ce;

import B2.ap;
import B9.K;
import F.C0094c1;
import F.C0103e2;
import F.EnumC0107f2;
import F.Q2;
import F.R2;
import F.W0;
import F.X0;
import android.net.ConnectivityManager;
import androidx.compose.runtime.n0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import je.C1983w;
import je.C1986z;
import je.Q;
import je.a0;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import t0.AbstractC2902a;
import t0.w0;
import t0.x0;
import t6.AbstractC2977c3;

/* loaded from: classes2.dex */
public final class ab extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Object obj, Object obj2, Object obj3, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float f5;
        R2 state;
        switch (this.alpha) {
            case 0:
                ad adVar = (ad) this.purple;
                ff.l lVar = ((Be.a) adVar.bravo.purple).alpha;
                z zVar = new z(adVar, (ve.w) this.red, (Ae.g) this.silver);
                lVar.getClass();
                return new ff.h(lVar, zVar);
            case 1:
                R2 r22 = null;
                Q2 q22 = (Q2) this.purple;
                if (q22 != null && (state = q22.getState()) != null) {
                    f5 = Float.valueOf(state.charlie());
                } else {
                    f5 = null;
                }
                kotlin.jvm.internal.r rVar = (kotlin.jvm.internal.r) this.red;
                float f10 = rVar.alpha;
                kotlin.jvm.internal.r rVar2 = (kotlin.jvm.internal.r) this.silver;
                if (!Intrinsics.alpha(f5, f10 - rVar2.alpha)) {
                    if (q22 != null) {
                        r22 = q22.getState();
                    }
                    if (r22 != null) {
                        ((n0) r22.alpha).kilo(rVar.alpha - rVar2.alpha);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C0103e2 c0103e2 = (C0103e2) this.purple;
                if (((Boolean) ((Function1) c0103e2.bravo.delta).invoke(EnumC0107f2.alpha)).booleanValue()) {
                    vf.ad.zulu((vf.ab) this.red, null, null, new W0(c0103e2, null), 3).crimson(new X0(c0103e2, (Function0) this.silver, 0));
                }
                return Unit.INSTANCE;
            case 3:
                if (((Boolean) ((Function1) ((C0103e2) this.purple).bravo.delta).invoke(EnumC0107f2.purple)).booleanValue()) {
                    vf.ad.zulu((vf.ab) this.red, null, null, new C0094c1((C0103e2) this.silver, null), 3);
                }
                return Boolean.TRUE;
            case 4:
                if (((kotlin.jvm.internal.q) this.purple).alpha) {
                    A2.z.echo().alpha(F2.p.alpha, "NetworkRequestConstraintController unregister callback");
                    ((ConnectivityManager) this.red).unregisterNetworkCallback((F2.d) this.silver);
                }
                return Unit.INSTANCE;
            case 5:
                Object obj = F2.k.bravo;
                ap apVar = (ap) this.purple;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.red;
                F2.k kVar = (F2.k) this.silver;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = F2.k.charlie;
                    linkedHashMap.remove(apVar);
                    if (linkedHashMap.isEmpty()) {
                        A2.z.echo().alpha(F2.p.alpha, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(kVar);
                    }
                }
                return Unit.INSTANCE;
            case 6:
                return ((Oe.c) this.purple).charlie((ByteArrayInputStream) this.red, (Oe.h) ((K) ((ef.o) this.silver).bravo.alpha).papa);
            case 7:
                InterfaceC2332h kilo = ((kotlin.reflect.jvm.internal.impl.types.y) this.purple).green().kilo();
                if (kilo instanceof InterfaceC2330f) {
                    Class juliet = a0.juliet((InterfaceC2330f) kilo);
                    C1983w c1983w = (C1983w) this.red;
                    if (juliet != null) {
                        C1986z c1986z = (C1986z) this.silver;
                        boolean areEqual = Intrinsics.areEqual(c1986z.purple.getSuperclass(), juliet);
                        Class cls = c1986z.purple;
                        if (areEqual) {
                            Type genericSuperclass = cls.getGenericSuperclass();
                            Intrinsics.delta(genericSuperclass, "{\n                      …ass\n                    }");
                            return genericSuperclass;
                        }
                        Class<?>[] interfaces = cls.getInterfaces();
                        Intrinsics.delta(interfaces, "jClass.interfaces");
                        int jade = ArraysKt.jade(interfaces, juliet);
                        if (jade >= 0) {
                            Type type = cls.getGenericInterfaces()[jade];
                            Intrinsics.delta(type, "{\n                      …ex]\n                    }");
                            return type;
                        }
                        throw new Q("No superclass of " + c1983w + " in Java reflection for " + kilo);
                    }
                    throw new Q("Unsupported superclass of " + c1983w + ": " + kilo);
                }
                throw new Q("Supertype not a class: " + kilo);
            default:
                AbstractC2902a abstractC2902a = (AbstractC2902a) this.purple;
                abstractC2902a.removeOnAttachStateChangeListener((w0) this.red);
                x0 listener = (x0) this.silver;
                Intrinsics.echo(listener, "listener");
                AbstractC2977c3.charlie(abstractC2902a).alpha.remove(listener);
                return Unit.INSTANCE;
        }
    }
}
