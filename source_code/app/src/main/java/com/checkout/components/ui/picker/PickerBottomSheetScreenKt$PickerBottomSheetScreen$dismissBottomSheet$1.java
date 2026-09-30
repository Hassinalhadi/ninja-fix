package com.checkout.components.ui.picker;

import F.C0103e2;
import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import Y1.r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import vf.ab;

@e(c = "com.checkout.components.ui.picker.PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1", f = "PickerBottomSheetScreen.kt", l = {37}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1 extends i implements l {
    final /* synthetic */ r $navController;
    final /* synthetic */ Function0<Unit> $onBottomSheetDismissed;
    final /* synthetic */ C0103e2 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1(C0103e2 c0103e2, r rVar, Function0<Unit> function0, c<? super PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1> cVar) {
        super(2, cVar);
        this.$sheetState = c0103e2;
        this.$navController = rVar;
        this.$onBottomSheetDismissed = function0;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1(this.$sheetState, this.$navController, this.$onBottomSheetDismissed, cVar);
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
            C0103e2 c0103e2 = this.$sheetState;
            this.label = 1;
            if (c0103e2.bravo(this) == aVar) {
                return aVar;
            }
        }
        this.$navController.echo();
        this.$onBottomSheetDismissed.invoke();
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
