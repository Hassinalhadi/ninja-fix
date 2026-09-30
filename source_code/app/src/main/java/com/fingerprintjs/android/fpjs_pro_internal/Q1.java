package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.location.Location;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Location;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Location;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Q1 extends Lambda implements Function1<SafeWithTimeoutProContext, Location> {
    public static int purple = 0;
    public static int red = 1;
    public static int silver;
    public static int teal;
    public final /* synthetic */ U1 alpha;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/E0;", "Landroid/location/Location;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/E0;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Function1<E0, Unit> {
        public static int purple = 0;
        public static int red = 1;
        public final /* synthetic */ FusedLocationProviderClient alpha;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "p0", "", "alpha", "(Landroid/location/Location;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.Q1$a$a */
        /* loaded from: classes3.dex */
        public static final class C0007a extends Lambda implements Function1<Location, Unit> {
            public static int purple = 0;
            public static int red = 1;
            public final /* synthetic */ E0 alpha;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0007a(E0 e02) {
                super(1);
                this.alpha = e02;
            }

            public final void alpha(Location location) {
                red = (purple + 53) % 128;
                ((G0) this.alpha).alpha(location);
                int i4 = red;
                int i5 = ((i4 | 33) << 1) - (i4 ^ 33);
                purple = i5 % 128;
                if (i5 % 2 == 0) {
                } else {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Location location) {
                int i4 = purple + 81;
                red = i4 % 128;
                int i5 = i4 % 2;
                alpha(location);
                Unit unit = Unit.INSTANCE;
                if (i5 == 0) {
                    int i10 = 60 / 0;
                }
                int i11 = purple;
                int i12 = (i11 ^ 75) + ((i11 & 75) << 1);
                red = i12 % 128;
                if (i12 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FusedLocationProviderClient fusedLocationProviderClient) {
            super(1);
            this.alpha = fusedLocationProviderClient;
        }

        public static /* synthetic */ Unit delta(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
            int i14 = ~i12;
            int i15 = (~(i14 | i5)) | i10;
            int i16 = ~i10;
            int i17 = ~(i16 | i5 | i12);
            int i18 = (~(i12 | i16)) | i5 | (~(i14 | i10));
            int i19 = 1303248896 * i11;
            int i20 = (808452096 * i4) + (1454768128 * i13) + i19 + ((-14360446) * i18) + (14360446 * i17) + (i15 * 14360446) + (1288888451 * i10) + (1317609343 * i5) + 1063714816;
            int papa = AbstractC2327c.papa(i4, -2062754392, ((-381402339) * i13) + i5 + i10 + i11);
            if (AbstractC2327c.quebec(papa, -427491328, (i4 * 1682205048) + (i13 * (-1583251481)) + (i11 * (-1355236397)) + (i18 * 294) + (i17 * (-294)) + (i15 * (-294)) + (i10 * (-1355236103)) + ((i5 * (-1355236691)) - 921838429), 844169216, ((-1790509056) * papa) + i20) != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i21 = red + 17;
                purple = i21 % 128;
                int i22 = i21 % 2;
                aVar.alpha((E0) obj);
                if (i22 == 0) {
                    Unit unit = Unit.INSTANCE;
                    int i23 = red;
                    purple = ((i23 & 1) + (i23 | 1)) % 128;
                    return unit;
                }
                throw null;
            }
            E0 e02 = (E0) objArr[0];
            int i24 = red;
            int i25 = (i24 & 93) + (i24 | 93);
            purple = i25 % 128;
            int i26 = i25 % 2;
            ((G0) e02).alpha(null);
            if (i26 == 0) {
                int i27 = red + 87;
                purple = i27 % 128;
                if (i27 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            throw null;
        }

        public final void alpha(@NotNull E0 e02) {
            FusedLocationProviderClient fusedLocationProviderClient = this.alpha;
            Intrinsics.checkNotNull(fusedLocationProviderClient);
            Task lastLocation = fusedLocationProviderClient.getLastLocation();
            Intrinsics.checkNotNull(lastLocation);
            E1 e12 = new E1(1, new C0007a(e02));
            G6.q qVar = (G6.q) lastLocation;
            qVar.getClass();
            qVar.echo(G6.i.alpha, e12);
            qVar.lima(new A1(e02, 2));
            int i4 = red + 63;
            purple = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(E0 e02) {
            return delta(new Object[]{this, e02}, C1208f2.vD14832N6715(), -798470760, 798470760, C1208f2.vD14832N6715(), C1208f2.vD14832N6715(), C1208f2.vD14832N6715());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(U1 u12) {
        super(1);
        this.alpha = u12;
    }

    @Nullable
    public final Location alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Context) U1.bravo(new Object[]{this.alpha}, H0.vD14832N6715(), H0.vD14832N6715(), 1233890339, H0.vD14832N6715(), H0.vD14832N6715(), -1233890337));
        Intrinsics.checkNotNull(fusedLocationProviderClient);
        a aVar = new a(fusedLocationProviderClient);
        G0 g02 = new G0();
        aVar.invoke(g02);
        Location location = (Location) g02.bravo();
        red = (purple + 77) % 128;
        return location;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = purple;
        red = (((i4 | 119) << 1) - (i4 ^ 119)) % 128;
        Location alpha = alpha(safeWithTimeoutProContext);
        int i5 = red;
        int i10 = ((i5 | 17) << 1) - (i5 ^ 17);
        purple = i10 % 128;
        if (i10 % 2 == 0) {
            return alpha;
        }
        throw null;
    }
}
