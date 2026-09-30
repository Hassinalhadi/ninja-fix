package com.clevertap.android.sdk.inapp.evaluation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "", "operatorValue", "", "<init>", "(Ljava/lang/String;II)V", "getOperatorValue", "()I", "GreaterThan", "Equals", "LessThan", "Contains", "Between", "NotEquals", "Set", "NotSet", "NotContains", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriggerOperator {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ TriggerOperator[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int operatorValue;
    public static final TriggerOperator GreaterThan = new TriggerOperator("GreaterThan", 0, 0);
    public static final TriggerOperator Equals = new TriggerOperator("Equals", 1, 1);
    public static final TriggerOperator LessThan = new TriggerOperator("LessThan", 2, 2);
    public static final TriggerOperator Contains = new TriggerOperator("Contains", 3, 3);
    public static final TriggerOperator Between = new TriggerOperator("Between", 4, 4);
    public static final TriggerOperator NotEquals = new TriggerOperator("NotEquals", 5, 15);
    public static final TriggerOperator Set = new TriggerOperator("Set", 6, 26);
    public static final TriggerOperator NotSet = new TriggerOperator("NotSet", 7, 27);
    public static final TriggerOperator NotContains = new TriggerOperator("NotContains", 8, 28);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator$Companion;", "", "<init>", "()V", "fromOperatorValue", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "operatorValue", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TriggerOperator fromOperatorValue(int operatorValue) {
            TriggerOperator triggerOperator;
            TriggerOperator[] values = TriggerOperator.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    triggerOperator = values[i4];
                    if (triggerOperator.getOperatorValue() == operatorValue) {
                        break;
                    }
                    i4++;
                } else {
                    triggerOperator = null;
                    break;
                }
            }
            if (triggerOperator == null) {
                return TriggerOperator.Equals;
            }
            return triggerOperator;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TriggerOperator[] $values() {
        return new TriggerOperator[]{GreaterThan, Equals, LessThan, Contains, Between, NotEquals, Set, NotSet, NotContains};
    }

    static {
        TriggerOperator[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private TriggerOperator(String str, int i4, int i5) {
        this.operatorValue = i5;
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static TriggerOperator valueOf(String str) {
        return (TriggerOperator) Enum.valueOf(TriggerOperator.class, str);
    }

    public static TriggerOperator[] values() {
        return (TriggerOperator[]) $VALUES.clone();
    }

    public final int getOperatorValue() {
        return this.operatorValue;
    }
}
