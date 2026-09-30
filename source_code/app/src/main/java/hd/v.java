package hd;

import androidx.recyclerview.widget.RecyclerView;
import ge.InterfaceC1772d;
import id.C1915c;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import od.InterfaceC2225b;
import pd.AbstractC2304b;
import s6.AbstractC2742p5;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class v {
    public static final rg.b alpha = rg.d.bravo().bravo().alpha("io.ktor.client.plugins.HttpCallValidator");
    public static final C1915c bravo = AbstractC2742p5.alpha("HttpResponseValidator", p.alpha, new l(2));
    public static final C3509a charlie;

    static {
        ge.w wVar;
        InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(Boolean.class);
        try {
            wVar = kotlin.jvm.internal.u.alpha(Boolean.TYPE);
        } catch (Throwable unused) {
            wVar = null;
        }
        charlie = new C3509a("ExpectSuccessAttributeKey", new Ed.a(bravo2, wVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit alpha(List list, Throwable th, InterfaceC2225b interfaceC2225b, Pd.c cVar) {
        s sVar;
        int i4;
        Iterator it;
        if (cVar instanceof s) {
            s sVar2 = (s) cVar;
            int i5 = sVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                sVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                sVar = sVar2;
                Object obj = sVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = sVar.purple;
                if (i4 == 0) {
                    if (i4 == 1 || i4 == 2) {
                        ResultKt.alpha(obj);
                        it = null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    alpha.hotel("Processing exception " + th + " for request " + interfaceC2225b.getUrl());
                    it = list.iterator();
                }
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
                if (it.next() == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            }
        }
        sVar = new Pd.c(cVar);
        Object obj2 = sVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = sVar.purple;
        if (i4 == 0) {
        }
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(List list, AbstractC2304b abstractC2304b, Pd.c cVar) {
        t tVar;
        int i4;
        Iterator it;
        if (cVar instanceof t) {
            t tVar2 = (t) cVar;
            int i5 = tVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                tVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                tVar = tVar2;
                Object obj = tVar.red;
                Object obj2 = Od.a.alpha;
                i4 = tVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        it = tVar.purple;
                        abstractC2304b = tVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    alpha.hotel("Validating response for request " + abstractC2304b.bravo().delta().getUrl());
                    it = list.iterator();
                }
                while (it.hasNext()) {
                    Xd.l lVar = (Xd.l) it.next();
                    tVar.alpha = abstractC2304b;
                    tVar.purple = it;
                    tVar.silver = 1;
                    if (lVar.invoke(abstractC2304b, tVar) == obj2) {
                        return obj2;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        tVar = new Pd.c(cVar);
        Object obj3 = tVar.red;
        Object obj22 = Od.a.alpha;
        i4 = tVar.silver;
        if (i4 == 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
