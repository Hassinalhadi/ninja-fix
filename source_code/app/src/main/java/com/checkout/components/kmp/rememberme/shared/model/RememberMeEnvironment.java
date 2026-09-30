package com.checkout.components.kmp.rememberme.shared.model;

import Qd.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "SANDBOX", "PROD", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberMeEnvironment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RememberMeEnvironment[] $VALUES;
    public static final RememberMeEnvironment SANDBOX = new RememberMeEnvironment("SANDBOX", 0);
    public static final RememberMeEnvironment PROD = new RememberMeEnvironment("PROD", 1);

    private static final /* synthetic */ RememberMeEnvironment[] $values() {
        return new RememberMeEnvironment[]{SANDBOX, PROD};
    }

    static {
        RememberMeEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private RememberMeEnvironment(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RememberMeEnvironment valueOf(String str) {
        return (RememberMeEnvironment) Enum.valueOf(RememberMeEnvironment.class, str);
    }

    public static RememberMeEnvironment[] values() {
        return (RememberMeEnvironment[]) $VALUES.clone();
    }
}
