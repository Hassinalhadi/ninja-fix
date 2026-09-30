package U0;

import F.C0130l1;
import af.C0430a;
import androidx.compose.runtime.ax;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class g extends Lambda implements Function1 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z zVar, Function0 function0, ad adVar, String str, Q0.n nVar) {
        super(1);
        this.red = zVar;
        this.silver = function0;
        this.teal = adVar;
        this.purple = str;
        this.white = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                z zVar = (z) this.red;
                zVar.f2104g.addView(zVar, zVar.f2105h);
                zVar.kilo((Function0) this.silver, (ad) this.teal, this.purple, (Q0.n) this.white);
                return new C0130l1(2, zVar);
            default:
                a4.u uVar = new a4.u(1, (ax) this.white);
                ah.g charlie = ((ah.h) this.silver).charlie(this.purple, (ai.b) this.teal, uVar);
                C0430a c0430a = (C0430a) this.red;
                c0430a.alpha = charlie;
                return new C0130l1(3, c0430a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0430a c0430a, ah.h hVar, String str, ai.b bVar, ax axVar) {
        super(1);
        this.red = c0430a;
        this.silver = hVar;
        this.purple = str;
        this.teal = bVar;
        this.white = axVar;
    }
}
