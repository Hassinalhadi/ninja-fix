package aw;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.view.inputmethod.EditorBoundsInfo;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key bravo() {
        return CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
    }

    public static /* bridge */ /* synthetic */ DynamicRangeProfiles charlie(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder golf() {
        return new EditorBoundsInfo.Builder();
    }
}
