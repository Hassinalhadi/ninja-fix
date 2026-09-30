package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.ComposeView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2902a;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0088b extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0088b(int i4, Object obj) {
        super(2);
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        if (r11.containsKey(r0) != false) goto L68;
     */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                T.s then = AbstractC0538d.romeo(T.p.alpha, AbstractC0128l.foxtrot).then(new HorizontalAlignElement(T.d.f2063g));
                q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                int romeo = C0564b.romeo(interfaceC0581m);
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(then, interfaceC0581m);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, interfaceC0581m, delta);
                C0564b.blue(C2551k.echo, interfaceC0581m, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
                ((Xd.l) this.purple).invoke(interfaceC0581m, 0);
                c0585q2.quebec(true);
                return Unit.INSTANCE;
            case 1:
                ((Number) obj2).intValue();
                ((I0) this.purple).alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                long j5 = ((Q0.m) obj).alpha;
                float golf = Q0.a.golf(((Q0.a) obj2).alpha);
                C0103e2 c0103e2 = (C0103e2) this.purple;
                Z0 z02 = new Z0(golf, j5, c0103e2);
                androidx.compose.material3.internal.v vVar = new androidx.compose.material3.internal.v();
                z02.invoke(vVar);
                LinkedHashMap linkedHashMap = vVar.alpha;
                androidx.compose.material3.internal.ad adVar = new androidx.compose.material3.internal.ad(linkedHashMap);
                int ordinal = ((EnumC0107f2) ((androidx.compose.runtime.ad) c0103e2.bravo.juliet).getValue()).ordinal();
                EnumC0107f2 enumC0107f2 = EnumC0107f2.alpha;
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EnumC0107f2 enumC0107f22 = EnumC0107f2.red;
                    if (!linkedHashMap.containsKey(enumC0107f22)) {
                        enumC0107f22 = EnumC0107f2.purple;
                        break;
                    }
                    enumC0107f2 = enumC0107f22;
                }
                return new Pair(adVar, enumC0107f2);
            case 3:
                T.s sVar = (T.s) obj;
                T.s sVar2 = (T.q) obj2;
                if (sVar2 instanceof T.n) {
                    Xd.m mVar = ((T.n) sVar2).alpha;
                    kotlin.jvm.internal.x.echo(3, mVar);
                    T.p pVar = T.p.alpha;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) this.purple;
                    sVar2 = T.a.bravo((T.s) mVar.invoke(pVar, interfaceC0581m2, 0), interfaceC0581m2);
                }
                return sVar.then(sVar2);
            case 4:
                ((Number) obj2).intValue();
                ((U0.s) this.purple).alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 5:
                ((Number) obj2).intValue();
                ((U0.z) this.purple).alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 6:
                ((V.d) this.purple).india(((Number) obj).intValue(), (A0.s) obj2);
                return Unit.INSTANCE;
            case 7:
                bx.ai aiVar = (bx.ai) obj;
                bx.ai aiVar2 = (bx.ai) obj2;
                bx.ai aiVar3 = bx.ai.red;
                if (aiVar == aiVar3 && aiVar2 == aiVar3 && !((bx.A) ((bx.az) this.purple)).charlie.delta) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 8:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue & 1, z10)) {
                    List list = (List) this.purple;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Xd.l lVar = (Xd.l) list.get(i4);
                        long j6 = c0585q3.magenta;
                        int i5 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j2 = C2551k.charlie;
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j2);
                        } else {
                            c0585q3.i();
                        }
                        C2549i c2549i2 = C2551k.golf;
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i5))) {
                            ao.ad.blue(i5, c0585q3, i5, c2549i2);
                        }
                        lVar.invoke(c0585q3, 0);
                        c0585q3.quebec(true);
                    }
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue2 & 1, z11)) {
                    ((AbstractC2902a) this.purple).alpha(c0585q4, 0);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                ((ComposeView) this.purple).alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0088b(AbstractC2902a abstractC2902a, int i4, int i5) {
        super(2);
        this.alpha = i5;
        this.purple = abstractC2902a;
    }
}
