package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class K extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public Ref.ObjectRef purple;
    public int red;
    public final /* synthetic */ ac silver;
    public final /* synthetic */ vf.ab teal;
    public final /* synthetic */ Pd.i white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(ac acVar, vf.ab abVar, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        ab abVar2 = ab.alpha;
        this.silver = acVar;
        this.teal = abVar;
        this.white = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? r02 = this.white;
        ab abVar = ab.alpha;
        return new K(this.silver, this.teal, r02, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Throwable th;
        Ref.ObjectRef objectRef2;
        vf.I i4;
        aj ajVar;
        Od.a aVar = Od.a.alpha;
        int i5 = this.red;
        ac acVar = this.silver;
        if (i5 != 0) {
            if (i5 == 1) {
                objectRef = this.purple;
                objectRef2 = this.alpha;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th2) {
                    th = th2;
                    i4 = (vf.I) objectRef2.alpha;
                    if (i4 != null) {
                        i4.foxtrot(null);
                    }
                    ajVar = (aj) objectRef.alpha;
                    if (ajVar == null) {
                        acVar.charlie(ajVar);
                        throw th;
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (acVar.bravo() == ab.alpha) {
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            try {
                ab abVar = ab.silver;
                vf.ab abVar2 = this.teal;
                ?? r11 = this.white;
                this.alpha = objectRef3;
                this.purple = objectRef;
                this.red = 1;
                C3207k c3207k = new C3207k(1, J6.delta(this));
                c3207k.tango();
                aa.Companion.getClass();
                J j5 = new J(C0654y.charlie(abVar), objectRef3, abVar2, C0654y.alpha(abVar), c3207k, Ef.d.alpha(), r11);
                objectRef.alpha = j5;
                acVar.alpha(j5);
                if (c3207k.sierra() == aVar) {
                    return aVar;
                }
                objectRef2 = objectRef3;
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef3;
                i4 = (vf.I) objectRef2.alpha;
                if (i4 != null) {
                }
                ajVar = (aj) objectRef.alpha;
                if (ajVar == null) {
                }
            }
        }
        vf.I i10 = (vf.I) objectRef2.alpha;
        if (i10 != null) {
            i10.foxtrot(null);
        }
        aj ajVar2 = (aj) objectRef.alpha;
        if (ajVar2 != null) {
            acVar.charlie(ajVar2);
        }
        return Unit.INSTANCE;
    }
}
