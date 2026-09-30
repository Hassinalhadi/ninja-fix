package L;

import com.clevertap.android.sdk.network.api.DefineTemplatesRequestBodyKt;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Collection purple;

    public /* synthetic */ b(int i4, Collection collection) {
        this.alpha = i4;
        this.purple = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(this.purple.contains(obj));
            case 1:
                return Boolean.valueOf(this.purple.contains(obj));
            case 2:
                return Boolean.valueOf(((List) obj).retainAll(this.purple));
            case 3:
                return Boolean.valueOf(this.purple.contains(obj));
            default:
                return DefineTemplatesRequestBodyKt.alpha(this.purple, (JSONObject) obj);
        }
    }
}
