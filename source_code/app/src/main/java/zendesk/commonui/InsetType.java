package zendesk.commonui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/commonui/InsetType;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "HORIZONTAL", "common-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InsetType {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ InsetType[] $VALUES;
    public static final InsetType TOP = new InsetType("TOP", 0);
    public static final InsetType BOTTOM = new InsetType("BOTTOM", 1);
    public static final InsetType HORIZONTAL = new InsetType("HORIZONTAL", 2);

    private static final /* synthetic */ InsetType[] $values() {
        return new InsetType[]{TOP, BOTTOM, HORIZONTAL};
    }

    static {
        InsetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
    }

    private InsetType(String str, int i4) {
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static InsetType valueOf(String str) {
        return (InsetType) Enum.valueOf(InsetType.class, str);
    }

    public static InsetType[] values() {
        return (InsetType[]) $VALUES.clone();
    }
}
