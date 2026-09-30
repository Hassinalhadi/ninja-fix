package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Camera;
import android.os.Process;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/fingerprintjs/android/fpjs_pro_internal/T2;", "delta", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ak extends Lambda implements Function0<List<? extends T2>> {
    public static int alpha = 0;
    public static int purple = 1;
    public static int red;
    public static int silver;

    public static int alpha() {
        int i4 = red;
        int i5 = i4 % 6687349;
        red = i4 + 1;
        if (i5 != 0) {
            return silver;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        silver = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @NotNull
    public final List<T2> delta() {
        int i4 = purple;
        alpha = ((i4 ^ 75) + ((i4 & 75) << 1)) % 128;
        int i5 = al.charlie;
        al.delta = ((i5 ^ 53) + ((i5 & 53) << 1)) % 128;
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        al.delta = (al.charlie + 55) % 128;
        int i10 = 0;
        while (i10 < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i10, cameraInfo);
            linkedList.add(new T2(String.valueOf(i10), (String) al.alpha(new Object[]{Integer.valueOf(cameraInfo.facing)}, -539443855, G2.alpha(), 539443856, G2.alpha(), G2.alpha(), G2.alpha()), String.valueOf(cameraInfo.orientation)));
            i10++;
            al.charlie = (al.delta + 45) % 128;
        }
        G2.alpha();
        G2.alpha();
        int i11 = purple + 15;
        alpha = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 79 / 0;
        }
        return linkedList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends T2> invoke() {
        int i4 = purple + 15;
        alpha = i4 % 128;
        if (i4 % 2 == 0) {
            List<T2> delta = delta();
            purple = (alpha + 121) % 128;
            return delta;
        }
        delta();
        throw null;
    }
}
