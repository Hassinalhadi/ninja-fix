package com.checkout.components.rememberme;

import com.checkout.components.rememberme.utils.JWTTokenEncoder$Header$$serializer;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class A {
    @NotNull
    public final KSerializer serializer() {
        return JWTTokenEncoder$Header$$serializer.INSTANCE;
    }
}
