package B2;

import android.content.Context;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.InAppFCManager;
import com.clevertap.android.sdk.inapp.InAppNotificationInflater;
import com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategyExecutors;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromInputStreamSync;
        Void lambda$messageDidShow$12;
        switch (this.alpha) {
            case 0:
                WorkDatabase workDatabase = ((f) this.purple).echo;
                J2.t victor = workDatabase.victor();
                String str = (String) this.silver;
                ((ArrayList) this.red).addAll(victor.papa(str));
                return workDatabase.uniform().hotel(str);
            case 1:
                J7.f fVar = (J7.f) this.purple;
                int i4 = 8;
                return fVar.alpha.submit(new A8.g(i4, (Callable) this.red, (D8.c) this.silver));
            case 2:
                fromInputStreamSync = LottieCompositionFactory.fromInputStreamSync((Context) this.purple, (InputStream) this.red, (String) this.silver);
                return fromInputStreamSync;
            case 3:
                lambda$messageDidShow$12 = ((CleverTapAPI) this.purple).lambda$messageDidShow$12((CTInboxMessage) this.red, (Bundle) this.silver);
                return lambda$messageDidShow$12;
            case 4:
                return InAppFCManager.alpha((InAppFCManager) this.purple, (String) this.silver, (Context) this.red);
            case 5:
                return InAppNotificationInflater.bravo((JSONObject) this.purple, (InAppNotificationInflater) this.red, (WeakReference) this.silver);
            default:
                return FileCleanupStrategyExecutors.alpha((FileCleanupStrategyExecutors) this.purple, (String) this.silver, (Function1) this.red);
        }
    }

    public /* synthetic */ e(Object obj, String str, Object obj2, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.silver = str;
        this.red = obj2;
    }
}
