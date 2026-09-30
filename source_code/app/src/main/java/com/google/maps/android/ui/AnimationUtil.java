package com.google.maps.android.ui;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.maps.model.LatLng;
import z6.f;

/* loaded from: classes2.dex */
public class AnimationUtil {

    /* loaded from: classes2.dex */
    public interface LatLngInterpolator {

        /* loaded from: classes2.dex */
        public static class Linear implements LatLngInterpolator {
            @Override // com.google.maps.android.ui.AnimationUtil.LatLngInterpolator
            public LatLng interpolate(float f5, LatLng latLng, LatLng latLng2) {
                double d4 = latLng2.alpha;
                double d9 = latLng.alpha;
                double d10 = f5;
                double d11 = ((d4 - d9) * d10) + d9;
                double d12 = latLng2.purple;
                double d13 = latLng.purple;
                double d14 = d12 - d13;
                if (Math.abs(d14) > 180.0d) {
                    d14 -= Math.signum(d14) * 360.0d;
                }
                return new LatLng(d11, (d14 * d10) + d13);
            }
        }

        LatLng interpolate(float f5, LatLng latLng, LatLng latLng2);
    }

    public static void animateMarkerTo(f fVar, LatLng latLng) {
        animateMarkerTo(fVar, latLng, Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    public static void animateMarkerTo(final f fVar, final LatLng latLng, final long j5) {
        final LatLngInterpolator.Linear linear = new LatLngInterpolator.Linear();
        final LatLng bravo = fVar.bravo();
        final Handler handler = new Handler();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        handler.post(new Runnable() { // from class: com.google.maps.android.ui.AnimationUtil.1
            long elapsed;

            /* renamed from: t, reason: collision with root package name */
            float f8321t;

            /* renamed from: v, reason: collision with root package name */
            float f8322v;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                this.elapsed = uptimeMillis2;
                float f5 = ((float) uptimeMillis2) / ((float) j5);
                this.f8321t = f5;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(f5);
                this.f8322v = interpolation;
                fVar.golf(linear.interpolate(interpolation, bravo, latLng));
                if (this.f8321t < 1.0f) {
                    handler.postDelayed(this, 16L);
                }
            }
        });
    }
}
