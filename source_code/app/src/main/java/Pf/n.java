package Pf;

import Yb.C0331t0;
import Yb.F;
import b.aq;
import b.ar;
import b.as;
import f.C1667d;
import f.C1668e;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.L;

/* loaded from: classes2.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.i implements Xd.l {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i4, Object obj, Class cls, String str, String str2, int i5, int i10) {
        super(i4, i5, cls, obj, str, str2);
        this.alpha = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [f.i, java.lang.Object, f.d] */
    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean bravo;
        as f5;
        switch (this.alpha) {
            case 0:
                SerialDescriptor p02 = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.echo(p02, "p0");
                o oVar = (o) this.receiver;
                oVar.getClass();
                if (!p02.victor(intValue) && p02.uniform(intValue).papa()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                oVar.bravo = z2;
                return Boolean.valueOf(z2);
            default:
                Y.v vVar = (Y.v) obj;
                Y.v vVar2 = (Y.v) obj2;
                ar arVar = (ar) this.receiver;
                if (arVar.isAttached() && (bravo = ((Y.x) vVar2).bravo()) != ((Y.x) vVar).bravo()) {
                    C0331t0 c0331t0 = arVar.silver;
                    if (c0331t0 != null) {
                        c0331t0.invoke(Boolean.valueOf(bravo));
                    }
                    if (bravo) {
                        vf.ad.zulu(arVar.getCoroutineScope(), null, null, new aq(arVar, null), 3);
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        AbstractC2557q.november(arVar, new F(9, objectRef, arVar));
                        androidx.compose.foundation.lazy.layout.ad adVar = (androidx.compose.foundation.lazy.layout.ad) objectRef.alpha;
                        if (adVar != null) {
                            adVar.alpha();
                        } else {
                            adVar = null;
                        }
                        arVar.white = adVar;
                        L l10 = arVar.yellow;
                        if (l10 != null) {
                            Intrinsics.checkNotNull(l10);
                            if (l10.india() && (f5 = arVar.f()) != null) {
                                f5.b(arVar.yellow);
                            }
                        }
                    } else {
                        androidx.compose.foundation.lazy.layout.ad adVar2 = arVar.white;
                        if (adVar2 != null) {
                            adVar2.bravo();
                        }
                        arVar.white = null;
                        as f10 = arVar.f();
                        if (f10 != null) {
                            f10.b(null);
                        }
                    }
                    AbstractC2555o.golf(arVar).coral();
                    InterfaceC1673j interfaceC1673j = arVar.red;
                    if (interfaceC1673j != null) {
                        if (bravo) {
                            C1667d c1667d = arVar.teal;
                            if (c1667d != null) {
                                arVar.e(interfaceC1673j, new C1668e(c1667d));
                                arVar.teal = null;
                            }
                            ?? obj3 = new Object();
                            arVar.e(interfaceC1673j, obj3);
                            arVar.teal = obj3;
                        } else {
                            C1667d c1667d2 = arVar.teal;
                            if (c1667d2 != null) {
                                arVar.e(interfaceC1673j, new C1668e(c1667d2));
                                arVar.teal = null;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
