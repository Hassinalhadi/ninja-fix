package com.checkout.address.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.ui.edit.AddressEditActivity;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.utils.ExtensionsKt;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0005\u0010\nJ)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/checkout/address/utils/IntentUtils;", "", "Landroid/content/Intent;", "intent", "Lcom/checkout/address/model/AddressEditState;", "getInitialState$address_standardRelease", "(Landroid/content/Intent;)Lcom/checkout/address/model/AddressEditState;", "getInitialState", "", "buildVersion", "(Landroid/content/Intent;I)Lcom/checkout/address/model/AddressEditState;", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/model/AddressComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/interfaces/model/contact/ContactData;", "contactData", "prepareIntent$address_standardRelease", "(Landroid/content/Context;Lcom/checkout/components/interfaces/model/AddressComponentConfig;Lcom/checkout/components/interfaces/model/contact/ContactData;)Landroid/content/Intent;", "prepareIntent", "(Landroid/content/Context;Lcom/checkout/components/interfaces/model/AddressComponentConfig;Landroid/content/Intent;Lcom/checkout/components/interfaces/model/contact/ContactData;)Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "result", "getContactDataFromResult$address_standardRelease", "(Landroidx/activity/result/ActivityResult;)Lcom/checkout/components/interfaces/model/contact/ContactData;", "getContactDataFromResult", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntentUtils {
    public static final int $stable = 0;

    @NotNull
    public static final IntentUtils INSTANCE = new IntentUtils();

    private IntentUtils() {
    }

    public static /* synthetic */ Intent prepareIntent$address_standardRelease$default(IntentUtils intentUtils, Context context, AddressComponentConfig addressComponentConfig, Intent intent, ContactData contactData, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            intent = new Intent(context, (Class<?>) AddressEditActivity.class);
        }
        if ((i4 & 8) != 0) {
            contactData = null;
        }
        return intentUtils.prepareIntent$address_standardRelease(context, addressComponentConfig, intent, contactData);
    }

    @Nullable
    public final ContactData getContactDataFromResult$address_standardRelease(@NotNull ActivityResult result) {
        Intrinsics.echo(result, "result");
        Object obj = null;
        Intent intent = result.purple;
        if (intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent.getParcelableExtra(AddressEditActivity.EXTRA_KEY_CONTACT_DATA, ContactData.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra(AddressEditActivity.EXTRA_KEY_CONTACT_DATA);
            if (parcelableExtra != null) {
                obj = parcelableExtra;
            }
        }
        return (ContactData) obj;
    }

    @NotNull
    public final AddressEditState getInitialState$address_standardRelease(@NotNull Intent intent) {
        Intrinsics.echo(intent, "intent");
        return getInitialState$address_standardRelease(intent, Build.VERSION.SDK_INT);
    }

    @NotNull
    public final Intent prepareIntent$address_standardRelease(@NotNull Context context, @NotNull AddressComponentConfig config, @Nullable ContactData contactData) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        return prepareIntent$address_standardRelease(context, config, new Intent(context, (Class<?>) AddressEditActivity.class), contactData);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AddressEditState getInitialState$address_standardRelease(@NotNull Intent intent, int buildVersion) {
        Object parcelableExtra;
        Object parcelableExtra2;
        Serializable serializableExtra;
        Serializable serializableExtra2;
        LinkedHashMap linkedHashMap;
        ArrayList parcelableArrayListExtra;
        Intrinsics.echo(intent, "intent");
        List list = null;
        if (buildVersion >= 33) {
            parcelableExtra = intent.getParcelableExtra(AddressEditActivity.EXTRA_KEY_CONTACT_DATA, ContactData.class);
        } else {
            parcelableExtra = intent.getParcelableExtra(AddressEditActivity.EXTRA_KEY_CONTACT_DATA);
            if (parcelableExtra == null) {
                parcelableExtra = null;
            }
        }
        ContactData contactData = (ContactData) parcelableExtra;
        if (buildVersion >= 33) {
            parcelableExtra2 = intent.getParcelableExtra(AddressEditActivity.EXTRA_KEY_APPEARANCE, DesignTokens.class);
        } else {
            parcelableExtra2 = intent.getParcelableExtra(AddressEditActivity.EXTRA_KEY_APPEARANCE);
            if (parcelableExtra2 == null) {
                parcelableExtra2 = null;
            }
        }
        DesignTokens designTokens = (DesignTokens) parcelableExtra2;
        if (buildVersion >= 33) {
            serializableExtra = intent.getSerializableExtra(AddressEditActivity.EXTRA_KEY_LOCALE, Locale.class);
        } else {
            serializableExtra = intent.getSerializableExtra(AddressEditActivity.EXTRA_KEY_LOCALE);
            if (serializableExtra == null) {
                serializableExtra = null;
            }
        }
        Locale locale = (Locale) serializableExtra;
        if (locale == null) {
            locale = ExtensionsKt.mapToLocale(com.checkout.components.interfaces.utils.Constants.INSTANCE.getDEFAULT_LOCALE());
        }
        Locale locale2 = locale;
        if (buildVersion >= 33) {
            serializableExtra2 = intent.getSerializableExtra(AddressEditActivity.EXTRA_KEY_TRANSLATION, HashMap.class);
        } else {
            serializableExtra2 = intent.getSerializableExtra(AddressEditActivity.EXTRA_KEY_TRANSLATION);
            if (serializableExtra2 == null) {
                serializableExtra2 = null;
            }
        }
        HashMap hashMap = (HashMap) serializableExtra2;
        if (hashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getKey() instanceof ComponentTranslationKey) && (entry.getValue() instanceof String)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(y.quebec(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                Intrinsics.charlie(key, "null cannot be cast to non-null type com.checkout.components.interfaces.localisation.ComponentTranslationKey");
                linkedHashMap3.put((ComponentTranslationKey) key, entry2.getValue());
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(y.quebec(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                Object key2 = entry3.getKey();
                Object value = entry3.getValue();
                Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap4.put(key2, (String) value);
            }
            if (!linkedHashMap4.isEmpty()) {
                linkedHashMap = linkedHashMap4;
                if (buildVersion < 33) {
                    parcelableArrayListExtra = intent.getParcelableArrayListExtra(AddressEditActivity.EXTRA_KEY_FIELDS, AddressField.class);
                    if (parcelableArrayListExtra != null) {
                        list = CollectionsKt.z(parcelableArrayListExtra);
                    }
                } else {
                    ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(AddressEditActivity.EXTRA_KEY_FIELDS);
                    if (parcelableArrayListExtra2 != null) {
                        list = CollectionsKt.z(parcelableArrayListExtra2);
                    }
                }
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                return new AddressEditState(list, locale2, designTokens, linkedHashMap, contactData);
            }
        }
        linkedHashMap = null;
        if (buildVersion < 33) {
        }
        if (list == null) {
        }
        return new AddressEditState(list, locale2, designTokens, linkedHashMap, contactData);
    }

    @NotNull
    public final Intent prepareIntent$address_standardRelease(@NotNull Context context, @NotNull AddressComponentConfig config, @NotNull Intent intent, @Nullable ContactData contactData) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(intent, "intent");
        ComponentName.Address name = config.getName();
        intent.putExtra(AddressEditActivity.EXTRA_KEY_CONTACT_DATA, contactData);
        intent.putExtra(AddressEditActivity.EXTRA_KEY_LOCALE, config.getLocale());
        Map<ComponentTranslationKey, String> translation = config.getTranslation();
        intent.putExtra(AddressEditActivity.EXTRA_KEY_TRANSLATION, translation != null ? new HashMap(translation) : null);
        intent.putExtra(AddressEditActivity.EXTRA_KEY_APPEARANCE, config.getAppearance());
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.addAll(name.getConfiguration().getFields());
        intent.putParcelableArrayListExtra(AddressEditActivity.EXTRA_KEY_FIELDS, arrayList);
        return intent;
    }
}
