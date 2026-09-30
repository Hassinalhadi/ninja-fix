package Yb;

import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class as {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[TaskType.values().length];
        try {
            iArr[TaskType.RETURNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaskType.RETURN_TO_AREA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[TaskStatus.values().length];
        try {
            iArr2[TaskStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TaskStatus.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
