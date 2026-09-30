package zendesk.core;

import vg.d;
import yg.f;
import yg.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface BlipsService {
    @f("/embeddable_blip")
    d<Void> send(@t("data") String str);
}
