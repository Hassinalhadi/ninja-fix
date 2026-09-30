package com.clevertap.android.sdk.cryption;

import Qd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "NONE", "MEDIUM", "intValue", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EncryptionLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EncryptionLevel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int value;
    public static final EncryptionLevel NONE = new EncryptionLevel("NONE", 0, 0);
    public static final EncryptionLevel MEDIUM = new EncryptionLevel("MEDIUM", 1, 1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionLevel$Companion;", "", "<init>", "()V", "fromInt", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "value", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EncryptionLevel fromInt(int value) {
            EncryptionLevel encryptionLevel;
            EncryptionLevel[] values = EncryptionLevel.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    encryptionLevel = values[i4];
                    if (encryptionLevel.value == value) {
                        break;
                    }
                    i4++;
                } else {
                    encryptionLevel = null;
                    break;
                }
            }
            if (encryptionLevel == null) {
                return EncryptionLevel.NONE;
            }
            return encryptionLevel;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EncryptionLevel[] $values() {
        return new EncryptionLevel[]{NONE, MEDIUM};
    }

    static {
        EncryptionLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private EncryptionLevel(String str, int i4, int i5) {
        this.value = i5;
    }

    @NotNull
    public static final EncryptionLevel fromInt(int i4) {
        return INSTANCE.fromInt(i4);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static EncryptionLevel valueOf(String str) {
        return (EncryptionLevel) Enum.valueOf(EncryptionLevel.class, str);
    }

    public static EncryptionLevel[] values() {
        return (EncryptionLevel[]) $VALUES.clone();
    }

    /* renamed from: intValue, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
