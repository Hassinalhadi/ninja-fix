package K9;

import okhttp3.internal.ws.WebSocketProtocol;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ b[] purple;
    public final int alpha;

    static {
        b[] bVarArr = {new b("BUILDING", 0, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), new b("LAND_MARK", 1, 1002)};
        purple = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public b(String str, int i4, int i5) {
        this.alpha = i5;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) purple.clone();
    }
}
