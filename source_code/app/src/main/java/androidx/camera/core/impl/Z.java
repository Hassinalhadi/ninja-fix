package androidx.camera.core.impl;

import android.util.Range;

/* loaded from: classes3.dex */
public interface Z extends bf.j, an {
    public static final C0505c amber;
    public static final C0505c azure;
    public static final C0505c beige;
    public static final C0505c black;
    public static final C0505c blue;
    public static final C0505c uniform = new C0505c("camerax.core.useCase.defaultSessionConfig", P.class, null);
    public static final C0505c victor = new C0505c("camerax.core.useCase.defaultCaptureConfig", ad.class, null);
    public static final C0505c whiskey = new C0505c("camerax.core.useCase.sessionConfigUnpacker", av.y.class, null);
    public static final C0505c xray = new C0505c("camerax.core.useCase.captureConfigUnpacker", av.x.class, null);
    public static final C0505c yankee;
    public static final C0505c zulu;

    static {
        Class cls = Integer.TYPE;
        yankee = new C0505c("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        zulu = new C0505c("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        amber = new C0505c("camerax.core.useCase.zslDisabled", cls2, null);
        azure = new C0505c("camerax.core.useCase.highResolutionDisabled", cls2, null);
        beige = new C0505c("camerax.core.useCase.captureType", b0.class, null);
        black = new C0505c("camerax.core.useCase.previewStabilizationMode", cls, null);
        blue = new C0505c("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    P azure();

    b0 emerald();

    int fuchsia();

    int lime();

    Range november();

    boolean orange();

    P tango();

    int uniform();

    av.y victor();

    boolean xray();
}
