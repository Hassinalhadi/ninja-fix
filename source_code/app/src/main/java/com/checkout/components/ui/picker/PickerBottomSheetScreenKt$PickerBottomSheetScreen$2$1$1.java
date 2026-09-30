package com.checkout.components.ui.picker;

import F.C0103e2;
import Y1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import vf.ab;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class PickerBottomSheetScreenKt$PickerBottomSheetScreen$2$1$1 extends i implements Function0<Unit> {
    final /* synthetic */ r $navController;
    final /* synthetic */ Function0<Unit> $onBottomSheetDismissed;
    final /* synthetic */ ab $scope;
    final /* synthetic */ C0103e2 $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerBottomSheetScreenKt$PickerBottomSheetScreen$2$1$1(ab abVar, C0103e2 c0103e2, r rVar, Function0<Unit> function0) {
        super(0, j.class, "dismissBottomSheet", "PickerBottomSheetScreen_cf5BqRc$dismissBottomSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V", 0);
        this.$scope = abVar;
        this.$sheetState = c0103e2;
        this.$navController = rVar;
        this.$onBottomSheetDismissed = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PickerBottomSheetScreenKt.PickerBottomSheetScreen_cf5BqRc$dismissBottomSheet(this.$scope, this.$sheetState, this.$navController, this.$onBottomSheetDismissed);
    }
}
