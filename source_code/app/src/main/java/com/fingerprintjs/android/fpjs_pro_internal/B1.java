package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/E0;", "Landroid/location/Location;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/E0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class B1 extends Lambda implements Function1<E0, Unit> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ FusedLocationProviderClient alpha;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "p0", "", "alpha", "(Landroid/location/Location;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Function1<Location, Unit> {
        public static final int purple;
        public final /* synthetic */ E0 alpha;

        static {
            foxtrot();
            delta();
            purple = 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E0 e02) {
            super(1);
            this.alpha = e02;
        }

        public static void delta() {
        }

        public static void foxtrot() {
        }

        public final void alpha(Location location) {
            ((G0) this.alpha).alpha(location);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Location location) {
            int i4 = (purple + 13) % 2;
            alpha(location);
            if (i4 == 0) {
                return Unit.INSTANCE;
            }
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(FusedLocationProviderClient fusedLocationProviderClient) {
        super(1);
        this.alpha = fusedLocationProviderClient;
    }

    public static /* synthetic */ Unit delta(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = i13 | i4 | i5;
        int i15 = (~((~i5) | i4)) | i13;
        int i16 = ~((~i13) | i4);
        int i17 = (830210048 * i10) + (1823473664 * i12) + ((-2079064064) * i11) + (565098208 * i16) + (i15 * 565098208) + ((-565098208) * i14) + ((-1513965855) * i4) + ((1650805025 * i13) - 289800192);
        int papa = AbstractC2327c.papa(i10, -2047965933, (1132004924 * i12) + i13 + i4 + i11);
        if (AbstractC2327c.quebec(papa, -2108293120, (i10 * (-1468578859)) + (i12 * 1544553956) + (i11 * (-767559561)) + (i16 * 544) + (i15 * 544) + (i14 * (-544)) + (i4 * (-767559017)) + ((i13 * (-767560105)) - 1188649921), -2075787264, ((-1143341056) * papa) + i17) != 1) {
            B1 b12 = (B1) objArr[0];
            Object obj = objArr[1];
            purple = (red + 89) % 128;
            b12.alpha((E0) obj);
            Unit unit = Unit.INSTANCE;
            int i18 = purple;
            red = ((i18 & 67) + (i18 | 67)) % 128;
            return unit;
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj2 = objArr[1];
        int i19 = red + 19;
        purple = i19 % 128;
        int i20 = i19 % 2;
        function1.invoke(obj2);
        if (i20 != 0) {
            int i21 = 45 / 0;
        }
        int i22 = red + 45;
        purple = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 12 / 0;
            return null;
        }
        return null;
    }

    public final void alpha(@NotNull E0 e02) {
        FusedLocationProviderClient fusedLocationProviderClient = this.alpha;
        Intrinsics.checkNotNull(fusedLocationProviderClient);
        Task lastLocation = fusedLocationProviderClient.getLastLocation();
        Intrinsics.checkNotNull(lastLocation);
        E1 e12 = new E1(2, new a(e02));
        G6.q qVar = (G6.q) lastLocation;
        qVar.getClass();
        qVar.echo(G6.i.alpha, e12);
        qVar.lima(new A1(e02, 0));
        int i4 = red + 31;
        purple = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(E0 e02) {
        return delta(new Object[]{this, e02}, -1333316322, N0.D8871(), N0.D8871(), N0.D8871(), N0.D8871(), 1333316322);
    }
}
