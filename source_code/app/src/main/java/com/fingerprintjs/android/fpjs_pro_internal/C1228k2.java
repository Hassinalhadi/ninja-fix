package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro.InvalidProxyIntegrationHeaders;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1228k2 implements I {
    public static int charlie = 0;
    public static int delta = 1;
    public final SensorManager alpha;
    public final G2 bravo;

    public C1228k2(SensorManager sensorManager, G2 g2) {
        this.alpha = sensorManager;
        this.bravo = g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [com.fingerprintjs.android.fpjs_pro_internal.h2, java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.fingerprintjs.android.fpjs_pro_internal.j2, java.lang.Object, android.hardware.SensorEventListener] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.fingerprintjs.android.fpjs_pro_internal.i2, java.lang.Object, java.util.concurrent.Callable] */
    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Object m206constructorimpl;
        Sensor defaultSensor;
        Sensor defaultSensor2;
        Object settopp6481;
        Object settopp64812;
        int i14;
        Object settopp64813;
        int i15 = ~i11;
        int i16 = ~i10;
        int i17 = ~(i15 | i16);
        int i18 = ~(i13 | i10);
        int i19 = i17 | i18;
        int i20 = i17 | (~(i11 | i10)) | i18;
        int i21 = (~(i10 | i11 | i13)) | (~(i16 | (~i13)));
        int i22 = ((-1404829696) * i12) + ((-798228480) * i5) + ((-1652293632) * i4) + ((-2059320060) * i21) + (i20 * (-2059320060)) + ((-176327176) * i19) + (407026429 * i13) + ((583353605 * i11) - 1319501824);
        int papa = AbstractC2327c.papa(i12, 1476006321, ((-2005657349) * i5) + i11 + i13 + i4);
        if (AbstractC2327c.quebec(papa, 798621696, (i12 * 72538105) + (i5 * (-1264871149)) + (i4 * 961754313) + (i21 * 36) + (i20 * 36) + (i19 * (-72)) + (i13 * 961754277) + (i11 * 961754349) + 784684277, -1437204480, ((-1043726336) * papa) + i22) != 1) {
            C1228k2 c1228k2 = (C1228k2) objArr[0];
            try {
                Result.Companion companion = Result.INSTANCE;
                SensorManager sensorManager = c1228k2.alpha;
                Intrinsics.checkNotNull(sensorManager);
                defaultSensor = sensorManager.getDefaultSensor(1);
                defaultSensor2 = c1228k2.alpha.getDefaultSensor(4);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            try {
                try {
                    Object echo = am.echo(1763141142);
                    if (echo == null) {
                        echo = am.charlie((char) (Process.myTid() >> 22), 51 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 748, 1625599920, "D8871", new Class[0]);
                    }
                    AbstractExecutorService abstractExecutorService = (AbstractExecutorService) ((Method) echo).invoke(null, null);
                    ?? obj = new Object();
                    obj.alpha = c1228k2;
                    obj.purple = defaultSensor;
                    Future submit = abstractExecutorService.submit((Callable) obj);
                    Intrinsics.checkNotNull(submit);
                    settopp6481 = new component8(submit);
                    charlie = (delta + 29) % 128;
                } catch (Throwable th2) {
                    settopp6481 = new setTopP6481(th2);
                }
                Object obj2 = settopp6481;
                try {
                    try {
                        Object echo2 = am.echo(1763141142);
                        if (echo2 == null) {
                            echo2 = am.charlie((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 749, 1625599920, "D8871", new Class[0]);
                        }
                        AbstractExecutorService abstractExecutorService2 = (AbstractExecutorService) ((Method) echo2).invoke(null, null);
                        ?? obj3 = new Object();
                        obj3.alpha = c1228k2;
                        obj3.purple = defaultSensor2;
                        Future submit2 = abstractExecutorService2.submit((Callable) obj3);
                        Intrinsics.checkNotNull(submit2);
                        settopp64812 = new component8(submit2);
                    } catch (Throwable th3) {
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    settopp64812 = new setTopP6481(th4);
                }
                if (obj2 instanceof component8) {
                    try {
                        settopp64813 = new component8(((Future) ((component8) obj2).component9).get());
                        int i23 = delta;
                        charlie = ((i23 ^ 45) + ((i23 & 45) << 1)) % 128;
                    } catch (Throwable th5) {
                        settopp64813 = new setTopP6481(th5);
                    }
                    obj2 = settopp64813;
                    i14 = charlie + 9;
                } else if (obj2 instanceof setTopP6481) {
                    i14 = charlie + 105;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                delta = i14 % 128;
                if (settopp64812 instanceof component8) {
                    try {
                        settopp64812 = new component8(((Future) ((component8) settopp64812).component9).get());
                    } catch (Throwable th6) {
                        settopp64812 = new setTopP6481(th6);
                    }
                    charlie = (delta + 73) % 128;
                } else if (!(settopp64812 instanceof setTopP6481)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair pair = new Pair(obj2, settopp64812);
                m206constructorimpl = Result.m206constructorimpl(new Y1((List) component13.vD14832N6715((N14263A23323) pair.getFirst(), CollectionsKt.emptyList()), (List) component13.vD14832N6715((N14263A23323) pair.getSecond(), CollectionsKt.emptyList())));
                int i24 = delta;
                charlie = (((i24 | 41) << 1) - (i24 ^ 41)) % 128;
                return (Y1) component13.vD14832N6715(bk.component5(m206constructorimpl), new Y1(CollectionsKt.emptyList(), CollectionsKt.emptyList()));
            } catch (Throwable th7) {
                Throwable cause2 = th7.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th7;
            }
        }
        C1228k2 c1228k22 = (C1228k2) objArr[0];
        Sensor sensor = (Sensor) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        long longValue = ((Number) objArr[3]).longValue();
        int intValue2 = ((Number) objArr[4]).intValue();
        int i25 = (charlie + 9) % 128;
        delta = i25;
        if (sensor == null) {
            charlie = ((i25 & 65) + (i25 | 65)) % 128;
            List emptyList = CollectionsKt.emptyList();
            int i26 = delta;
            charlie = ((i26 ^ 81) + ((i26 & 81) << 1)) % 128;
            return emptyList;
        }
        if (c1228k22.alpha == null) {
            charlie = (((i25 | 115) << 1) - (i25 ^ 115)) % 128;
            return CollectionsKt.emptyList();
        }
        CountDownLatch countDownLatch = new CountDownLatch(intValue);
        LinkedList linkedList = new LinkedList();
        ?? obj4 = new Object();
        obj4.alpha = countDownLatch;
        obj4.bravo = linkedList;
        SensorManager sensorManager2 = c1228k22.alpha;
        sensorManager2.registerListener((SensorEventListener) obj4, sensor, intValue2);
        try {
            countDownLatch.await(longValue, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        sensorManager2.unregisterListener((SensorEventListener) obj4);
        return linkedList;
    }

    public static final /* synthetic */ G2 bravo(C1228k2 c1228k2) {
        int i4 = delta + 85;
        charlie = i4 % 128;
        int i5 = i4 % 2;
        G2 g2 = c1228k2.bravo;
        if (i5 == 0) {
            return g2;
        }
        throw null;
    }

    public static final /* synthetic */ List charlie(C1228k2 c1228k2, Sensor sensor, int i4, long j5, int i5) {
        charlie = (delta + 11) % 128;
        List list = (List) alpha(new Object[]{c1228k2, sensor, Integer.valueOf(i4), Long.valueOf(j5), Integer.valueOf(i5)}, InvalidProxyIntegrationHeaders.D8871(), InvalidProxyIntegrationHeaders.D8871(), InvalidProxyIntegrationHeaders.D8871(), -941913255, InvalidProxyIntegrationHeaders.D8871(), 941913256);
        int i10 = delta;
        charlie = ((i10 ^ 63) + ((i10 & 63) << 1)) % 128;
        return list;
    }
}
