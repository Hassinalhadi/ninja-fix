package com.clevertap.android.sdk.inapp.customtemplates;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgument;", "", "name", "", Constants.KEY_TYPE, "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "getDefaultValue", "()Ljava/lang/Object;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TemplateArgument {

    @Nullable
    private final Object defaultValue;

    @NotNull
    private final String name;

    @NotNull
    private final TemplateArgumentType type;

    public TemplateArgument(@NotNull String name, @NotNull TemplateArgumentType type, @Nullable Object obj) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(type, "type");
        this.name = name;
        this.type = type;
        this.defaultValue = obj;
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final TemplateArgumentType getType() {
        return this.type;
    }
}
