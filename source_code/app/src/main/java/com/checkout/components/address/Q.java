package com.checkout.components.address;

import com.checkout.address.ui.navigation.Screen;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Q {
    @NotNull
    public final KSerializer serializer() {
        Lazy lazy;
        lazy = Screen.f3817b;
        return (KSerializer) lazy.getValue();
    }
}
