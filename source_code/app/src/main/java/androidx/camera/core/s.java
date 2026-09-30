package androidx.camera.core;

import android.os.Handler;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.C0505c;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class s implements bf.j {
    public final androidx.camera.core.impl.B alpha;
    public static final C0505c purple = new C0505c("camerax.core.appConfig.cameraFactoryProvider", at.a.class, null);
    public static final C0505c red = new C0505c("camerax.core.appConfig.deviceSurfaceManagerProvider", at.b.class, null);
    public static final C0505c silver = new C0505c("camerax.core.appConfig.useCaseConfigFactoryProvider", at.c.class, null);
    public static final C0505c teal = new C0505c("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final C0505c white = new C0505c("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final C0505c yellow = new C0505c("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* renamed from: a, reason: collision with root package name */
    public static final C0505c f2955a = new C0505c("camerax.core.appConfig.availableCamerasLimiter", C0533o.class, null);

    /* renamed from: b, reason: collision with root package name */
    public static final C0505c f2956b = new C0505c("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* renamed from: c, reason: collision with root package name */
    public static final C0505c f2957c = new C0505c("camerax.core.appConfig.cameraProviderInitRetryPolicy", C.class, null);

    /* renamed from: d, reason: collision with root package name */
    public static final C0505c f2958d = new C0505c("camerax.core.appConfig.quirksSettings", androidx.camera.core.impl.E.class, null);

    public s(androidx.camera.core.impl.B b2) {
        this.alpha = b2;
    }

    public final C0533o alpha() {
        Object obj;
        try {
            obj = this.alpha.quebec(f2955a);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (C0533o) obj;
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ Set beige(C0505c c0505c) {
        return P0.juliet(this, c0505c);
    }

    @Override // bf.j
    public final /* synthetic */ String blue(String str) {
        throw null;
    }

    public final at.a bravo() {
        Object obj;
        try {
            obj = this.alpha.quebec(purple);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (at.a) obj;
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ void charlie(A2.ao aoVar) {
        P0.echo(this, aoVar);
    }

    public final long delta() {
        C0505c c0505c = f2956b;
        Object obj = -1L;
        androidx.camera.core.impl.B b2 = this.alpha;
        b2.getClass();
        try {
            obj = b2.quebec(c0505c);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) obj).longValue();
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ boolean echo(C0505c c0505c) {
        return P0.alpha(this, c0505c);
    }

    public final at.b foxtrot() {
        Object obj;
        try {
            obj = this.alpha.quebec(red);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (at.b) obj;
    }

    @Override // androidx.camera.core.impl.H
    public final androidx.camera.core.impl.af getConfig() {
        return this.alpha;
    }

    @Override // bf.j
    public final /* synthetic */ String green() {
        throw null;
    }

    public final at.c hotel() {
        Object obj;
        try {
            obj = this.alpha.quebec(silver);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (at.c) obj;
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ Object juliet(C0505c c0505c, androidx.camera.core.impl.ae aeVar) {
        return P0.xray(this, c0505c, aeVar);
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ androidx.camera.core.impl.ae pink(C0505c c0505c) {
        return P0.hotel(this, c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ Object plum(C0505c c0505c, Object obj) {
        return P0.whiskey(this, c0505c, obj);
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ Object quebec(C0505c c0505c) {
        return P0.victor(this, c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public final /* synthetic */ Set romeo() {
        return P0.oscar(this);
    }
}
