package t6;

import a0.C0366t;
import a0.as;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2;
import rb.C2514b;
import t6.P3;
import z.AbstractC3450d;
import z.C3449c;

/* loaded from: classes2.dex */
public abstract class P3 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(T.s sVar, a0.as asVar, long j5, long j6, float f5, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        a0.as asVar2;
        int i11;
        long j7;
        int i12;
        int i13;
        float f10;
        int i14;
        P.d dVar2;
        boolean z2;
        float f11;
        a0.as asVar3;
        long j10;
        androidx.compose.runtime.Q uniform;
        a0.as asVar4;
        long j11;
        float f12;
        int i15;
        int i16;
        int i17;
        int i18;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(174096871);
        if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            asVar2 = asVar;
            if (c0585q.golf(asVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) == 0) {
                if (c0585q.foxtrot(j5)) {
                    i17 = Barcode.FORMAT_QR_CODE;
                } else {
                    i17 = 128;
                }
                i10 |= i17;
            }
            if ((i4 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    j7 = j6;
                    if (c0585q.foxtrot(j7)) {
                        i16 = 2048;
                        i10 |= i16;
                    }
                } else {
                    j7 = j6;
                }
                i16 = Barcode.FORMAT_UPC_E;
                i10 |= i16;
            } else {
                j7 = j6;
            }
            if ((i5 & 16) == 0) {
                i10 |= 24576;
            } else if ((i4 & 24576) == 0) {
                if (c0585q.golf(null)) {
                    i12 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            i13 = i5 & 32;
            if (i13 == 0) {
                i10 |= 196608;
            } else if ((196608 & i4) == 0) {
                f10 = f5;
                if (c0585q.delta(f10)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i10 |= i14;
                if ((1572864 & i4) == 0) {
                    dVar2 = dVar;
                    if (c0585q.india(dVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i10 |= i15;
                } else {
                    dVar2 = dVar;
                }
                if ((i10 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0585q.magenta(i10 & 1, z2)) {
                    c0585q.orange();
                    if ((i4 & 1) != 0 && !c0585q.beige()) {
                        c0585q.ochre();
                        f12 = f10;
                        asVar3 = asVar2;
                        j11 = j7;
                    } else {
                        if (i19 != 0) {
                            asVar4 = a0.ao.alpha;
                        } else {
                            asVar4 = asVar2;
                        }
                        if ((i5 & 8) != 0) {
                            j11 = AbstractC3450d.alpha(j5, c0585q);
                        } else {
                            j11 = j7;
                        }
                        if (i13 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        asVar3 = asVar4;
                    }
                    c0585q.romeo();
                    androidx.compose.runtime.aa aaVar = z.q.bravo;
                    float f13 = ((Q0.g) c0585q.kilo(aaVar)).alpha + f12;
                    C0564b.bravo(new androidx.compose.runtime.O[]{z.g.alpha.alpha(new C0366t(j11)), aaVar.alpha(new Q0.g(f13))}, P.e.echo(-2004281689, new z.ag(sVar2, asVar3, j5, f13, f12, dVar2), c0585q), c0585q, 56);
                    f11 = f12;
                    j10 = j11;
                } else {
                    c0585q.ochre();
                    f11 = f10;
                    asVar3 = asVar2;
                    j10 = j7;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new C2514b(sVar, asVar3, j5, j10, f11, dVar, i4, i5);
                    return;
                }
                return;
            }
            f10 = f5;
            if ((1572864 & i4) == 0) {
            }
            if ((i10 & 599187) != 599186) {
            }
            if (c0585q.magenta(i10 & 1, z2)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        asVar2 = asVar;
        if ((i4 & 384) == 0) {
        }
        if ((i4 & 3072) != 0) {
        }
        if ((i5 & 16) == 0) {
        }
        i13 = i5 & 32;
        if (i13 == 0) {
        }
        f10 = f5;
        if ((1572864 & i4) == 0) {
        }
        if ((i10 & 599187) != 599186) {
        }
        if (c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0066  */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final float f5, final int i4, final int i5, final long j5, final long j6, final P.d dVar, final T.s sVar, final a0.as asVar, InterfaceC0581m interfaceC0581m, b.ab abVar, final InterfaceC1673j interfaceC1673j, final Function0 function0, boolean z2) {
        int i10;
        T.s sVar2;
        boolean z10;
        a0.as asVar2;
        boolean z11;
        long j7;
        int i11;
        int i12;
        ?? r17;
        boolean z12;
        final b.ab abVar2;
        final boolean z13;
        androidx.compose.runtime.Q uniform;
        b.ab abVar3;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2141308794);
        if ((i4 & 6) == 0) {
            i10 = (c0585q.india(function0) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            sVar2 = sVar;
            i10 |= c0585q.golf(sVar2) ? 32 : 16;
        } else {
            sVar2 = sVar;
        }
        int i13 = i5 & 4;
        if (i13 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            i10 |= c0585q.hotel(z10) ? Barcode.FORMAT_QR_CODE : 128;
            if ((i4 & 3072) != 0) {
                asVar2 = asVar;
                i10 |= c0585q.golf(asVar2) ? 2048 : Barcode.FORMAT_UPC_E;
            } else {
                asVar2 = asVar;
            }
            int i14 = i10;
            if ((i4 & 24576) != 0) {
                z11 = true;
                j7 = j5;
                i11 = i14 | (c0585q.foxtrot(j7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
            } else {
                z11 = true;
                j7 = j5;
                i11 = i14;
            }
            if ((i4 & 196608) == 0) {
                i11 |= c0585q.foxtrot(j6) ? 131072 : 65536;
            }
            i12 = i5 & 64;
            if (i12 == 0) {
                i11 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                r17 = 0;
                i11 |= c0585q.golf(abVar) ? 1048576 : 524288;
                if ((i4 & 12582912) == 0) {
                    i11 |= c0585q.delta(f5) ? 8388608 : 4194304;
                }
                z12 = z11;
                if ((i4 & 100663296) == 0) {
                    i11 |= c0585q.golf(interfaceC1673j) ? 67108864 : 33554432;
                }
                if ((i4 & 805306368) == 0) {
                    i11 |= c0585q.india(dVar) ? 536870912 : 268435456;
                }
                if (c0585q.magenta(i11 & 1, (i11 & 306783379) != 306783378 ? z12 ? 1 : 0 : r17)) {
                    c0585q.orange();
                    if ((i4 & 1) == 0 || c0585q.beige()) {
                        if (i13 != 0) {
                            z10 = z12 ? 1 : 0;
                        }
                        if (i12 != 0) {
                            abVar3 = null;
                            boolean z14 = z10;
                            c0585q.romeo();
                            androidx.compose.runtime.aa aaVar = z.q.bravo;
                            float f10 = ((Q0.g) c0585q.kilo(aaVar)).alpha + f5;
                            b.ab abVar4 = abVar3;
                            androidx.compose.runtime.O alpha = z.g.alpha.alpha(new C0366t(j6));
                            androidx.compose.runtime.O alpha2 = aaVar.alpha(new Q0.g(f10));
                            androidx.compose.runtime.O[] oArr = new androidx.compose.runtime.O[2];
                            oArr[r17] = alpha;
                            oArr[z12 ? 1 : 0] = alpha2;
                            C0564b.bravo(oArr, P.e.echo(-1766606150, new z.ah(f10, f5, j7, dVar, sVar2, asVar2, abVar4, interfaceC1673j, function0, z14), c0585q), c0585q, 56);
                            abVar2 = abVar4;
                            z13 = z14;
                        }
                    } else {
                        c0585q.ochre();
                    }
                    abVar3 = abVar;
                    boolean z142 = z10;
                    c0585q.romeo();
                    androidx.compose.runtime.aa aaVar2 = z.q.bravo;
                    float f102 = ((Q0.g) c0585q.kilo(aaVar2)).alpha + f5;
                    b.ab abVar42 = abVar3;
                    androidx.compose.runtime.O alpha3 = z.g.alpha.alpha(new C0366t(j6));
                    androidx.compose.runtime.O alpha22 = aaVar2.alpha(new Q0.g(f102));
                    androidx.compose.runtime.O[] oArr2 = new androidx.compose.runtime.O[2];
                    oArr2[r17] = alpha3;
                    oArr2[z12 ? 1 : 0] = alpha22;
                    C0564b.bravo(oArr2, P.e.echo(-1766606150, new z.ah(f102, f5, j7, dVar, sVar2, asVar2, abVar42, interfaceC1673j, function0, z142), c0585q), c0585q, 56);
                    abVar2 = abVar42;
                    z13 = z142;
                } else {
                    c0585q.ochre();
                    abVar2 = abVar;
                    z13 = z10;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Xd.l() { // from class: z.ae
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            P.d dVar2 = dVar;
                            int i15 = i5;
                            Function0 function02 = Function0.this;
                            T.s sVar3 = sVar;
                            boolean z15 = z13;
                            as asVar3 = asVar;
                            long j10 = j5;
                            long j11 = j6;
                            b.ab abVar5 = abVar2;
                            P3.bravo(f5, cyan, i15, j10, j11, dVar2, sVar3, asVar3, (InterfaceC0581m) obj, abVar5, interfaceC1673j, function02, z15);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            r17 = 0;
            if ((i4 & 12582912) == 0) {
            }
            z12 = z11;
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if (c0585q.magenta(i11 & 1, (i11 & 306783379) != 306783378 ? z12 ? 1 : 0 : r17)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z10 = z2;
        if ((i4 & 3072) != 0) {
        }
        int i142 = i10;
        if ((i4 & 24576) != 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        r17 = 0;
        if ((i4 & 12582912) == 0) {
        }
        z12 = z11;
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if (c0585q.magenta(i11 & 1, (i11 & 306783379) != 306783378 ? z12 ? 1 : 0 : r17)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final T.s charlie(T.s sVar, a0.as asVar, long j5, b.ab abVar, float f5) {
        T.s sVar2;
        T.s alpha = ac.alpha(sVar, f5, asVar, 0L, 0L, 24);
        if (abVar != null) {
            sVar2 = new BorderModifierNodeElement(abVar.alpha, abVar.bravo, asVar);
        } else {
            sVar2 = T.p.alpha;
        }
        return AbstractC3087z.alpha(androidx.compose.foundation.a.bravo(alpha.then(sVar2), j5, asVar), asVar);
    }

    public static final long delta(long j5, z.l lVar, float f5, C0585q c0585q) {
        androidx.compose.runtime.E0 e02 = AbstractC3450d.alpha;
        if (C0366t.charlie(j5, ((C3449c) c0585q.kilo(e02)).charlie()) && lVar != null) {
            c0585q.purple(-1124594614);
            c0585q.purple(-1687113661);
            C3449c c3449c = (C3449c) c0585q.kilo(e02);
            if (Float.compare(f5, 0) > 0 && !c3449c.delta()) {
                c0585q.purple(-1095579370);
                androidx.compose.runtime.E0 e03 = z.q.alpha;
                j5 = a0.ao.kilo(C0366t.bravo(((((float) Math.log(f5 + 1)) * 4.5f) + 2.0f) / 100.0f, AbstractC3450d.alpha(j5, c0585q)), j5);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1095440862);
                c0585q.quebec(false);
            }
            c0585q.quebec(false);
            c0585q.quebec(false);
            return j5;
        }
        c0585q.purple(-1124526507);
        c0585q.quebec(false);
        return j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0569, code lost:
    
        if ("Spreadtrum".equalsIgnoreCase(r8) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x050b, code lost:
    
        if ("gta8wifi".equalsIgnoreCase(r3) == false) goto L300;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Q3.c echo(androidx.camera.camera2.internal.compat.j jVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        String str;
        boolean z31;
        HashSet hashSet;
        Locale locale;
        String str2;
        Integer num;
        androidx.camera.core.impl.F f5 = androidx.camera.core.impl.F.charlie;
        f5.getClass();
        try {
            androidx.camera.core.impl.E e = (androidx.camera.core.impl.E) f5.alpha.bravo().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num2 = (Integer) jVar.alpha(key);
            boolean z32 = true;
            if (num2 != null && num2.intValue() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (e.alpha(AeFpsRangeLegacyQuirk.class, z2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(jVar));
            }
            if (e.alpha(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet2 = JpegHalCorruptImageQuirk.alpha;
            String str3 = Build.DEVICE;
            Locale locale2 = Locale.US;
            if (e.alpha(JpegHalCorruptImageQuirk.class, hashSet2.contains(str3.toLowerCase(locale2)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet3 = JpegCaptureDownsizingQuirk.alpha;
            String str4 = Build.MODEL;
            if (hashSet3.contains(str4.toLowerCase(locale2)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.alpha(JpegCaptureDownsizingQuirk.class, z10)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num3 = (Integer) jVar.alpha(key);
            if (num3 != null && num3.intValue() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (e.alpha(CamcorderProfileResolutionQuirk.class, z11)) {
                Object obj = new Object();
                jVar.bravo();
                arrayList.add(obj);
            }
            String str5 = Build.HARDWARE;
            if (("samsungexynos7420".equalsIgnoreCase(str5) || "universal7420".equalsIgnoreCase(str5)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (e.alpha(CaptureNoResponseQuirk.class, z12)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num4 = (Integer) jVar.alpha(key);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 > 23 && num4 != null && num4.intValue() == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (e.alpha(LegacyCameraOutputConfigNullPointerQuirk.class, z13)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (i4 > 23 && i4 < 29 && (num = (Integer) jVar.alpha(key)) != null && num.intValue() == 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (e.alpha(LegacyCameraSurfaceCleanupQuirk.class, z14)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            List list = ImageCaptureWashedOutImageQuirk.alpha;
            if (ImageCaptureWashedOutImageQuirk.alpha.contains(str4.toUpperCase(locale2)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (e.alpha(ImageCaptureWashedOutImageQuirk.class, z15)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            List list2 = CameraNoResponseWhenEnablingFlashQuirk.alpha;
            if (CameraNoResponseWhenEnablingFlashQuirk.alpha.contains(str4.toUpperCase(locale2)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (e.alpha(CameraNoResponseWhenEnablingFlashQuirk.class, z16)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str6 = Build.BRAND;
            if (("motorola".equalsIgnoreCase(str6) && "MotoG3".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-G532F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-J700F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-A920F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-J415F".equalsIgnoreCase(str4)) || ("xiaomi".equalsIgnoreCase(str6) && "Mi A1".equalsIgnoreCase(str4))))))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (e.alpha(YuvImageOnePixelShiftQuirk.class, z17)) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator it = FlashTooSlowQuirk.alpha.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                    if (((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                        z18 = true;
                    }
                }
            }
            z18 = false;
            if (e.alpha(FlashTooSlowQuirk.class, z18)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (e.alpha(AfRegionFlipHorizontallyQuirk.class, z19)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num5 = (Integer) jVar.alpha(key2);
            if (num5 != null && num5.intValue() == 2) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (e.alpha(ConfigureSurfaceToSecondarySessionFailQuirk.class, z20)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num6 = (Integer) jVar.alpha(key2);
            if (num6 != null && num6.intValue() == 2) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (e.alpha(PreviewOrientationIncorrectQuirk.class, z21)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num7 = (Integer) jVar.alpha(key2);
            if (num7 != null && num7.intValue() == 2) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (e.alpha(CaptureSessionStuckQuirk.class, z22)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List list3 = ImageCaptureFlashNotFireQuirk.alpha;
            String str7 = Build.MODEL;
            Locale locale3 = Locale.US;
            if (ImageCaptureFlashNotFireQuirk.bravo.contains(str7.toLowerCase(locale3)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean contains = ImageCaptureFlashNotFireQuirk.alpha.contains(str7.toLowerCase(locale3));
            if (!z23 && !contains) {
                z24 = false;
            } else {
                z24 = true;
            }
            if (e.alpha(ImageCaptureFlashNotFireQuirk.class, z24)) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            List list4 = ImageCaptureWithFlashUnderexposureQuirk.alpha;
            if (ImageCaptureWithFlashUnderexposureQuirk.alpha.contains(str7.toLowerCase(locale3)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (e.alpha(ImageCaptureWithFlashUnderexposureQuirk.class, z25)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            List list5 = ImageCaptureFailWithAutoFlashQuirk.alpha;
            if (ImageCaptureFailWithAutoFlashQuirk.alpha.contains(str7.toLowerCase(locale3)) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z26 = true;
            } else {
                z26 = false;
            }
            if (e.alpha(ImageCaptureFailWithAutoFlashQuirk.class, z26)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num8 = (Integer) jVar.alpha(key2);
            if (num8 != null && num8.intValue() == 2) {
                z27 = true;
            } else {
                z27 = false;
            }
            if (e.alpha(IncorrectCaptureStateQuirk.class, z27)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.alpha.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                    if (((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        z28 = true;
                    }
                }
            }
            z28 = false;
            if (e.alpha(TorchFlashRequiredFor3aUpdateQuirk.class, z28)) {
                arrayList.add(new Object());
            }
            String str8 = Build.MANUFACTURER;
            if (("HUAWEI".equalsIgnoreCase(str8) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str8) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str8) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                z29 = true;
            } else {
                z29 = false;
            }
            if (e.alpha(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, z29)) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (e.alpha(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str8))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            String str9 = Build.BRAND;
            if ((!"blu".equalsIgnoreCase(str9) || !"studio x10".equalsIgnoreCase(Build.MODEL)) && ((!"itel".equalsIgnoreCase(str9) || !"itel w6004".equalsIgnoreCase(Build.MODEL)) && ((!"vivo".equalsIgnoreCase(str9) || !"vivo 1805".equalsIgnoreCase(Build.MODEL)) && (!"positivo".equalsIgnoreCase(str9) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL))))) {
                String str10 = Build.MODEL;
                if ((!"pixel 4 xl".equalsIgnoreCase(str10) || Build.VERSION.SDK_INT != 29) && (!"motorola".equalsIgnoreCase(str9) || !"moto e13".equalsIgnoreCase(str10))) {
                    if ("samsung".equalsIgnoreCase(str9)) {
                        String str11 = Build.DEVICE;
                        if (!"gta8".equalsIgnoreCase(str11)) {
                        }
                    }
                    z30 = false;
                    if (e.alpha(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z30)) {
                        arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                    }
                    str = Build.MODEL;
                    if (!"Pixel 8".equalsIgnoreCase(str) && ((Integer) jVar.alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    if (e.alpha(TemporalNoiseQuirk.class, z31)) {
                        arrayList.add(new TemporalNoiseQuirk());
                    }
                    hashSet = ImageCaptureFailedForVideoSnapshotQuirk.alpha;
                    locale = Locale.US;
                    if (!hashSet.contains(str.toLowerCase(locale))) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            str2 = Build.SOC_MANUFACTURER;
                        }
                        String str12 = Build.HARDWARE;
                        if (!str12.toLowerCase(locale).startsWith("ums") && ((!"itel".equalsIgnoreCase(str9) || !str12.toLowerCase(locale).startsWith("sp")) && (!"HUAWEI".equalsIgnoreCase(str9) || !"FIG-LX1".equalsIgnoreCase(str)))) {
                            z32 = false;
                        }
                    }
                    if (e.alpha(ImageCaptureFailedForVideoSnapshotQuirk.class, z32)) {
                        arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                    }
                    Q3.c cVar = new Q3.c(arrayList);
                    AbstractC3066u3.bravo("CameraQuirks", "camera2 CameraQuirks = " + Q3.c.foxtrot(cVar));
                    return cVar;
                }
            }
            z30 = true;
            if (e.alpha(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z30)) {
            }
            str = Build.MODEL;
            if (!"Pixel 8".equalsIgnoreCase(str)) {
            }
            z31 = false;
            if (e.alpha(TemporalNoiseQuirk.class, z31)) {
            }
            hashSet = ImageCaptureFailedForVideoSnapshotQuirk.alpha;
            locale = Locale.US;
            if (!hashSet.contains(str.toLowerCase(locale))) {
            }
            if (e.alpha(ImageCaptureFailedForVideoSnapshotQuirk.class, z32)) {
            }
            Q3.c cVar2 = new Q3.c(arrayList);
            AbstractC3066u3.bravo("CameraQuirks", "camera2 CameraQuirks = " + Q3.c.foxtrot(cVar2));
            return cVar2;
        } catch (InterruptedException | ExecutionException e4) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e4);
        }
    }
}
