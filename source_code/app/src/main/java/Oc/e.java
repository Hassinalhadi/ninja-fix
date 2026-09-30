package Oc;

import com.app.network.network.models.tickets.ActorType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ActorType.values().length];
        try {
            iArr[ActorType.ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActorType.CAPTAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
