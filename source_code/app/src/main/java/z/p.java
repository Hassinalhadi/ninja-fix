package z;

import bz.AbstractC0800z;
import bz.C0778c;
import bz.C0795u;
import bz.f0;
import f.C1665b;
import f.C1670g;
import f.C1676m;
import f.InterfaceC1672i;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class p {
    public static final f0 alpha = new f0(120, AbstractC0800z.alpha, 2);
    public static final f0 bravo = new f0(150, new C0795u(0.4f, 0.0f, 0.6f, 1.0f), 2);
    public static final f0 charlie = new f0(120, new C0795u(0.4f, 0.0f, 0.6f, 1.0f), 2);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r10 instanceof f.C1667d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if ((r9 instanceof f.C1667d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(C0778c c0778c, float f5, InterfaceC1672i interfaceC1672i, InterfaceC1672i interfaceC1672i2, Pd.c cVar) {
        f0 f0Var;
        f0 f0Var2 = null;
        if (interfaceC1672i2 != null) {
            boolean z2 = interfaceC1672i2 instanceof C1676m;
            f0Var = alpha;
            if (!z2) {
                if (!(interfaceC1672i2 instanceof C1665b)) {
                    if (!(interfaceC1672i2 instanceof C1670g)) {
                    }
                }
            }
            f0Var2 = f0Var;
        } else if (interfaceC1672i != null) {
            boolean z10 = interfaceC1672i instanceof C1676m;
            f0Var = bravo;
            if (!z10 && !(interfaceC1672i instanceof C1665b)) {
                if (interfaceC1672i instanceof C1670g) {
                    f0Var2 = charlie;
                }
            }
            f0Var2 = f0Var;
        }
        f0 f0Var3 = f0Var2;
        if (f0Var3 != null) {
            Object charlie2 = C0778c.charlie(c0778c, new Q0.g(f5), f0Var3, null, cVar, 12);
            if (charlie2 == Od.a.alpha) {
                return charlie2;
            }
            return Unit.INSTANCE;
        }
        Object foxtrot = c0778c.foxtrot(cVar, new Q0.g(f5));
        if (foxtrot == Od.a.alpha) {
            return foxtrot;
        }
        return Unit.INSTANCE;
    }
}
