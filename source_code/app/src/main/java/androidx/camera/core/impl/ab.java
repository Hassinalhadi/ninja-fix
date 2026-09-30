package androidx.camera.core.impl;

import androidx.appcompat.widget.P0;
import androidx.camera.core.InterfaceC0528j;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s6.T7;
import t6.AbstractC3066u3;
import t6.P2;

/* loaded from: classes3.dex */
public final class ab {
    public final StringBuilder alpha = new StringBuilder();
    public final Object bravo;
    public int charlie;
    public final Be.e delta;
    public final HashMap echo;
    public int foxtrot;

    public ab(Be.e eVar) {
        Object obj = new Object();
        this.bravo = obj;
        this.echo = new HashMap();
        this.charlie = 1;
        synchronized (obj) {
            this.delta = eVar;
            this.foxtrot = this.charlie;
        }
    }

    public static void charlie(av.s sVar, EnumC0524w enumC0524w) {
        if (P2.delta()) {
            P2.echo(enumC0524w.ordinal(), "CX:State[" + sVar + Constants.AES_SUFFIX);
        }
    }

    public final aa alpha(String str) {
        HashMap hashMap = this.echo;
        for (InterfaceC0528j interfaceC0528j : hashMap.keySet()) {
            if (str.equals(interfaceC0528j.alpha().bravo())) {
                return (aa) hashMap.get(interfaceC0528j);
            }
        }
        return null;
    }

    public final void bravo() {
        String str;
        boolean echo = AbstractC3066u3.echo("CameraStateRegistry");
        StringBuilder sb2 = this.alpha;
        if (echo) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i4 = 0;
        for (Map.Entry entry : this.echo.entrySet()) {
            if (AbstractC3066u3.echo("CameraStateRegistry")) {
                if (((aa) entry.getValue()).alpha != null) {
                    str = ((aa) entry.getValue()).alpha.toString();
                } else {
                    str = "UNKNOWN";
                }
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0528j) entry.getKey()).toString(), str));
            }
            EnumC0524w enumC0524w = ((aa) entry.getValue()).alpha;
            if (enumC0524w != null && enumC0524w.alpha) {
                i4++;
            }
        }
        if (AbstractC3066u3.echo("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append(P0.azure(i4, this.charlie, "Open count: ", " (Max allowed: ", ")"));
            AbstractC3066u3.bravo("CameraStateRegistry", sb2.toString());
        }
        this.foxtrot = Math.max(this.charlie - i4, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:11:0x0034, B:13:0x0065, B:15:0x0069, B:17:0x006d, B:23:0x0080, B:25:0x0088, B:28:0x0093, B:31:0x00a7, B:32:0x00aa, B:37:0x0079), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:11:0x0034, B:13:0x0065, B:15:0x0069, B:17:0x006d, B:23:0x0080, B:25:0x0088, B:28:0x0093, B:31:0x00a7, B:32:0x00aa, B:37:0x0079), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean delta(av.s sVar) {
        boolean z2;
        String str;
        boolean z10;
        boolean z11;
        synchronized (this.bravo) {
            try {
                aa aaVar = (aa) this.echo.get(sVar);
                T7.foxtrot(aaVar, "Camera must first be registered with registerCamera()");
                z2 = true;
                if (AbstractC3066u3.echo("CameraStateRegistry")) {
                    this.alpha.setLength(0);
                    StringBuilder sb2 = this.alpha;
                    Locale locale = Locale.US;
                    int i4 = this.foxtrot;
                    EnumC0524w enumC0524w = aaVar.alpha;
                    if (enumC0524w != null && enumC0524w.alpha) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sb2.append("tryOpenCamera(" + sVar + ") [Available Cameras: " + i4 + ", Already Open: " + z11 + " (Previous state: " + aaVar.alpha + ")]");
                }
                if (this.foxtrot <= 0) {
                    EnumC0524w enumC0524w2 = aaVar.alpha;
                    if (enumC0524w2 != null && enumC0524w2.alpha) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z2 = false;
                        if (AbstractC3066u3.echo("CameraStateRegistry")) {
                            StringBuilder sb3 = this.alpha;
                            Locale locale2 = Locale.US;
                            if (z2) {
                                str = "SUCCESS";
                            } else {
                                str = "FAIL";
                            }
                            sb3.append(" --> ".concat(str));
                            AbstractC3066u3.bravo("CameraStateRegistry", this.alpha.toString());
                        }
                        if (z2) {
                            bravo();
                        }
                    }
                }
                EnumC0524w enumC0524w3 = EnumC0524w.OPENING;
                aaVar.alpha = enumC0524w3;
                charlie(sVar, enumC0524w3);
                if (AbstractC3066u3.echo("CameraStateRegistry")) {
                }
                if (z2) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean echo(String str, String str2) {
        EnumC0524w enumC0524w;
        aa aaVar;
        boolean z2;
        boolean z10;
        synchronized (this.bravo) {
            try {
                boolean z11 = true;
                if (this.delta.alpha != 2) {
                    return true;
                }
                aa alpha = alpha(str);
                EnumC0524w enumC0524w2 = null;
                if (alpha != null) {
                    enumC0524w = alpha.alpha;
                } else {
                    enumC0524w = null;
                }
                if (str2 != null) {
                    aaVar = alpha(str2);
                } else {
                    aaVar = null;
                }
                if (aaVar != null) {
                    enumC0524w2 = aaVar.alpha;
                }
                EnumC0524w enumC0524w3 = EnumC0524w.OPEN;
                if (!enumC0524w3.equals(enumC0524w) && !EnumC0524w.CONFIGURED.equals(enumC0524w)) {
                    z2 = false;
                    if (!enumC0524w3.equals(enumC0524w2) && !EnumC0524w.CONFIGURED.equals(enumC0524w2)) {
                        z10 = false;
                        if (z2 || !z10) {
                            z11 = false;
                        }
                        return z11;
                    }
                    z10 = true;
                    if (z2) {
                    }
                    z11 = false;
                    return z11;
                }
                z2 = true;
                if (!enumC0524w3.equals(enumC0524w2)) {
                    z10 = false;
                    if (z2) {
                    }
                    z11 = false;
                    return z11;
                }
                z10 = true;
                if (z2) {
                }
                z11 = false;
                return z11;
            } finally {
            }
        }
    }
}
