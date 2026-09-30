package zendesk.classic.messaging.ui;

import Kd.a;
import com.squareup.picasso.Picasso;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class AvatarStateRenderer_Factory implements b {
    private final a picassoProvider;

    public AvatarStateRenderer_Factory(a aVar) {
        this.picassoProvider = aVar;
    }

    public static AvatarStateRenderer_Factory create(a aVar) {
        return new AvatarStateRenderer_Factory(aVar);
    }

    public static AvatarStateRenderer newInstance(Picasso picasso) {
        return new AvatarStateRenderer(picasso);
    }

    @Override // Kd.a
    public AvatarStateRenderer get() {
        return newInstance((Picasso) this.picassoProvider.get());
    }
}
