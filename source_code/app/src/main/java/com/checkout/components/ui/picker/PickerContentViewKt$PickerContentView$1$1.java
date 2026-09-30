package com.checkout.components.ui.picker;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import i.C1874w;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;

@e(c = "com.checkout.components.ui.picker.PickerContentViewKt$PickerContentView$1$1", f = "PickerContentView.kt", l = {44}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class PickerContentViewKt$PickerContentView$1$1 extends i implements l {
    final /* synthetic */ List<T> $filteredItems;
    final /* synthetic */ C1874w $listState;
    final /* synthetic */ T $selectedItem;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PickerContentViewKt$PickerContentView$1$1(List<? extends T> list, T t5, C1874w c1874w, c<? super PickerContentViewKt$PickerContentView$1$1> cVar) {
        super(2, cVar);
        this.$filteredItems = list;
        this.$selectedItem = t5;
        this.$listState = c1874w;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new PickerContentViewKt$PickerContentView$1$1(this.$filteredItems, this.$selectedItem, this.$listState, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            List<T> list = this.$filteredItems;
            T t5 = this.$selectedItem;
            Intrinsics.echo(list, "<this>");
            Integer num = new Integer(list.indexOf(t5));
            if (num.intValue() == -1) {
                num = null;
            }
            if (num != null) {
                C1874w c1874w = this.$listState;
                int intValue = num.intValue();
                this.I$0 = intValue;
                this.I$1 = 0;
                this.label = 1;
                if (C1874w.india(c1874w, intValue, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((PickerContentViewKt$PickerContentView$1$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
