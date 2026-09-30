package s6;

import Nf.AbstractC0244b;
import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public abstract class S5 {
    public static final /* synthetic */ int alpha = 0;

    public static final KSerializer alpha(AbstractC0244b abstractC0244b, Mf.a aVar, String str) {
        Intrinsics.echo(abstractC0244b, "<this>");
        KSerializer alpha2 = abstractC0244b.alpha(aVar, str);
        if (alpha2 != null) {
            return alpha2;
        }
        Nf.az.kilo(abstractC0244b.charlie(), str);
        throw null;
    }

    public static final KSerializer bravo(AbstractC0244b abstractC0244b, AbstractC2796v6 abstractC2796v6, Object value) {
        Intrinsics.echo(abstractC0244b, "<this>");
        Intrinsics.echo(value, "value");
        KSerializer bravo = abstractC0244b.bravo(abstractC2796v6, value);
        if (bravo == null) {
            InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(value.getClass());
            InterfaceC1772d baseClass = abstractC0244b.charlie();
            Intrinsics.echo(baseClass, "baseClass");
            String kilo = bravo2.kilo();
            if (kilo == null) {
                kilo = String.valueOf(bravo2);
            }
            Nf.az.kilo(baseClass, kilo);
            throw null;
        }
        return bravo;
    }
}
