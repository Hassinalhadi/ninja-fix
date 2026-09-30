package at;

import J2.e;
import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class b {
    public static e alpha(Context context, Object obj, LinkedHashSet linkedHashSet) {
        try {
            return new e(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
