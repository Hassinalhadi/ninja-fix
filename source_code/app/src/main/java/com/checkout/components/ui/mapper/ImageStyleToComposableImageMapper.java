package com.checkout.components.ui.mapper;

import P.d;
import Xd.l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.af;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.view.StyledImageViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "Lkotlin/Function0;", "", "<init>", "()V", "from", "map", "(Lcom/checkout/components/ui/model/style/base/ImageStyle;)LXd/l;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageStyleToComposableImageMapper implements Mapper<ImageStyle, l> {
    public static final int $stable = 0;

    public static /* synthetic */ Unit alpha(ImageStyle imageStyle, InterfaceC0581m interfaceC0581m, int i4) {
        return map$lambda$1$lambda$0(imageStyle, interfaceC0581m, i4);
    }

    public static final Unit map$lambda$1$lambda$0(ImageStyle imageStyle, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            StyledImageViewKt.StyledImageView(imageStyle, null, c0585q, 0, 2);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @Nullable
    public l map(@Nullable ImageStyle from) {
        if (from == null || from.getImage() == null) {
            return null;
        }
        return new d(new af(10, from), -418326101, true);
    }
}
