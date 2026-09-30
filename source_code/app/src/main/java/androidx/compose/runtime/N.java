package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class N {
    public final ar alpha;

    public N(Function0 function0) {
        this.alpha = new ar(function0);
    }

    public abstract O alpha(Object obj);

    public G0 bravo() {
        return this.alpha;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0043, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G0 charlie(O o5, G0 g02) {
        ah ahVar;
        ah ahVar2 = null;
        if (g02 instanceof ah) {
            if (o5.delta) {
                ahVar2 = (ah) g02;
                ((t0) ahVar2.alpha).setValue(o5.alpha());
            }
        } else if (g02 instanceof F0) {
            if ((o5.bravo || o5.echo != null) && !o5.delta) {
                F0 f02 = (F0) g02;
                boolean areEqual = Intrinsics.areEqual(o5.alpha(), f02.alpha);
                ahVar = f02;
            }
        } else if (g02 instanceof ab) {
            o5.getClass();
            ab abVar = (ab) g02;
            Function1 function1 = abVar.alpha;
            ahVar = abVar;
        }
        if (ahVar2 == null) {
            if (o5.delta) {
                u0 u0Var = o5.charlie;
                if (u0Var == null) {
                    u0Var = as.white;
                }
                return new ah(new t0(o5.echo, u0Var));
            }
            return new F0(o5.alpha());
        }
        return ahVar2;
    }
}
