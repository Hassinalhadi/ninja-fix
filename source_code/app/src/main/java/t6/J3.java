package t6;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0519q;
import fe.C1713e;
import fe.C1714f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.E6;

/* loaded from: classes2.dex */
public abstract class J3 {
    public static void alpha(CaptureRequest.Builder builder, androidx.camera.core.impl.B b2) {
        av.ah charlie = androidx.camera.core.r.delta(b2).charlie();
        for (C0505c c0505c : charlie.getConfig().romeo()) {
            CaptureRequest.Key key = c0505c.charlie;
            try {
                builder.set(key, charlie.getConfig().quebec(c0505c));
            } catch (IllegalArgumentException unused) {
                AbstractC3066u3.charlie("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void bravo(CaptureRequest.Builder builder, int i4, androidx.compose.foundation.layout.af afVar) {
        Map map;
        if (i4 == 3 && afVar.alpha) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = Collections.unmodifiableMap(hashMap);
        } else {
            if (i4 == 4) {
                if (afVar.bravo) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                    map = Collections.unmodifiableMap(hashMap2);
                }
            } else {
                afVar.getClass();
            }
            map = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest charlie(androidx.camera.core.impl.ad adVar, CameraDevice cameraDevice, HashMap hashMap, boolean z2, androidx.compose.foundation.layout.af afVar) {
        CaptureRequest.Builder createCaptureRequest;
        int i4;
        InterfaceC0519q interfaceC0519q;
        if (cameraDevice != null) {
            List unmodifiableList = Collections.unmodifiableList(adVar.alpha);
            ArrayList arrayList = new ArrayList();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) hashMap.get((androidx.camera.core.impl.ah) it.next());
                if (surface != null) {
                    arrayList.add(surface);
                } else {
                    throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            int i5 = adVar.charlie;
            if (i5 == 5 && (interfaceC0519q = adVar.golf) != null && (interfaceC0519q.m() instanceof TotalCaptureResult)) {
                AbstractC3066u3.bravo("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
                createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC0519q.m());
            } else {
                AbstractC3066u3.bravo("Camera2CaptureRequestBuilder", "createCaptureRequest");
                if (i5 == 5) {
                    if (z2) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    createCaptureRequest = cameraDevice.createCaptureRequest(i4);
                } else {
                    createCaptureRequest = cameraDevice.createCaptureRequest(i5);
                }
            }
            bravo(createCaptureRequest, i5, afVar);
            C0505c c0505c = androidx.camera.core.impl.ad.juliet;
            Object obj = C0509g.foxtrot;
            androidx.camera.core.impl.B b2 = adVar.bravo;
            try {
                obj = b2.quebec(c0505c);
            } catch (IllegalArgumentException unused) {
            }
            Range range = (Range) obj;
            Objects.requireNonNull(range);
            Object obj2 = C0509g.foxtrot;
            if (!range.equals(obj2)) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                try {
                    obj2 = b2.quebec(androidx.camera.core.impl.ad.juliet);
                } catch (IllegalArgumentException unused2) {
                }
                Range range2 = (Range) obj2;
                Objects.requireNonNull(range2);
                createCaptureRequest.set(key, range2);
            }
            if (adVar.alpha() != 1 && adVar.bravo() != 1) {
                if (adVar.alpha() == 2) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                } else if (adVar.bravo() == 2) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                }
            } else {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            }
            C0505c c0505c2 = androidx.camera.core.impl.ad.hotel;
            TreeMap treeMap = b2.alpha;
            if (treeMap.containsKey(c0505c2)) {
                createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) b2.quebec(c0505c2));
            }
            C0505c c0505c3 = androidx.camera.core.impl.ad.india;
            if (treeMap.containsKey(c0505c3)) {
                createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) b2.quebec(c0505c3)).byteValue()));
            }
            alpha(createCaptureRequest, b2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                createCaptureRequest.addTarget((Surface) it2.next());
            }
            createCaptureRequest.setTag(adVar.foxtrot);
            return createCaptureRequest.build();
        }
        return null;
    }

    public static CaptureRequest delta(androidx.camera.core.impl.ad adVar, CameraDevice cameraDevice, androidx.compose.foundation.layout.af afVar) {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("template type = ");
        int i4 = adVar.charlie;
        sb2.append(i4);
        AbstractC3066u3.bravo("Camera2CaptureRequestBuilder", sb2.toString());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i4);
        bravo(createCaptureRequest, i4, afVar);
        alpha(createCaptureRequest, adVar.bravo);
        return createCaptureRequest.build();
    }

    public static Ne.f echo(Ne.f fVar, String str, String str2, int i4) {
        boolean z2;
        char charAt;
        char charAt2;
        Object obj;
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.purple) {
            String charlie = fVar.charlie();
            if (kotlin.text.r.quebec(charlie, str, false) && charlie.length() != str.length() && ('a' > (charAt = charlie.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return Ne.f.echo(str2.concat(StringsKt.lime(charlie, str)));
                }
                if (!z2) {
                    return fVar;
                }
                String lime = StringsKt.lime(charlie, str);
                if (lime.length() != 0 && E6.charlie(0, lime)) {
                    if (lime.length() != 1 && E6.charlie(1, lime)) {
                        Iterator it = new C1713e(0, lime.length() - 1, 1).iterator();
                        while (true) {
                            if (((C1714f) it).red) {
                                obj = ((kotlin.collections.x) it).next();
                                if (!E6.charlie(((Number) obj).intValue(), lime)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            String substring = lime.substring(0, intValue);
                            Intrinsics.delta(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String delta = E6.delta(substring);
                            String substring2 = lime.substring(intValue);
                            Intrinsics.delta(substring2, "this as java.lang.String).substring(startIndex)");
                            lime = delta.concat(substring2);
                        } else {
                            lime = E6.delta(lime);
                        }
                    } else if (lime.length() != 0 && 'A' <= (charAt2 = lime.charAt(0)) && charAt2 < '[') {
                        char lowerCase = Character.toLowerCase(charAt2);
                        String substring3 = lime.substring(1);
                        Intrinsics.delta(substring3, "this as java.lang.String).substring(startIndex)");
                        lime = lowerCase + substring3;
                    }
                }
                if (Ne.f.foxtrot(lime)) {
                    return Ne.f.echo(lime);
                }
            }
        }
        return null;
    }
}
