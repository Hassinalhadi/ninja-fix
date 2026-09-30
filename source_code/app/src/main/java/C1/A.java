package C1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class A {
    public final Ef.c alpha = Ef.d.alpha();
    public final Aa.m bravo = new Aa.m(6);
    public final t charlie = new t(new Pd.i(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [Xd.l, Pd.i] */
    public A(String str) {
    }

    public final Integer alpha() {
        return new Integer(((AtomicInteger) this.bravo.purple).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.delta(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Function1 function1, Pd.c cVar) {
        ax axVar;
        Od.a aVar;
        int i4;
        Ef.c cVar2;
        Throwable th;
        Ef.a aVar2;
        Object invoke;
        try {
            if (cVar instanceof ax) {
                axVar = (ax) cVar;
                int i5 = axVar.teal;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    axVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = axVar.red;
                    aVar = Od.a.alpha;
                    i4 = axVar.teal;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                aVar2 = (Ef.a) axVar.alpha;
                                try {
                                    ResultKt.alpha(obj);
                                    ((Ef.c) aVar2).foxtrot(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((Ef.c) aVar2).foxtrot(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ef.c cVar3 = axVar.purple;
                        Function1 function12 = (Function1) axVar.alpha;
                        ResultKt.alpha(obj);
                        cVar2 = cVar3;
                        function1 = function12;
                    } else {
                        ResultKt.alpha(obj);
                        axVar.alpha = function1;
                        cVar2 = this.alpha;
                        axVar.purple = cVar2;
                        axVar.teal = 1;
                    }
                    axVar.alpha = cVar2;
                    axVar.purple = null;
                    axVar.teal = 2;
                    invoke = function1.invoke(axVar);
                    if (invoke != aVar) {
                        Ef.c cVar4 = cVar2;
                        obj = invoke;
                        aVar2 = cVar4;
                        ((Ef.c) aVar2).foxtrot(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            axVar.alpha = cVar2;
            axVar.purple = null;
            axVar.teal = 2;
            invoke = function1.invoke(axVar);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            Ef.c cVar5 = cVar2;
            th = th3;
            aVar2 = cVar5;
            ((Ef.c) aVar2).foxtrot(null);
            throw th;
        }
        axVar = new ax(this, cVar);
        Object obj2 = axVar.red;
        aVar = Od.a.alpha;
        i4 = axVar.teal;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object charlie(Xd.l lVar, Pd.c cVar) {
        ay ayVar;
        int i4;
        Ef.c cVar2;
        Throwable th;
        boolean z2;
        if (cVar instanceof ay) {
            ayVar = (ay) cVar;
            int i5 = ayVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                ayVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = ayVar.red;
                Object obj2 = Od.a.alpha;
                i4 = ayVar.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        z2 = ayVar.purple;
                        cVar2 = ayVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            if (z2) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Ef.c cVar3 = this.alpha;
                    boolean echo = cVar3.echo();
                    try {
                        Object valueOf = Boolean.valueOf(echo);
                        ayVar.alpha = cVar3;
                        ayVar.purple = echo;
                        ayVar.teal = 1;
                        Object invoke = lVar.invoke(valueOf, ayVar);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = invoke;
                        z2 = echo;
                    } catch (Throwable th3) {
                        cVar2 = cVar3;
                        th = th3;
                        z2 = echo;
                        if (z2) {
                            cVar2.foxtrot(null);
                        }
                        throw th;
                    }
                }
                if (z2) {
                    cVar2.foxtrot(null);
                }
                return obj;
            }
        }
        ayVar = new ay(this, cVar);
        Object obj3 = ayVar.red;
        Object obj22 = Od.a.alpha;
        i4 = ayVar.teal;
        if (i4 == 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}
