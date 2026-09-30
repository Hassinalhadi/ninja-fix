package com.clevertap.android.sdk.inapp.customtemplates.system;

import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplatesExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s5.C2599a;
import s5.C2600b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/system/PlayStoreAppRatingTemplate;", "", "<init>", "()V", "NAME", "", "createTemplate", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "systemActionHandler", "Lcom/clevertap/android/sdk/inapp/InAppActionHandler;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayStoreAppRatingTemplate {

    @NotNull
    public static final PlayStoreAppRatingTemplate INSTANCE = new PlayStoreAppRatingTemplate();

    @NotNull
    private static final String NAME = "ctsystem_apprating";

    private PlayStoreAppRatingTemplate() {
    }

    public static /* synthetic */ Unit charlie(CustomTemplateContext.FunctionContext functionContext) {
        return createTemplate$lambda$3$lambda$2$lambda$0(functionContext);
    }

    public static final Unit createTemplate$lambda$3(InAppActionHandler systemActionHandler, CustomTemplate.FunctionBuilder function) {
        Intrinsics.echo(systemActionHandler, "$systemActionHandler");
        Intrinsics.echo(function, "$this$function");
        function.setSystemDefined$clevertap_core_release(true);
        function.name(NAME);
        function.presenter(new C2599a(systemActionHandler, 1));
        return Unit.INSTANCE;
    }

    public static final void createTemplate$lambda$3$lambda$2(InAppActionHandler systemActionHandler, CustomTemplateContext.FunctionContext templateContext) {
        Intrinsics.echo(systemActionHandler, "$systemActionHandler");
        Intrinsics.echo(templateContext, "templateContext");
        systemActionHandler.launchPlayStoreReviewFlow(new n(20, templateContext), new Y(12, templateContext));
    }

    public static final Unit createTemplate$lambda$3$lambda$2$lambda$0(CustomTemplateContext.FunctionContext templateContext) {
        Intrinsics.echo(templateContext, "$templateContext");
        templateContext.setPresented();
        templateContext.setDismissed();
        return Unit.INSTANCE;
    }

    public static final Unit createTemplate$lambda$3$lambda$2$lambda$1(CustomTemplateContext.FunctionContext templateContext, Exception exc) {
        Intrinsics.echo(templateContext, "$templateContext");
        templateContext.setDismissed();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit delta(CustomTemplateContext.FunctionContext functionContext, Exception exc) {
        return createTemplate$lambda$3$lambda$2$lambda$1(functionContext, exc);
    }

    @Nullable
    public final CustomTemplate createTemplate(@NotNull InAppActionHandler systemActionHandler) {
        Intrinsics.echo(systemActionHandler, "systemActionHandler");
        if (!systemActionHandler.isPlayStoreReviewLibraryAvailable()) {
            return null;
        }
        return CustomTemplatesExtKt.function(true, new C2600b(systemActionHandler, 1));
    }
}
