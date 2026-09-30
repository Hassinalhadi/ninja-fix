package Yb;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.G5;

/* loaded from: classes2.dex */
public final class af extends Pd.i implements Xd.l {
    public final /* synthetic */ List alpha;
    public final /* synthetic */ File purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(List list, File file, Nd.c cVar) {
        super(2, cVar);
        this.alpha = list;
        this.purple = file;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new af(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((af) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean areEqual;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            File file2 = this.purple;
            if (file2 == null) {
                areEqual = false;
            } else {
                areEqual = Intrinsics.areEqual(file.getAbsolutePath(), file2.getAbsolutePath());
            }
            if (!areEqual) {
                G5.bravo(file, "cleanup_old_proof");
            }
        }
        return Unit.INSTANCE;
    }
}
