package P7;

import B9.C0058p;
import T.r;
import Y.aa;
import Y.h;
import Y.n;
import Y.x;
import ae.ai;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b.ar;
import bv.am;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;
import kotlin.text.StringsKt;
import l3.AbstractC2056a;
import p0.AbstractC2264a;
import p3.C2272d;
import p3.ab;
import p3.ah;
import p3.m;
import s0.AbstractC2555o;
import s0.al;
import s0.g0;
import t0.C2932p;
import t0.an;
import u.InterfaceC3132f;
import u3.InterfaceC3142e;
import w0.C3232a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends i implements Function0 {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, Object obj, Class cls, String str, String str2, int i5, int i10) {
        super(i4, i5, cls, obj, str, str2);
        this.alpha = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        C0058p c0058p;
        char c3;
        boolean z2;
        char c4;
        boolean z10;
        boolean f5;
        String str;
        String locationsTopic;
        ContentCaptureSession bravo;
        int i5 = 0;
        boolean z11 = true;
        switch (this.alpha) {
            case 0:
                ((e) this.receiver).getClass();
                String threadName = Thread.currentThread().getName();
                Intrinsics.delta(threadName, "threadName");
                return Boolean.valueOf(StringsKt.beige(threadName, "Firebase Background Thread #", false));
            case 1:
                ((e) this.receiver).getClass();
                String threadName2 = Thread.currentThread().getName();
                Intrinsics.delta(threadName2, "threadName");
                return Boolean.valueOf(StringsKt.beige(threadName2, "Firebase Blocking Thread #", false));
            case 2:
                ((e) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                h hVar = (h) this.receiver;
                n nVar = hVar.alpha;
                aa aaVar = nVar.hotel;
                am amVar = hVar.charlie;
                am amVar2 = hVar.delta;
                if (aaVar == null) {
                    Object[] objArr = amVar2.bravo;
                    long[] jArr = amVar2.alpha;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        char c10 = 7;
                        while (true) {
                            long j5 = jArr[i10];
                            boolean z12 = z11;
                            if ((((~j5) << c10) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j5 & 255) < 128) {
                                        c4 = c10;
                                        z10 = z12;
                                        ((Y.e) objArr[(i10 << 3) + i12]).a(x.silver);
                                    } else {
                                        c4 = c10;
                                        z10 = z12;
                                    }
                                    j5 >>= 8;
                                    i12++;
                                    c10 = c4;
                                    z12 = z10;
                                }
                                c3 = c10;
                                z2 = z12;
                                if (i11 != 8) {
                                }
                            } else {
                                c3 = c10;
                                z2 = z12;
                            }
                            if (i10 != length) {
                                i10++;
                                c10 = c3;
                                z11 = z2;
                            }
                        }
                    }
                } else {
                    int i13 = 1;
                    if (aaVar.isAttached()) {
                        if (amVar.charlie(aaVar)) {
                            aaVar.e();
                        }
                        x d4 = aaVar.d();
                        if (!aaVar.getNode().isAttached()) {
                            AbstractC2264a.bravo("visitAncestors called on an unattached node");
                        }
                        r node = aaVar.getNode();
                        al golf = AbstractC2555o.golf(aaVar);
                        int i14 = 0;
                        while (golf != null) {
                            if ((((r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 5120) != 0) {
                                while (node != null) {
                                    if ((node.getKindSet$ui_release() & 5120) != 0) {
                                        if ((node.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i14++;
                                        }
                                        if ((node instanceof Y.e) && amVar2.charlie(node)) {
                                            if (i14 <= i13) {
                                                ((Y.e) node).a(d4);
                                            } else {
                                                ((Y.e) node).a(x.purple);
                                            }
                                            amVar2.lima(node);
                                        }
                                    }
                                    node = node.getParent$ui_release();
                                    i13 = 1;
                                }
                            }
                            golf = golf.victor();
                            if (golf != null && (c0058p = golf.f13305x) != null) {
                                node = (g0) c0058p.golf;
                            } else {
                                node = null;
                            }
                            i13 = 1;
                        }
                        Object[] objArr2 = amVar2.bravo;
                        long[] jArr2 = amVar2.alpha;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i15 = 0;
                            while (true) {
                                long j6 = jArr2[i15];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        if ((j6 & 255) < 128) {
                                            ((Y.e) objArr2[(i15 << 3) + i17]).a(x.silver);
                                        }
                                        j6 >>= 8;
                                    }
                                    i4 = 1;
                                    if (i16 != 8) {
                                    }
                                } else {
                                    i4 = 1;
                                }
                                if (i15 != length2) {
                                    i15 += i4;
                                }
                            }
                        }
                    }
                }
                if (nVar.hotel == null || nVar.charlie.d() == x.silver) {
                    nVar.charlie();
                }
                amVar.bravo();
                amVar2.bravo();
                hVar.echo = false;
                return Unit.INSTANCE;
            case 4:
                ((ai) this.receiver).foxtrot();
                return Unit.INSTANCE;
            case 5:
                ((ai) this.receiver).foxtrot();
                return Unit.INSTANCE;
            case 6:
                f5 = ((aa) ((ar) this.receiver).f3299a).f(7);
                return Boolean.valueOf(f5);
            case 7:
                return Boolean.valueOf(((ab) this.receiver).echo().foxtrot);
            case 8:
                return Boolean.valueOf(((ab) this.receiver).echo().india);
            case 9:
                return Long.valueOf(((ab) this.receiver).echo().juliet);
            case 10:
                return Float.valueOf(((ab) this.receiver).echo().kilo);
            case 11:
                return Long.valueOf(((ab) this.receiver).echo().alpha);
            case 12:
                return Integer.valueOf(((ab) this.receiver).echo().charlie);
            case 13:
                ab abVar = (ab) this.receiver;
                C2272d c2272d = abVar.alpha;
                FusedLocationProviderClient fusedLocationProviderClient = abVar.amber;
                if (fusedLocationProviderClient != null) {
                    if (AbstractC2056a.charlie(c2272d.alpha)) {
                        str = "HIGH";
                    } else {
                        str = "DEGRADED";
                    }
                    String str2 = str;
                    if (c2272d.foxtrot.getState() == ah.purple && (locationsTopic = c2272d.echo.getLocationsTopic()) != null) {
                        fusedLocationProviderClient.getLastLocation().bravo(new bj.i(1, abVar, str2, fusedLocationProviderClient, locationsTopic));
                    }
                }
                return Unit.INSTANCE;
            case 14:
                ab abVar2 = (ab) this.receiver;
                if (!abVar2.blue) {
                    LocationCallback locationCallback = abVar2.azure;
                    FusedLocationProviderClient fusedLocationProviderClient2 = abVar2.amber;
                    InterfaceC3142e interfaceC3142e = abVar2.alpha.charlie;
                    if (locationCallback != null && fusedLocationProviderClient2 != null) {
                        abVar2.blue = true;
                        Function0 function0 = abVar2.india;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        abVar2.india = null;
                        abVar2.hotel = false;
                        try {
                            try {
                                LocationRequest locationRequest = abVar2.beige;
                                if (locationRequest == null) {
                                    locationRequest = abVar2.charlie();
                                }
                                fusedLocationProviderClient2.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper());
                                abVar2.hotel = true;
                                abVar2.india = new m(fusedLocationProviderClient2, locationCallback, i5);
                                abVar2.zulu = System.currentTimeMillis();
                                abVar2.foxtrot(null);
                                interfaceC3142e.alpha("LocationFlow", "[STUCK_RECOVERY] Re-registered location updates");
                            } catch (Exception e) {
                                interfaceC3142e.bravo("LocationFlow", "[STUCK_RECOVERY] Re-register failed: " + e.getMessage(), e);
                                try {
                                    K7.b.alpha().charlie(e);
                                } catch (Exception unused) {
                                }
                            }
                            abVar2.blue = false;
                        } catch (Throwable th) {
                            abVar2.blue = false;
                            throw th;
                        }
                    } else {
                        interfaceC3142e.alpha("LocationFlow", "[STUCK_RECOVERY] Cannot re-register: callback or client null");
                    }
                }
                return Unit.INSTANCE;
            case 15:
                return ((InterfaceC3132f) this.receiver).cyan();
            default:
                View view = (View) this.receiver;
                C2932p c2932p = an.alpha;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 30) {
                    bc.d.hotel(view);
                }
                if (i18 < 29 || (bravo = I2.b.bravo(view)) == null) {
                    return null;
                }
                return new C3232a(bravo, view);
        }
    }
}
