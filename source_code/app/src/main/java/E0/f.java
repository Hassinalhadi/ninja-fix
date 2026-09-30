package E0;

import android.graphics.Shader;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ Shader.TileMode echo() {
        return Shader.TileMode.DECAL;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder juliet(AutofillId autofillId, long j5) {
        return new ViewTranslationRequest.Builder(autofillId, j5);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse lima(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void papa() {
    }
}
