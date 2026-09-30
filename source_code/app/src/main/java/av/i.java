package av;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C0533o;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.C0504b;
import androidx.camera.core.impl.InterfaceC0523v;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import t6.AbstractC3066u3;
import t6.L3;
import t6.M3;
import t6.N3;

/* loaded from: classes3.dex */
public final class i {
    public final Context alpha;
    public final Be.e bravo;
    public final C0504b charlie;
    public final androidx.camera.core.impl.ab delta;
    public final androidx.camera.camera2.internal.compat.q echo;
    public final ArrayList foxtrot;
    public final ak golf;
    public final long hotel;
    public final HashMap india = new HashMap();

    public i(Context context, C0504b c0504b, C0533o c0533o, long j5) {
        String str;
        this.alpha = context;
        this.charlie = c0504b;
        androidx.camera.camera2.internal.compat.q alpha = androidx.camera.camera2.internal.compat.q.alpha(context, c0504b.bravo);
        this.echo = alpha;
        this.golf = ak.bravo(context);
        try {
            ArrayList arrayList = new ArrayList();
            J2.e eVar = alpha.alpha;
            eVar.getClass();
            try {
                List<String> asList = Arrays.asList(((CameraManager) eVar.purple).getCameraIdList());
                if (c0533o == null) {
                    Iterator it = asList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        str = M3.delta(alpha, c0533o.bravo(), asList);
                    } catch (IllegalStateException unused) {
                        str = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : asList) {
                        if (!str2.equals(str)) {
                            arrayList2.add(bravo(str2));
                        }
                    }
                    Iterator it2 = c0533o.alpha(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((InterfaceC0523v) it2.next()).bravo());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    if (!str3.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO) && !str3.equals("1")) {
                        if (L3.alpha(this.echo, str3)) {
                            arrayList3.add(str3);
                        } else {
                            AbstractC3066u3.bravo("Camera2CameraFactory", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                        }
                    } else {
                        arrayList3.add(str3);
                    }
                }
                this.foxtrot = arrayList3;
                Be.e eVar2 = new Be.e(this.echo);
                this.bravo = eVar2;
                androidx.camera.core.impl.ab abVar = new androidx.camera.core.impl.ab(eVar2);
                this.delta = abVar;
                ((ArrayList) eVar2.bravo).add(abVar);
                this.hotel = j5;
            } catch (CameraAccessException e) {
                throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e4) {
            throw new InitializationException(N3.bravo(e4));
        } catch (CameraUnavailableException e5) {
            throw new InitializationException(e5);
        }
    }

    public final s alpha(String str) {
        if (this.foxtrot.contains(str)) {
            u bravo = bravo(str);
            C0504b c0504b = this.charlie;
            Executor executor = c0504b.alpha;
            return new s(this.alpha, this.echo, str, bravo, this.bravo, this.delta, executor, c0504b.bravo, this.golf, this.hotel);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public final u bravo(String str) {
        HashMap hashMap = this.india;
        try {
            u uVar = (u) hashMap.get(str);
            if (uVar == null) {
                u uVar2 = new u(this.echo, str);
                hashMap.put(str, uVar2);
                return uVar2;
            }
            return uVar;
        } catch (CameraAccessExceptionCompat e) {
            throw N3.bravo(e);
        }
    }
}
