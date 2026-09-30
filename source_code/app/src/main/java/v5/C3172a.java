package v5;

import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.network.api.DefineTemplatesRequestBodyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3172a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CustomTemplate purple;

    public /* synthetic */ C3172a(CustomTemplate customTemplate, int i4) {
        this.alpha = i4;
        this.purple = customTemplate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit jSON$lambda$6$lambda$5$lambda$4$lambda$3;
        Unit jSON$lambda$6$lambda$5$lambda$4;
        switch (this.alpha) {
            case 0:
                jSON$lambda$6$lambda$5$lambda$4$lambda$3 = DefineTemplatesRequestBodyKt.toJSON$lambda$6$lambda$5$lambda$4$lambda$3(this.purple, (JSONObject) obj);
                return jSON$lambda$6$lambda$5$lambda$4$lambda$3;
            default:
                jSON$lambda$6$lambda$5$lambda$4 = DefineTemplatesRequestBodyKt.toJSON$lambda$6$lambda$5$lambda$4(this.purple, (JSONObject) obj);
                return jSON$lambda$6$lambda$5$lambda$4;
        }
    }
}
