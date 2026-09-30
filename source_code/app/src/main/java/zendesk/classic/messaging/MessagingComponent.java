package zendesk.classic.messaging;

import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.Picasso;
import java.util.List;
import zendesk.core.MediaFileResolver;

@MessagingScope
/* loaded from: classes.dex */
public interface MessagingComponent {

    /* loaded from: classes.dex */
    public interface Builder {
        Builder appContext(Context context);

        MessagingComponent build();

        Builder engines(List<Engine> list);

        Builder messagingConfiguration(MessagingConfiguration messagingConfiguration);
    }

    MediaFileResolver mediaFileResolver();

    MediaInMemoryDataSource mediaInMemoryDataSource();

    MessagingConfiguration messagingConfiguration();

    MessagingViewModel messagingViewModel();

    Picasso picasso();

    Resources resources();
}
