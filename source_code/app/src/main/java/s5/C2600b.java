package s5;

import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.system.OpenUrlTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.system.PlayStoreAppRatingTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.system.PushPermissionTemplate;
import kotlin.jvm.functions.Function1;

/* renamed from: s5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2600b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InAppActionHandler purple;

    public /* synthetic */ C2600b(InAppActionHandler inAppActionHandler, int i4) {
        this.alpha = i4;
        this.purple = inAppActionHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return OpenUrlTemplate.bravo(this.purple, (CustomTemplate.FunctionBuilder) obj);
            case 1:
                return PlayStoreAppRatingTemplate.alpha(this.purple, (CustomTemplate.FunctionBuilder) obj);
            default:
                return PushPermissionTemplate.alpha(this.purple, (CustomTemplate.FunctionBuilder) obj);
        }
    }
}
