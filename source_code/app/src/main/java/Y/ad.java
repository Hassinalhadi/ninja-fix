package Y;

import C1.av;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.InterfaceC2385d;
import s0.AbstractC2555o;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ad extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ aa purple;
    public final /* synthetic */ aa red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ av teal;
    public final /* synthetic */ Object white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(aa aaVar, aa aaVar2, Object obj, int i4, av avVar, int i5) {
        super(1);
        this.alpha = i5;
        this.purple = aaVar;
        this.red = aaVar2;
        this.white = obj;
        this.silver = i4;
        this.teal = avVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                InterfaceC2385d interfaceC2385d = (InterfaceC2385d) obj;
                aa aaVar = this.red;
                if (this.purple != ((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).hotel) {
                    return Boolean.TRUE;
                }
                boolean mike = g.mike(aaVar, (aa) this.white, this.silver, this.teal);
                Boolean valueOf = Boolean.valueOf(mike);
                if (!mike && interfaceC2385d.alpha()) {
                    return null;
                }
                return valueOf;
            default:
                InterfaceC2385d interfaceC2385d2 = (InterfaceC2385d) obj;
                aa aaVar2 = this.red;
                if (this.purple != ((n) ((C2946x) AbstractC2555o.hotel(aaVar2)).getFocusOwner()).hotel) {
                    return Boolean.TRUE;
                }
                boolean juliet = ae.juliet(this.silver, this.teal, aaVar2, (Z.c) this.white);
                Boolean valueOf2 = Boolean.valueOf(juliet);
                if (!juliet && interfaceC2385d2.alpha()) {
                    return null;
                }
                return valueOf2;
        }
    }
}
