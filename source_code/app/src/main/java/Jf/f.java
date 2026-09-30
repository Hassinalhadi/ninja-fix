package Jf;

import ge.w;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.Handshake;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;

    public /* synthetic */ f(int i4, List list) {
        this.alpha = i4;
        this.purple = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        List handshake$lambda$2;
        switch (this.alpha) {
            case 0:
                return ((w) this.purple.get(0)).foxtrot();
            case 1:
                return ((w) this.purple.get(0)).foxtrot();
            case 2:
                return this.purple.iterator();
            case 3:
                list = Handshake.Companion.get$lambda$3(this.purple);
                return list;
            default:
                handshake$lambda$2 = Handshake.Companion.handshake$lambda$2(this.purple);
                return handshake$lambda$2;
        }
    }
}
