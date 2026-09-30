package Yb;

import com.app.network.network.models.TaskStatus;
import com.app.network.network.models.TaskType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class G0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[TaskType.values().length];
        try {
            iArr[TaskType.PICK_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaskType.ON_DEMAND_PICK_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaskType.DELIVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaskType.RETURNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TaskType.RETURN_TO_AREA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[TaskStatus.values().length];
        try {
            iArr2[TaskStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TaskStatus.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TaskStatus.AT_DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TaskStatus.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TaskStatus.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
