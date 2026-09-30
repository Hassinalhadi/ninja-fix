package i2;

import android.adservices.measurement.MeasurementManager;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ Class amber() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class azure() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class beige() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class black() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager golf(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class mike() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean victor(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class yankee() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class zulu() {
        return DeleteRangeGesture.class;
    }
}
