package C1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements Xd.l {
    public Iterator alpha;
    public Object purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ List teal;
    public final /* synthetic */ ArrayList white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, ArrayList arrayList, Nd.c cVar) {
        super(2, cVar);
        this.teal = list;
        this.white = arrayList;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = new f(this.teal, this.white, cVar);
        fVar.silver = obj;
        return fVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    it = this.alpha;
                    list = (List) this.silver;
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.purple;
                Iterator it2 = this.alpha;
                List list2 = (List) this.silver;
                ResultKt.alpha(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new Pd.i(1, null));
                    this.silver = list2;
                    this.alpha = it2;
                    this.purple = null;
                    this.red = 2;
                    throw null;
                }
            }
        } else {
            ResultKt.alpha(obj);
            obj = this.silver;
            it = this.teal.iterator();
            list = this.white;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.silver = list;
            this.alpha = it;
            this.purple = obj;
            this.red = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
