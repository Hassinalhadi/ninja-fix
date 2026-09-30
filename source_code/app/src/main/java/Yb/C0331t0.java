package Yb;

import android.app.AppOpsManager;
import android.content.Context;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.core.content.FileProvider;
import b.AbstractC0701p;
import b.C0696k;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.canhub.cropper.CropImageActivity;
import dc.C1608a;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import f.C1676m;
import f.InterfaceC1673j;
import g1.AbstractC1735d;
import g3.C1744e;
import g3.C1745f;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k0.AbstractC1996c;
import k0.C1995b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import p.C2263a;
import r3.C2492a;
import s0.AbstractC2557q;
import t.C2878d;
import t.C2879e;
import t.C2880f;
import u.AbstractC3134h;
import u.InterfaceC3133g;
import y.C3353M;
import z3.C3462a;

/* renamed from: Yb.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0331t0 extends kotlin.jvm.internal.i implements Function1 {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0331t0(int i4, Object obj, Class cls, String str, String str2, int i5, int i10) {
        super(i4, i5, cls, obj, str, str2);
        this.alpha = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Type inference failed for: r4v46, types: [kotlin.jvm.internal.q, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        int i4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AppOpsManager appOpsManager;
        int unsafeCheckOpNoThrow;
        String str;
        LocationManager locationManager;
        long j5;
        I0.a aVar;
        n.ap alpha;
        boolean z14;
        Integer valueOf;
        g3.af afVar;
        int i5 = 31;
        boolean z15 = true;
        Integer num = null;
        int i10 = 7;
        switch (this.alpha) {
            case 0:
                C2492a p02 = (C2492a) obj;
                Intrinsics.echo(p02, "p0");
                ProcessOrderActivityV2 processOrderActivityV2 = (ProcessOrderActivityV2) this.receiver;
                int i11 = ProcessOrderActivityV2.f12378N0;
                processOrderActivityV2.getClass();
                androidx.compose.runtime.ax axVar = processOrderActivityV2.f12432x0;
                int i12 = p02.alpha;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            processOrderActivityV2.bronze();
                        }
                    } else {
                        processOrderActivityV2.tango();
                        ((androidx.compose.runtime.t0) axVar).setValue(Boolean.FALSE);
                        processOrderActivityV2.f12426q0 = false;
                        Order order = (Order) p02.charlie;
                        if (order != null) {
                            processOrderActivityV2.f12418i0 = order;
                            ((androidx.compose.runtime.t0) processOrderActivityV2.f12431w0).setValue(order);
                            processOrderActivityV2.olive(order);
                            Integer id2 = order.getId();
                            if (id2 != null) {
                                int intValue = id2.intValue();
                                C1608a c1608a = processOrderActivityV2.f12398N;
                                if (c1608a != null) {
                                    if (!c1608a.alpha(order) || !Intrinsics.areEqual(order.getIsStacked(), Boolean.TRUE)) {
                                        Boolean isStacked = order.getIsStacked();
                                        Boolean bool = Boolean.TRUE;
                                        if (Intrinsics.areEqual(isStacked, bool)) {
                                            Context lima = processOrderActivityV2.lima();
                                            AtomicInteger atomicInteger = L9.d.alpha;
                                            Intrinsics.echo(lima, "<this>");
                                            if (!lima.getSharedPreferences("AddressNotesPrefShown", 0).getBoolean("multiple_orders_dialog_shown_" + intValue, false)) {
                                                ((androidx.compose.runtime.t0) processOrderActivityV2.f12402S).setValue(bool);
                                                Context lima2 = processOrderActivityV2.lima();
                                                Intrinsics.echo(lima2, "<this>");
                                                lima2.getSharedPreferences("AddressNotesPrefShown", 0).edit().putBoolean("multiple_orders_dialog_shown_" + intValue, true).apply();
                                            }
                                        }
                                    }
                                } else {
                                    Intrinsics.lima("hybridOrdersFeature");
                                    throw null;
                                }
                            }
                            processOrderActivityV2.lavender(order);
                            processOrderActivityV2.lime();
                            androidx.compose.runtime.ax axVar2 = processOrderActivityV2.f12429t0;
                            Integer id3 = order.getId();
                            if (id3 != null) {
                                int intValue2 = id3.intValue();
                                AtomicInteger atomicInteger2 = L9.d.alpha;
                                z2 = L9.k.golf(processOrderActivityV2).getBoolean(String.valueOf(intValue2), false);
                            } else {
                                z2 = false;
                            }
                            ((androidx.compose.runtime.t0) axVar2).setValue(Boolean.valueOf(z2));
                            C3462a.alpha("ProcessOrderV2", 12, "evt=FETCH_ORDER_DETAIL_SUCCESS orderStatus=" + order.getOrderStatusEnum(), null);
                            processOrderActivityV2.jade();
                        }
                    }
                } else {
                    processOrderActivityV2.tango();
                    ((androidx.compose.runtime.t0) axVar).setValue(Boolean.FALSE);
                    processOrderActivityV2.f12426q0 = false;
                    L9.d.pink(processOrderActivityV2, String.valueOf(p02.bravo));
                    Pair pair = (Pair) processOrderActivityV2.ivory().getErrorObserver().getValue();
                    if (pair != null) {
                        num = (Integer) pair.getFirst();
                    }
                    if (num != null && num.intValue() == 901) {
                        processOrderActivityV2.crimson(new C0322o0(processOrderActivityV2, 1));
                    } else if (num != null && num.intValue() == 902) {
                        processOrderActivityV2.coral(new C0322o0(processOrderActivityV2, i10));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                OrderTask p03 = (OrderTask) obj;
                Intrinsics.echo(p03, "p0");
                ag agVar = (ag) this.receiver;
                agVar.getClass();
                agVar.foxtrot = p03;
                w.o oVar = agVar.alpha;
                E9.c charlie = ((C0333u0) oVar.purple).charlie();
                C0333u0 c0333u0 = (C0333u0) oVar.purple;
                ProcessOrderActivityV2 processOrderActivityV22 = c0333u0.alpha;
                ProcessOrderActivityV2 context = c0333u0.alpha;
                File alpha2 = ((F9.i) charlie).alpha(processOrderActivityV22);
                if (alpha2 == null) {
                    return null;
                }
                try {
                    File file = new File(alpha2, "delivery_temp_" + System.currentTimeMillis() + ".jpg");
                    file.createNewFile();
                    agVar.bravo = file;
                    String alpha3 = c0333u0.alpha();
                    File file2 = agVar.bravo;
                    Intrinsics.checkNotNull(file2);
                    agVar.charlie = FileProvider.getUriForFile(context, alpha3, file2);
                    Intrinsics.checkNotNull(agVar.bravo);
                    Intrinsics.echo(context, "context");
                    return agVar.charlie;
                } catch (Exception e) {
                    K7.b.alpha().charlie(e);
                    agVar.foxtrot = null;
                    return null;
                }
            case 2:
                Uri p04 = (Uri) obj;
                Intrinsics.echo(p04, "p0");
                ((ah.b) this.receiver).alpha(p04);
                return Unit.INSTANCE;
            case 3:
                OrderTask p05 = (OrderTask) obj;
                Intrinsics.echo(p05, "p0");
                S s3 = (S) this.receiver;
                s3.getClass();
                s3.echo = p05;
                C0333u0 c0333u02 = (C0333u0) s3.alpha.purple;
                File alpha4 = ((F9.i) c0333u02.charlie()).alpha(c0333u02.alpha);
                if (alpha4 == null) {
                    return null;
                }
                try {
                    File file3 = new File(alpha4, "invoice_temp_" + System.currentTimeMillis() + ".jpg");
                    file3.createNewFile();
                    s3.bravo = file3;
                    ProcessOrderActivityV2 processOrderActivityV23 = c0333u02.alpha;
                    String alpha5 = c0333u02.alpha();
                    File file4 = s3.bravo;
                    Intrinsics.checkNotNull(file4);
                    return FileProvider.getUriForFile(processOrderActivityV23, alpha5, file4);
                } catch (Exception e4) {
                    K7.b.alpha().charlie(e4);
                    s3.echo = null;
                    return null;
                }
            case 4:
                Uri p06 = (Uri) obj;
                Intrinsics.echo(p06, "p0");
                ((ah.b) this.receiver).alpha(p06);
                return Unit.INSTANCE;
            case 5:
                a4.q p07 = (a4.q) obj;
                Intrinsics.echo(p07, "p0");
                CropImageActivity cropImageActivity = (CropImageActivity) this.receiver;
                int i13 = CropImageActivity.f3611b;
                cropImageActivity.getClass();
                int ordinal = p07.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        cropImageActivity.white.alpha("image/*");
                    }
                } else {
                    File createTempFile = File.createTempFile("tmp_image_file", ".png", cropImageActivity.getCacheDir());
                    createTempFile.createNewFile();
                    createTempFile.deleteOnExit();
                    Uri bravo = V8.a.bravo(cropImageActivity, createTempFile);
                    cropImageActivity.teal = bravo;
                    cropImageActivity.yellow.alpha(bravo);
                }
                return Unit.INSTANCE;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AbstractC0701p abstractC0701p = (AbstractC0701p) this.receiver;
                if (booleanValue) {
                    abstractC0701p.j();
                } else {
                    InterfaceC1673j interfaceC1673j = abstractC0701p.red;
                    bv.ad adVar = abstractC0701p.f3314i;
                    if (interfaceC1673j != null) {
                        Object[] objArr = adVar.charlie;
                        long[] jArr = adVar.alpha;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j6 = jArr[i14];
                                boolean z16 = z15;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> i5);
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        if ((j6 & 255) < 128) {
                                            i4 = i15;
                                            vf.ad.zulu(abstractC0701p.getCoroutineScope(), null, null, new C0696k(abstractC0701p, (C1676m) objArr[(i14 << 3) + i17], null), 3);
                                        } else {
                                            i4 = i15;
                                        }
                                        j6 >>= i4;
                                        i17++;
                                        i15 = i4;
                                    }
                                    if (i16 != i15) {
                                    }
                                }
                                if (i14 != length) {
                                    i14++;
                                    z15 = z16;
                                    i5 = 31;
                                }
                            }
                        }
                    }
                    adVar.alpha();
                    abstractC0701p.k();
                }
                return Unit.INSTANCE;
            case 7:
                Context p08 = (Context) obj;
                Intrinsics.echo(p08, "p0");
                ((C1745f) this.receiver).getClass();
                if (AbstractC1735d.alpha(p08, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (AbstractC1735d.alpha(p08, "android.permission.ACCESS_COARSE_LOCATION") != 0 || z10) {
                    return null;
                }
                return new C1744e(g3.u.alpha, "Approximate location is not supported. Precise location is required.");
            case 8:
                Context p09 = (Context) obj;
                Intrinsics.echo(p09, "p0");
                ((C1745f) this.receiver).getClass();
                if (AbstractC1735d.alpha(p09, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AbstractC1735d.alpha(p09, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 || z12) {
                    return null;
                }
                return new C1744e(g3.u.purple, "Location permission is required.");
            case 9:
                Context p010 = (Context) obj;
                Intrinsics.echo(p010, "p0");
                ((C1745f) this.receiver).getClass();
                if (AbstractC1735d.alpha(p010, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    return null;
                }
                return new C1744e(g3.u.purple, "Precise location permission is required.");
            case 10:
                Context p011 = (Context) obj;
                Intrinsics.echo(p011, "p0");
                ((C1745f) this.receiver).getClass();
                if (Build.VERSION.SDK_INT < 29 || AbstractC1735d.alpha(p011, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    return null;
                }
                return new C1744e(g3.u.red, "Background location permission is required for tracking.");
            case 11:
                Context p012 = (Context) obj;
                Intrinsics.echo(p012, "p0");
                ((C1745f) this.receiver).getClass();
                if (Build.VERSION.SDK_INT < 31) {
                    return null;
                }
                if (AbstractC1735d.alpha(p012, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    return null;
                }
                try {
                    Object systemService = p012.getSystemService("appops");
                    if (systemService instanceof AppOpsManager) {
                        appOpsManager = (AppOpsManager) systemService;
                    } else {
                        appOpsManager = null;
                    }
                    if (appOpsManager != null) {
                        unsafeCheckOpNoThrow = appOpsManager.unsafeCheckOpNoThrow("android:fine_location", Process.myUid(), p012.getPackageName());
                        if (unsafeCheckOpNoThrow == 0) {
                            return null;
                        }
                        if (unsafeCheckOpNoThrow == 4) {
                            if (z13) {
                                str = "Ask every time";
                            } else {
                                str = "While using the app";
                            }
                        } else {
                            str = "restricted";
                        }
                        return new C1744e(g3.u.silver, "Background location is set to '" + str + "' but must be 'Allow all the time'.");
                    }
                    return new C1744e(g3.u.silver, "Unable to verify location access level. Please ensure location is set to 'Allow all the time'.");
                } catch (Exception unused) {
                    return new C1744e(g3.u.silver, "Unable to verify location access level. Please ensure location is set to 'Allow all the time'.");
                }
            case 12:
                Context p013 = (Context) obj;
                Intrinsics.echo(p013, "p0");
                ((C1745f) this.receiver).getClass();
                if (Build.VERSION.SDK_INT < 34 || AbstractC1735d.alpha(p013, "android.permission.FOREGROUND_SERVICE_LOCATION") == 0) {
                    return null;
                }
                return new C1744e(g3.u.teal, "Foreground service location permission is required.");
            case 13:
                Context p014 = (Context) obj;
                Intrinsics.echo(p014, "p0");
                ((C1745f) this.receiver).getClass();
                Object systemService2 = p014.getSystemService("location");
                if (systemService2 instanceof LocationManager) {
                    locationManager = (LocationManager) systemService2;
                } else {
                    locationManager = null;
                }
                if (locationManager == null) {
                    return new C1744e(g3.u.white, "Unable to verify system location.");
                }
                try {
                    boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
                    boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
                    if (isProviderEnabled || isProviderEnabled2) {
                        return null;
                    }
                    return new C1744e(g3.u.white, "System location is disabled. Please enable GPS or Network location.");
                } catch (Exception unused2) {
                    return new C1744e(g3.u.white, "Unable to verify system location.");
                }
            case 14:
                hd.ao aoVar = (hd.ao) obj;
                gd.b bVar = ((gd.f) this.receiver).silver;
                bVar.getClass();
                OkHttpClient.Builder newBuilder = ((OkHttpClient) gd.f.f12695b.getValue()).newBuilder();
                newBuilder.dispatcher(new Dispatcher());
                bVar.alpha.invoke(newBuilder);
                if (aoVar != null) {
                    Long l10 = aoVar.bravo;
                    long j7 = 0;
                    if (l10 != null) {
                        long longValue = l10.longValue();
                        rg.b bVar2 = hd.ar.alpha;
                        if (longValue == Long.MAX_VALUE) {
                            longValue = 0;
                        }
                        newBuilder.connectTimeout(longValue, TimeUnit.MILLISECONDS);
                    }
                    Long l11 = aoVar.charlie;
                    if (l11 != null) {
                        long longValue2 = l11.longValue();
                        rg.b bVar3 = hd.ar.alpha;
                        if (longValue2 == Long.MAX_VALUE) {
                            j5 = 0;
                        } else {
                            j5 = longValue2;
                        }
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        newBuilder.readTimeout(j5, timeUnit);
                        if (longValue2 != Long.MAX_VALUE) {
                            j7 = longValue2;
                        }
                        newBuilder.writeTimeout(j7, timeUnit);
                    }
                }
                return newBuilder.build();
            case 15:
                return ((io.ktor.utils.io.m) ((io.ktor.utils.io.ag) this.receiver)).india((Nd.c) obj);
            case 16:
                KeyEvent keyEvent = ((C1995b) obj).alpha;
                n.S s9 = (n.S) this.receiver;
                s9.getClass();
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    n.ak akVar = s9.india;
                    akVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        akVar.alpha = Integer.valueOf(unicodeChar & LottieConstants.IterateForever);
                        valueOf = null;
                    } else {
                        Integer num2 = akVar.alpha;
                        if (num2 != null) {
                            akVar.alpha = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num2.intValue(), unicodeChar);
                            Integer valueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                unicodeChar = valueOf2.intValue();
                            }
                            valueOf = Integer.valueOf(unicodeChar);
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        aVar = new I0.a(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        C3353M c3353m = s9.foxtrot;
                        boolean z17 = s9.delta;
                        if (aVar == null) {
                            if (z17) {
                                s9.alpha(kotlin.collections.ab.juliet(aVar));
                                c3353m.alpha = null;
                                z14 = true;
                            }
                            z14 = false;
                        } else {
                            if (AbstractC1996c.foxtrot(keyEvent) == 2 && (alpha = s9.juliet.alpha(keyEvent)) != null && (!alpha.alpha || z17)) {
                                ?? obj2 = new Object();
                                obj2.alpha = true;
                                Cb.ac acVar = new Cb.ac(alpha, s9, (Object) obj2, 24);
                                n.e0 delta = s9.alpha.delta();
                                I0.aa aaVar = s9.charlie;
                                y.aq aqVar = new y.aq(aaVar, s9.golf, delta, c3353m);
                                D0.g gVar = aqVar.golf;
                                acVar.invoke(aqVar);
                                if (!D0.am.bravo(aqVar.foxtrot, aaVar.bravo) || !Intrinsics.areEqual(gVar, aaVar.alpha)) {
                                    s9.kilo.invoke(I0.aa.alpha(aaVar, gVar, aqVar.foxtrot, 4));
                                }
                                n.j0 j0Var = s9.hotel;
                                if (j0Var != null) {
                                    j0Var.echo = true;
                                }
                                z14 = obj2.alpha;
                            }
                            z14 = false;
                        }
                        return Boolean.valueOf(z14);
                    }
                }
                aVar = null;
                C3353M c3353m2 = s9.foxtrot;
                boolean z172 = s9.delta;
                if (aVar == null) {
                }
                return Boolean.valueOf(z14);
            case 17:
                p3.ae p015 = (p3.ae) obj;
                Intrinsics.echo(p015, "p0");
                p3.ab abVar = (p3.ab) this.receiver;
                boolean isMockLocationAllowed = abVar.alpha.golf.isMockLocationAllowed();
                int ordinal2 = p015.ordinal();
                if (ordinal2 != 0) {
                    float f5 = abVar.alpha.kilo;
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 4) {
                                if (ordinal2 == 5) {
                                    return new g3.af(f5, 60000L, isMockLocationAllowed);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            return new g3.af(200.0f, abVar.echo().bravo, isMockLocationAllowed);
                        }
                        afVar = new g3.af(abVar.echo().echo, abVar.echo().delta, isMockLocationAllowed);
                    } else {
                        return new g3.af(f5, Long.MAX_VALUE, isMockLocationAllowed);
                    }
                } else {
                    afVar = new g3.af(abVar.echo().hotel, abVar.echo().golf, isMockLocationAllowed);
                }
                return afVar;
            case 18:
                long j10 = ((Z.b) obj).alpha;
                C2880f c2880f = (C2880f) this.receiver;
                c2880f.getClass();
                InterfaceC3133g interfaceC3133g = (InterfaceC3133g) AbstractC2557q.echo(c2880f, AbstractC3134h.alpha);
                if (interfaceC3133g != null) {
                    vf.ad.zulu(c2880f.getCoroutineScope(), null, null, new C2879e(c2880f, interfaceC3133g, new C2878d(c2880f, j10), null), 3);
                }
                return Unit.INSTANCE;
            case 19:
                ((C2263a) this.receiver).bravo.golf((Function1) obj);
                return Unit.INSTANCE;
            default:
                ((vf.K) this.receiver).kilo((Throwable) obj);
                return Unit.INSTANCE;
        }
    }
}
