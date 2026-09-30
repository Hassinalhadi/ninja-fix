package com.checkout.components.interfaces.uicustomisation.designtoken;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/designtoken/DefaultBorderRadius;", "", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "a", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "getBUTTON", "()Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "BUTTON", "b", "getFORM", "FORM", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class DefaultBorderRadius {
    public static final int $stable = 0;

    @NotNull
    public static final DefaultBorderRadius INSTANCE = new DefaultBorderRadius();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final BorderRadius BUTTON = new BorderRadius(4, 4, 4, 4);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final BorderRadius FORM = new BorderRadius(8, 8, 8, 8);

    private DefaultBorderRadius() {
    }

    @NotNull
    public final BorderRadius getBUTTON() {
        return BUTTON;
    }

    @NotNull
    public final BorderRadius getFORM() {
        return FORM;
    }
}
