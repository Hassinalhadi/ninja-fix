package com.clevertap.android.sdk.inapp.customtemplates.system;

import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplatesExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s5.C2599a;
import s5.C2600b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/system/PushPermissionTemplate;", "", "<init>", "()V", "NAME", "", "FALLBACK_TO_SETTINGS_ARG", "createTemplate", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "systemActionHandler", "Lcom/clevertap/android/sdk/inapp/InAppActionHandler;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushPermissionTemplate {

    @NotNull
    private static final String FALLBACK_TO_SETTINGS_ARG = "fbSettings";

    @NotNull
    public static final PushPermissionTemplate INSTANCE = new PushPermissionTemplate();

    @NotNull
    private static final String NAME = "ctsystem_pushpermission";

    private PushPermissionTemplate() {
    }

    public static final Unit createTemplate$lambda$1(InAppActionHandler systemActionHandler, CustomTemplate.FunctionBuilder function) {
        Intrinsics.echo(systemActionHandler, "$systemActionHandler");
        Intrinsics.echo(function, "$this$function");
        function.setSystemDefined$clevertap_core_release(true);
        function.name(NAME);
        function.booleanArgument("fbSettings", false);
        function.presenter(new C2599a(systemActionHandler, 2));
        return Unit.INSTANCE;
    }

    public static final void createTemplate$lambda$1$lambda$0(InAppActionHandler systemActionHandler, CustomTemplateContext.FunctionContext templateContext) {
        Intrinsics.echo(systemActionHandler, "$systemActionHandler");
        Intrinsics.echo(templateContext, "templateContext");
        if (systemActionHandler.launchPushPermissionPrompt(Intrinsics.areEqual(templateContext.getBoolean("fbSettings"), Boolean.TRUE))) {
            templateContext.setPresented();
        }
        templateContext.setDismissed();
    }

    @NotNull
    public final CustomTemplate createTemplate(@NotNull InAppActionHandler systemActionHandler) {
        Intrinsics.echo(systemActionHandler, "systemActionHandler");
        return CustomTemplatesExtKt.function(true, new C2600b(systemActionHandler, 2));
    }
}
