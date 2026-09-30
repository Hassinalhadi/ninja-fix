package E7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.aj;
import com.google.android.gms.internal.measurement.aw;
import com.google.android.gms.internal.measurement.ax;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.az;
import com.google.android.gms.measurement.internal.InterfaceC1461o0;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public final class a implements InterfaceC1461o0 {
    public final /* synthetic */ J alpha;

    public a(J j5) {
        this.alpha = j5;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String alpha() {
        J j5 = this.alpha;
        aj ajVar = new aj();
        j5.bravo(new D(j5, ajVar, 1));
        return (String) aj.delta(ajVar.charlie(50L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String bravo() {
        J j5 = this.alpha;
        aj ajVar = new aj();
        j5.bravo(new D(j5, ajVar, 4));
        return (String) aj.delta(ajVar.charlie(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final List charlie(String str, String str2) {
        return this.alpha.echo(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final Map delta(String str, String str2, boolean z2) {
        return this.alpha.foxtrot(str, str2, z2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void echo(Bundle bundle) {
        J j5 = this.alpha;
        j5.bravo(new ax(j5, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void foxtrot(String str, String str2, Bundle bundle) {
        J j5 = this.alpha;
        j5.bravo(new aw(j5, str, str2, bundle, true, 2));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void golf(String str) {
        J j5 = this.alpha;
        j5.bravo(new az(j5, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void hotel(String str, String str2, Bundle bundle) {
        J j5 = this.alpha;
        j5.bravo(new ay(j5, str, str2, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void india(String str) {
        J j5 = this.alpha;
        j5.bravo(new az(j5, str, 2));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final int juliet(String str) {
        return this.alpha.charlie(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String kilo() {
        J j5 = this.alpha;
        aj ajVar = new aj();
        j5.bravo(new D(j5, ajVar, 3));
        return (String) aj.delta(ajVar.charlie(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String lima() {
        J j5 = this.alpha;
        aj ajVar = new aj();
        j5.bravo(new D(j5, ajVar, 0));
        return (String) aj.delta(ajVar.charlie(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final long zzb() {
        J j5 = this.alpha;
        aj ajVar = new aj();
        j5.bravo(new D(j5, ajVar, 2));
        Long l10 = (Long) aj.delta(ajVar.charlie(500L), Long.class);
        if (l10 == null) {
            long nanoTime = System.nanoTime();
            j5.bravo.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i4 = j5.foxtrot + 1;
            j5.foxtrot = i4;
            return nextLong + i4;
        }
        return l10.longValue();
    }
}
