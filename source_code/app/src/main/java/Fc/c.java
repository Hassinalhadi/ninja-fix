package Fc;

import com.app.network.network.models.UserIdentityStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[K9.a.values().length];
        try {
            K9.a[] aVarArr = K9.a.purple;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            K9.a[] aVarArr2 = K9.a.purple;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            K9.a[] aVarArr3 = K9.a.purple;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            K9.a[] aVarArr4 = K9.a.purple;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[UserIdentityStatus.values().length];
        try {
            iArr2[UserIdentityStatus.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UserIdentityStatus.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[UserIdentityStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[UserIdentityStatus.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
