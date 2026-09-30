package Dd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends f {
    public final List purple;
    public final Nd.h red;
    public Object silver;
    public int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object context, List interceptors, Object subject, Nd.h hVar) {
        super(context);
        Intrinsics.echo(context, "context");
        Intrinsics.echo(interceptors, "interceptors");
        Intrinsics.echo(subject, "subject");
        this.purple = interceptors;
        this.red = hVar;
        this.silver = subject;
    }

    @Override // Dd.f
    public final Object alpha(Object obj, Pd.c cVar) {
        this.teal = 0;
        Intrinsics.echo(obj, "<set-?>");
        this.silver = obj;
        return delta(cVar);
    }

    @Override // Dd.f
    public final Object bravo() {
        return this.silver;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.red;
    }

    @Override // Dd.f
    public final Object delta(Nd.c cVar) {
        int i4 = this.teal;
        if (i4 < 0) {
            return this.silver;
        }
        if (i4 >= this.purple.size()) {
            this.teal = -1;
            return this.silver;
        }
        return foxtrot(cVar);
    }

    @Override // Dd.f
    public final Object echo(Nd.c cVar, Object obj) {
        Intrinsics.echo(obj, "<set-?>");
        this.silver = obj;
        return delta(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(Nd.c cVar) {
        a aVar;
        Od.a aVar2;
        int i4;
        int i5;
        Xd.m mVar;
        Object obj;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.red;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aVar.red = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = aVar.alpha;
                aVar2 = Od.a.alpha;
                i4 = aVar.red;
                if (i4 == 0 && i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj2);
                do {
                    i5 = this.teal;
                    if (i5 == -1) {
                        List list = this.purple;
                        if (i5 >= list.size()) {
                            this.teal = -1;
                        } else {
                            mVar = (Xd.m) list.get(i5);
                            this.teal = i5 + 1;
                            obj = this.silver;
                            aVar.red = 1;
                        }
                    }
                    return this.silver;
                } while (mVar.invoke(this, obj, aVar) != aVar2);
                return aVar2;
            }
        }
        aVar = new a(this, cVar);
        Object obj22 = aVar.alpha;
        aVar2 = Od.a.alpha;
        i4 = aVar.red;
        if (i4 == 0) {
        }
        ResultKt.alpha(obj22);
        do {
            i5 = this.teal;
            if (i5 == -1) {
            }
            return this.silver;
        } while (mVar.invoke(this, obj, aVar) != aVar2);
        return aVar2;
    }
}
