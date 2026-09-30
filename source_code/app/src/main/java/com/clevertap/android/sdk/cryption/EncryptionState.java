package com.clevertap.android.sdk.cryption;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionState;", "", "<init>", "(Ljava/lang/String;I)V", "ENCRYPTED_AES", "ENCRYPTED_AES_GCM", "PLAIN_TEXT", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EncryptionState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EncryptionState[] $VALUES;
    public static final EncryptionState ENCRYPTED_AES = new EncryptionState("ENCRYPTED_AES", 0);
    public static final EncryptionState ENCRYPTED_AES_GCM = new EncryptionState("ENCRYPTED_AES_GCM", 1);
    public static final EncryptionState PLAIN_TEXT = new EncryptionState("PLAIN_TEXT", 2);

    private static final /* synthetic */ EncryptionState[] $values() {
        return new EncryptionState[]{ENCRYPTED_AES, ENCRYPTED_AES_GCM, PLAIN_TEXT};
    }

    static {
        EncryptionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private EncryptionState(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static EncryptionState valueOf(String str) {
        return (EncryptionState) Enum.valueOf(EncryptionState.class, str);
    }

    public static EncryptionState[] values() {
        return (EncryptionState[]) $VALUES.clone();
    }
}
