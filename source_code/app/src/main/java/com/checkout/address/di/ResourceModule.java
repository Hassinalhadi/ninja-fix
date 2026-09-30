package com.checkout.address.di;

import android.content.Context;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\fH\u0007J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\fH\u0007¨\u0006\u000f"}, d2 = {"Lcom/checkout/address/di/ResourceModule;", "", "<init>", "()V", "provideResourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "context", "Landroid/content/Context;", "translation", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "provideFormResourceProvider", "Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourceModule {
    public static final int $stable = 0;

    @NotNull
    public final CountryPickerResourceProvider provideFormResourceProvider(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> translation) {
        Intrinsics.echo(context, "context");
        return new CountryPickerResourceProvider(context, translation);
    }

    @NotNull
    public final ResourceProvider provideResourceProvider(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> translation) {
        Intrinsics.echo(context, "context");
        return new ResourceProviderImpl(context, translation);
    }
}
