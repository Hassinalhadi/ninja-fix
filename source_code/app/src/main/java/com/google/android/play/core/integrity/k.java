package com.google.android.play.core.integrity;

import a0.C0347ag;
import a0.ao;
import android.app.Service;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import bd.ExecutorC0753f;
import bx.C0769g;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.measurement.internal.C1469t;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.material.internal.s;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import g.C1718a;
import g0.AbstractC1722b;
import g0.C1729i;
import g0.C1730j;
import g0.C1731k;
import g0.aa;
import g0.r;
import g0.u;
import g0.v;
import g0.w;
import g0.y;
import g0.z;
import ge.InterfaceC1772d;
import j1.C1929c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.al;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p6.ab;
import p6.q;
import p6.x;
import p7.t;
import s6.AbstractC2763s0;
import s6.AbstractC2824y7;
import t0.C2932p;
import t0.InterfaceC2894L;
import t0.an;
import vg.A;

/* loaded from: classes2.dex */
public class k implements p7.l, T5.m, p6.n, InterfaceC2894L, Callback, ServiceComponentBuilder {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;

    public /* synthetic */ k(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k delta(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
            try {
                return new k(2, fileChannel, fileLock);
            } catch (IOException e4) {
                e = e4;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (IOException unused) {
                    }
                }
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (Error e5) {
                e = e5;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            } catch (OverlappingFileLockException e10) {
                e = e10;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            }
        } catch (IOException | Error | OverlappingFileLockException e11) {
            e = e11;
            fileChannel = null;
            fileLock = null;
        }
    }

