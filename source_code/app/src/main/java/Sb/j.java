package Sb;

import com.app.network.network.models.TaskType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TaskType.values().length];
        try {
            iArr[TaskType.PICK_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaskType.DELIVERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaskType.RETURNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaskType.RETURN_TO_AREA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
