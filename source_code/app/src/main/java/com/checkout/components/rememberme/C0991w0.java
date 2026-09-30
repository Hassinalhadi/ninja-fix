package com.checkout.components.rememberme;

import com.checkout.components.rememberme.model.RememberMeScreen;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.checkout.components.rememberme.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0991w0 {
    @NotNull
    public final KSerializer serializer() {
        Lazy lazy;
        lazy = RememberMeScreen.f6068a;
        return (KSerializer) lazy.getValue();
    }
}
