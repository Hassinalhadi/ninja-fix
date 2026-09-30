package zendesk.classic.messaging;

import Kd.a;
import android.content.Context;
import com.squareup.picasso.Picasso;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class MessagingModule_PicassoFactory implements b {
    private final a contextProvider;

    public MessagingModule_PicassoFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static MessagingModule_PicassoFactory create(a aVar) {
        return new MessagingModule_PicassoFactory(aVar);
    }

    public static Picasso picasso(Context context) {
        Picasso picasso = MessagingModule.picasso(context);
        AbstractC2763s0.delta(picasso);
        return picasso;
    }

    @Override // Kd.a
    public Picasso get() {
        return picasso((Context) this.contextProvider.get());
    }
}
