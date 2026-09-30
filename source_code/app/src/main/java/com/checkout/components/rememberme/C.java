package com.checkout.components.rememberme;

import com.checkout.components.rememberme.utils.JWTTokenEncoder$Payload$$serializer;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class C {
    @NotNull
    public final KSerializer serializer() {
        return JWTTokenEncoder$Payload$$serializer.INSTANCE;
    }
}
