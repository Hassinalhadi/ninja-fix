package com.clevertap.android.sdk.inapp.customtemplates.system;

import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/system/SystemTemplates;", "", "<init>", "()V", "getSystemTemplates", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "systemActionHandler", "Lcom/clevertap/android/sdk/inapp/InAppActionHandler;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemTemplates {

    @NotNull
    public static final SystemTemplates INSTANCE = new SystemTemplates();

    private SystemTemplates() {
    }

    @NotNull
    public final Set<CustomTemplate> getSystemTemplates(@NotNull InAppActionHandler systemActionHandler) {
        Intrinsics.echo(systemActionHandler, "systemActionHandler");
        CustomTemplate[] customTemplateArr = {OpenUrlTemplate.INSTANCE.createTemplate(systemActionHandler), PlayStoreAppRatingTemplate.INSTANCE.createTemplate(systemActionHandler), PushPermissionTemplate.INSTANCE.createTemplate(systemActionHandler)};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i4 = 0; i4 < 3; i4++) {
            CustomTemplate customTemplate = customTemplateArr[i4];
            if (customTemplate != null) {
                linkedHashSet.add(customTemplate);
            }
        }
        return linkedHashSet;
    }
}
