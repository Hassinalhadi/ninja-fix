package Fc;

import com.app.network.network.models.AppState;
import com.app.network.network.models.UpdateActions;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ag {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
        int[] iArr2 = new int[AppState.values().length];
        try {
            iArr2[AppState.REGISTERING_DEVICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AppState.DEVICE_REGISTERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AppState.CAPTAIN_NOT_LOGGED_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AppState.CAPTAIN_LOGGED_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AppState.CAPTAIN_LOGGED_IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[AppState.DEVICE_INFO_UPDATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[AppState.NO_LOCATION_PERMISSION.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[AppState.ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
