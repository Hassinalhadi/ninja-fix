package I;

import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;

/* loaded from: classes3.dex */
public abstract class aj {
    public final /* synthetic */ int alpha;
    public final int bravo;
    public final int charlie;

    public /* synthetic */ aj(int i4, int i5, int i10, byte b2) {
        this.alpha = i10;
        this.bravo = i4;
        this.charlie = i5;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Ke.b, I.aj] */
    public static Ke.b alpha(aj ajVar) {
        return new aj(ajVar.bravo + ajVar.charlie, 1, 1, (byte) 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ke.b, I.aj] */
    public static Ke.b bravo() {
        return new aj(0, 1, 1, (byte) 0);
    }

    public abstract void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar);

    public C0562a delta(al alVar) {
        return null;
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                String kilo = kotlin.jvm.internal.u.alpha.bravo(getClass()).kilo();
                if (kilo == null) {
                    return "";
                }
                return kilo;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(int i4, int i5, int i10) {
        this((i10 & 1) != 0 ? 0 : i4, (i10 & 2) != 0 ? 0 : i5, 0, (byte) 0);
        this.alpha = 0;
    }
}
