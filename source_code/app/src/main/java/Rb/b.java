package Rb;

import com.app.network.network.models.TaskType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TaskType.values().length];
        try {
            iArr[TaskType.DELIVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaskType.RETURN_TO_AREA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
