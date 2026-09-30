package Pe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class ah {
    public static final ag alpha;
    public static final af purple;
    public static final /* synthetic */ ah[] red;

    static {
        ag agVar = new ag();
        alpha = agVar;
        af afVar = new af();
        purple = afVar;
        red = new ah[]{agVar, afVar};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) red.clone();
    }

    public abstract String alpha(String str);
}
