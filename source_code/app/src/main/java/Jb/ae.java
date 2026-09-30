package Jb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t6.Y3;
import y.C3344D;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ae(Object obj, boolean z2, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = z2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                af.alpha((ag) this.red, this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                Y3.alpha(this.purple, (Xd.l) this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                n.at.juliet((C3344D) this.red, this.purple, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ae(boolean z2, Xd.l lVar, int i4) {
        this.alpha = 1;
        this.purple = z2;
        this.red = lVar;
    }
}
