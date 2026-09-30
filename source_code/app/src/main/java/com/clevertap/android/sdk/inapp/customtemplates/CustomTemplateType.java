package com.clevertap.android.sdk.inapp.customtemplates;

import Qd.a;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "", "stringName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TEMPLATE", "FUNCTION", "toString", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTemplateType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CustomTemplateType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String stringName;
    public static final CustomTemplateType TEMPLATE = new CustomTemplateType("TEMPLATE", 0, "template");
    public static final CustomTemplateType FUNCTION = new CustomTemplateType("FUNCTION", 1, "function");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType$Companion;", "", "<init>", "()V", "fromString", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", CTVariableUtils.STRING, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CustomTemplateType fromString(@NotNull String string) {
            Intrinsics.echo(string, "string");
            for (CustomTemplateType customTemplateType : CustomTemplateType.values()) {
                if (Intrinsics.areEqual(customTemplateType.stringName, string)) {
                    return customTemplateType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CustomTemplateType[] $values() {
        return new CustomTemplateType[]{TEMPLATE, FUNCTION};
    }

    static {
        CustomTemplateType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private CustomTemplateType(String str, int i4, String str2) {
        this.stringName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CustomTemplateType valueOf(String str) {
        return (CustomTemplateType) Enum.valueOf(CustomTemplateType.class, str);
    }

    public static CustomTemplateType[] values() {
        return (CustomTemplateType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.stringName;
    }
}
