package ax;

import Q3.c;
import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.T;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import r1.InterfaceC2482a;
import t6.AbstractC3066u3;
import t6.j4;
import w.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC2482a {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ("Q2Q".equalsIgnoreCase(r2) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04e1, code lost:
    
        if (r6.toLowerCase(r5).startsWith("td1a") == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x051c, code lost:
    
        if (r6 != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0530, code lost:
    
        if (r3 != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0508, code lost:
    
        if (r6.toLowerCase(r5).startsWith("tp1a") == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ("OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if ("Q706F".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0398  */
    @Override // r1.InterfaceC2482a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i4;
        boolean z15;
        boolean z16;
        boolean z17;
        Locale locale;
        String str2;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean contains;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25 = true;
        switch (this.alpha) {
            case 0:
                E e = (E) obj;
                ArrayList arrayList = new ArrayList();
                List list = ImageCapturePixelHDRPlusQuirk.alpha;
                String str3 = Build.MODEL;
                if (list.contains(str3) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (e.alpha(ImageCapturePixelHDRPlusQuirk.class, z2)) {
                    arrayList.add(new ImageCapturePixelHDRPlusQuirk());
                }
                if (e.alpha(ExtraCroppingQuirk.class, ExtraCroppingQuirk.charlie())) {
                    arrayList.add(new ExtraCroppingQuirk());
                }
                int i5 = Nexus4AndroidLTargetAspectRatioQuirk.alpha;
                String str4 = Build.BRAND;
                "GOOGLE".equalsIgnoreCase(str4);
                if (e.alpha(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                if ((!"OnePlus".equalsIgnoreCase(str4) || !"OnePlus6".equalsIgnoreCase(Build.DEVICE)) && ((!"OnePlus".equalsIgnoreCase(str4) || !"OnePlus6T".equalsIgnoreCase(Build.DEVICE)) && ((!"HUAWEI".equalsIgnoreCase(str4) || !"HWANE".equalsIgnoreCase(Build.DEVICE)) && !ExcludedSupportedSizesQuirk.charlie() && !ExcludedSupportedSizesQuirk.bravo() && (!"REDMI".equalsIgnoreCase(str4) || !"joyeuse".equalsIgnoreCase(Build.DEVICE))))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (e.alpha(ExcludedSupportedSizesQuirk.class, z10)) {
                    arrayList.add(new ExcludedSupportedSizesQuirk());
                }
                List list2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.alpha;
                Locale locale2 = Locale.US;
                if (e.alpha(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.alpha.contains(str3.toUpperCase(locale2)))) {
                    arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                }
                List list3 = PreviewPixelHDRnetQuirk.alpha;
                String str5 = Build.MANUFACTURER;
                if ("Google".equals(str5)) {
                    if (PreviewPixelHDRnetQuirk.alpha.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
                        z11 = true;
                        if (e.alpha(PreviewPixelHDRnetQuirk.class, z11)) {
                            arrayList.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!"SAMSUNG".equals(str5.toUpperCase(locale2)) && str3.toUpperCase(locale2).startsWith("SM-A716")) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (e.alpha(StillCaptureFlashStopRepeatingQuirk.class, z12)) {
                            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        T t5 = ExtraSupportedSurfaceCombinationsQuirk.alpha;
                        str = Build.DEVICE;
                        if (!"heroqltevzw".equalsIgnoreCase(str) && !"heroqltetmo".equalsIgnoreCase(str)) {
                            if ("google".equalsIgnoreCase(str4)) {
                                contains = false;
                            } else {
                                contains = ExtraSupportedSurfaceCombinationsQuirk.charlie.contains(str3.toUpperCase(locale2));
                            }
                            if (!contains && !ExtraSupportedSurfaceCombinationsQuirk.bravo()) {
                                z13 = false;
                                if (e.alpha(ExtraSupportedSurfaceCombinationsQuirk.class, z13)) {
                                    arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
                                }
                                if (e.alpha(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.alpha.contains(new Pair(str5.toLowerCase(locale2), str3.toLowerCase(locale2))))) {
                                    arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
                                }
                                if (!"Huawei".equalsIgnoreCase(str4) && "mha-l29".equalsIgnoreCase(str3)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (e.alpha(RepeatingStreamConstraintForVideoRecordingQuirk.class, z14)) {
                                    arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                                }
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 > 23) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (e.alpha(TextureViewIsClosedQuirk.class, z15)) {
                                    arrayList.add(new TextureViewIsClosedQuirk());
                                }
                                if (e.alpha(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                                    arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
                                }
                                List list4 = TorchIsClosedAfterImageCapturingQuirk.alpha;
                                if (e.alpha(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.alpha.contains(str3.toLowerCase(locale2)))) {
                                    arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
                                }
                                List list5 = ZslDisablerQuirk.alpha;
                                if ((!"samsung".equalsIgnoreCase(str4) && ZslDisablerQuirk.bravo(ZslDisablerQuirk.alpha)) || ("xiaomi".equalsIgnoreCase(str4) && ZslDisablerQuirk.bravo(ZslDisablerQuirk.bravo))) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (e.alpha(ZslDisablerQuirk.class, z16)) {
                                    arrayList.add(new ZslDisablerQuirk());
                                }
                                if (!"motorola".equalsIgnoreCase(str4) && "moto e5 play".equalsIgnoreCase(str3)) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (e.alpha(ExtraSupportedOutputSizeQuirk.class, z17)) {
                                    arrayList.add(new ExtraSupportedOutputSizeQuirk());
                                }
                                List list6 = InvalidVideoProfilesQuirk.alpha;
                                if ("samsung".equalsIgnoreCase(str4) || !Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
                                    locale = Locale.ROOT;
                                    if (InvalidVideoProfilesQuirk.alpha.contains(str3.toLowerCase(locale))) {
                                        String str6 = Build.ID;
                                        if (!str6.toLowerCase(locale).startsWith("tp1a")) {
                                            break;
                                        }
                                    }
                                    if (!"redmi".equalsIgnoreCase(str4) || "xiaomi".equalsIgnoreCase(str4)) {
                                        str2 = Build.ID;
                                        if (!str2.toLowerCase(locale).startsWith("tkq1")) {
                                            break;
                                        }
                                    }
                                    if (InvalidVideoProfilesQuirk.bravo.contains(str3.toLowerCase(locale))) {
                                        if (i4 == 33) {
                                            z20 = true;
                                            break;
                                        } else {
                                            z20 = false;
                                            break;
                                        }
                                    }
                                    if (InvalidVideoProfilesQuirk.charlie.contains(str3.toLowerCase(locale))) {
                                        if (i4 == 33) {
                                            z19 = true;
                                            break;
                                        } else {
                                            z19 = false;
                                            break;
                                        }
                                    }
                                    z18 = false;
                                    if (e.alpha(InvalidVideoProfilesQuirk.class, z18)) {
                                        arrayList.add(new InvalidVideoProfilesQuirk());
                                    }
                                    if (e.alpha(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                                        arrayList.add(new Preview3AThreadCrashQuirk());
                                    }
                                    if (e.alpha(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.alpha.containsKey(str3.toUpperCase(locale2)))) {
                                        arrayList.add(new SmallDisplaySizeQuirk());
                                    }
                                    if (!"google".equalsIgnoreCase(str4) && i4 >= 35) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (e.alpha(CaptureSessionShouldUseMrirQuirk.class, z21)) {
                                        arrayList.add(new CaptureSessionShouldUseMrirQuirk());
                                    }
                                    b.alpha = new c(arrayList);
                                    AbstractC3066u3.bravo("DeviceQuirks", "camera2 DeviceQuirks = " + c.foxtrot(b.alpha));
                                    return;
                                }
                                z18 = true;
                                if (e.alpha(InvalidVideoProfilesQuirk.class, z18)) {
                                }
                                if (e.alpha(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                                }
                                if (e.alpha(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.alpha.containsKey(str3.toUpperCase(locale2)))) {
                                }
                                if (!"google".equalsIgnoreCase(str4)) {
                                }
                                z21 = false;
                                if (e.alpha(CaptureSessionShouldUseMrirQuirk.class, z21)) {
                                }
                                b.alpha = new c(arrayList);
                                AbstractC3066u3.bravo("DeviceQuirks", "camera2 DeviceQuirks = " + c.foxtrot(b.alpha));
                                return;
                            }
                        }
                        z13 = true;
                        if (e.alpha(ExtraSupportedSurfaceCombinationsQuirk.class, z13)) {
                        }
                        if (e.alpha(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.alpha.contains(new Pair(str5.toLowerCase(locale2), str3.toLowerCase(locale2))))) {
                        }
                        if (!"Huawei".equalsIgnoreCase(str4)) {
                        }
                        z14 = false;
                        if (e.alpha(RepeatingStreamConstraintForVideoRecordingQuirk.class, z14)) {
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 > 23) {
                        }
                        if (e.alpha(TextureViewIsClosedQuirk.class, z15)) {
                        }
                        if (e.alpha(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        }
                        List list42 = TorchIsClosedAfterImageCapturingQuirk.alpha;
                        if (e.alpha(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.alpha.contains(str3.toLowerCase(locale2)))) {
                        }
                        List list52 = ZslDisablerQuirk.alpha;
                        if (!"samsung".equalsIgnoreCase(str4)) {
                        }
                        z16 = false;
                        if (e.alpha(ZslDisablerQuirk.class, z16)) {
                        }
                        if (!"motorola".equalsIgnoreCase(str4)) {
                        }
                        z17 = false;
                        if (e.alpha(ExtraSupportedOutputSizeQuirk.class, z17)) {
                        }
                        List list62 = InvalidVideoProfilesQuirk.alpha;
                        if ("samsung".equalsIgnoreCase(str4)) {
                        }
                        locale = Locale.ROOT;
                        if (InvalidVideoProfilesQuirk.alpha.contains(str3.toLowerCase(locale))) {
                        }
                        if (!"redmi".equalsIgnoreCase(str4)) {
                        }
                        str2 = Build.ID;
                        if (!str2.toLowerCase(locale).startsWith("tkq1")) {
                        }
                        z18 = true;
                        if (e.alpha(InvalidVideoProfilesQuirk.class, z18)) {
                        }
                        if (e.alpha(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                        }
                        if (e.alpha(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.alpha.containsKey(str3.toUpperCase(locale2)))) {
                        }
                        if (!"google".equalsIgnoreCase(str4)) {
                        }
                        z21 = false;
                        if (e.alpha(CaptureSessionShouldUseMrirQuirk.class, z21)) {
                        }
                        b.alpha = new c(arrayList);
                        AbstractC3066u3.bravo("DeviceQuirks", "camera2 DeviceQuirks = " + c.foxtrot(b.alpha));
                        return;
                    }
                }
                z11 = false;
                if (e.alpha(PreviewPixelHDRnetQuirk.class, z11)) {
                }
                if (!"SAMSUNG".equals(str5.toUpperCase(locale2))) {
                }
                z12 = false;
                if (e.alpha(StillCaptureFlashStopRepeatingQuirk.class, z12)) {
                }
                T t52 = ExtraSupportedSurfaceCombinationsQuirk.alpha;
                str = Build.DEVICE;
                if (!"heroqltevzw".equalsIgnoreCase(str)) {
                    if ("google".equalsIgnoreCase(str4)) {
                    }
                    if (!contains) {
                        z13 = false;
                        if (e.alpha(ExtraSupportedSurfaceCombinationsQuirk.class, z13)) {
                        }
                        if (e.alpha(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.alpha.contains(new Pair(str5.toLowerCase(locale2), str3.toLowerCase(locale2))))) {
                        }
                        if (!"Huawei".equalsIgnoreCase(str4)) {
                        }
                        z14 = false;
                        if (e.alpha(RepeatingStreamConstraintForVideoRecordingQuirk.class, z14)) {
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 > 23) {
                        }
                        if (e.alpha(TextureViewIsClosedQuirk.class, z15)) {
                        }
                        if (e.alpha(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        }
                        List list422 = TorchIsClosedAfterImageCapturingQuirk.alpha;
                        if (e.alpha(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.alpha.contains(str3.toLowerCase(locale2)))) {
                        }
                        List list522 = ZslDisablerQuirk.alpha;
                        if (!"samsung".equalsIgnoreCase(str4)) {
                        }
                        z16 = false;
                        if (e.alpha(ZslDisablerQuirk.class, z16)) {
                        }
                        if (!"motorola".equalsIgnoreCase(str4)) {
                        }
                        z17 = false;
                        if (e.alpha(ExtraSupportedOutputSizeQuirk.class, z17)) {
                        }
                        List list622 = InvalidVideoProfilesQuirk.alpha;
                        if ("samsung".equalsIgnoreCase(str4)) {
                        }
                        locale = Locale.ROOT;
                        if (InvalidVideoProfilesQuirk.alpha.contains(str3.toLowerCase(locale))) {
                        }
                        if (!"redmi".equalsIgnoreCase(str4)) {
                        }
                        str2 = Build.ID;
                        if (!str2.toLowerCase(locale).startsWith("tkq1")) {
                        }
                        z18 = true;
                        if (e.alpha(InvalidVideoProfilesQuirk.class, z18)) {
                        }
                        if (e.alpha(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                        }
                        if (e.alpha(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.alpha.containsKey(str3.toUpperCase(locale2)))) {
                        }
                        if (!"google".equalsIgnoreCase(str4)) {
                        }
                        z21 = false;
                        if (e.alpha(CaptureSessionShouldUseMrirQuirk.class, z21)) {
                        }
                        b.alpha = new c(arrayList);
                        AbstractC3066u3.bravo("DeviceQuirks", "camera2 DeviceQuirks = " + c.foxtrot(b.alpha));
                        return;
                    }
                }
                z13 = true;
                if (e.alpha(ExtraSupportedSurfaceCombinationsQuirk.class, z13)) {
                }
                if (e.alpha(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.alpha.contains(new Pair(str5.toLowerCase(locale2), str3.toLowerCase(locale2))))) {
                }
                if (!"Huawei".equalsIgnoreCase(str4)) {
                }
                z14 = false;
                if (e.alpha(RepeatingStreamConstraintForVideoRecordingQuirk.class, z14)) {
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 > 23) {
                }
                if (e.alpha(TextureViewIsClosedQuirk.class, z15)) {
                }
                if (e.alpha(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                }
                List list4222 = TorchIsClosedAfterImageCapturingQuirk.alpha;
                if (e.alpha(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.alpha.contains(str3.toLowerCase(locale2)))) {
                }
                List list5222 = ZslDisablerQuirk.alpha;
                if (!"samsung".equalsIgnoreCase(str4)) {
                }
                z16 = false;
                if (e.alpha(ZslDisablerQuirk.class, z16)) {
                }
                if (!"motorola".equalsIgnoreCase(str4)) {
                }
                z17 = false;
                if (e.alpha(ExtraSupportedOutputSizeQuirk.class, z17)) {
                }
                List list6222 = InvalidVideoProfilesQuirk.alpha;
                if ("samsung".equalsIgnoreCase(str4)) {
                }
                locale = Locale.ROOT;
                if (InvalidVideoProfilesQuirk.alpha.contains(str3.toLowerCase(locale))) {
                }
                if (!"redmi".equalsIgnoreCase(str4)) {
                }
                str2 = Build.ID;
                if (!str2.toLowerCase(locale).startsWith("tkq1")) {
                }
                z18 = true;
                if (e.alpha(InvalidVideoProfilesQuirk.class, z18)) {
                }
                if (e.alpha(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                }
                if (e.alpha(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.alpha.containsKey(str3.toUpperCase(locale2)))) {
                }
                if (!"google".equalsIgnoreCase(str4)) {
                }
                z21 = false;
                if (e.alpha(CaptureSessionShouldUseMrirQuirk.class, z21)) {
                }
                b.alpha = new c(arrayList);
                AbstractC3066u3.bravo("DeviceQuirks", "camera2 DeviceQuirks = " + c.foxtrot(b.alpha));
                return;
            case 1:
                if (obj == null) {
                    j4.alpha();
                    throw null;
                }
                throw new ClassCastException();
            case 2:
                if (obj == null) {
                    j4.alpha();
                    throw null;
                }
                throw new ClassCastException();
            case 3:
                E e4 = (E) obj;
                ArrayList arrayList2 = new ArrayList();
                String str7 = Build.BRAND;
                if (("HUAWEI".equalsIgnoreCase(str7) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str7) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                    z22 = true;
                } else {
                    String str8 = Build.FINGERPRINT;
                    if (!str8.startsWith("generic") && !str8.startsWith("unknown")) {
                        String str9 = Build.MODEL;
                        if (!str9.contains("google_sdk") && !str9.contains("Emulator") && !str9.contains("Cuttlefish") && !str9.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str7.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                            Build.HARDWARE.contains("ranchu");
                        }
                    }
                    z22 = false;
                }
                if (e4.alpha(ImageCaptureRotationOptionQuirk.class, z22)) {
                    arrayList2.add(new ImageCaptureRotationOptionQuirk());
                }
                if (e4.alpha(SurfaceOrderQuirk.class, true)) {
                    arrayList2.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.alpha;
                Locale locale3 = Locale.US;
                String upperCase = str7.toUpperCase(locale3);
                String str10 = Build.MODEL;
                if (e4.alpha(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.alpha.contains(Pair.create(upperCase, str10.toUpperCase(locale3))))) {
                    arrayList2.add(new CaptureFailedRetryQuirk());
                }
                if (e4.alpha(LowMemoryQuirk.class, LowMemoryQuirk.alpha.contains(str10.toUpperCase(locale3)))) {
                    arrayList2.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.alpha;
                if (!"Samsung".equalsIgnoreCase(str7) && (!"Vivo".equalsIgnoreCase(str7) || !LargeJpegImageQuirk.alpha.contains(str10.toUpperCase(locale3)))) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                if (e4.alpha(LargeJpegImageQuirk.class, z23)) {
                    arrayList2.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.alpha;
                if (!"Samsung".equalsIgnoreCase(str7) || !IncorrectJpegMetadataQuirk.alpha.contains(Build.DEVICE.toUpperCase(locale3))) {
                    z25 = false;
                }
                if (e4.alpha(IncorrectJpegMetadataQuirk.class, z25)) {
                    arrayList2.add(new IncorrectJpegMetadataQuirk());
                }
                bg.a.alpha = new c(arrayList2);
                AbstractC3066u3.bravo("DeviceQuirks", "core DeviceQuirks = " + c.foxtrot(bg.a.alpha));
                return;
            default:
                E e5 = (E) obj;
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str11 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str11)) {
                        String str12 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str12)) {
                            break;
                        }
                        z24 = true;
                        if (e5.alpha(SurfaceViewStretchedQuirk.class, z24)) {
                            arrayList3.add(new SurfaceViewStretchedQuirk());
                        }
                        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) || !"M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
                            z25 = false;
                        }
                        if (e5.alpha(SurfaceViewNotCroppedByParentQuirk.class, z25)) {
                            arrayList3.add(new SurfaceViewNotCroppedByParentQuirk());
                        }
                        br.a.alpha = new c(arrayList3);
                        AbstractC3066u3.bravo("DeviceQuirks", "view DeviceQuirks = " + c.foxtrot(br.a.alpha));
                        return;
                    }
                    if ("OPPO".equalsIgnoreCase(str11)) {
                        break;
                    }
                    if ("LENOVO".equalsIgnoreCase(str11)) {
                        break;
                    }
                }
                z24 = false;
                if (e5.alpha(SurfaceViewStretchedQuirk.class, z24)) {
                }
                if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER)) {
                }
                z25 = false;
                if (e5.alpha(SurfaceViewNotCroppedByParentQuirk.class, z25)) {
                }
                br.a.alpha = new c(arrayList3);
                AbstractC3066u3.bravo("DeviceQuirks", "view DeviceQuirks = " + c.foxtrot(br.a.alpha));
                return;
        }
    }

    public /* synthetic */ a(o oVar, int i4) {
        this.alpha = i4;
    }
}
