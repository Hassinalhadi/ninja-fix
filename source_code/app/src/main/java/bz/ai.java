package bz;

import Yb.C0312j0;
import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ai extends Pd.i implements Xd.l {
    public kotlin.jvm.internal.r alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;
    public final /* synthetic */ aj teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(androidx.compose.runtime.ax axVar, aj ajVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = axVar;
        this.teal = ajVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ai aiVar = new ai(this.silver, this.teal, cVar);
        aiVar.red = obj;
        return aiVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((ai) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (yf.AbstractC3428A.oscar(r12, r1, r11) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        if (bz.AbstractC0779d.lima(r5, r11) == r0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Xd.l, Pd.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0077 -> B:6:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005a -> B:6:0x003e). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
        kotlin.jvm.internal.r rVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    kotlin.jvm.internal.r rVar2 = this.alpha;
                    vf.ab abVar2 = (vf.ab) this.red;
                    ResultKt.alpha(obj);
                    rVar = rVar2;
                    abVar = abVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.jvm.internal.r rVar3 = this.alpha;
                vf.ab abVar3 = (vf.ab) this.red;
                ResultKt.alpha(obj);
                rVar = rVar3;
                abVar = abVar3;
                if (rVar.alpha == 0.0f) {
                    C1.t bronze = C0564b.bronze(new C0312j0(11, abVar));
                    ?? iVar = new Pd.i(2, null);
                    this.red = abVar;
                    this.alpha = rVar;
                    this.purple = 2;
                }
            }
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar4 = (vf.ab) this.red;
            ?? obj2 = new Object();
            obj2.alpha = 1.0f;
            abVar = abVar4;
            rVar = obj2;
        }
        X9.e eVar = new X9.e(this.silver, this.teal, rVar, abVar, 6);
        this.red = abVar;
        this.alpha = rVar;
        this.purple = 1;
    }
}
