package H0;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2724n5;

/* loaded from: classes3.dex */
public final class d implements D0 {
    public final List alpha;
    public final ac purple;
    public final Function1 red;
    public final ax silver;
    public boolean teal = true;

    public d(List list, Object obj, ac acVar, J2.t tVar, Function1 function1, a aVar) {
        this.alpha = list;
        this.purple = acVar;
        this.red = function1;
        this.silver = C0564b.zulu(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:16:0x009e, B:23:0x0049, B:25:0x004e, B:28:0x007b, B:33:0x0094), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009e -> B:14:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Pd.c cVar) {
        c cVar2;
        int i4;
        ax axVar;
        Function1 function1;
        int size;
        List list;
        int i5;
        try {
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i10 = cVar2.yellow;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    cVar2.yellow = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = cVar2.teal;
                    Od.a aVar = Od.a.alpha;
                    i4 = cVar2.yellow;
                    axVar = this.silver;
                    function1 = this.red;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                size = cVar2.silver;
                                i5 = cVar2.red;
                                list = cVar2.alpha;
                                ResultKt.alpha(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            int i11 = cVar2.silver;
                            int i12 = cVar2.red;
                            i iVar = cVar2.purple;
                            List list2 = cVar2.alpha;
                            ResultKt.alpha(obj);
                            if (obj != null) {
                                ac acVar = this.purple;
                                ((t0) axVar).setValue(AbstractC2724n5.bravo(acVar.delta, obj, iVar, acVar.bravo, acVar.charlie));
                                return Unit.INSTANCE;
                            }
                            cVar2.alpha = list2;
                            cVar2.purple = null;
                            cVar2.red = i12;
                            cVar2.silver = i11;
                            cVar2.yellow = 2;
                            if (vf.ad.bronze(cVar2) == aVar) {
                                return aVar;
                            }
                            size = i11;
                            i5 = i12;
                            list = list2;
                        }
                        i5++;
                        if (i5 < size) {
                            ((z) ((i) list.get(i5))).getClass();
                            i5++;
                            if (i5 < size) {
                                boolean whiskey = vf.ad.whiskey(cVar2.getContext());
                                this.teal = false;
                                function1.invoke(new ae(((t0) axVar).getValue(), whiskey));
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        ResultKt.alpha(obj);
                        List list3 = this.alpha;
                        size = list3.size();
                        list = list3;
                        i5 = 0;
                        if (i5 < size) {
                        }
                    }
                }
            }
            if (i4 == 0) {
            }
        } finally {
            boolean whiskey2 = vf.ad.whiskey(cVar2.getContext());
            this.teal = false;
            function1.invoke(new ae(((t0) axVar).getValue(), whiskey2));
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.teal;
        Od.a aVar2 = Od.a.alpha;
        i4 = cVar2.yellow;
        axVar = this.silver;
        function1 = this.red;
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return ((t0) this.silver).getValue();
    }
}
