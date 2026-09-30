package Hc;

import zendesk.support.RequestStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RequestStatus.values().length];
        try {
            iArr[RequestStatus.New.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestStatus.Open.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequestStatus.Pending.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequestStatus.Hold.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequestStatus.Solved.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RequestStatus.Closed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
