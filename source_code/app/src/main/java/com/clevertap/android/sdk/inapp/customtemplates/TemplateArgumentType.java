package com.clevertap.android.sdk.inapp.customtemplates;

import Qd.a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "", "stringName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "STRING", "BOOLEAN", "NUMBER", "FILE", "ACTION", "toString", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TemplateArgumentType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TemplateArgumentType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String stringName;
    public static final TemplateArgumentType STRING = new TemplateArgumentType("STRING", 0, CTVariableUtils.STRING);
    public static final TemplateArgumentType BOOLEAN = new TemplateArgumentType("BOOLEAN", 1, CTVariableUtils.BOOLEAN);
    public static final TemplateArgumentType NUMBER = new TemplateArgumentType("NUMBER", 2, CTVariableUtils.NUMBER);
    public static final TemplateArgumentType FILE = new TemplateArgumentType("FILE", 3, CTVariableUtils.FILE);
    public static final TemplateArgumentType ACTION = new TemplateArgumentType("ACTION", 4, Constants.KEY_ACTION);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType$Companion;", "", "<init>", "()V", "fromString", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", CTVariableUtils.STRING, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TemplateArgumentType fromString(@NotNull String string) {
            Intrinsics.echo(string, "string");
            for (TemplateArgumentType templateArgumentType : TemplateArgumentType.values()) {
                if (Intrinsics.areEqual(templateArgumentType.stringName, string)) {
                    return templateArgumentType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TemplateArgumentType[] $values() {
        return new TemplateArgumentType[]{STRING, BOOLEAN, NUMBER, FILE, ACTION};
    }

    static {
        TemplateArgumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private TemplateArgumentType(String str, int i4, String str2) {
        this.stringName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TemplateArgumentType valueOf(String str) {
        return (TemplateArgumentType) Enum.valueOf(TemplateArgumentType.class, str);
    }

    public static TemplateArgumentType[] values() {
        return (TemplateArgumentType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.stringName;
    }
}
