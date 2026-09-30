package Jb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.compose.runtime.C0564b;
import com.checkout.components.address.AbstractC0870k;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import g1.AbstractC1735d;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t6.X2;

/* renamed from: Jb.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0201i implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;

    public /* synthetic */ C0201i(Context context, int i4) {
        this.alpha = i4;
        this.purple = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        Context context = this.purple;
        switch (this.alpha) {
            case 0:
                try {
                    context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 1:
                context.startActivity(new Intent(context, (Class<?>) AreaListingActivityV2.class));
                return Unit.INSTANCE;
            case 2:
                Bitmap.Config[] configArr = a3.h.alpha;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                throw new IllegalStateException("cacheDir == null");
            case 3:
                Bitmap.Config[] configArr2 = a3.h.alpha;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 != null) {
                    cacheDir2.mkdirs();
                    return cacheDir2;
                }
                throw new IllegalStateException("cacheDir == null");
            case 4:
                return X2.alpha(context);
            case 5:
                return AbstractC0870k.a(context);
            default:
                if (AbstractC1735d.alpha(context, "android.permission.CAMERA") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return C0564b.zulu(Boolean.valueOf(z2));
        }
    }
}
