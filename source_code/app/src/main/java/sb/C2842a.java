package sb;

import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2842a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ P.d red;

    public /* synthetic */ C2842a(Function0 function0, P.d dVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = function0;
        this.red = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                AbstractC2845d.hotel(this.purple, this.red, interfaceC0581m, C0564b.cyan(439));
                return Unit.INSTANCE;
            case 1:
                AbstractC2845d.alpha(this.purple, this.red, interfaceC0581m, C0564b.cyan(55));
                return Unit.INSTANCE;
            default:
                AbstractC2845d.golf(this.purple, this.red, interfaceC0581m, C0564b.cyan(439));
                return Unit.INSTANCE;
        }
    }
}
