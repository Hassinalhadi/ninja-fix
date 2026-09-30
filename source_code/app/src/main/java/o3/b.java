package o3;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import n3.EnumC2159b;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class b {
    public final boolean alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;
    public final boolean foxtrot;
    public final boolean golf;
    public final boolean hotel;
    public final boolean india;
    public final boolean juliet;
    public final a kilo;
    public final boolean lima;
    public final boolean mike;
    public final boolean november;
    public final boolean oscar;
    public final boolean papa;
    public final boolean quebec;
    public final boolean romeo;
    public final String sierra;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(139, b.class);
        Hidden0.special_clinit_139_00(b.class);
    }

    public b(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, a gnssState, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, String deviceManufacturer) {
        Intrinsics.echo(gnssState, "gnssState");
        Intrinsics.echo(deviceManufacturer, "deviceManufacturer");
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = false;
        this.delta = z12;
        this.echo = z13;
        this.foxtrot = false;
        this.golf = z15;
        this.hotel = false;
        this.india = z17;
        this.juliet = false;
        this.kilo = gnssState;
        this.lima = z19;
        this.mike = z20;
        this.november = z21;
        this.oscar = z22;
        this.papa = z23;
        this.quebec = z24;
        this.romeo = z25;
        this.sierra = deviceManufacturer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25) {
        this(z2, z10, z11, z12, z13, z14, z15, z16, z17, z18, r19, z19, z20, z21, z22, z23, z24, z25, MANUFACTURER);
        a aVar = new a();
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.delta(MANUFACTURER, "MANUFACTURER");
    }

    public final native boolean alpha();

    public final native EnumC2159b bravo();

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();
}
