package Pe;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2321ad;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.aq;
import s6.U6;

/* loaded from: classes2.dex */
public final class b implements c {
    public static final b bravo = new b(0);
    public static final b charlie = new b(1);
    public static final b delta = new b(2);
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    public static String bravo(InterfaceC2332h interfaceC2332h) {
        String str;
        Ne.f name = interfaceC2332h.getName();
        Intrinsics.delta(name, "descriptor.name");
        String bravo2 = U6.bravo(name);
        if (!(interfaceC2332h instanceof aq)) {
            InterfaceC2335k lima = interfaceC2332h.lima();
            Intrinsics.delta(lima, "descriptor.containingDeclaration");
            if (lima instanceof InterfaceC2330f) {
                str = bravo((InterfaceC2332h) lima);
            } else if (lima instanceof InterfaceC2321ad) {
                Ne.e india = ((se.ab) ((InterfaceC2321ad) lima)).teal.india();
                Intrinsics.delta(india, "descriptor.fqName.toUnsafe()");
                str = U6.charlie(india.echo());
            } else {
                str = null;
            }
            if (str != null && !Intrinsics.areEqual(str, "")) {
                return str + '.' + bravo2;
            }
        }
        return bravo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [pe.k, pe.h] */
    /* JADX WARN: Type inference failed for: r2v8, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r2v9, types: [pe.k] */
    @Override // Pe.c
    public final String alpha(InterfaceC2332h interfaceC2332h, t tVar) {
        switch (this.alpha) {
            case 0:
                if (interfaceC2332h instanceof aq) {
                    Ne.f name = ((aq) interfaceC2332h).getName();
                    Intrinsics.delta(name, "classifier.name");
                    return tVar.indigo(name, false);
                }
                Ne.e golf = Qe.e.golf(interfaceC2332h);
                Intrinsics.delta(golf, "getFqName(classifier)");
                return tVar.oscar(U6.charlie(golf.echo()));
            case 1:
                if (interfaceC2332h instanceof aq) {
                    Ne.f name2 = ((aq) interfaceC2332h).getName();
                    Intrinsics.delta(name2, "classifier.name");
                    return tVar.indigo(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC2332h.getName());
                    interfaceC2332h = interfaceC2332h.lima();
                } while (interfaceC2332h instanceof InterfaceC2330f);
                return U6.charlie(new kotlin.collections.z(arrayList));
            default:
                return bravo(interfaceC2332h);
        }
    }
}
