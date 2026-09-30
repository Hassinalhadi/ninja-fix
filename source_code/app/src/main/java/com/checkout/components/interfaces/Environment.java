package com.checkout.components.interfaces;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/interfaces/Environment;", "", "<init>", "(Ljava/lang/String;I)V", "SANDBOX", "PRODUCTION", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class Environment {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment SANDBOX = new Environment("SANDBOX", 0);
    public static final Environment PRODUCTION = new Environment("PRODUCTION", 1);

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{SANDBOX, PRODUCTION};
    }

    static {
        Environment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private Environment(String str, int i4) {
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }
}
