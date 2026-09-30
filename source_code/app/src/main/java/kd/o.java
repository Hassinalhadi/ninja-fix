package kd;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC2304b;
import s6.AbstractC2626c6;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.m {
    public StringBuilder alpha;
    public int purple;
    public /* synthetic */ Object red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ e white;
    public final /* synthetic */ ArrayList yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z2, e eVar, ArrayList arrayList, Nd.c cVar) {
        super(3, cVar);
        this.teal = z2;
        this.white = eVar;
        this.yellow = arrayList;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.yellow;
        o oVar = new o(this.teal, this.white, arrayList, (Nd.c) obj3);
        oVar.red = (ak) obj;
        oVar.silver = (AbstractC2304b) obj2;
        return oVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x013f, code lost:
    
        if (r2.bravo(r11) != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0142, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ee, code lost:
    
        if (r1.bravo(r11) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r1.bravo(r11) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        if (s6.AbstractC2626c6.delta(r1, r7, r11) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r6.bravo(r11) == r0) goto L73;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC2304b abstractC2304b;
        d dVar;
        StringBuilder sb2;
        Throwable th;
        d dVar2;
        StringBuilder sb3;
        boolean z2;
        d dVar3;
        boolean z10;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        boolean z11 = true;
        e eVar = this.white;
        switch (i4) {
            case 0:
                ResultKt.alpha(obj);
                ak akVar = (ak) this.red;
                abstractC2304b = (AbstractC2304b) this.silver;
                if (this.teal) {
                    return Unit.INSTANCE;
                }
                if (eVar != e.f12929a && !abstractC2304b.bravo().beige().bravo(aa.bravo)) {
                    dVar = (d) abstractC2304b.bravo().beige().charlie(aa.alpha);
                    sb2 = new StringBuilder();
                    try {
                        AbstractC2626c6.echo(sb2, abstractC2304b.bravo().echo(), eVar, this.yellow);
                        this.red = abstractC2304b;
                        this.silver = dVar;
                        this.alpha = sb2;
                        this.purple = 1;
                        obj = akVar.alpha.delta(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        String sb4 = sb2.toString();
                        Intrinsics.delta(sb4, "toString(...)");
                        dVar.foxtrot(sb4);
                        z10 = eVar.red;
                        if (z10) {
                            this.red = null;
                            this.silver = null;
                            this.alpha = null;
                            this.purple = 2;
                            break;
                        } else {
                            if (z10 && hd.n.bravo(abstractC2304b)) {
                                this.red = dVar;
                                this.silver = null;
                                this.alpha = null;
                                this.purple = 3;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        StringBuilder sb5 = sb2;
                        dVar2 = dVar;
                        sb3 = sb5;
                        try {
                            aa.india(eVar, sb3, abstractC2304b.bravo().delta(), th);
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                String sb6 = sb3.toString();
                                Intrinsics.delta(sb6, "toString(...)");
                                dVar2.foxtrot(sb6);
                                if (!z11 && (z2 = eVar.red)) {
                                    if (z2) {
                                        if (hd.n.bravo(abstractC2304b)) {
                                            this.red = dVar2;
                                            this.silver = th;
                                            this.alpha = null;
                                            this.purple = 6;
                                            if (AbstractC2626c6.delta(dVar2, abstractC2304b, this) != aVar) {
                                                dVar3 = dVar2;
                                                this.red = th;
                                                this.silver = null;
                                                this.purple = 7;
                                                break;
                                            }
                                        } else {
                                            throw th;
                                        }
                                    } else {
                                        throw th;
                                    }
                                } else {
                                    this.red = th;
                                    this.silver = null;
                                    this.alpha = null;
                                    this.purple = 5;
                                    break;
                                }
                                return aVar;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z11 = false;
                        }
                    }
                } else {
                    return Unit.INSTANCE;
                }
                break;
            case 1:
                sb3 = this.alpha;
                dVar2 = (d) this.silver;
                abstractC2304b = (AbstractC2304b) this.red;
                try {
                    ResultKt.alpha(obj);
                    sb2 = sb3;
                    dVar = dVar2;
                    String sb42 = sb2.toString();
                    Intrinsics.delta(sb42, "toString(...)");
                    dVar.foxtrot(sb42);
                    z10 = eVar.red;
                    if (z10) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aa.india(eVar, sb3, abstractC2304b.bravo().delta(), th);
                    throw th;
                }
                break;
            case 2:
            case 4:
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            case 3:
                dVar = (d) this.red;
                ResultKt.alpha(obj);
                this.red = null;
                this.purple = 4;
                break;
            case 5:
            case 7:
                Throwable th6 = (Throwable) this.red;
                ResultKt.alpha(obj);
                throw th6;
            case 6:
                Throwable th7 = (Throwable) this.silver;
                dVar3 = (d) this.red;
                ResultKt.alpha(obj);
                th = th7;
                this.red = th;
                this.silver = null;
                this.purple = 7;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
