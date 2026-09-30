package K9;

import okhttp3.internal.ws.WebSocketProtocol;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a[] purple;
    public final int alpha;

    static {
        a[] aVarArr = {new a("PICTURE", 0, 1000), new a("IQAMA", 1, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), new a("DRIVING_LICENSES", 2, 1002), new a("CAR_LICENSES", 3, 1003)};
        purple = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public a(String str, int i4, int i5) {
        this.alpha = i5;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) purple.clone();
    }
}
