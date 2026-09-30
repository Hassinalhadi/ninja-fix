package Jb;

import com.app.network.network.models.AttributeGroup;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class E extends Pd.i implements Xd.l {
    public final /* synthetic */ HomeViewModelV2 alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(HomeViewModelV2 homeViewModelV2, String str, Nd.c cVar) {
        super(2, cVar);
        this.alpha = homeViewModelV2;
        this.purple = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new E(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        yf.N n5 = this.alpha.india;
        Iterable iterable = (Iterable) n5.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (!Intrinsics.areEqual(((AttributeGroup) obj2).getGroup(), this.purple)) {
                arrayList.add(obj2);
            }
        }
        n5.getClass();
        n5.juliet(null, arrayList);
        return Unit.INSTANCE;
    }
}
