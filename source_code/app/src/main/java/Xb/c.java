package Xb;

import Xd.l;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ArrayList red;
    public final /* synthetic */ AllAddressNoteViewModel silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, AllAddressNoteViewModel allAddressNoteViewModel, Nd.c cVar) {
        super(2, cVar);
        this.red = arrayList;
        this.silver = allAddressNoteViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = new c(this.red, this.silver, cVar);
        cVar2.purple = obj;
        return cVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        ab abVar = (ab) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        ArrayList arrayList = this.red;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        int i5 = 0;
        for (Object obj2 : arrayList) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(ad.golf(abVar, null, new b((String) obj2, this.silver, i5, null), 3));
            i5 = i10;
        }
        this.purple = null;
        this.alpha = 1;
        Object hotel = ad.hotel(arrayList2, this);
        if (hotel == aVar) {
            return aVar;
        }
        return hotel;
    }
}