    public static al echo(List attributes) {
        Intrinsics.echo(attributes, "attributes");
        if (attributes.isEmpty()) {
            return al.red;
        }
        return new al(attributes);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // T5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        int i4 = 2;
        G6.h hVar = (G6.h) obj2;
        q qVar = (q) obj;
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) this.purple;
        G6.a aVar = (G6.a) this.red;
        Object obj3 = null;
        if (qVar.black(com.google.android.gms.location.n.foxtrot)) {
            ab abVar = (ab) qVar.tango();
            zzee zzeeVar = new zzee(4, null, new p6.j(2, hVar), null, null);
            Parcel ivory = abVar.ivory();
            p6.e.bravo(ivory, currentLocationRequest);
            p6.e.bravo(ivory, zzeeVar);
            Parcel jade = abVar.jade(ivory, 92);
            IBinder readStrongBinder = jade.readStrongBinder();
            int i5 = V5.i.hotel;
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                if (queryLocalInterface instanceof V5.j) {
                    obj3 = (V5.j) queryLocalInterface;
                } else {
                    obj3 = new AbstractC1394y(readStrongBinder, "com.google.android.gms.common.internal.ICancelToken", 2);
                }
            }
            jade.recycle();
            if (aVar != null) {
                aVar.alpha(new C1718a(18, obj3));
                return;
            }
            return;
        }
        if (qVar.black(com.google.android.gms.location.n.bravo)) {
            ab abVar2 = (ab) qVar.tango();
            p6.j jVar = new p6.j(2, hVar);
            Parcel ivory2 = abVar2.ivory();
            p6.e.bravo(ivory2, currentLocationRequest);
            ivory2.writeStrongBinder(jVar);
            Parcel jade2 = abVar2.jade(ivory2, 87);
            IBinder readStrongBinder2 = jade2.readStrongBinder();
            int i10 = V5.i.hotel;
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                if (queryLocalInterface2 instanceof V5.j) {
                    obj3 = (V5.j) queryLocalInterface2;
                } else {
                    obj3 = new AbstractC1394y(readStrongBinder2, "com.google.android.gms.common.internal.ICancelToken", 2);
                }
            }
            jade2.recycle();
            if (aVar != null) {
                aVar.alpha(new s(26, obj3));
                return;
            }
            return;
        }
        K1.f charlie = AbstractC2824y7.charlie(new p6.k(qVar, hVar), "GetCurrentLocation", x.alpha);
        T5.i iVar = (T5.i) charlie.bravo;
        Objects.requireNonNull(iVar);
        k kVar = new k(7, charlie, hVar);
        G6.h hVar2 = new G6.h();
        com.google.android.gms.location.g gVar = new com.google.android.gms.location.g(currentLocationRequest.red, 0L);
        gVar.delta(0L);
        long j5 = currentLocationRequest.silver;
        if (j5 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.alpha("durationMillis must be greater than 0", z2);
        gVar.echo = j5;
        gVar.bravo(currentLocationRequest.purple);
        gVar.charlie(currentLocationRequest.alpha);
        gVar.lima = currentLocationRequest.teal;
        int i11 = currentLocationRequest.white;
        if (i11 != 0 && i11 != 1) {
            if (i11 == 2) {
                z10 = true;
                V5.x.charlie(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i4));
                gVar.kilo = i11;
                gVar.hotel = true;
                gVar.mike = currentLocationRequest.yellow;
                qVar.bronze(kVar, gVar.alpha(), hVar2);
                hVar2.alpha.bravo(new G6.p(hVar));
                if (aVar == null) {
                    aVar.alpha(new gd.a(6, qVar, iVar));
                    return;
                }
                return;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        i4 = i11;
        V5.x.charlie(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i4));
        gVar.kilo = i11;
        gVar.hotel = true;
        gVar.mike = currentLocationRequest.yellow;
        qVar.bronze(kVar, gVar.alpha(), hVar2);
        hVar2.alpha.bravo(new G6.p(hVar));
        if (aVar == null) {
        }
    }

    @Override // p6.n
    public void alpha(K1.f fVar) {
        throw new IllegalStateException();
    }

    @Override // p7.m
    public Object bravo() {
        return new i(((E5.j) this.purple).purple, (t) ((p7.k) this.red).bravo(), new C1469t(8));
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public ServiceComponent build() {
        AbstractC2763s0.bravo(Service.class, (Service) this.red);
        return new w9.n((w9.p) this.purple);
    }

    @Override // t0.InterfaceC2894L
    public void charlie(View view, float[] fArr) {
        C0347ag.delta(fArr);
        juliet(view, fArr);
    }

    public int foxtrot(InterfaceC1772d kClass) {
        int intValue;
        Intrinsics.echo(kClass, "kClass");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.purple;
        String key = kClass.juliet();
        Intrinsics.checkNotNull(key);
        C0769g c0769g = new C0769g(12, this);
        Intrinsics.echo(concurrentHashMap, "<this>");
        Intrinsics.echo(key, "key");
        Integer num = (Integer) concurrentHashMap.get(key);
        if (num == null) {
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 == null) {
                        Object invoke = c0769g.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) invoke).intValue()));
                        num2 = (Integer) invoke;
                    }
                    intValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return intValue;
        }
        return num.intValue();
    }

    public void golf(p1.f fVar) {
        int i4 = fVar.bravo;
        ExecutorC0753f executorC0753f = (ExecutorC0753f) this.red;
        s sVar = (s) this.purple;
        if (i4 == 0) {
            executorC0753f.execute(new com.google.common.util.concurrent.d(15, sVar, fVar.alpha));
        } else {
            executorC0753f.execute(new K1.i(sVar, i4, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x016e, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x0426. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0418 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0409  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void hotel(String str, ArrayList arrayList) {
        int i4;
        int i5;
        char charAt;
        char c3;
        int i10;
        ?? r20;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        long j5;
        boolean z14;
        char c4;
        int i12;
        int i13;
        int i14;
        char c10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j6;
        int i21;
        boolean z15;
        long j7;
        int floatToRawIntBits;
        float f5;
        long j10;
        float f10;
        int i22;
        char c11;
        boolean z16;
        int i23;
        char c12;
        long j11;
        long floatToRawIntBits2;
        char c13;
        int i24;
        boolean z17;
        float intBitsToFloat;
        int length = str.length();
        int i25 = 0;
        while (true) {
            i4 = 32;
            if (i25 >= length || Intrinsics.golf(str.charAt(i25), 32) > 0) {
                break;
            } else {
                i25++;
            }
        }
        while (length > i25 && Intrinsics.golf(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i26 = 0;
        while (i25 < length) {
            while (true) {
                i5 = i25 + 1;
                charAt = str.charAt(i25);
                int i27 = charAt | ' ';
                if ((i27 - 122) * (i27 - 97) > 0 || i27 == 101) {
                    if (i5 >= length) {
                        charAt = 0;
                    } else {
                        i25 = i5;
                    }
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i26 = 0;
                    while (true) {
                        if (i5 < length && Intrinsics.golf(str.charAt(i5), i4) <= 0) {
                            i5++;
                        } else {
                            if (i5 == length) {
                                int i28 = i4;
                                i11 = i26;
                                j10 = (i5 << i28) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                c3 = charAt;
                                i10 = i28;
                            } else {
                                int i29 = i4;
                                i11 = i26;
                                char charAt2 = str.charAt(i5);
                                if (charAt2 == '-') {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                i10 = i29;
                                if (z13) {
                                    i12 = i5 + 1;
                                    if (i12 == length) {
                                        j10 = (i12 << i10) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                        c3 = charAt;
                                    } else {
                                        z14 = true;
                                        z17 = true;
                                        z14 = true;
                                        c4 = str.charAt(i12);
                                        j5 = 4294967295L;
                                        if (((char) (c4 - '0')) >= '\n' && c4 != '.') {
                                            j11 = i12 << i10;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            j10 = j11 | (floatToRawIntBits2 & j5);
                                            c3 = charAt;
                                            r20 = z17;
                                            int i30 = (int) (j10 >>> i10);
                                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & j5));
                                            if (!Float.isNaN(intBitsToFloat)) {
                                                float[] fArr = (float[]) this.red;
                                                i26 = i11 + 1;
                                                fArr[i11] = intBitsToFloat;
                                                if (i26 >= fArr.length) {
                                                    float[] fArr2 = new float[i26 * 2];
                                                    this.red = fArr2;
                                                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                                }
                                                i5 = i30;
                                            } else {
                                                i5 = i30;
                                                i26 = i11;
                                            }
                                            while (i5 < length && str.charAt(i5) == ',') {
                                                i5++;
                                            }
                                            if (i5 >= length && !Float.isNaN(intBitsToFloat)) {
                                                i4 = i10;
                                                charAt = c3;
                                            }
                                        }
                                    }
                                } else {
                                    j5 = 4294967295L;
                                    z14 = true;
                                    c4 = charAt2;
                                    i12 = i5;
                                }
                                int length2 = str.length();
                                long j12 = 0;
                                int i31 = i12;
                                long j13 = 0;
                                while (i31 != length) {
                                    int i32 = c4 - '0';
                                    if (((char) i32) < '\n') {
                                        j13 = (j13 * 10) + i32;
                                        i31++;
                                        if (i31 < length2) {
                                            c4 = str.charAt(i31);
                                        } else {
                                            c4 = 0;
                                        }
                                    } else {
                                        i13 = i31 - i12;
                                        if (i31 == length && c4 == '.') {
                                            int i33 = i31 + 1;
                                            i16 = i33;
                                            c10 = '0';
                                            while (true) {
                                                if (length - i16 >= 4) {
                                                    int i34 = length2;
                                                    long charAt3 = str.charAt(i16) | (str.charAt(i16 + 1) << 16) | (str.charAt(i16 + 2) << i10) | (str.charAt(i16 + 3) << 48);
                                                    long j14 = charAt3 - 13511005043687472L;
                                                    if ((((charAt3 + 19703549022044230L) | j14) & (-35747867511423104L)) != 0) {
                                                        i24 = -1;
                                                    } else {
                                                        i24 = (int) ((j14 * 281475406208040961L) >>> 48);
                                                    }
                                                    if (i24 >= 0) {
                                                        j13 = (j13 * 10000) + i24;
                                                        i16 += 4;
                                                        length2 = i34;
                                                    } else {
                                                        i14 = i34;
                                                    }
                                                } else {
                                                    i14 = length2;
                                                }
                                            }
                                            if (i16 < i14) {
                                                c13 = str.charAt(i16);
                                                while (i16 != length) {
                                                    int i35 = c13 - '0';
                                                    if (((char) i35) < '\n') {
                                                        j13 = (j13 * 10) + i35;
                                                        i16++;
                                                        if (i16 < i14) {
                                                            c13 = str.charAt(i16);
                                                        }
                                                    } else {
                                                        i17 = i33 - i16;
                                                        i13 -= i17;
                                                        c4 = c13;
                                                        i15 = i33;
                                                    }
                                                }
                                                i17 = i33 - i16;
                                                i13 -= i17;
                                                c4 = c13;
                                                i15 = i33;
                                            }
                                            c13 = 0;
                                        } else {
                                            i14 = length2;
                                            c10 = '0';
                                            i15 = i31;
                                            i16 = i15;
                                            i17 = 0;
                                        }
                                        if (i13 != 0) {
                                            j11 = i16 << i10;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            z17 = z14;
                                            j10 = j11 | (floatToRawIntBits2 & j5);
                                            c3 = charAt;
                                            r20 = z17;
                                            int i302 = (int) (j10 >>> i10);
                                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & j5));
                                            if (!Float.isNaN(intBitsToFloat)) {
                                            }
                                            while (i5 < length) {
                                                i5++;
                                            }
                                            if (i5 >= length) {
                                                i4 = i10;
                                                charAt = c3;
                                            }
                                        } else {
                                            if ((c4 | ' ') == 101) {
                                                int i36 = i16 + 1;
                                                if (i36 < i14) {
                                                    c11 = str.charAt(i36);
                                                } else {
                                                    c11 = 0;
                                                }
                                                if (c11 == '-') {
                                                    z16 = z14 ? 1 : 0;
                                                } else {
                                                    z16 = false;
                                                }
                                                int i37 = i17;
                                                if (z16 || c11 == '+') {
                                                    i36 = i16 + 2;
                                                }
                                                char charAt4 = str.charAt(i36);
                                                i19 = 0;
                                                while (true) {
                                                    if (i36 != length) {
                                                        int i38 = charAt4 - '0';
                                                        i23 = i36;
                                                        if (((char) i38) < '\n') {
                                                            if (i19 < 1024) {
                                                                i19 = (i19 * 10) + i38;
                                                            }
                                                            i36 = i23 + 1;
                                                            if (i36 < i14) {
                                                                c12 = str.charAt(i36);
                                                            } else {
                                                                c12 = 0;
                                                            }
                                                            charAt4 = c12;
                                                        }
                                                    } else {
                                                        i23 = i36;
                                                    }
                                                }
                                                if (z16) {
                                                    i19 = -i19;
                                                }
                                                i17 = i37 + i19;
                                                i18 = i23;
                                            } else {
                                                i18 = i16;
                                                i19 = 0;
                                            }
                                            if (i13 > 19) {
                                                int i39 = i12;
                                                char charAt5 = str.charAt(i12);
                                                while (true) {
                                                    i20 = i17;
                                                    if (i18 != length && (charAt5 == c10 || charAt5 == '.')) {
                                                        if (charAt5 == '0') {
                                                            i13--;
                                                        }
                                                        int i40 = i39 + 1;
                                                        if (i40 < i14) {
                                                            charAt5 = str.charAt(i40);
                                                        } else {
                                                            charAt5 = 0;
                                                        }
                                                        i39 = i40;
                                                        i17 = i20;
                                                        c10 = '0';
                                                    }
                                                }
                                                if (i13 > 19) {
                                                    char charAt6 = str.charAt(i12);
                                                    int i41 = i19;
                                                    long j15 = 0;
                                                    while (true) {
                                                        if (i12 != i31) {
                                                            char c14 = charAt6;
                                                            c3 = charAt;
                                                            if (Long.compare(j15 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                j15 = (j15 * 10) + (c14 - '0');
                                                                i12++;
                                                                if (i12 < i14) {
                                                                    charAt6 = str.charAt(i12);
                                                                } else {
                                                                    charAt6 = 0;
                                                                }
                                                                charAt = c3;
                                                            }
                                                        } else {
                                                            c3 = charAt;
                                                        }
                                                    }
                                                    if (Long.compare(j15 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        i21 = i41 + (i31 - i12);
                                                    } else {
                                                        char charAt7 = str.charAt(i15);
                                                        int i42 = i15;
                                                        while (true) {
                                                            if (i42 != i16) {
                                                                char c15 = charAt7;
                                                                i22 = i42;
                                                                if (Long.compare(j15 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                    j15 = (j15 * 10) + (c15 - '0');
                                                                    i42 = i22 + 1;
                                                                    if (i42 < i14) {
                                                                        charAt7 = str.charAt(i42);
                                                                    } else {
                                                                        charAt7 = 0;
                                                                    }
                                                                }
                                                            } else {
                                                                i22 = i42;
                                                            }
                                                        }
                                                        i21 = i41 + (i15 - i22);
                                                    }
                                                    z15 = z14 ? 1 : 0;
                                                    j6 = j15;
                                                    if (-10 > i21 && i21 < 11 && !z15 && Long.compare(j6 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                        float f11 = (float) j6;
                                                        float[] fArr3 = AbstractC1722b.alpha;
                                                        if (i21 < 0) {
                                                            f10 = f11 / fArr3[-i21];
                                                        } else {
                                                            f10 = f11 * fArr3[i21];
                                                        }
                                                        if (z13) {
                                                            f10 = -f10;
                                                        }
                                                        j7 = i18 << i10;
                                                        floatToRawIntBits = Float.floatToRawIntBits(f10);
                                                    } else if (j6 != 0) {
                                                        if (z13) {
                                                            f5 = -0.0f;
                                                        } else {
                                                            f5 = 0.0f;
                                                        }
                                                        j7 = i18 << i10;
                                                        floatToRawIntBits = Float.floatToRawIntBits(f5);
                                                    } else if (-126 <= i21 && i21 < 128) {
                                                        long j16 = AbstractC1722b.bravo[i21 + 325];
                                                        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j6);
                                                        long j17 = j6 << numberOfLeadingZeros;
                                                        long j18 = j17 & j5;
                                                        long j19 = j17 >>> i10;
                                                        long j20 = j16 & j5;
                                                        long j21 = j16 >>> i10;
                                                        long j22 = j19 * j21;
                                                        long j23 = j21 * j18;
                                                        long j24 = j22 + ((((j19 * j20) + ((j18 * j20) >>> i10)) + (j23 & j5)) >>> i10) + (j23 >>> i10);
                                                        int i43 = (int) (j24 >>> 63);
                                                        long j25 = j24 >>> (i43 + 9);
                                                        int i44 = numberOfLeadingZeros + (i43 ^ 1);
                                                        long j26 = j24 & 511;
                                                        if (j26 != 511 && (j26 != 0 || (j25 & 3) != 1)) {
                                                            long j27 = (j25 + 1) >>> (z14 ? 1L : 0L);
                                                            if (j27 >= 9007199254740992L) {
                                                                i44--;
                                                                j27 = 4503599627370496L;
                                                            }
                                                            long j28 = j27 & (-4503599627370497L);
                                                            long j29 = ((((i21 * 217706) >> 16) + Barcode.FORMAT_UPC_E) + 63) - i44;
                                                            if (j29 >= 1 && j29 <= 2046) {
                                                                long j30 = (j29 << 52) | j28;
                                                                if (z13) {
                                                                    j12 = Long.MIN_VALUE;
                                                                }
                                                                j7 = i18 << i10;
                                                                floatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble(j30 | j12));
                                                            } else {
                                                                String substring = str.substring(i5, i18);
                                                                Intrinsics.delta(substring, "substring(...)");
                                                                j7 = i18 << i10;
                                                                floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring));
                                                            }
                                                        } else {
                                                            String substring2 = str.substring(i5, i18);
                                                            Intrinsics.delta(substring2, "substring(...)");
                                                            j7 = i18 << i10;
                                                            floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring2));
                                                        }
                                                    } else {
                                                        String substring3 = str.substring(i5, i18);
                                                        Intrinsics.delta(substring3, "substring(...)");
                                                        j7 = i18 << i10;
                                                        floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring3));
                                                    }
                                                    j10 = j7 | (floatToRawIntBits & j5);
                                                    r20 = z14;
                                                    int i3022 = (int) (j10 >>> i10);
                                                    intBitsToFloat = Float.intBitsToFloat((int) (j10 & j5));
                                                    if (!Float.isNaN(intBitsToFloat)) {
                                                    }
                                                    while (i5 < length) {
                                                    }
                                                    if (i5 >= length) {
                                                    }
                                                }
                                            } else {
                                                i20 = i17;
                                            }
                                            c3 = charAt;
                                            j6 = j13;
                                            i21 = i20;
                                            z15 = false;
                                            if (-10 > i21) {
                                            }
                                            if (j6 != 0) {
                                            }
                                            j10 = j7 | (floatToRawIntBits & j5);
                                            r20 = z14;
                                            int i30222 = (int) (j10 >>> i10);
                                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & j5));
                                            if (!Float.isNaN(intBitsToFloat)) {
                                            }
                                            while (i5 < length) {
                                            }
                                            if (i5 >= length) {
                                            }
                                        }
                                    }
                                }
                                i13 = i31 - i12;
                                if (i31 == length) {
                                }
                                i14 = length2;
                                c10 = '0';
                                i15 = i31;
                                i16 = i15;
                                i17 = 0;
                                if (i13 != 0) {
                                }
                            }
                            j5 = 4294967295L;
                            r20 = 1;
                            int i302222 = (int) (j10 >>> i10);
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & j5));
                            if (!Float.isNaN(intBitsToFloat)) {
                            }
                            while (i5 < length) {
                            }
                            if (i5 >= length) {
                            }
                        }
                    }
                } else {
                    c3 = charAt;
                    i10 = i4;
                    r20 = 1;
                }
                i25 = i5;
                float[] fArr4 = (float[]) this.red;
                int i45 = 2;
                switch (c3) {
                    case 'A':
                        int i46 = i26 - 7;
                        for (int i47 = 0; i47 <= i46; i47 += 7) {
                            float f12 = fArr4[i47];
                            float f13 = fArr4[i47 + 1];
                            float f14 = fArr4[i47 + 2];
                            if (Float.compare(fArr4[i47 + 3], 0.0f) != 0) {
                                z2 = r20;
                            } else {
                                z2 = false;
                            }
                            if (Float.compare(fArr4[i47 + 4], 0.0f) != 0) {
                                z10 = r20;
                            } else {
                                z10 = false;
                            }
                            arrayList.add(new C1729i(f12, f13, f14, z2, z10, fArr4[i47 + 5], fArr4[i47 + 6]));
                        }
                        i4 = i10;
                        break;
                    case 'C':
                        int i48 = i26 - 6;
                        for (int i49 = 0; i49 <= i48; i49 += 6) {
                            arrayList.add(new C1731k(fArr4[i49], fArr4[i49 + 1], fArr4[i49 + 2], fArr4[i49 + 3], fArr4[i49 + 4], fArr4[i49 + 5]));
                        }
                        i4 = i10;
                        break;
                    case 'H':
                        int i50 = i26 - 1;
                        for (int i51 = 0; i51 <= i50; i51++) {
                            arrayList.add(new g0.l(fArr4[i51]));
                        }
                        i4 = i10;
                        break;
                    case 'L':
                        int i52 = i26 - 2;
                        for (int i53 = 0; i53 <= i52; i53 += 2) {
                            arrayList.add(new g0.m(fArr4[i53], fArr4[i53 + 1]));
                        }
                        i4 = i10;
                        break;
                    case 'M':
                        int i54 = i26 - 2;
                        if (i54 >= 0) {
                            arrayList.add(new g0.n(fArr4[0], fArr4[r20]));
                            while (i45 <= i54) {
                                arrayList.add(new g0.m(fArr4[i45], fArr4[i45 + 1]));
                                i45 += 2;
                            }
                            i4 = i10;
                            break;
                        }
                        i4 = i10;
                    case 'Q':
                        int i55 = i26 - 4;
                        for (int i56 = 0; i56 <= i55; i56 += 4) {
                            arrayList.add(new g0.o(fArr4[i56], fArr4[i56 + 1], fArr4[i56 + 2], fArr4[i56 + 3]));
                        }
                        i4 = i10;
                        break;
                    case 'S':
                        int i57 = i26 - 4;
                        for (int i58 = 0; i58 <= i57; i58 += 4) {
                            arrayList.add(new g0.p(fArr4[i58], fArr4[i58 + 1], fArr4[i58 + 2], fArr4[i58 + 3]));
                        }
                        i4 = i10;
                        break;
                    case 'T':
                        int i59 = i26 - 2;
                        for (int i60 = 0; i60 <= i59; i60 += 2) {
                            arrayList.add(new g0.q(fArr4[i60], fArr4[i60 + 1]));
                        }
                        i4 = i10;
                        break;
                    case 'V':
                        int i61 = i26 - 1;
                        for (int i62 = 0; i62 <= i61; i62++) {
                            arrayList.add(new aa(fArr4[i62]));
                        }
                        i4 = i10;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(C1730j.charlie);
                        i4 = i10;
                        break;
                    case 'a':
                        int i63 = i26 - 7;
                        for (int i64 = 0; i64 <= i63; i64 += 7) {
                            float f15 = fArr4[i64];
                            float f16 = fArr4[i64 + 1];
                            float f17 = fArr4[i64 + 2];
                            if (Float.compare(fArr4[i64 + 3], 0.0f) != 0) {
                                z11 = r20;
                            } else {
                                z11 = false;
                            }
                            if (Float.compare(fArr4[i64 + 4], 0.0f) != 0) {
                                z12 = r20;
                            } else {
                                z12 = false;
                            }
                            arrayList.add(new r(f15, f16, f17, z11, z12, fArr4[i64 + 5], fArr4[i64 + 6]));
                        }
                        i4 = i10;
                        break;
                    case 'c':
                        int i65 = i26 - 6;
                        for (int i66 = 0; i66 <= i65; i66 += 6) {
                            arrayList.add(new g0.s(fArr4[i66], fArr4[i66 + 1], fArr4[i66 + 2], fArr4[i66 + 3], fArr4[i66 + 4], fArr4[i66 + 5]));
                        }
                        i4 = i10;
                        break;
                    case 'h':
                        int i67 = i26 - 1;
                        for (int i68 = 0; i68 <= i67; i68++) {
                            arrayList.add(new g0.t(fArr4[i68]));
                        }
                        i4 = i10;
                        break;
                    case 'l':
                        int i69 = i26 - 2;
                        for (int i70 = 0; i70 <= i69; i70 += 2) {
                            arrayList.add(new u(fArr4[i70], fArr4[i70 + 1]));
                        }
                        i4 = i10;
                        break;
                    case 'm':
                        int i71 = i26 - 2;
                        if (i71 >= 0) {
                            arrayList.add(new v(fArr4[0], fArr4[r20]));
                            while (i45 <= i71) {
                                arrayList.add(new u(fArr4[i45], fArr4[i45 + 1]));
                                i45 += 2;
                            }
                        }
                        i4 = i10;
                        break;
                    case 'q':
                        int i72 = i26 - 4;
                        for (int i73 = 0; i73 <= i72; i73 += 4) {
                            arrayList.add(new w(fArr4[i73], fArr4[i73 + 1], fArr4[i73 + 2], fArr4[i73 + 3]));
                        }
                        i4 = i10;
                        break;
                    case 's':
                        int i74 = i26 - 4;
                        for (int i75 = 0; i75 <= i74; i75 += 4) {
                            arrayList.add(new g0.x(fArr4[i75], fArr4[i75 + 1], fArr4[i75 + 2], fArr4[i75 + 3]));
                        }
                        i4 = i10;
                        break;
                    case 't':
                        int i76 = i26 - 2;
                        for (int i77 = 0; i77 <= i76; i77 += 2) {
                            arrayList.add(new y(fArr4[i77], fArr4[i77 + 1]));
                        }
                        i4 = i10;
                        break;
                    case 'v':
                        int i78 = i26 - 1;
                        for (int i79 = 0; i79 <= i78; i79++) {
                            arrayList.add(new z(fArr4[i79]));
                        }
                        i4 = i10;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + c3);
                }
            } else {
                i25 = i5;
            }
        }
    }

    public void india() {
        try {
            ((FileLock) this.red).release();
            ((FileChannel) this.purple).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void juliet(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z2 = parent instanceof View;
        float[] fArr2 = (float[]) this.purple;
        if (z2) {
            juliet((View) parent, fArr);
            C2932p c2932p = an.alpha;
            C0347ag.delta(fArr2);
            C0347ag.foxtrot(fArr2, -view.getScrollX(), -view.getScrollY());
            an.bravo(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C0347ag.delta(fArr2);
            C0347ag.foxtrot(fArr2, left, top);
            an.bravo(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.red;
            view.getLocationInWindow(iArr);
            C2932p c2932p2 = an.alpha;
            C0347ag.delta(fArr2);
            C0347ag.foxtrot(fArr2, -view.getScrollX(), -view.getScrollY());
            an.bravo(fArr, fArr2);
            float f5 = iArr[0];
            float f10 = iArr[1];
            C0347ag.delta(fArr2);
            C0347ag.foxtrot(fArr2, f5, f10);
            an.bravo(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            ao.victor(matrix, fArr2);
            an.bravo(fArr, fArr2);
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        try {
            ((vg.g) this.purple).onFailure((vg.y) this.red, iOException);
        } catch (Throwable th) {
            A.sierra(th);
            th.printStackTrace();
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        vg.g gVar = (vg.g) this.purple;
        vg.y yVar = (vg.y) this.red;
        try {
            try {
                gVar.onResponse(yVar, yVar.charlie(response));
            } catch (Throwable th) {
                A.sierra(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            A.sierra(th2);
            try {
                gVar.onFailure(yVar, th2);
            } catch (Throwable th3) {
                A.sierra(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public ServiceComponentBuilder service(Service service) {
        service.getClass();
        this.red = service;
        return this;
    }

    public String toString() {
        switch (this.alpha) {
            case 9:
                return "Bounds{lower=" + ((C1929c) this.purple) + " upper=" + ((C1929c) this.red) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p6.n
    public K1.f zza() {
        return (K1.f) this.purple;
    }

    @Override // p6.n
    public void zzc() {
        ((G6.h) this.red).delta(null);
    }

    public /* synthetic */ k(int i4, boolean z2) {
        this.alpha = i4;
    }

    public k(E5.j jVar, p7.k kVar, C1477x c1477x) {
        this.alpha = 0;
        this.purple = jVar;
        this.red = kVar;
    }

    public k(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 3:
                this.purple = new ConcurrentHashMap();
                this.red = new AtomicInteger(0);
                return;
            default:
                this.red = new float[64];
                return;
        }
    }

    public k(vg.y yVar, vg.g gVar) {
        this.alpha = 12;
        this.red = yVar;
        this.purple = gVar;
    }

    public k(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.alpha = 9;
        lowerBound = bounds.getLowerBound();
        this.purple = C1929c.charlie(lowerBound);
        upperBound = bounds.getUpperBound();
        this.red = C1929c.charlie(upperBound);
    }

    public k(w9.p pVar) {
        this.alpha = 13;
        this.purple = pVar;
    }

    public k(float[] fArr) {
        this.alpha = 10;
        this.purple = fArr;
        this.red = new int[2];
    }
}
