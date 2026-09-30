package De;

import J2.t;
import Q0.n;
import U0.ad;
import U0.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ap;
import pe.InterfaceC2332h;
import pe.aq;
import ve.s;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ae aeVar;
        switch (this.alpha) {
            case 0:
                gd.a aVar = (gd.a) ((t) this.purple).red;
                InterfaceC2332h kilo = ((ap) this.teal).kilo();
                if (kilo != null) {
                    aeVar = kilo.oscar();
                } else {
                    aeVar = null;
                }
                return aVar.echo((aq) this.red, a.alpha(a.alpha((a) this.silver, 0, false, null, aeVar, 31), 0, ((s) this.white).delta(), null, null, 59));
            default:
                ((z) this.purple).kilo((Function0) this.red, (ad) this.silver, (String) this.teal, (n) this.white);
                return Unit.INSTANCE;
        }
    }
}
