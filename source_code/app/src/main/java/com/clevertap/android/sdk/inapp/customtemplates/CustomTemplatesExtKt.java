package com.clevertap.android.sdk.inapp.customtemplates;

import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "templates", "", "templatesSet", "([Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;)Ljava/util/Set;", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$TemplateBuilder;", "", "buildBlock", "template", "(Lkotlin/jvm/functions/Function1;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "", "isVisual", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate$FunctionBuilder;", "function", "(ZLkotlin/jvm/functions/Function1;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTemplatesExtKt {
    @NotNull
    public static final CustomTemplate function(boolean z2, @NotNull Function1<? super CustomTemplate.FunctionBuilder, Unit> buildBlock) {
        Intrinsics.echo(buildBlock, "buildBlock");
        CustomTemplate.FunctionBuilder functionBuilder = new CustomTemplate.FunctionBuilder(z2);
        buildBlock.invoke(functionBuilder);
        return functionBuilder.build();
    }

    @NotNull
    public static final CustomTemplate template(@NotNull Function1<? super CustomTemplate.TemplateBuilder, Unit> buildBlock) {
        Intrinsics.echo(buildBlock, "buildBlock");
        CustomTemplate.TemplateBuilder templateBuilder = new CustomTemplate.TemplateBuilder();
        buildBlock.invoke(templateBuilder);
        return templateBuilder.build();
    }

    @NotNull
    public static final Set<CustomTemplate> templatesSet(@NotNull CustomTemplate... templates) {
        Intrinsics.echo(templates, "templates");
        Object[] elements = Arrays.copyOf(templates, templates.length);
        Intrinsics.echo(elements, "elements");
        return ArraysKt.g(elements);
    }
}
