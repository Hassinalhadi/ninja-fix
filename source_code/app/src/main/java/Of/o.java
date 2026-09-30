package Of;

import Nf.P;
import Nf.az;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o {
    public static final Nf.af alpha = az.alpha("kotlinx.serialization.json.JsonUnquotedLiteral", P.alpha);

    public static final ae alpha(n nVar) {
        ae aeVar;
        if (nVar instanceof ae) {
            aeVar = (ae) nVar;
        } else {
            aeVar = null;
        }
        if (aeVar != null) {
            return aeVar;
        }
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.u.alpha.bravo(nVar.getClass()) + " is not a JsonPrimitive");
    }

    public static final long bravo(ae aeVar) {
        String str;
        Intrinsics.echo(aeVar, "<this>");
        Pf.ae aeVar2 = new Pf.ae(aeVar.alpha());
        long india = aeVar2.india();
        if (aeVar2.foxtrot() != 10) {
            int i4 = aeVar2.alpha;
            int i5 = i4 - 1;
            String str2 = aeVar2.echo;
            if (i4 != str2.length() && i5 >= 0) {
                str = String.valueOf(str2.charAt(i5));
            } else {
                str = "EOF";
            }
            Pf.a.romeo(aeVar2, ao.ad.gray("Expected input to contain a single valid number, but got '", str, "' after it"), i5, null, 4);
            throw null;
        }
        return india;
    }
}
