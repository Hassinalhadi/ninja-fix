package com.checkout.components.ui.utils;

import android.content.Context;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "context", "Landroid/content/Context;", "translation", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "getTranslationKey", "resId", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryPickerResourceProvider extends ResourceProvider {
    public static final int $stable = ResourceProvider.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryPickerResourceProvider(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> map) {
        super(context, map);
        Intrinsics.echo(context, "context");
    }

    @Override // com.checkout.components.interfaces.ui.ResourceProvider
    @Nullable
    public ComponentTranslationKey getTranslationKey(int resId) {
        if (resId == R.string.cko_form_search) {
            return ComponentTranslationKey.FormSearch;
        }
        if (resId == R.string.cko_form_no_matches_found) {
            return ComponentTranslationKey.FormNoMatchesFound;
        }
        if (resId == R.string.cko_form_try_searching_with_another_term) {
            return ComponentTranslationKey.FormTrySearchingWithAnotherTerm;
        }
        if (resId == R.string.cko_address_country_select) {
            return ComponentTranslationKey.AddressCountrySelect;
        }
        return null;
    }
}
