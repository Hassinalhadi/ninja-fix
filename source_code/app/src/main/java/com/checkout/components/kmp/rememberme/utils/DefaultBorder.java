package com.checkout.components.kmp.rememberme.utils;

import com.checkout.components.kmp.rememberme.shared.model.customization.BorderRadius;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/DefaultBorder;", "", "<init>", "()V", "FORM_RADIUS", "", "BUTTON_RADIUS", "FORM", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "getFORM", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "BUTTON", "getBUTTON", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultBorder {
    public static final int $stable = 0;
    public static final int BUTTON_RADIUS = 8;
    public static final int FORM_RADIUS = 4;

    @NotNull
    public static final DefaultBorder INSTANCE = new DefaultBorder();

    @NotNull
    private static final BorderRadius FORM = new BorderRadius(4);

    @NotNull
    private static final BorderRadius BUTTON = new BorderRadius(8);

    private DefaultBorder() {
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
