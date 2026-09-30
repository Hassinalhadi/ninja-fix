package He;

import Y1.aa;
import Y1.w;
import Y1.z;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.P0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k8.C2019a;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {
    public final /* synthetic */ int alpha = 2;
    public String bravo;
    public int charlie;
    public Object delta;
    public Object echo;
    public Serializable foxtrot;
    public Serializable golf;
    public Object hotel;

    public /* synthetic */ b() {
    }

    public C2019a alpha() {
        String str;
        if (this.charlie == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.foxtrot) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.golf) == null) {
            str = P0.crimson(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C2019a(this.bravo, this.charlie, (String) this.delta, (String) this.echo, ((Long) this.foxtrot).longValue(), ((Long) this.golf).longValue(), (String) this.hotel);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z bravo(String route) {
        w wVar;
        Intrinsics.echo(route, "route");
        Lazy lazy = (Lazy) this.hotel;
        if (lazy != null && (wVar = (w) lazy.getValue()) != null) {
            int i4 = aa.white;
            String uriString = "android-app://androidx.navigation/".concat(route);
            Intrinsics.echo(uriString, "uriString");
            Uri parse = Uri.parse(uriString);
            Intrinsics.delta(parse, "parse(...)");
            Bundle delta = wVar.delta(parse, (LinkedHashMap) this.foxtrot);
            if (delta != null) {
                return new z((aa) this.delta, delta, wVar.papa, wVar.bravo(parse), false, -1);
            }
            return null;
        }
        return null;
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return ((a) this.delta) + " version=" + ((Me.f) this.echo);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a kind, Me.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i4) {
        Intrinsics.echo(kind, "kind");
        this.delta = kind;
        this.echo = fVar;
        this.foxtrot = strArr;
        this.golf = strArr2;
        this.hotel = strArr3;
        this.bravo = str;
        this.charlie = i4;
    }

    public b(aa destination) {
        Intrinsics.echo(destination, "destination");
        this.delta = destination;
        this.echo = new ArrayList();
        this.foxtrot = new LinkedHashMap();
    }
}
