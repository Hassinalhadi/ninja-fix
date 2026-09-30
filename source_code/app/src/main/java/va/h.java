package va;

import com.app.network.network.models.UserIdentityStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[UserIdentityStatus.values().length];
        try {
            iArr[UserIdentityStatus.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserIdentityStatus.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserIdentityStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserIdentityStatus.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
