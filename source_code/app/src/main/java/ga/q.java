package ga;

import B9.L;
import B9.M;
import android.graphics.Bitmap;
import b9.C0738b;
import com.app.network.network.models.Captain;
import com.app.network.network.models.CaptainQrResponse;
import com.app.network.network.models.NaqlBlockedReason;
import com.app.network.network.models.UserInfo;
import com.app.network.network.models.captian.User;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import s6.AbstractC2746q0;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ u purple;

    public /* synthetic */ q(u uVar, int i4) {
        this.alpha = i4;
        this.purple = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        List<String> reasons;
        String str2;
        int i4;
        String qr;
        Captain captain;
        User user;
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i5 = c2492a.alpha;
                u uVar = this.purple;
                if (i5 != 1) {
                    if (i5 == 2) {
                        uVar.kilo().bronze();
                    }
                } else {
                    uVar.kilo().tango();
                    NaqlBlockedReason naqlBlockedReason = (NaqlBlockedReason) c2492a.charlie;
                    if (naqlBlockedReason != null && (reasons = naqlBlockedReason.getReasons()) != null) {
                        str = CollectionsKt.maroon(reasons, "\n", null, null, null, 62);
                    } else {
                        str = null;
                    }
                    if (str != null && str.length() != 0) {
                        uVar.quebec().f173o.setText(str);
                        uVar.quebec().f170l.setVisibility(0);
                        uVar.quebec().f173o.setVisibility(0);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a2 = (C2492a) obj;
                int i10 = c2492a2.alpha;
                u uVar2 = this.purple;
                if (i10 != 0) {
                    if (i10 == 1) {
                        CaptainQrResponse captainQrResponse = (CaptainQrResponse) c2492a2.charlie;
                        if (captainQrResponse != null && (qr = captainQrResponse.getQr()) != null) {
                            str2 = StringsKt.b(qr).toString();
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && str2.length() != 0) {
                            uVar2.quebec().f164f.setVisibility(0);
                            L quebec = uVar2.quebec();
                            C0738b alpha = AbstractC2746q0.alpha(str2);
                            Bitmap createBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);
                            Intrinsics.delta(createBitmap, "createBitmap(...)");
                            for (int i11 = 0; i11 < 600; i11++) {
                                for (int i12 = 0; i12 < 600; i12++) {
                                    if (alpha.alpha(i11, i12)) {
                                        i4 = ShapeBuilder.DEFAULT_SHAPE_COLOR;
                                    } else {
                                        i4 = -1;
                                    }
                                    createBitmap.setPixel(i11, i12, i4);
                                }
                            }
                            quebec.f164f.setImageBitmap(createBitmap);
                        } else {
                            uVar2.quebec().f164f.setVisibility(8);
                        }
                    }
                } else {
                    uVar2.quebec().f164f.setVisibility(8);
                }
                return Unit.INSTANCE;
            case 2:
                u uVar3 = this.purple;
                UserInfo userInfo = (UserInfo) obj;
                if (userInfo != null && (captain = userInfo.getCaptain()) != null && (user = captain.getUser()) != null) {
                    M m4 = (M) uVar3.quebec();
                    m4.f177s = user;
                    synchronized (m4) {
                        m4.f182u |= 1;
                    }
                    m4.delta();
                    m4.oscar();
                }
                return Unit.INSTANCE;
            default:
                String newValue = (String) obj;
                Intrinsics.echo(newValue, "newValue");
                u uVar4 = this.purple;
                uVar4.quebec().f174p.setText(newValue);
                uVar4.quebec().f169k.setVisibility(0);
                uVar4.quebec().f174p.setVisibility(0);
                uVar4.quebec().f165g.setVisibility(0);
                uVar4.romeo().alpha();
                return Unit.INSTANCE;
        }
    }
}
