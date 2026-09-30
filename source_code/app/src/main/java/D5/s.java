package D5;

import B9.K;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import pe.InterfaceC2335k;

/* loaded from: classes3.dex */
public final class s {
    public Object alpha;
    public Object bravo;
    public Object charlie;
    public Object delta;
    public Object echo;
    public Object foxtrot;
    public Object golf;
    public Object hotel;
    public Object india;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006a, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(K components, Ke.e nameResolver, InterfaceC2335k containingDeclaration, G6.j jVar, Ke.f versionRequirementTable, Ke.a metadataVersion, Ge.g gVar, cf.z zVar, List typeParameters) {
        String str;
        Intrinsics.echo(components, "components");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        Intrinsics.echo(versionRequirementTable, "versionRequirementTable");
        Intrinsics.echo(metadataVersion, "metadataVersion");
        Intrinsics.echo(typeParameters, "typeParameters");
        this.alpha = components;
        this.bravo = nameResolver;
        this.charlie = containingDeclaration;
        this.delta = jVar;
        this.echo = versionRequirementTable;
        this.foxtrot = metadataVersion;
        this.golf = gVar;
        String str2 = "Deserializer for \"" + containingDeclaration.getName() + '\"';
        if (gVar != null) {
            str = "Class '" + gVar.alpha().bravo().bravo() + '\'';
        }
        str = "[container not found]";
        this.hotel = new cf.z(this, zVar, typeParameters, str2, str);
        this.india = new cf.q(this);
    }

    public static void echo(String str, JSONObject jSONObject) {
        StringBuilder tango = Q0.c.tango(str);
        tango.append(jSONObject.toString());
        String sb2 = tango.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public s alpha(InterfaceC2335k interfaceC2335k, List typeParameterProtos, Ke.e nameResolver, G6.j jVar, Ke.f versionRequirementTable, Ke.a metadataVersion) {
        Intrinsics.echo(typeParameterProtos, "typeParameterProtos");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(versionRequirementTable, "versionRequirementTable");
        Intrinsics.echo(metadataVersion, "metadataVersion");
        int i4 = metadataVersion.bravo;
        if ((i4 != 1 || metadataVersion.charlie < 4) && i4 <= 1) {
            versionRequirementTable = (Ke.f) this.echo;
        }
        return new s((K) this.alpha, nameResolver, interfaceC2335k, jVar, versionRequirementTable, metadataVersion, (Ge.g) this.golf, (cf.z) this.hotel, typeParameterProtos);
    }

    public W7.b charlie(int i4) {
        W7.b bVar = null;
        try {
            if (!av.q.bravo(2, i4)) {
                JSONObject g2 = ((O7.l) this.echo).g();
                if (g2 != null) {
                    W7.b f5 = ((O7.l) this.charlie).f(g2);
                    echo("Loaded cached settings: ", g2);
                    ((U8.a) this.delta).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!av.q.bravo(3, i4) && f5.charlie < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return f5;
                        } catch (Exception e) {
                            e = e;
                            bVar = f5;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public W7.b delta() {
        return (W7.b) ((AtomicReference) this.hotel).get();
    }
}
