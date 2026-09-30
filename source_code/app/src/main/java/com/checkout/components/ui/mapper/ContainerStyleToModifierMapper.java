package com.checkout.components.ui.mapper;

import T.p;
import T.s;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/ui/mapper/ContainerStyleToModifierMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "<init>", "()V", "from", "map", "(Lcom/checkout/components/ui/model/style/base/ContainerStyle;)LT/s;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContainerStyleToModifierMapper implements Mapper<ContainerStyle, s> {
    public static final int $stable = 0;

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public s map(@NotNull ContainerStyle from) {
        Intrinsics.echo(from, "from");
        s charlie = V.charlie(a.bravo(p.alpha, C0366t.juliet, ao.alpha), 1.0f);
        if (from.getHeight() != null) {
            charlie = V.echo(charlie, r1.intValue());
        }
        if (from.getWidth() != null) {
            charlie = V.oscar(charlie, r1.intValue());
        }
        return from.getPadding() != null ? AbstractC0538d.victor(charlie, r5.getStart(), r5.getTop(), r5.getEnd(), r5.getBottom()) : charlie;
    }
}
