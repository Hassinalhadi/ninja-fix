package Df;

import Nd.f;
import Nd.h;
import java.util.Map;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public final class a extends Nd.a implements f {
    public static final W8.a purple = new W8.a(2);
    public final Map alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a() {
        super(purple);
        if (AbstractC3062u.foxtrot() != null) {
            Map echo = AbstractC3062u.foxtrot().echo();
            this.alpha = echo;
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static void green(Map map) {
        if (map == null) {
            if (AbstractC3062u.foxtrot() != null) {
                AbstractC3062u.foxtrot().clear();
                return;
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        if (AbstractC3062u.foxtrot() != null) {
            AbstractC3062u.foxtrot().delta(map);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public final void beige(Object obj) {
        green((Map) obj);
    }

    public final Object indigo(h hVar) {
        if (AbstractC3062u.foxtrot() != null) {
            Map echo = AbstractC3062u.foxtrot().echo();
            green(this.alpha);
            return echo;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }
}
