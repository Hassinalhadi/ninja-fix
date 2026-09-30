package va;

import com.app.network.network.models.UpdateActions;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[UpdateActions.values().length];
        try {
            iArr[UpdateActions.NO_UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpdateActions.RECOMMENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpdateActions.FORCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
