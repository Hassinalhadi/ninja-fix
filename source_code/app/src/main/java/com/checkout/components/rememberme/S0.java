package com.checkout.components.rememberme;

import com.checkout.components.rememberme.model.SaveCardScreen;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class S0 {
    @NotNull
    public final KSerializer serializer() {
        Lazy lazy;
        lazy = SaveCardScreen.f6074a;
        return (KSerializer) lazy.getValue();
    }
}
