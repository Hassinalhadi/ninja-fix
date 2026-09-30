package com.checkout.components.card.ui.component.cardnumber;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SchemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$2 implements Function1<Integer, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f4477a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f4478b;

    public SchemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$2(Function1 function1, List list) {
        this.f4477a = function1;
        this.f4478b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.f4477a.invoke(this.f4478b.get(num.intValue()));
    }

    public final Object invoke(int i4) {
        return this.f4477a.invoke(this.f4478b.get(i4));
    }
}
