package com.incognia.internal;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: W, reason: collision with root package name */
    public final WallpaperManager f10347W;

    /* renamed from: b, reason: collision with root package name */
    public final KDK f10348b;

    public e2(Context context, KDK kdk) {
        this.f10348b = kdk;
        this.f10347W = WallpaperManager.getInstance(context);
    }

    public final Integer W() {
        int wallpaperId;
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            try {
                wallpaperId = this.f10347W.getWallpaperId(1);
                return Integer.valueOf(wallpaperId);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final String b() {
        String str = null;
        if (CnH.b(CnH.f8484b, 0, 32, 1) && this.f10348b.b("android.permission.READ_EXTERNAL_STORAGE")) {
            try {
                Drawable drawable = this.f10347W.getDrawable();
                if (drawable != null) {
                    str = sq.b(drawable);
                }
            } catch (Throwable unused) {
            }
            this.f10347W.forgetLoadedWallpaper();
        }
        return str;
    }
}
