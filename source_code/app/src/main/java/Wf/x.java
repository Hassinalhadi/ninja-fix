package Wf;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.compose.resources.MissingResourceException;

/* loaded from: classes2.dex */
public final class x {
    public final Lazy alpha = LazyKt.lazy(new Vc.i(11));

    public final InputStream alpha(String str) {
        AssetManager assetManager;
        try {
            try {
                try {
                    Object value = this.alpha.getValue();
                    Intrinsics.delta(value, "getValue(...)");
                    InputStream open = ((AssetManager) value).open(str);
                    Intrinsics.checkNotNull(open);
                    return open;
                } catch (FileNotFoundException unused) {
                    assetManager = a.bravo().getAssets();
                    if (assetManager != null || (r0 = assetManager.open(str)) == null) {
                        throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    return r0;
                }
            } catch (NoClassDefFoundError unused2) {
                Log.d("ResourceReader", "Android Instrumentation context is not available.");
                assetManager = null;
                if (assetManager != null) {
                }
                throw new FileNotFoundException("Current AssetManager is null.");
            }
        } catch (FileNotFoundException unused3) {
            ClassLoader classLoader = x.class.getClassLoader();
            if (classLoader != null) {
                InputStream resourceAsStream = classLoader.getResourceAsStream(str);
                if (resourceAsStream == null) {
                    throw new MissingResourceException(str);
                }
                return resourceAsStream;
            }
            throw new IllegalStateException("Cannot find class loader");
        }
    }
}
