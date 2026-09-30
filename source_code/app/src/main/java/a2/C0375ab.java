package a2;

import Y1.ag;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import bv.af;
import bz.a0;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a2.ab, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0375ab extends Pd.i implements Xd.l {
    public final /* synthetic */ a0 alpha;
    public final /* synthetic */ ag purple;
    public final /* synthetic */ Y1.l red;
    public final /* synthetic */ af silver;
    public final /* synthetic */ D0 teal;
    public final /* synthetic */ C0383h white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375ab(a0 a0Var, ag agVar, Y1.l lVar, af afVar, D0 d02, C0383h c0383h, Nd.c cVar) {
        super(2, cVar);
        this.alpha = a0Var;
        this.purple = agVar;
        this.red = lVar;
        this.silver = afVar;
        this.teal = d02;
        this.white = c0383h;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0375ab(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0375ab) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        char c3;
        char c4;
        char c10 = 7;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        a0 a0Var = this.alpha;
        Object L4 = a0Var.alpha.L();
        ax axVar = a0Var.delta;
        if (Intrinsics.areEqual(L4, ((t0) axVar).getValue()) && (((Y1.l) this.purple.bravo.foxtrot.lima()) == null || Intrinsics.areEqual(((t0) axVar).getValue(), this.red))) {
            Iterator it = ((List) this.teal.getValue()).iterator();
            while (it.hasNext()) {
                this.white.bravo().charlie((Y1.l) it.next());
            }
            af afVar = this.silver;
            long[] jArr = afVar.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j5 = jArr[i4];
                    if ((((~j5) << c10) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i5) {
                            if ((j5 & 255) < 128) {
                                int i11 = (i4 << 3) + i10;
                                c4 = c10;
                                Object obj2 = afVar.bravo[i11];
                                float f5 = afVar.charlie[i11];
                                if (!Intrinsics.areEqual((String) obj2, ((Y1.l) ((t0) axVar).getValue()).white)) {
                                    afVar.echo--;
                                    long[] jArr2 = afVar.alpha;
                                    int i12 = afVar.delta;
                                    int i13 = i11 >> 3;
                                    int i14 = (i11 & 7) << 3;
                                    long j6 = (jArr2[i13] & (~(255 << i14))) | (254 << i14);
                                    jArr2[i13] = j6;
                                    jArr2[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j6;
                                    afVar.bravo[i11] = null;
                                }
                            } else {
                                c4 = c10;
                            }
                            j5 >>= 8;
                            i10++;
                            c10 = c4;
                        }
                        c3 = c10;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        c3 = c10;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    c10 = c3;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
