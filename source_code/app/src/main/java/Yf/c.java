package Yf;

import O7.j;
import Pd.h;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import pf.C2359i;

/* loaded from: classes2.dex */
public final class c extends h implements l {
    public int purple;
    public int red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ Zf.a white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Zf.a aVar, Nd.c cVar) {
        super(2, cVar);
        this.white = aVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = new c(this.white, cVar);
        cVar2.teal = obj;
        return cVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        int length;
        int i4;
        Object jVar;
        Od.a aVar = Od.a.alpha;
        int i5 = this.silver;
        Zf.a aVar2 = this.white;
        if (i5 != 0) {
            if (i5 == 1) {
                length = this.red;
                int i10 = this.purple;
                c2359i = (C2359i) this.teal;
                ResultKt.alpha(obj);
                i4 = i10 + 1;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.teal;
            Zf.a aVar3 = aVar2;
            aVar3.getClass();
            length = ((Node) aVar3.purple).getChildNodes().getLength();
            i4 = 0;
        }
        if (i4 < length) {
            Zf.a aVar4 = aVar2;
            aVar4.getClass();
            Node node = (Node) aVar4.purple;
            node.getChildNodes().getLength();
            Node item = node.getChildNodes().item(i4);
            if (item instanceof Element) {
                jVar = new Zf.a((Element) item);
            } else {
                Intrinsics.checkNotNull(item);
                jVar = new j(item);
            }
            this.teal = c2359i;
            this.purple = i4;
            this.red = length;
            this.silver = 1;
            c2359i.bravo(this, jVar);
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
