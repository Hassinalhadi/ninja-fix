package X2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.lifecycle.ac;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import vf.AbstractC3220y;

/* loaded from: classes3.dex */
public final class h {
    public final Context alpha;
    public final Object bravo;
    public final Aa.m charlie;
    public final Bitmap.Config delta;
    public final Y2.d echo;
    public final List foxtrot;
    public final Z2.e golf;
    public final Headers hotel;
    public final n india;
    public final boolean juliet;
    public final boolean kilo;
    public final boolean lima;
    public final boolean mike;
    public final a november;
    public final a oscar;
    public final a papa;
    public final AbstractC3220y quebec;
    public final AbstractC3220y romeo;
    public final AbstractC3220y sierra;
    public final AbstractC3220y tango;
    public final ac uniform;
    public final Y2.i victor;
    public final Y2.g whiskey;
    public final l xray;
    public final c yankee;
    public final b zulu;

    public h(Context context, Object obj, Aa.m mVar, Bitmap.Config config, Y2.d dVar, List list, Z2.e eVar, Headers headers, n nVar, boolean z2, boolean z10, boolean z11, boolean z12, a aVar, a aVar2, a aVar3, AbstractC3220y abstractC3220y, AbstractC3220y abstractC3220y2, AbstractC3220y abstractC3220y3, AbstractC3220y abstractC3220y4, ac acVar, Y2.i iVar, Y2.g gVar, l lVar, c cVar, b bVar) {
        this.alpha = context;
        this.bravo = obj;
        this.charlie = mVar;
        this.delta = config;
        this.echo = dVar;
        this.foxtrot = list;
        this.golf = eVar;
        this.hotel = headers;
        this.india = nVar;
        this.juliet = z2;
        this.kilo = z10;
        this.lima = z11;
        this.mike = z12;
        this.november = aVar;
        this.oscar = aVar2;
        this.papa = aVar3;
        this.quebec = abstractC3220y;
        this.romeo = abstractC3220y2;
        this.sierra = abstractC3220y3;
        this.tango = abstractC3220y4;
        this.uniform = acVar;
        this.victor = iVar;
        this.whiskey = gVar;
        this.xray = lVar;
        this.yankee = cVar;
        this.zulu = bVar;
    }

    public static g alpha(h hVar) {
        Context context = hVar.alpha;
        hVar.getClass();
        return new g(hVar, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (Intrinsics.areEqual(this.alpha, hVar.alpha) && Intrinsics.areEqual(this.bravo, hVar.bravo) && Intrinsics.areEqual(this.charlie, hVar.charlie) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && this.delta == hVar.delta) {
                    if ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(null, null)) && this.echo == hVar.echo && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.foxtrot, hVar.foxtrot) && Intrinsics.areEqual(this.golf, hVar.golf) && Intrinsics.areEqual(this.hotel, hVar.hotel) && Intrinsics.areEqual(this.india, hVar.india) && this.juliet == hVar.juliet && this.kilo == hVar.kilo && this.lima == hVar.lima && this.mike == hVar.mike && this.november == hVar.november && this.oscar == hVar.oscar && this.papa == hVar.papa && Intrinsics.areEqual(this.quebec, hVar.quebec) && Intrinsics.areEqual(this.romeo, hVar.romeo) && Intrinsics.areEqual(this.sierra, hVar.sierra) && Intrinsics.areEqual(this.tango, hVar.tango) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.uniform, hVar.uniform) && Intrinsics.areEqual(this.victor, hVar.victor) && this.whiskey == hVar.whiskey && Intrinsics.areEqual(this.xray, hVar.xray) && Intrinsics.areEqual(this.yankee, hVar.yankee) && Intrinsics.areEqual(this.zulu, hVar.zulu)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        Aa.m mVar = this.charlie;
        if (mVar != null) {
            i4 = mVar.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (this.india.alpha.hashCode() + ((this.hotel.hashCode() + ((this.golf.hashCode() + com.google.android.material.datepicker.j.golf((this.echo.hashCode() + ((this.delta.hashCode() + ((hashCode + i4) * 923521)) * 961)) * 29791, 31, this.foxtrot)) * 31)) * 31)) * 31;
        int i12 = 1237;
        if (this.juliet) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i13 = (hashCode2 + i5) * 31;
        if (this.kilo) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.lima) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.mike) {
            i12 = 1231;
        }
        return this.zulu.hashCode() + ((this.yankee.hashCode() + ((this.xray.alpha.hashCode() + ((this.whiskey.hashCode() + ((this.victor.hashCode() + ((this.uniform.hashCode() + ((this.tango.hashCode() + ((this.sierra.hashCode() + ((this.romeo.hashCode() + ((this.quebec.hashCode() + ((this.papa.hashCode() + ((this.oscar.hashCode() + ((this.november.hashCode() + ((i15 + i12) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
