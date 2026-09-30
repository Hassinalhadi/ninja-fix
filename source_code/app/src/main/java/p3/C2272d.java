package p3;

import android.content.Context;
import androidx.appcompat.app.al;
import bz.C0796v;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.api.LocationPayloadMapper;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import com.google.android.gms.measurement.internal.C1471u;
import g3.InterfaceC1740a;
import g3.InterfaceC1748i;
import h3.InterfaceC1808e;
import k3.InterfaceC2002a;
import kotlin.jvm.internal.Intrinsics;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2272d {
    public final Context alpha;
    public final LocationBroadcastConfig bravo;
    public final InterfaceC3142e charlie;
    public final LocationPayloadMapper delta;
    public final UserInfoProvider echo;
    public final StompStateHolder foxtrot;
    public final AllowMockProvider golf;
    public final InterfaceC1740a hotel;
    public final InterfaceC2002a india;
    public final InterfaceC1748i juliet;
    public final float kilo;
    public final InterfaceC3143f lima;
    public final LastSentLocationStore mike;
    public final g3.w november;
    public final al oscar;
    public final C1471u papa;
    public final C0796v quebec;
    public final InterfaceC1808e romeo;

    public C2272d(Context context, LocationBroadcastConfig locationBroadcastConfig, InterfaceC3142e interfaceC3142e, LocationPayloadMapper locationPayloadMapper, UserInfoProvider userInfoProvider, StompStateHolder stompStateHolder, AllowMockProvider allowMockProvider, InterfaceC1740a interfaceC1740a, InterfaceC2002a interfaceC2002a, InterfaceC1748i interfaceC1748i, float f5, InterfaceC3143f interfaceC3143f, LastSentLocationStore lastSentLocationStore, g3.w wVar, al alVar, C1471u c1471u, C0796v c0796v, InterfaceC1808e interfaceC1808e) {
        this.alpha = context;
        this.bravo = locationBroadcastConfig;
        this.charlie = interfaceC3142e;
        this.delta = locationPayloadMapper;
        this.echo = userInfoProvider;
        this.foxtrot = stompStateHolder;
        this.golf = allowMockProvider;
        this.hotel = interfaceC1740a;
        this.india = interfaceC2002a;
        this.juliet = interfaceC1748i;
        this.kilo = f5;
        this.lima = interfaceC3143f;
        this.mike = lastSentLocationStore;
        this.november = wVar;
        this.oscar = alVar;
        this.papa = c1471u;
        this.quebec = c0796v;
        this.romeo = interfaceC1808e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2272d) {
                C2272d c2272d = (C2272d) obj;
                if (!Intrinsics.areEqual(this.alpha, c2272d.alpha) || !Intrinsics.areEqual(this.bravo, c2272d.bravo) || !Intrinsics.areEqual(this.charlie, c2272d.charlie) || !Intrinsics.areEqual(this.delta, c2272d.delta) || !Intrinsics.areEqual(this.echo, c2272d.echo) || !Intrinsics.areEqual(this.foxtrot, c2272d.foxtrot) || !Intrinsics.areEqual(this.golf, c2272d.golf) || !Intrinsics.areEqual(this.hotel, c2272d.hotel) || !Intrinsics.areEqual(this.india, c2272d.india) || !Intrinsics.areEqual(this.juliet, c2272d.juliet) || Float.compare(this.kilo, c2272d.kilo) != 0 || !Intrinsics.areEqual(this.lima, c2272d.lima) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.mike, c2272d.mike) || !Intrinsics.areEqual(this.november, c2272d.november) || !Intrinsics.areEqual(this.oscar, c2272d.oscar) || !Intrinsics.areEqual(this.papa, c2272d.papa) || !Intrinsics.areEqual(this.quebec, c2272d.quebec) || !Intrinsics.areEqual(this.romeo, c2272d.romeo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.hotel.hashCode() + ((this.golf.hashCode() + ((this.foxtrot.hashCode() + ((this.echo.hashCode() + ((this.delta.hashCode() + ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i4 = 0;
        InterfaceC2002a interfaceC2002a = this.india;
        if (interfaceC2002a == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC2002a.hashCode();
        }
        int sierra = ao.ad.sierra(this.kilo, (this.juliet.hashCode() + ((hashCode3 + hashCode) * 31)) * 31, 31);
        InterfaceC3143f interfaceC3143f = this.lima;
        if (interfaceC3143f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC3143f.hashCode();
        }
        int hashCode4 = (this.quebec.hashCode() + ((this.papa.hashCode() + ((this.oscar.hashCode() + ((this.november.hashCode() + ((this.mike.hashCode() + ((sierra + hashCode2) * 961)) * 31)) * 31)) * 31)) * 31)) * 31;
        InterfaceC1808e interfaceC1808e = this.romeo;
        if (interfaceC1808e != null) {
            i4 = interfaceC1808e.hashCode();
        }
        return hashCode4 + i4;
    }

    public final String toString() {
        return "LocationControllerConfig(context=" + this.alpha + ", broadcastConfig=" + this.bravo + ", logger=" + this.charlie + ", locationPayloadMapper=" + this.delta + ", userInfoProvider=" + this.echo + ", stompStateHolder=" + this.foxtrot + ", allowMockProvider=" + this.golf + ", complianceChecker=" + this.hotel + ", complianceUiHandler=" + this.india + ", diagnostics=" + this.juliet + ", maxAcceptableAccuracyMeters=" + this.kilo + ", remoteConfigProvider=" + this.lima + ", lastLocationStore=null, lastSentStore=" + this.mike + ", locationSend=" + this.november + ", stuckRecoveryPolicy=" + this.oscar + ", locationStalenessPolicy=" + this.papa + ", systemLocationStateObserver=" + this.quebec + ", locationDiagnosticsTimestampSink=" + this.romeo + ")";
    }
}
