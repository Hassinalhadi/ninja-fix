package com.checkout.components.card.ui.component.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes3.dex */
public final /* synthetic */ class InputComponentViewKt$InputComponent$2$1 extends i implements Function1<String, Unit> {
    public InputComponentViewKt$InputComponent$2$1(Object obj) {
        super(1, 0, InputComponentViewModel.class, obj, "onInputTextChanged", "onInputTextChanged$card_standardRelease(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.echo(p02, "p0");
        ((InputComponentViewModel) this.receiver).onInputTextChanged$card_standardRelease(p02);
    }
}
