package androidx.compose.runtime;

import androidx.appcompat.widget.P0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;

/* renamed from: androidx.compose.runtime.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0579k extends Pd.h implements Xd.l {
    public int purple;
    public int red;
    public int silver;
    public int teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ ComposePausableCompositionException yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579k(ComposePausableCompositionException composePausableCompositionException, Nd.c cVar) {
        super(2, cVar);
        this.yellow = composePausableCompositionException;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0579k c0579k = new C0579k(this.yellow, cVar);
        c0579k.white = obj;
        return c0579k;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0579k) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        int i4;
        int i5;
        int i10;
        int i11;
        bv.l lVar;
        bv.l lVar2;
        String str;
        bv.ar arVar;
        bv.l lVar3;
        bv.l lVar4;
        bv.l lVar5;
        bv.l lVar6;
        bv.l lVar7;
        int i12;
        bv.l lVar8;
        bv.ar arVar2;
        int i13;
        bv.l lVar9;
        bv.ar arVar3;
        bv.ar arVar4;
        bv.ar arVar5;
        bv.ar arVar6;
        Od.a aVar = Od.a.alpha;
        int i14 = this.teal;
        if (i14 != 0) {
            if (i14 == 1) {
                i4 = this.silver;
                i5 = this.red;
                i10 = this.purple;
                c2359i = (C2359i) this.white;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.white;
            i4 = 0;
            i5 = 0;
            i10 = 0;
        }
        ComposePausableCompositionException composePausableCompositionException = this.yellow;
        i11 = composePausableCompositionException.lastOperation;
        lVar = composePausableCompositionException.operations;
        if (i10 < Math.min(i11, lVar.bravo)) {
            lVar2 = composePausableCompositionException.operations;
            int i15 = i10 + 1;
            int alpha = lVar2.alpha(i10);
            switch (alpha) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    arVar = composePausableCompositionException.instances;
                    str = P0.bronze(arVar.bravo(i5), "down ");
                    i5++;
                    break;
                case 2:
                    lVar3 = composePausableCompositionException.operations;
                    int alpha2 = lVar3.alpha(i15);
                    lVar4 = composePausableCompositionException.operations;
                    i15 = i10 + 3;
                    str = "remove " + alpha2 + ' ' + lVar4.alpha(i10 + 2);
                    break;
                case 3:
                    lVar5 = composePausableCompositionException.operations;
                    int alpha3 = lVar5.alpha(i15);
                    lVar6 = composePausableCompositionException.operations;
                    int alpha4 = lVar6.alpha(i10 + 2);
                    lVar7 = composePausableCompositionException.operations;
                    i12 = i10 + 4;
                    str = "move " + alpha3 + ' ' + alpha4 + ' ' + lVar7.alpha(i10 + 3);
                    i15 = i12;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    lVar8 = composePausableCompositionException.operations;
                    i12 = i10 + 2;
                    int alpha5 = lVar8.alpha(i15);
                    arVar2 = composePausableCompositionException.instances;
                    i13 = i5 + 1;
                    str = "insertBottomUp " + alpha5 + ' ' + arVar2.bravo(i5);
                    i5 = i13;
                    i15 = i12;
                    break;
                case 6:
                    lVar9 = composePausableCompositionException.operations;
                    i12 = i10 + 2;
                    int alpha6 = lVar9.alpha(i15);
                    arVar3 = composePausableCompositionException.instances;
                    i13 = i5 + 1;
                    str = "insertTopDown " + alpha6 + ' ' + arVar3.bravo(i5);
                    i5 = i13;
                    i15 = i12;
                    break;
                case 7:
                    arVar4 = composePausableCompositionException.instances;
                    int i16 = i5 + 1;
                    Object bravo = arVar4.bravo(i5);
                    Intrinsics.charlie(bravo, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                    kotlin.jvm.internal.x.echo(2, bravo);
                    arVar5 = composePausableCompositionException.instances;
                    i5 += 2;
                    str = "apply " + ((Xd.l) bravo) + ' ' + arVar5.bravo(i16);
                    break;
                case 8:
                    StringBuilder sb2 = new StringBuilder("reuse ");
                    arVar6 = composePausableCompositionException.reused;
                    sb2.append(arVar6.bravo(i4));
                    str = sb2.toString();
                    i4++;
                    break;
                default:
                    str = ao.ad.zulu(alpha, "unknown op: ");
                    break;
            }
            this.white = c2359i;
            this.purple = i15;
            this.red = i5;
            this.silver = i4;
            this.teal = 1;
            c2359i.bravo(this, i10 + ": " + str);
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
