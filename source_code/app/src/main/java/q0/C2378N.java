package q0;

import androidx.compose.runtime.AbstractC0587t;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: q0.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2378N extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2379O purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2378N(C2379O c2379o, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = c2379o;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                this.purple.alpha().purple = (AbstractC0587t) obj2;
                return Unit.INSTANCE;
            case 1:
                al alpha = this.purple.alpha();
                ((s0.al) obj).silver(new ai(alpha, (Xd.l) obj2, alpha.f13157i));
                return Unit.INSTANCE;
            default:
                s0.al alVar = (s0.al) obj;
                al alVar2 = alVar.f13307z;
                C2379O c2379o = this.purple;
                if (alVar2 == null) {
                    alVar2 = new al(alVar, c2379o.alpha);
                    alVar.f13307z = alVar2;
                }
                c2379o.bravo = alVar2;
                c2379o.alpha().echo();
                al alpha2 = c2379o.alpha();
                InterfaceC2381Q interfaceC2381Q = alpha2.red;
                InterfaceC2381Q interfaceC2381Q2 = c2379o.alpha;
                if (interfaceC2381Q != interfaceC2381Q2) {
                    alpha2.red = interfaceC2381Q2;
                    alpha2.foxtrot(false);
                    s0.al.olive(alpha2.alpha, false, 7);
                }
                return Unit.INSTANCE;
        }
    }
}
