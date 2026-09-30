package H4;

import Xd.l;
import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.core.ui.views.InternalImageViewKt;
import eb.C1646a;
import eb.h;
import eb.i;
import kotlin.Unit;
import s6.G0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ a(int i4, int i5, i iVar, Object obj, int i10, int i11) {
        this.alpha = i11;
        this.purple = i4;
        this.red = i5;
        this.teal = iVar;
        this.white = obj;
        this.silver = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                return InternalImageViewKt.alpha(this.purple, (String) this.teal, (C0366t) this.white, this.red, this.silver, interfaceC0581m, intValue);
            case 1:
                ((Integer) obj2).intValue();
                G0.bravo(this.purple, this.red, (i) this.teal, (h) this.white, (InterfaceC0581m) obj, C0564b.cyan(this.silver | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                G0.alpha(this.purple, this.red, (i) this.teal, (C1646a) this.white, (InterfaceC0581m) obj, C0564b.cyan(this.silver | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(int i4, String str, C0366t c0366t, int i5, int i10) {
        this.alpha = 0;
        this.purple = i4;
        this.teal = str;
        this.white = c0366t;
        this.red = i5;
        this.silver = i10;
    }
}
