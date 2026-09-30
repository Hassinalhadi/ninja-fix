package com.checkout.address.utils;

import androidx.annotation.Keep;
import com.checkout.components.address.R;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/checkout/address/utils/Utils;", "", "<init>", "()V", "getLabelText", "", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "isStandalone", "", "isAddressEmpty", "getFormTitle", "address", "Lcom/checkout/components/interfaces/model/contact/Address;", "getFormTitle$address_standardRelease", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Utils {
    public static final int $stable = 0;

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @NotNull
    public final String getFormTitle$address_standardRelease(@NotNull ResourceProvider resourceProvider, @Nullable Address address) {
        String str;
        int i4;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        if (address != null) {
            str = address.getAddressLine1();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            i4 = R.string.cko_address_edit_address;
        } else {
            i4 = R.string.cko_form_add_address;
        }
        return resourceProvider.getString(i4);
    }

    @NotNull
    public final String getLabelText(@NotNull ResourceProvider resourceProvider, boolean isStandalone, boolean isAddressEmpty) {
        int i4;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        if (isStandalone) {
            if (isAddressEmpty) {
                i4 = R.string.cko_form_add_address;
            } else {
                i4 = R.string.cko_form_address;
            }
        } else if (isAddressEmpty) {
            i4 = R.string.cko_address_billing_add;
        } else {
            i4 = R.string.cko_form_billing_address;
        }
        return resourceProvider.getString(i4);
    }
}
