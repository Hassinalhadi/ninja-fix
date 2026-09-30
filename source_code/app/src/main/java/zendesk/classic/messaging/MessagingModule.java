package zendesk.classic.messaging;

import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.Picasso;

/* loaded from: classes.dex */
abstract class MessagingModule {
    @MessagingScope
    public static Picasso picasso(Context context) {
        return new Picasso.Builder(context).build();
    }

    @MessagingScope
    public static Resources resources(Context context) {
        return context.getResources();
    }
}
