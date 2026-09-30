package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/E0;", "Landroid/location/Location;", "", "delta", "(Lcom/fingerprintjs/android/fpjs_pro_internal/E0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class F1 extends Lambda implements Function1<E0, Unit> {
    public static int red = 0;
    public static int silver = 1;
    public final /* synthetic */ FusedLocationProviderClient alpha;
    public final /* synthetic */ CurrentLocationRequest purple;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "p0", "", "alpha", "(Landroid/location/Location;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Function1<Location, Unit> {
        public static int purple = 0;
        public static int red = 1;
        public final /* synthetic */ E0 alpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E0 e02) {
            super(1);
            this.alpha = e02;
        }

        public final void alpha(Location location) {
            int i4 = purple;
            int i5 = ((i4 | 77) << 1) - (i4 ^ 77);
            red = i5 % 128;
            int i10 = i5 % 2;
            ((G0) this.alpha).alpha(location);
            if (i10 == 0) {
                int i11 = 65 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Location location) {
            int i4 = red;
            int i5 = (i4 & 31) + (i4 | 31);
            purple = i5 % 128;
            int i10 = i5 % 2;
            alpha(location);
            if (i10 == 0) {
                Unit unit = Unit.INSTANCE;
                int i11 = purple;
                red = ((i11 ^ 125) + ((i11 & 125) << 1)) % 128;
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(FusedLocationProviderClient fusedLocationProviderClient, CurrentLocationRequest currentLocationRequest) {
        super(1);
        this.alpha = fusedLocationProviderClient;
        this.purple = currentLocationRequest;
    }

    public static /* synthetic */ Unit alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i4;
        int i15 = ~i12;
        int i16 = ~(i14 | i15 | i10);
        int i17 = ~i10;
        int i18 = i16 | (~(i14 | i17 | i12));
        int i19 = (~(i10 | i15)) | i14 | (~(i17 | i12));
        int i20 = 1305971684 * i19;
        int i21 = (892338176 * i13) + ((-1446510592) * i11) + ((-89653248) * i5) + i20 + ((-1305971684) * i15) + (i18 * (-1305971684)) + ((-1395624931) * i12) + ((1216318437 * i4) - 781189120);
        int papa = AbstractC2327c.papa(i13, -1897213938, (1112421973 * i11) + i4 + i12 + i5);
        if (AbstractC2327c.quebec(papa, 563281920, (i13 * 856652822) + (i11 * (-1378896031)) + (i5 * 2010091741) + (i19 * 980) + (i15 * (-980)) + (i18 * (-980)) + (i12 * 2010090761) + (i4 * 2010092721) + 1217064380, -1077346304, ((-1657864192) * papa) + i21) != 1) {
            E0 e02 = (E0) objArr[0];
            int i22 = red;
            silver = ((i22 & 113) + (i22 | 113)) % 128;
            ((G0) e02).alpha(null);
            int i23 = red;
            int i24 = (i23 ^ 23) + ((i23 & 23) << 1);
            silver = i24 % 128;
            if (i24 % 2 != 0) {
                return null;
            }
            throw null;
        }
        F1 f12 = (F1) objArr[0];
        Object obj = objArr[1];
        silver = (red + 49) % 128;
        f12.delta((E0) obj);
        Unit unit = Unit.INSTANCE;
        int i25 = silver;
        int i26 = (i25 ^ 5) + ((i25 & 5) << 1);
        red = i26 % 128;
        if (i26 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void delta(@NotNull E0 e02) {
        FusedLocationProviderClient fusedLocationProviderClient = this.alpha;
        Intrinsics.checkNotNull(fusedLocationProviderClient);
        Task currentLocation = fusedLocationProviderClient.getCurrentLocation(this.purple, (G6.a) null);
        Intrinsics.checkNotNull(currentLocation);
        E1 e12 = new E1(0, new a(e02));
        G6.q qVar = (G6.q) currentLocation;
        qVar.getClass();
        qVar.echo(G6.i.alpha, e12);
        qVar.lima(new A1(e02, 1));
        int i4 = red;
        int i5 = (i4 & 57) + (i4 | 57);
        silver = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 90 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(E0 e02) {
        return alpha(new Object[]{this, e02}, 781907880, H0.vD14832N6715(), H0.vD14832N6715(), H0.vD14832N6715(), -781907879, H0.vD14832N6715());
    }
}
